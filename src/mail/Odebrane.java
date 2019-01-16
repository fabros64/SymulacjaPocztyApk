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
public class Odebrane extends Funkcjonalnosci {
    
    protected String adres;
    protected String temat;
    protected String data;
    protected String tresc;
    protected Boolean zalacznik;
    
    public Odebrane(String adres, String temat, String data, Boolean zalacznik)
    {
        this.adres = adres;
        this.temat = temat;
        this.data = data;
        this.zalacznik = zalacznik;
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
       
            String spacje = OdpowiednieParsowanie(adres, temat, data);
            return adres + spacje + temat + spacje + data;
    
    }
}
