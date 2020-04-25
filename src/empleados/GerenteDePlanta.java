package empleados;
// Importacion de clases.
import assets.*;
import areasDeTrabajo.*;

// Creacion de clase gerente de planta
public class GerenteDePlanta extends Personal {
    // Atributos.
    
    // Constructor.
    public GerenteDePlanta(Personal a){
       super(a.nombre, a.area, a.edad, a.sexo, a.profesion, a.funcion);
    };
    
    // Metodos.
    public void verEstadoDeProduccion(Taller a){
        System.out.println("==============");
        System.out.println("El estado de produccion es: "+ a.estadoProduccion);
        System.out.println("==============");
    };
    public void confirmarDesvinculacion(int desvinculacion, Personal a, Administrador b){
        if(desvinculacion == 1){
            System.out.println("==============");
            System.out.println("Se desvincula a :"+ a.nombre);
            System.out.println("==============");
            b.eliminarPersonal(a);
        }else if((desvinculacion == 0) ||( a.area == "Recursos Humanos" )|| (a.area == "Gerencia")){
            System.out.println("==============");
            System.out.println("No se desvincula a :"+ a.nombre);
            System.out.println("==============");
        }
    };
    // Getters & Setters.
}
