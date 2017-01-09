/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.Asistencia;
import java.util.ArrayList;
import modelo.ModeloAsistencia;

/**
 *
 * @author vek
 */
public class ControladorAsistencia implements ControllerOperations {
    ModeloAsistencia modelasis;

    public ControladorAsistencia() {
        this.modelasis = new ModeloAsistencia();
    }
    @Override
    public int guardar(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public ArrayList mostrar() {
        try {
            ArrayList lista = new ArrayList();
            lista =  this.modelasis.select();
            System.out.println("[+]ControladorAsistencia... OK");
            return lista;

        } catch (Exception e) {
            System.out.println("[-]ControladorAsistencia... Error");
            return null;
        }

    }

    @Override
    public int modificar(Object o) {
        Asistencia a = (Asistencia) o;
        modelasis.update(a.getIdpersonal(),a.getIdgalpon(),a.getEstado(),a.getHora_extra(),a.getFecha());
        System.out.println("ControladorAsistencia... OK");
        return 1;
    }

    @Override
    public int eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
    
    public int procedure1(){
        return modelasis.proc_asis();
        
    }
}
