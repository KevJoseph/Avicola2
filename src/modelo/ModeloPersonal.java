/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.ControladorBaseDatos;
import entidades.BaseDatosResultados;
import entidades.Personal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/**
 *
 * @author vek
 */
public class ModeloPersonal {
    private ControladorBaseDatos cbd;

   
    public ModeloPersonal() {
        this.cbd = new ControladorBaseDatos();
    }
    
    public int insertPersonal(String codigo,String nombre,String apellido,String fecha,String tipo){
           
        try {
            this.cbd.conectar();
        
            String sql = "INSERT INTO personal(codpersonal,nombre,apellido,fecha,tipo) values(?,?,?,?,?)";
            PreparedStatement st = cbd.objconexion().prepareStatement(sql);
            st.setString (1, codigo);
            st.setString (2, nombre);
            st.setString (3, apellido);
            st.setString (4, fecha);
            st.setString (5, tipo);
            
            st.execute();
            this.cbd.desconectar();
            System.out.println("ModeloPersonal: OK");
            return BaseDatosResultados.EXITO_GUARDAR;
        } catch (Exception e) {
            System.out.println("ModeloPersonal: ERROR,verifica campos en la sentencia sql");
            return BaseDatosResultados.FALLO_GUARDAR;
        }
    }
    
    public ArrayList selectPersonal(){
        ArrayList lista = new ArrayList();
        try {
            this.cbd.conectar();
            String sql = "select * from personal";
            Statement st = cbd.objconexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                String codigo_p = rs.getString("codpersonal");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String fecha = rs.getString("fecha");
                String tipo = rs.getString("tipo");
                Personal tempersonal = new Personal(codigo_p,nombre,apellido,fecha,tipo);
                System.out.println(tempersonal.toString());
                lista.add(tempersonal);
            }
            this.cbd.desconectar();
            return lista;
            
        } catch (SQLException e) {
            System.out.println("ModeloPersonal Error: "+e);
            return null;
        }

    }

    public int updatePersonal(String codigo,String nombre,String apellido,String fecha,String tipo){
        try {
            this.cbd.conectar();
            String sql = "update personal set nombre = ?,apellido = ?,fecha = ?,tipo = ? where codpersonal ";
            PreparedStatement st = cbd.objconexion().prepareStatement(sql);
            st.setString (1, nombre);
            st.setString (2, apellido);
            st.setString (3, fecha);
            st.setString (4, tipo);
            st.setString (5, codigo);
            st.execute();
            this.cbd.desconectar();
            System.out.println("ModeloPersonal: OK");
            return BaseDatosResultados.EXITO_GUARDAR;
        } catch (Exception e) {
            System.out.println("ModeloPersonal: ERROR");
            return BaseDatosResultados.FALLO_GUARDAR;

        }   
        
    }
    public int deletePersonal(String codigo){
        try {
            this.cbd.conectar();
            String sql = "delete from personal where codpersonal = ?";
            PreparedStatement st = cbd.objconexion().prepareStatement(sql);
            st.setString (1, codigo);
            st.execute();
            this.cbd.desconectar();
            System.out.println("ModeloPersonal: OK");
            return BaseDatosResultados.EXITO_GUARDAR;        
        } catch (Exception e) {
            System.out.println("ModeloPersonal: ERROR");
            return BaseDatosResultados.FALLO_GUARDAR;
        }
    }
    public static void main(String[] args) {
        ModeloPersonal m = new ModeloPersonal();
        m.selectPersonal();
    }
    

}
