/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail;

import java.util.LinkedList;

/**
 *
 * @author Michał
 */
public class listWyslane {
      protected LinkedList<Wyslane> lista;
    
    public listWyslane() {
        
        lista = new LinkedList<>();
}
    
    public void dodajWyslane(Wyslane e){
        lista.add(e);
    }
    
    public String[] getInfos(){
        String[] rob = new String[lista.size()];
        int i = 0;
        for (Wyslane z : lista) {
            rob[i++] = z.getInfo();
        }
        return rob;
    }
    
    public String[] getTresci(){
        String[] rob = new String[lista.size()];
        int i = 0;
        for (Wyslane z : lista) {
            rob[i++] = z.getTresc();
        }
        return rob;
    }
    
     public void DeleteAt(int index)
    {
        lista.remove(index);
    }
    
    public Boolean czyZalacznik(int index)
    {
        if(lista.get(index).zalacznik.equals(true))
            return true;
        else return false;
    }
}
