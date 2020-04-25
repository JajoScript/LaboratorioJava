package assets;

public class Reporte {
    // Atributos.
    public int valorBase;
    public int vehiculos = 0;
    public int gastos;
    public int total;
    
    // Constuctor.
    public Reporte(OrdenDeVenta oV, Vehiculo v, OrdenDeCompra oC){
        if(v.estado == "Completado"){
            this.vehiculos = this.vehiculos + 1;
        }else{
            this.vehiculos = 0;
        }
        
        this.gastos = oC.cantidad * oC.valor;
        this.valorBase = oV.valorBase;
        this.total = this.valorBase - this.gastos;        
    }
    
    // Metodos.
    
    // Getters & Setters.
    
}
