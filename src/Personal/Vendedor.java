package Personal;

// Importación de Paquetes.
import Areas.*; // Bodega.

// Creación de la clase.
public class Vendedor extends Bodega{
    // Atributos.
    
    // Constructores.
    public Vendedor() {
    
    }
   
    // Metodos.
    public void mirar(){
        System.out.println("Recursos en bodega Disponibles: "+ this.recursos);
    }
    // Getters & Setters. 
   
}
