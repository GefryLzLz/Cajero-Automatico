
package cajero_automatico;


public class Retiro extends Acciones {
    
    
   
    
     public void retirar(Usuario usuario){
      Cuenta cuenta_a_retirar = seleccionarCuenta(usuario);
          System.out.println("Ingrese la cantidad de dinero que le gustaria retirar.");
          int retiro = lec.nextInt();
           cuenta_a_retirar.getSaldo();
          if(retiro <= cuenta_a_retirar.getSaldo()){
              if((cuenta_a_retirar.getLimite_diario()-retiro) >= 0){
                  cuenta_a_retirar.setSaldo( cuenta_a_retirar.getSaldo()- retiro);
                  cuenta_a_retirar.setLimite_diario(cuenta_a_retirar.getLimite_diario()- retiro);
                  System.out.println("Su nuevo saldo en la cuenta  "+cuenta_a_retirar.getTipo_cuenta()+" es de "+cuenta_a_retirar.getSaldo());
              }else{
                  System.out.println("Usted a alcanzado su limite diario");
              }
          }else{
              System.out.println("Su retiro excede su saldo actual");
              System.out.println("Su saldo actual es de "+cuenta_a_retirar.getSaldo());
          }
      }
    
}
