package empleados;

// Importación de clases.
import areasDeTrabajo.*;
import assets.*;

public class Administrador extends Personal{
    // Atributos.
    public String nombre;
    public String area;
    public char sexo;
    public int edad;
    
    
    // Constructor.
    public Administrador(String nombre, int edad, char sexo){
        super(nombre, "Administrador", edad, sexo);
        
        this.nombre = nombre;
        this.area = "Administrador";
        this.sexo = sexo;
        this.edad = edad;
        
    }
   
    // Metodos.
    public void datosAdministrador(){
        System.out.println("=====================");
        System.out.println("Datos del administrador: ");
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("=====================");
    };
    
    // Getters & Setters
}
