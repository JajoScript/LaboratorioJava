package assets;

public class Personal {
    // Atributos.
    public String nombre;
    public String area;
    public String profesion;
    public String funcion;
    
    public char sexo;
    
    public int edad;
    
    
    // Constructor.
    public Personal(String n, String a, int e, char s, String p, String f){
        this.nombre = n; this.area = a; this.edad = e; this.sexo = s; this.funcion = f; this.profesion = p;
    };
    
    // Metodos.
    public void informacionPersonal(){
        System.out.println("==============");
        System.out.println("Datos del personal: ");
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Edad: "+ this.edad);
        System.out.println("Area: "+ this.area);
        System.out.println("Profesion: "+ this.profesion);
        System.out.println("Funcion a desempeñar: "+ this.funcion);
        System.out.println("==============");
    }
    
    // Getters & Setters.
}
