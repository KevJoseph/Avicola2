/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author vek
 */
public class Galpon {
    private String id;
    private String numero_g;
    private String codpersonal;
    private String nombre_p;
    private String apellido_p;

    public Galpon() {
    }

    public Galpon(String id, String numero_g, String codpersonal, String nombre_p, String apellido_p) {
        this.id = id;
        this.numero_g = numero_g;
        this.codpersonal = codpersonal;
        this.nombre_p = nombre_p;
        this.apellido_p = apellido_p;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumero_g() {
        return numero_g;
    }

    public void setNumero_g(String numero_g) {
        this.numero_g = numero_g;
    }

    public String getCodpersonal() {
        return codpersonal;
    }

    public void setCodpersonal(String codpersonal) {
        this.codpersonal = codpersonal;
    }

    public String getNombre_p() {
        return nombre_p;
    }

    public void setNombre_p(String nombre_p) {
        this.nombre_p = nombre_p;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    @Override
    public String toString() {
        return "Galpon{" + "id=" + id + ", numero_g=" + numero_g + ", codpersonal=" + codpersonal + ", nombre_p=" + nombre_p + ", apellido_p=" + apellido_p + '}';
    }
   
    
    
    
}
