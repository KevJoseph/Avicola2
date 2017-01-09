/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author vek
 */
public class ConfiBaseDatos {
    private String user;
    private String pass;
    private String bd;
    private String url="jdbc:mysql://localhost/bd_avicola";

    public ConfiBaseDatos(String user, String pass, String bd) {
        this.user = user;
        this.pass = pass;
        this.bd = bd;
    }

    public ConfiBaseDatos() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getUrl() {
        return url;

    }

    public void setUrl(String url) {
        this.url = url;
    }  
}
