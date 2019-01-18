/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funkcje;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import mail.Odebrane;
import mail.listEmail;
import mail.listOdebrane;
import mail.listWyslane;
import mail.listaKontaktow;

/**
 *
 * @author Michał Fabrowski
 */
public class OperacjeNaPlikach {
    private File odebrane;
    private File wyslane;
    private File kontakty;
    private FileWriter zapis;
    private PrintStream bw;
    private Scanner odczyt;
    BufferedReader br;
    FileReader fr;
    
     
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
                    wyslane.setWritable(true);
                    
                }
                
                kontakty = new File("kontakty.txt");
                if(!kontakty.exists())
                {
                    kontakty.createNewFile();
                }
                
            }
    
    public void ZapisOdebranychDoPliku(listOdebrane listaOdebranych)
    {
        try {
            zapis = new FileWriter(odebrane);            
            bw = new PrintStream(odebrane);
            
            for(int i = 0; i < listaOdebranych.getInfos().length; i++)
            {                             
                bw.print(listaOdebranych.getInfos()[i]+ " " + listaOdebranych.getTresci()[i]);
                bw.println();                
            }                     
        } catch (IOException ex) {
            Logger.getLogger(OperacjeNaPlikach.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(zapis != null)
                try {
                    zapis.close();
                    bw.close();
                    
            } catch (IOException ex) {
                Logger.getLogger(OperacjeNaPlikach.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public void ZapisWyslanychDoPliku(listWyslane listaWyslanych)
    {
        try {
            zapis = new FileWriter(wyslane);
            
            bw = new PrintStream(wyslane);
            for(int i = 0; i < listaWyslanych.getInfos().length; i++)
            {               
                //bw.write(listaWyslanych.getInfos()[i] + listaWyslanych.getTresci()[i]);
               // bw.newLine();
                bw.print(listaWyslanych.getInfos()[i]+ " " + listaWyslanych.getTresci()[i]);
                bw.println();
                
            }                     
        } catch (IOException ex) {
            Logger.getLogger(OperacjeNaPlikach.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(zapis != null)
                try {
                    zapis.close();
                    bw.close();
                    
            } catch (IOException ex) {
                Logger.getLogger(OperacjeNaPlikach.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
    public void ZapisKontaktowDoPliku(listaKontaktow listaKontaktow)
    {
        try {
            zapis = new FileWriter(kontakty);
            
            bw = new PrintStream(kontakty);
            for(int i = 0; i < listaKontaktow.getInfos().length; i++)
            {               
                //bw.write(listaWyslanych.getInfos()[i] + listaWyslanych.getTresci()[i]);
               // bw.newLine();
                bw.print(listaKontaktow.getInfos()[i]);
                bw.println();
                
            }                     
        } catch (IOException ex) {
            Logger.getLogger(OperacjeNaPlikach.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(zapis != null)
                try {
                    zapis.close();
                    bw.close();
                    
            } catch (IOException ex) {
                Logger.getLogger(OperacjeNaPlikach.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
    public listOdebrane WczytajOdebraneZPliku() throws IOException
    {
        Odebrane od;
        listOdebrane lista = new listOdebrane();
        try {
            odczyt = new Scanner(odebrane);
            fr = new FileReader(odebrane);
            br = new BufferedReader(fr);
            String mail;
            while(odczyt.hasNext())
            {
                mail = odczyt.nextLine();
                //String mailR = mail.replace();
                String[] mailSplit = mail.split(" ");
                od = new Odebrane(mailSplit[0],mailSplit[1], mailSplit[2]+mailSplit[3], false);
                String tresc="";
                for(int i=4; i<mailSplit.length;i++)
                {
                    tresc+=mailSplit[i];               
                }
                od.setTresc(tresc);
                
                lista.dodajEmail(od);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OperacjeNaPlikach.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
            odczyt.close();
            fr.close();
            br.close();
        }
        
        return lista;
    }
    /*
    public listWyslane WczytajWyslaneZPliku()
    {
        
    }
    
    public listaKontaktow WczytajKontaktyZPliku()
    {
        
    }
*/
}
