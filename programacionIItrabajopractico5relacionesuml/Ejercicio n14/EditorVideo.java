package tp5;


public class EditorVideo {
    
    public void exportar(String formato, Proyecto proyecto) {
     
        
        Render render = new Render(formato);

        System.out.println("Render Exportado");
        System.out.println("Formato: " + render.getFormato());
        System.out.println("Proyecto: " + proyecto.getNombre());
        System.out.println("Duración: " + proyecto.getDuracionMin() + " minutos");
        System.out.println("Render creado: " + render);

        
        System.out.println("Exportando proyecto '" + proyecto.getNombre() +
                          "' en formato " + formato + "...");
        System.out.println("Exportación completada exitosamente!");

        
    }
}
