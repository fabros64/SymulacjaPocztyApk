/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail;

/**
 *
 * @author Michał
 */
public class Kontakt {
    
    protected Osoba osoba;
    protected Instytucja instytucja;
   
    
    private Boolean os, ins;
    
    public Kontakt(String imie, String nazwisko, String email, String notatki)
    {
       osoba = new Osoba(imie,nazwisko,email,notatki);
       os = true;
       ins = false;
    }
    
    public Kontakt(String nazwa, String email, String notatki)
    {
        instytucja = new Instytucja(nazwa,email,notatki);
        os = false;
        ins = true;
    }
    
    public String getInfo() 
    {
        if(os)
        {
            return osoba.imie + " " + osoba.nazwisko + " " + osoba.email + " "
                    + osoba.notatki;
        }    
        else
            return instytucja.nazwa + " " + instytucja.email + " " 
                    + instytucja.notatki;
    }
    
     public String getAdres() 
    {
        if(os)
        {
            return osoba.email;
        }    
        else
            return instytucja.email;
    }
    
}
