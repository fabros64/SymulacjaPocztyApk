/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail;

/**
 *
 * @author 
 */
public class Instytucja {
    
    protected String nazwa;
    protected String email;
    protected String notatki;

    public Instytucja(String nazwa, String email, String notatki) {
        this.nazwa = nazwa;
        this.email = email;
        this.notatki = notatki;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotatki() {
        return notatki;
    }

    public void setNotatki(String notatki) {
        this.notatki = notatki;
    }
    
    
    
}
