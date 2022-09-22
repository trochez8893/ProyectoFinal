

import java.util.ArrayList;
import Clases.Clientes;






public class ProyectoCajero {
        static Clientes cli1=new Clientes ();
        static Clientes cli2 = new Clientes(); 
        static Clientes cli3 = new Clientes(); 
        static Clientes cli4 = new Clientes(); 
        static Clientes cli5 = new Clientes();
        ArrayList Retirar = new ArrayList(); 
        ArrayList Consignar = new ArrayList();
        static int Sesion=0;

public static void main (String[]args){ 
            
    
    
cli1.setIdentidad("1");
cli1.setNombre("Jairo");
cli1.setApellido("Trochez");
cli1.setPass("1993");
cli1.setMonto(100); 

cli2.setIdentidad("2");
cli2.setNombre("Ariel");
cli2.setApellido( "Montoya");
cli2.setPass("1996");
cli2.setMonto(200); 

cli3.setIdentidad("3");
cli3.setNombre("Fabricio");
cli3.setApellido("Laureano");
cli3.setPass("1995"); 
cli3.setMonto(300);

cli4.setIdentidad("4");
cli4.setNombre("Martin");
cli4.setApellido("Garcia");
cli4.setPass("2003"); 
cli4.setMonto(400);

cli5.setIdentidad("5");
cli5.setNombre("Edgardo");
cli5.setApellido("Guillen");
cli5.setPass("2003"); 
cli5.setMonto(500);
    
Inicio newframe = new Inicio(); 
newframe.setVisible(true);
    
}}
