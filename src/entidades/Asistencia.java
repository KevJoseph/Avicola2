/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Vector;

/**
 *
 * @author vek
 */
public class Asistencia {
    private String idpersonal=null;
    private String codpersonal=null;
    private String nombre=null;
    private String apellido=null;
    private String idgalpon=null;
    private String estado=null;
    private String hora_extra=null;
    private String fecha=null;

    public Asistencia() {
    }

    public Asistencia(String idpersonal,String codpersonal, String nombre, String apellido, String idgalpon, String estado, String hora_extra, String fecha) {
        this.idpersonal = idpersonal;
        this.codpersonal = codpersonal;
        this.nombre = nombre;
        this.apellido = apellido;
        this.idgalpon = idgalpon;
        this.estado = estado;
        this.hora_extra = hora_extra;
        this.fecha = fecha;
    }

    public String getIdpersonal() {
        return idpersonal;
    }

    public void setIdpersonal(String idpersonal) {
        this.idpersonal = idpersonal;
    }
    
    public String getCodpersonal() {
        return codpersonal;
    }

    public void setCodpersonal(String codpersonal) {
        this.codpersonal = codpersonal;
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

    public String getIdgalpon() {
        return idgalpon;
    }

    public void setIdgalpon(String idgalpon) {
        this.idgalpon = idgalpon;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getHora_extra() {
        return hora_extra;
    }

    public void setHora_extra(String hora_extra) {
        this.hora_extra = hora_extra;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Asistencia{" + "idpersonal=" + idpersonal + ", codpersonal=" + codpersonal + ", nombre=" + nombre + ", apellido=" + apellido + ", idgalpon=" + idgalpon + ", estado=" + estado + ", hora_extra=" + hora_extra + ", fecha=" + fecha + '}';
    }

    public Object[] toArray() {
        return new Object[]{ this.idpersonal,this.codpersonal,this.nombre,this.apellido,this.idgalpon,this.estado,this.hora_extra,this.fecha};
    }
    
    
    
}
