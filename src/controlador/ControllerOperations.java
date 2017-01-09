/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;

/**
 *
 * @author vek
 */
public interface ControllerOperations {
    public int guardar(Object o);
    public ArrayList mostrar();
    public int modificar(Object o);
    public int eliminar();
}
