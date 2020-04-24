package Personal;

// Importación de paquetes.
import Assets.*;
import Areas.*;

// Creación de la clase.
public class Administrador extends RecursosHumanos{
    // Atributos.
    
    // Constructor.
    public Administrador(){    
    }

    // Metodos.
    public Personal crearPersonal(int edad, char sexo, String nombre, String profesion, String funcionDesempeñar, String areaAsociada) {
        Personal nuevoPersonal = new Personal(edad, sexo, nombre, profesion, funcionDesempeñar, areaAsociada);
        return nuevoPersonal;
    }
    // Getters & Setters.
}
