# <span><img src="./Images/a.png" alt="java icon" width="45"/></span> Laboratorio de JAVA 

## **Terminos de uso y condiciones.**
*   No me copien la wea bastardos culiaos, ya chao.
*   Este trabajo se respalda al uso exclusivo de **Javier Almarza**.
*   Quiero dejar en claro que **Javascript > JAVA** en todos los aspectos.
*   Sigo sin entender para que quieren un Makefile o un ScripShell.
*   Esta es mi bitacora escrita en MarkDown, **saludos**.

***
## **Areas De Trabajo.**
    Las areas de trabajo son aquellas clases que heredan sus atributos y metodos a las clases hijas. 
    (al menos eso se espera)

*   Ventas.
*   Recursos humanos.
*   Taller.
*   Finanzas.
*   Gerencia.
*   Bodega.

## **Clase de Trabajadores.**
    Cada Trabajador tiene sus Atributos y propiedades privadas para controlar el acceso a ciertos datos.

*   Vendedor.
*   Administrador.
*   Contador.
*   Bodeguero.
*   Mecanico.
*   Gerente de planta.

## **Assets, Objetos complejos para datos.**
    Los Assets funcionan como intermediarios de datos más complejos entre, conteniendo metodos y clases.

*   Personal.
*   OrdenDeCompra.
*   OrdenDeVentas.
*   Reporte.
*   Taller.
*   Vehiculo.

***
## **Diagrama de clases**

<img src="./Images/D1.jpg" width="" />

Versión: 1.0.0

## **Diagrama de Objetos, Metodos y Atributos**

<img src="./Images/D2.png" width="" />

Versión: 1.1.0

## Documentacion de clases.

*   Vendedor:

    Se Encarga del area de ventas, generando ordenes de ventas mediante la funcion:

        *   GenerarOrdenDeVentas(); 
        *   verOrdenDeVenta();

*   Administrador.

    Es el encargado de despedir y contratar al personal mediante las funciones:

        *   CrearPersonal(); 
        *   EliminarPersonal();

*   Contador.

    Se Encarga de generar reportes calculando las ganancias y gastos de la empresa con la funcion:

        *   generarReporte();

*   Bodeguero.

    Es el encargado de consultar el Stock, generar ordenes de comprar de articulos y verificar el estado de abastecimiento, mediante las funciones: 

        *   EstadoDeAbastecimiento(); 
        *   generarOrdenDeCompra(); 
        *   verOrdenDeCompra(); 
        *   agregarStock(); 
        *   quitarStock();
        *   verRecursos();
        *   verStock();

*   Mecanico.

    Es el encargado de administrar todo lo relacionado con la reparacion, mantencion y mejora de los vehiculos, mediante las funciones: 

        *   CrearVehiculo();
        *   CambiarEstadoDelVehiculo();
        *   verEstadoDelVehiculo();   


*   Gerente de planta.

    Es el encargado de aprobar las desvinculaciones de los empleados junto con administrar las ordenes de venta y compra mediante las funciones:

        *   verOrdenDeVenta();
        *   verOrdenDeCompra();
        *   confirmarDesvinculacion();
    
***

## **Trabajando para usted**
<img src="./Images/b.gif" width="200" />

***