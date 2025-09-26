
package tp5;


public class Tp5 {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Publicidad", 2);
        EditorVideo editor = new EditorVideo();

        System.out.println("Dependecia de Creacion");
        editor.exportar("MP4", proyecto); 

        System.out.println("\nSegunda exportacion");
        editor.exportar("AVI", proyecto); 
    }
}
