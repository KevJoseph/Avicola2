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
public class Personal {
    
    private String cod_p;
    private String nombre;
    private String apellido;
    private String fecha_i;
    private String tipo;

    public Personal(String cod_p, String nombre, String apellido, String date, String tipo) {
        this.cod_p = cod_p;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_i = date;
        this.tipo = tipo;
    }

    public Personal() {
    }

    public String getCod_p() {
        return cod_p;
    }

    public void setCod_p(String cod_p) {
        this.cod_p = cod_p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha_i() {
        return fecha_i;
    }

    public void setFecha_i(String date) {
        this.fecha_i = date;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public Object[] toArray(){
       return new Object[]{this.cod_p, this.nombre, this.apellido,this.fecha_i,this.tipo};
    }

    @Override
    public String toString() {
        return "Personal{" + "cod_p=" + cod_p + ", nombre=" + nombre + ", apellido=" + apellido + ", fecha_i=" + fecha_i + ", tipo=" + tipo + '}';
    }
    
    
}
