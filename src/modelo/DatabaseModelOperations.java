/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author vek
 */
public interface DatabaseModelOperations {
    public int insert();
    public ArrayList select();
    public int update();
    public int delete();
}
