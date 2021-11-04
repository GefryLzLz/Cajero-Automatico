
package cajero_automatico;


public class Cuenta {
    private int saldo;
    private String tipo_cuenta;
    private String estado_cuenta;
     

   
    @Override
    public String toString() {
        return " ,Tipo de cuenta:"+ tipo_cuenta + ",Saldo : " + saldo +  ", Estado cuenta :" + estado_cuenta + ", Limite diario=" + limite_diario + '}';
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTipo_cuenta() {
        return tipo_cuenta;
    }

    public void setTipo_cuenta(String tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }

    public String getEstado_cuenta() {
        return estado_cuenta;
    }

    public void setEstado_cuenta(String estado_cuenta) {
        this.estado_cuenta = estado_cuenta;
    }

    

    public int getLimite_diario() {
        return limite_diario;
    }

    public void setLimite_diario(int limite_diario) {
        this.limite_diario = limite_diario;
    }
    private int limite_diario;

    public Cuenta() {
    }

    public Cuenta(int saldo, String tipo_cuenta, String estado_cuenta, int limite_diario) {
        this.saldo = saldo;
        this.tipo_cuenta = tipo_cuenta;
        this.estado_cuenta = estado_cuenta;
        this.limite_diario = limite_diario;
    }
    
   
}
