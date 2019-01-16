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
    
    final int dlugoscWyswietlana = 48;
    
    public String WyswietlaneSpacje(String s1)
    {                       
        String spacje= new String();               
             
        for(int i=0; i < (dlugoscWyswietlana - s1.length());i++)
        {
            spacje+=" ";
        }
        
      return spacje;          
    }
}
