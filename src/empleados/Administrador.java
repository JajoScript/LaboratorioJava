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
        System.out.println("==============");
        System.out.println("Datos del administrador: ");
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("==============");
    };
    
    public Personal crearPersonal(String nombre, String area, char sexo, int edad){
        System.out.println("==============");
        Personal personal = new Personal(nombre,area,edad,sexo);
        
        System.out.println("Se Agrego alguien al personal.");
        System.out.println("==============");
        return personal;
    };
    
    public void eliminarPersonal(Personal despedido){
        System.out.println("==============");
        System.out.println("Se Despidio a: "+ despedido.nombre);
        System.out.println("==============");
    };
    
    // Getters & Setters
}
