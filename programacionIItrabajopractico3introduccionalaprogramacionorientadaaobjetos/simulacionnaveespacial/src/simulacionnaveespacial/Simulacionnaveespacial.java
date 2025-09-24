package simulacionnaveespacial;

public class Simulacionnaveespacial {


    public static void main(String[] args) {
 NaveEspacial nave = new NaveEspacial();
        nave.nombre = "LA_SABEIRO";
        nave.combustible = 50;

        nave.avanzar(75);

        nave.recargarCombustible(25);

        nave.avanzar(75);

        nave.despegar();
        nave.mostrarEstado();
    }

    public static class NaveEspacial {
        String nombre;
        int combustible;
        final int MAX_COMBUSTIBLE = 100;

        public void despegar() {
            System.out.println(nombre + "   está despegando");
        }

        public void avanzar(int distancia) {
            if (combustible >= distancia) {
                combustible -= distancia;
                System.out.println(nombre + "  avanzó" + distancia + " unidades.");
            } else {
                System.out.println("No hay suficiente combustible para avanzar " + distancia + " unidades.");
            }
        }

        public void recargarCombustible(int cantidad) {
            if (combustible + cantidad > MAX_COMBUSTIBLE) {
                combustible = MAX_COMBUSTIBLE;
                System.out.println("Combustible recargado al máximo: " + MAX_COMBUSTIBLE);
            } else {
                combustible += cantidad;
                System.out.println("Combustible recargado: " + cantidad + " unidades.");
            }
        }

        public void mostrarEstado() {
            System.out.println("Estado de  " + nombre + "  Combustible: " + combustible);
        }
    }
}