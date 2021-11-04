
package cajero_automatico;




import java.util.Scanner;


 public  class Acciones {
     int opcion;
        
    Scanner lec= new Scanner (System.in);
   
      public boolean verificar (Usuario usuario){
      /*Validacion de Usuario*/ 
         System.out.println("Ingrese su Nombre de usuario");
         String nombreIngresado = lec.nextLine();
         System.out.println("Ingrese su contraseña");
         String contraIngresada = lec.nextLine();
         
         if(nombreIngresado.equals(usuario.getNombre_usuario())&& contraIngresada.equals(usuario.getContrasena())){
               return true;
         }else{
             return false;
         }
      }
      
      public Cuenta seleccionarCuenta(Usuario usuario){
          int contador=0;
          System.out.println("Cuentas activas a su nombre");
          //aca se recorre el listado de las cuentas
           for(int i = 0 ; i < usuario.getListadoCuentas().size(); i++){
               
               if(usuario.getListadoCuentas().get(i).getEstado_cuenta().equals("Activa")){
               contador++;
               //aca se valida que solo muestre las cuentas activas
               System.out.println("-----------------------------------------------------------");
               System.out.print(contador+" - ");
               System.out.print("Tipo de cuenta: "+usuario.getListadoCuentas().get(i).getTipo_cuenta()
                       + " Saldo: "+usuario.getListadoCuentas().get(i).getSaldo()
                       + " Estado de cuenta: "+usuario.getListadoCuentas().get(i).getEstado_cuenta());
             System.out.println("");
               System.out.println("------------------------------------------------------------");       
               }                     
            } 
          
            int cuenta_a_operar=0;

                  System.out.println("Presione el numero de la cuenta que quisiera operar");
                   cuenta_a_operar=lec.nextInt();
                   
                if(cuenta_a_operar<=contador && cuenta_a_operar!=0 ){
                   return usuario.getListadoCuentas().get(cuenta_a_operar-1);
               }else{
                  System.out.println("Numero de cuenta seleccionado no existe.");
               }
 
               return null;
      }
 }
        
        


