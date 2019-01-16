/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funkcje;

/**
 *
 * @author Michał
 */
public class Funkcjonalnosci {
    
    final int dlugoscWyswietlana = 156;
    
    public String OdpowiednieParsowanie(String s1, String s2, String s3)
    {
        int dlugosc = s1.length() + s2.length() + s3.length();
        
        int dlugoscPrzerwy = (dlugoscWyswietlana-dlugosc)/3;
        
        String spacje="";
        
        for(int i=0; i < dlugoscPrzerwy;i++)
        {
            spacje+=" ";
        }
        
        return spacje;        
    }
}
