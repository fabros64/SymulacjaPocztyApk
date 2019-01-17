/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail;

import funkcje.Funkcjonalnosci;

/**
 *
 * @author Michał
 */
public class Wyslane extends Funkcjonalnosci{
    protected String adres;
    protected String temat;
    protected String data;
    protected String tresc;
    protected Boolean zalacznik;
    
    public Wyslane(String adres, String temat, String data, Boolean zalacznik)
    {
        this.adres = adres;
        this.temat = temat;
        this.data = data;
        this.zalacznik = zalacznik;
    }
    
    public Wyslane(String adres, String temat, String data, String tresc)
    {
        this.adres = adres;
        this.temat = temat;
        this.data = data;
        this.tresc = tresc;
        this.zalacznik = false;
    }

    Wyslane(String adres, String temat, String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
    
    public String getTemat() {
        return temat;
    }

    public void setTemat(String temat) {
        this.temat = temat;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public String getTresc()
    {
        return tresc;
    }
    
    public void setTresc(String tresc)
    {
        this.tresc = tresc;
    }
    
    public String getInfo() 
    {
       
            return adres + WyswietlaneSpacje(adres) + temat + WyswietlaneSpacje(temat) + data;
    }

    public Boolean getZalacznik() {
        return zalacznik;
    }

    public void setZalacznik(Boolean zalacznik) {
        this.zalacznik = zalacznik;
    }
    
}

