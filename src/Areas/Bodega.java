package Areas;

// Creación de la clase.
public class Bodega {
    // Atrubutos
    protected int recursos;
    protected int stock;
    
    // Constructor
    public Bodega(int recursos, int stock) {
        this.recursos = recursos;
        this.stock = stock;
    }
    
    // Metodos.
    protected void verRecursos(){
        System.out.println("Recursos Disponibles: "+ this.recursos);
    }
    protected void verStock(){
        System.out.println("Stock Disponible: "+ this.stock);
    }
    
    // Getters & Setters.   
}
