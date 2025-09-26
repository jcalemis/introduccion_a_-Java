
package tp5;


public class Render {
    private String formato;
    

    public Render(String formato) { 
        this.formato = formato;
    }

    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }

    @Override
    public String toString() {
        return "Render{formato='" + formato + "'}";
    }
}
