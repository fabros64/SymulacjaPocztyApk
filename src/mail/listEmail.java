/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail;

import java.util.LinkedList;

/**
 *
 * @auth
 */
public class listEmail {
     protected LinkedList<Email> lista;
    
    public listEmail() {
        
        lista = new LinkedList<>();
}
    
    public void dodajEmail(Email e){
        lista.add(e);
    }
    
    public String[] getInfos(){
        String[] rob = new String[lista.size()];
        int i = 0;
        for (Email z : lista) {
            rob[i++] = z.getInfo();
        }
        return rob;
    }
}
