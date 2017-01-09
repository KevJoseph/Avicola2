/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.ControladorBaseDatos;

/**
 *
 * @author vek
 */
public class ModeloGalpon {
    private ControladorBaseDatos bd;

    public ModeloGalpon() {
        this.bd = new ControladorBaseDatos();
    }
    
    public int insert(){
        return 1;
    }
    public int select(){
        return 1;
    }    
    public int update(){
        return 1;
    }
    public int delete(){
        return 1;
    }
    
    
}
