package assets;

public class Personal {
    // Atributos.
    public String nombre;
    public String area;
    public char sexo;
    
    public int edad;
    
    
    // Constructor.
    public Personal(String n, String a, int e, char s){
        this.nombre = n; this.area = a; this.edad = e; this.sexo = s;
    };
    
    // Metodos.
    public void informacionPersonal(){
        System.out.println("==============");
        System.out.println("Datos del personal: ");
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Edad: "+ this.edad);
        System.out.println("Area: "+ this.area);
        System.out.println("==============");
    }
    
    // Getters & Setters.
}
