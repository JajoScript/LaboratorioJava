package Assets;

// Importación de paquetes.
import Areas.*;

// Creación de la clase Personal.
public class Personal extends RecursosHumanos{
    // Atributos.
    protected int edad;
    protected char sexo;
    
    protected String nombre;
    protected String profesion;
    protected String FuncionDesempeñar;
    protected String AreaAsociada;
    
    // Constructor.
    public Personal(int edad, char sexo, String nombre, String profesion, String funcionDesempeñar, String areaAsociada) {
        this.edad = edad;
        this.sexo = sexo;
        this.nombre = nombre;
        this.profesion = profesion;
        this.FuncionDesempeñar = funcionDesempeñar;
        this.AreaAsociada = areaAsociada;
    }
    // Metodos.
    
    // Getters & Setters.
}
