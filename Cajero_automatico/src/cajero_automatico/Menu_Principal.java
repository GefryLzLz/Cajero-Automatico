
package cajero_automatico;

import java.util.Scanner;


public class Menu_Principal {
    
    
    
    public void mostrar(){
    
    int opcion;
    int intentos=0;
     System.out.println("*********************************************************");
             System.out.println(    "******** Bienvenido al cajero Automatico ********");
    Scanner lec= new Scanner (System.in);
    /*Creacion de Usuario*/
      Usuario usuario1 = new Usuario();
       usuario1.setNombre_usuario("Gefry");
       usuario1.setContrasena("123");
       usuario1.setUsuario_existe(true);
       
     
       
      
       //Aca se agregar las cuentas al listado de cuentas del usuario 
       Cuenta cuenta1 = new Cuenta( 5000," Monetaria","Activa",3500);
       usuario1.setListadoCuentas(cuenta1);
      
       Cuenta cuenta2 = new Cuenta(8000,"Ahorro","Activa",3500);
       usuario1.setListadoCuentas(cuenta2);
     
       Cuenta cuenta3 = new Cuenta(2000,"Ahorro","Activa",3500);
       usuario1.setListadoCuentas(cuenta3);
   
      
       
       Acciones accion = new Acciones();
       
       do{
        
    if(accion.verificar(usuario1)){
              
     do {
            
    
             System.out.println("Presione 1 para retirar");
             System.out.println("Presione 2 para depositar");
             
             opcion = lec.nextInt();
              int opcionCuenta;

               switch (opcion) {
                   case 1:
                       Retiro retiro = new Retiro();
                       retiro.retirar(usuario1);
                       
                      break;
                   case 2:
                       Deposito deposito = new Deposito();
                        deposito.depositar(usuario1);
                     
                      break;    
               }
               System.out.println("Para seguir digite 0, para salir digite 2");
               opcion = lec.nextInt();
            } while (opcion != 2);
            System.out.println("Gracias por usar nuestro cajero...");
            
            }else{
                intentos ++;         
                System.out.println("Contraseña incorrecta o usuario incorrecto");
                 System.out.println("");
                 System.out.println("Solo tiene 3 intentos, hasta ahora lleva "+intentos+" intento");
                 System.out.println("");
                }
     //Aca se cierra el ciclo do para contar los intentos
            }while(intentos!=3);
                System.out.println("Llego al limite de intentos regrese mañana");
    }
}