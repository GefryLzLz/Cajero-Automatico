
package cajero_automatico;

import java.util.ArrayList;


public class Usuario {
    private String nombre_usuario;
    private String contrasena;
    private boolean usuario_existe;
    private ArrayList <Cuenta> listadoCuentas = new ArrayList();
         
    
    public Usuario(String nombre_usuario, String contrasena, boolean usuario_existe) {
        this.nombre_usuario = nombre_usuario;
        this.contrasena = contrasena;
        this.usuario_existe = usuario_existe;
    }

    public Usuario() {
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isUsuarioExiste(String nombreIngresado, String contrasenaIngresada) {
        
        if(nombreIngresado.equals(this.nombre_usuario) && contrasenaIngresada.equals(this.contrasena)){
            usuario_existe=true;
            return usuario_existe;
        }else{
            usuario_existe=false;
            return usuario_existe;
        }
        
    }

    public void setUsuario_existe(boolean usuario_existe) {
        this.usuario_existe = usuario_existe;
    }

    public ArrayList<Cuenta> getListadoCuentas() {
        return listadoCuentas;
    }

    public void setListadoCuentas(Cuenta nuevaCuenta) {
        
        this.listadoCuentas.add(nuevaCuenta);
    }  
}
