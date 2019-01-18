/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funkcje;

import java.io.IOException;

/**
 *
 * @author Michał
 */
public class Funkcjonalnosci {
    
    final int dlugoscWyswietlana = 40;
    OperacjeNaPlikach onp = null;
    
    public String WyswietlaneSpacje(String s1)
    {                       
        String spacje= "";               
             
        for(int i=0; i < (dlugoscWyswietlana - s1.length());i++)
        {
            spacje+=" ";
        }
        
      return spacje;          
    }
    
    public void TworzeniePlikow()
    {               
        try {
    onp = new OperacjeNaPlikach();
}catch(IOException e) {
        
    }
    }
    
    
}
