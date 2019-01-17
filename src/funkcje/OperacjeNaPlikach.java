/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funkcje;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Michał Fabrowski
 */
public class OperacjeNaPlikach {
    private File odebrane;
    private File wyslane;
    private File kontakty;
    
    public OperacjeNaPlikach() throws IOException
            {
                odebrane = new File("odebrane.txt");
                //odebrane.setReadable(true);
                //odebrane.setWritable(true);
                if(!odebrane.exists())
                {
                    odebrane.createNewFile();
                }
                
                wyslane = new File("wyslane.txt");
                if(!wyslane.exists())
                {
                    wyslane.createNewFile();
                }
                
                kontakty = new File("kontakty.txt");
                if(!kontakty.exists())
                {
                    kontakty.createNewFile();
                }
                
            }
}
