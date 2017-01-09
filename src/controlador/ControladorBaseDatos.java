/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.ConfiBaseDatos;
/**
 *
 * @author vek
 */
public class ControladorBaseDatos {
    private ConfiBaseDatos confibasedatos;
    Connection con = null;

    public ControladorBaseDatos() {
        this.confibasedatos = new ConfiBaseDatos();
        this.confibasedatos.setUser("root");
        this.confibasedatos.setPass("qwerty123");
        this.confibasedatos.setBd("bd_avicola");
        
    }
    
    public boolean conectar(){
         try {
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             con = DriverManager.getConnection(confibasedatos.getUrl(),confibasedatos.getUser(),confibasedatos.getPass());
             System.out.println("Base de datos conectada.");
             System.out.println("[+]"+confibasedatos.getUrl()+"   User:"+confibasedatos.getUser()+" Pass:"+confibasedatos.getPass());
             return true;
        } catch (Exception e) {
             System.out.println("Error en los datos de la bd.");
             return false;
        }
    }
    public Connection objconexion(){
        return con;
    }
    
    public boolean desconectar(){
        try {
            //code
            this.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
}
