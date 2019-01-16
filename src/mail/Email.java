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
public class Email {
    
    Odebrane odebrane;
    Wyslane wyslane;
    
    private String Odbiorca_czy_Nadawca;
    
    public Email(String adres, String temat, String data, String Odbiorca_czy_Nadawca, Boolean zalacznik)
    {
        this.Odbiorca_czy_Nadawca = Odbiorca_czy_Nadawca;
        
        if(Odbiorca_czy_Nadawca.equals("Odbiorca"))
            odebrane = new Odebrane(adres, temat, data, zalacznik);
        
        else if(Odbiorca_czy_Nadawca.equals("Nadawca"))
            wyslane = new Wyslane(adres, temat, data);
    }
    
    public void setTresc(String tresc)
    {
        if(Odbiorca_czy_Nadawca.equals("Odbiorca"))
            odebrane.tresc = tresc;
        
        else if(Odbiorca_czy_Nadawca.equals("Nadawca"))
            wyslane.tresc = tresc;
    }
    

    public String getInfo() 
    {
            if(Odbiorca_czy_Nadawca.equals("Odbiorca"))
                return odebrane.adres + " " + odebrane.temat + " " + odebrane.data;
            
           else if(Odbiorca_czy_Nadawca.equals("Nadawca"))
                return odebrane.adres + " " + odebrane.temat + " " + odebrane.data;
            
           else return null;
    }
    
    
    
    
    
}