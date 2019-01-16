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
public class Osoba {
    
    protected String imie;
    protected String nazwisko;
    protected String email;
    protected String notatki;

    public Osoba(String imie, String nazwisko, String email, String notatki) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.notatki = notatki;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
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
