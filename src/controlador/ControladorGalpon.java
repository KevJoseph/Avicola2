/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.ModeloPersonal;

/**
 *
 * @author vek
 */
public class ControladorGalpon {
    ControladorBaseDatos bd;
    ModeloPersonal mp;

    public ControladorGalpon() {
        this.bd = new ControladorBaseDatos();
        this.mp = new ModeloPersonal();
    }
    
    public int guardar(){
        return 1;
    }
    
    public int mostrar(){
        return 1;
    }
    
    public int modificar(){
        return 1;
    }
    
    public int eliminar(){
        return 1;
    }
    
    
}
