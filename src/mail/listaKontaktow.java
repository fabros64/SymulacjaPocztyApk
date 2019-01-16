/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail;

import java.util.LinkedList;

/**
 *
 * @author 
 */
public class listaKontaktow {
    
    protected LinkedList<Kontakt> kontakty;
    
    public listaKontaktow() {
        
        kontakty = new LinkedList<>();
}
    
    public String[] getInfos(){
        String[] rob = new String[kontakty.size()];
        int i = 0;
        for (Kontakt z : kontakty) {
            rob[i++] = z.getInfo();
        }
        return rob;
    }
    
     public String[] getInfos2(){
        String[] rob = new String[kontakty.size()];
        int i = 0;
        for (Kontakt z : kontakty) {
            rob[i++] = z.getAdres();
        }
        return rob;
    }
    
    public void dodajKontakt(Kontakt k){
        kontakty.add(k);
    }
    
    public void usunKontakt(int index)
    {
        kontakty.remove(index);
    }
    
    //
    
}
