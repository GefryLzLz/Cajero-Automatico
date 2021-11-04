/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero_automatico;

public class Deposito extends Acciones{
    
      public void depositar(Usuario usuario){
      Cuenta cuenta_a_depositar = seleccionarCuenta(usuario);
          System.out.println("Ingrese la cantidad de dinero que le gustaria depositar.");
          int deposito = lec.nextInt();
           cuenta_a_depositar.getSaldo();
       
              if(deposito >=50){
                  if(deposito<5000){
                  cuenta_a_depositar.setSaldo( cuenta_a_depositar.getSaldo()+ deposito);
                  System.out.println("Su nuevo saldo en la cuenta  "+cuenta_a_depositar.getTipo_cuenta()+" es de "+cuenta_a_depositar.getSaldo());
              }else{
                      System.out.println("Su deposito debe ser menor a Q5000");
                }
              }else{
                  System.out.println("Su deposito debe ser mayor o igual a Q50");
              }
      }
      
}
