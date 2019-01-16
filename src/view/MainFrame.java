/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import funkcje.rozmiary;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JRadioButton;
import mail.Email;
import mail.Kontakt;
import mail.Odebrane;
import mail.Wyslane;
import mail.listOdebrane;
import mail.listWyslane;
import mail.listaKontaktow;

/**
 *
 * @author 
 */
public class MainFrame extends javax.swing.JFrame implements KeyListener{
    
    private rozmiary rozm;

    /**
     * Creates new form MainFrame
     */
    
    
    protected listaKontaktow kontakty;
    protected listOdebrane listaOdebranych;
    protected listWyslane listaWyslanych;
    
    protected JButton button;
    protected JRadioButton isOdebrane;
    
    public MainFrame() {
        initComponents();
        pLogowanie.addKeyListener(this); 
        pLogowanie.requestFocus(); 
        
        rbOdebrane.setSelected(true);
        rbOdebrane.setEnabled(false);
        
        button = btnWyswietl;
        isOdebrane = rbOdebrane;
        
        
        
        Odebrane e1 = new Odebrane("fabrosssssdfhdfhdf@op.pl", "Praca magisterska", "2019-01-11  07:30",true);
        e1.setTresc("Przesyłam pierwszy rozdzial pracy licencjackiej\n"
                +"Mozna pobrac http://www.dropbox.com/T56fH\n"
                +"Z poważaniem\n");
        Odebrane e2 = new Odebrane("Marcel@op.pl", "Zaległości", "2018-09-15  11:12", false);
        e2.setTresc("W piatek sie widzimy na zajeciach\n\n"
                +"Nie zapomnij o kasie! :P\n");
        Odebrane e3 = new Odebrane("Tomasz@op.pl", "Jak się masz?", "2018-10-07  04:56",true);
        e3.setTresc("Cześć\n"
                +"Jak się masz, nie odzywasz sie wgl?\n"
                +"Wszystko w porzadku?\n");
        Odebrane e4 = new Odebrane("Robert@vp.pl", "Gra", "2016-11-19  09:01",false);
        e4.setTresc("kiedy się umawiamy na pogranie\n"
                +"ja od piatku mam czas\n");
       
        listaOdebranych = new listOdebrane();
        
        listaOdebranych.dodajEmail(e1);
        listaOdebranych.dodajEmail(e2);
        listaOdebranych.dodajEmail(e3);
        listaOdebranych.dodajEmail(e4);
        
        
        Wyslane w1 = new Wyslane("ktos@gmail.com          ", "Kupno myszki komputerowej                                     ", "2017-03-24  10:23",false);
        w1.setTresc("Dzień dobry, jestem zainteresowany kupnem myszki. \n"
                + "Mam na mysli myszke ZX76, chciałbym się zapytać czy mysz jest dostepna w kolorze niebieskim\n"
                + "Z gory dziekuje za odpowiedz");
        Wyslane w2 = new Wyslane("Marek@gmail.com      ", "Problem z komputerem.                                               ", "2014-02-15  15:43",true);
        w2.setTresc("Mam duzy problem ze starym komputerem \n"
                +"Juz tlumacze, jak go wlaczam to dziala dobrze przez 5 minut a potem cos zaczyna w nim piszczec i sie wylacza sam\n"
                +"nie wiem co sie dzieje\n"
                +"pomocy\n");
        Wyslane w3 = new Wyslane("Monika@interia.pl       ", "Jak prawidłowo zaparzyć yerba mate?                    ", "2020-01-10  00:24",false);
        w3.setTresc("1. Woda zimna i zmrożona da nam terrere, czyli Yerba Mate zaparzone na zimno. Będzie nieco delikatniejsza w smaku i w mocy, "
                + "ale przyjemnie nas ochłodzi i lekko pobudzi. Możemy zrobić 2-3 zimne zalania Yerba Mate i wciąż będziemy otrzymywać pełnowartościowy napar.\n"
                + "2. Letnia woda (30-40*C) da nam bardzo łagodne Yerba Mate, będziemy też musieli zdecydowanie dłużej zanurzać je w wodzie, żeby dostać swoją dawkę kofeiny.\n"
                + "3. Woda o temperaturze 50-60*C również świetnie sprawdzi się do długiego parzenia Yerba Mate, taki napar możemy wypić nawet pod wieczór.\n");
        
        Wyslane w4 = new Wyslane("Karol@gmail.com        ", "Potrzebuje pożyczyć coś                                             ", "2015-08-14  13:20",true);
        w4.setTresc("Cześć masz może wkrętarkę?\n"
                +"Potrzebuje pożyczyć na pare dni\n"
                +"Najlepiej z udarem\n");
        
        
        listaWyslanych = new listWyslane();
        
        listaWyslanych.dodajWyslane(w1);
        listaWyslanych.dodajWyslane(w2);
        listaWyslanych.dodajWyslane(w3);
        listaWyslanych.dodajWyslane(w4);
                       
        
        
        AktualizujListeWiadomosci();
        
               
        taInfo.setEditable(false);
        pMain.setVisible(false);
        lbLoginError.setVisible(false);
        pfHaslo.setEchoChar('•');
        
        kontakty = new listaKontaktow();
        
        Kontakt k1 = new Kontakt("Michał", "Fabrowski", "fabros@op.pl", "To jest Michał");
        Kontakt k2 = new Kontakt("FirmaIT", "firma@gmail.com", "A to jest firma");
        
        kontakty.dodajKontakt(k1);
        kontakty.dodajKontakt(k2);
        
        DefaultListModel<String> lm2 = new DefaultListModel<>();
        String[] zespoly = kontakty.getInfos2();       // jakby inicjalizacja listy była poza konstruktorem
        for (String info : zespoly) {
            lm2.addElement(info);
        }
        Kontakty.setModel(lm2);
        
        String imie2 = "Mariusz";
        String nazwisko2 = "Nowak";
        
        rozm = new rozmiary();
        setSize(rozm.width,rozm.height);
        
        btnWyswietl.setEnabled(false);
        btnUsun.setEnabled(false);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        pMain = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lEmaile = new javax.swing.JList<>();
        lbWitaj = new javax.swing.JLabel();
        rbOdebrane = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        rbWyslane = new javax.swing.JRadioButton();
        btnWyswietl = new javax.swing.JButton();
        Login = new javax.swing.JLabel();
        Haslo = new javax.swing.JLabel();
        Imie = new javax.swing.JLabel();
        Nazwisko = new javax.swing.JLabel();
        POP3 = new javax.swing.JLabel();
        SMTP = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Kontakty = new javax.swing.JList<>();
        btnNowaWiadomosc = new javax.swing.JButton();
        btnUsun = new javax.swing.JButton();
        Email = new javax.swing.JLabel();
        pLogowanie = new javax.swing.JPanel();
        btnZaloguj = new javax.swing.JButton();
        tfLogin = new javax.swing.JTextField();
        lbLogin = new javax.swing.JLabel();
        lbHaslo = new javax.swing.JLabel();
        lbLoginError = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taInfo = new javax.swing.JTextArea();
        pfHaslo = new javax.swing.JPasswordField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        pMain.setPreferredSize(new java.awt.Dimension(800, 600));

        lEmaile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lEmaileMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lEmaile);

        rbOdebrane.setText("Odebrane");
        rbOdebrane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOdebraneActionPerformed(evt);
            }
        });

        jButton3.setText("Kontakty");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        rbWyslane.setText("Wysłane");
        rbWyslane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbWyslaneActionPerformed(evt);
            }
        });

        btnWyswietl.setText("Wyświetl treść");
        btnWyswietl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWyswietlActionPerformed(evt);
            }
        });

        jScrollPane6.setViewportView(Kontakty);

        btnNowaWiadomosc.setText("Nowa wiadomość");
        btnNowaWiadomosc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNowaWiadomoscActionPerformed(evt);
            }
        });

        btnUsun.setText("Usuń");
        btnUsun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pMainLayout = new javax.swing.GroupLayout(pMain);
        pMain.setLayout(pMainLayout);
        pMainLayout.setHorizontalGroup(
            pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMainLayout.createSequentialGroup()
                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pMainLayout.createSequentialGroup()
                                .addGap(0, 166, Short.MAX_VALUE)
                                .addComponent(POP3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SMTP, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pMainLayout.createSequentialGroup()
                                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pMainLayout.createSequentialGroup()
                                        .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pMainLayout.createSequentialGroup()
                                                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Haslo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(Nazwisko, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(Imie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(91, 91, 91))
                                            .addGroup(pMainLayout.createSequentialGroup()
                                                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pMainLayout.createSequentialGroup()
                                        .addComponent(Email)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbWitaj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMainLayout.createSequentialGroup()
                                        .addComponent(btnUsun)
                                        .addGap(24, 24, 24))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMainLayout.createSequentialGroup()
                        .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pMainLayout.createSequentialGroup()
                                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pMainLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pMainLayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(btnNowaWiadomosc))
                                    .addGroup(pMainLayout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pMainLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbOdebrane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbWyslane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnWyswietl)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)))
                .addGap(67, 67, 67))
        );
        pMainLayout.setVerticalGroup(
            pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMainLayout.createSequentialGroup()
                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pMainLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Haslo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Imie, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(pMainLayout.createSequentialGroup()
                        .addComponent(lbWitaj, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUsun, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnWyswietl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Email))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pMainLayout.createSequentialGroup()
                        .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pMainLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(rbOdebrane, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbWyslane, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pMainLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnNowaWiadomosc, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(POP3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SMTP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        pLogowanie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pLogowanieKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pLogowanieKeyTyped(evt);
            }
        });

        btnZaloguj.setText("Zaloguj");
        btnZaloguj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZalogujActionPerformed(evt);
            }
        });

        lbLogin.setText("Login");

        lbHaslo.setText("Haslo");

        lbLoginError.setForeground(new java.awt.Color(255, 0, 0));
        lbLoginError.setText("Błedne dane");

        taInfo.setColumns(20);
        taInfo.setRows(5);
        taInfo.setText("Dane do logowania:\n\nLogin:  Mariusz@gmail.com\nHasło:  Qwerty123");
        jScrollPane3.setViewportView(taInfo);

        pfHaslo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfHasloActionPerformed(evt);
            }
        });
        pfHaslo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pfHasloKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pLogowanieLayout = new javax.swing.GroupLayout(pLogowanie);
        pLogowanie.setLayout(pLogowanieLayout);
        pLogowanieLayout.setHorizontalGroup(
            pLogowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLogowanieLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pLogowanieLayout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addGroup(pLogowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbHaslo)
                    .addComponent(lbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pLogowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pLogowanieLayout.createSequentialGroup()
                        .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(367, Short.MAX_VALUE))
                    .addGroup(pLogowanieLayout.createSequentialGroup()
                        .addGroup(pLogowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnZaloguj)
                            .addComponent(lbLoginError)
                            .addComponent(pfHaslo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pLogowanieLayout.setVerticalGroup(
            pLogowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pLogowanieLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pLogowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLogin))
                .addGap(18, 18, 18)
                .addGroup(pLogowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHaslo)
                    .addComponent(pfHaslo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbLoginError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnZaloguj)
                .addGap(216, 216, 216))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMain, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(pLogowanie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 54, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMain, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(72, Short.MAX_VALUE)
                    .addComponent(pLogowanie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(79, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lEmaileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lEmaileMouseClicked
        // TODO add your handling code here:
        btnWyswietl.setEnabled(true);
        btnUsun.setEnabled(true);
      
    }//GEN-LAST:event_lEmaileMouseClicked

    private void rbOdebraneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOdebraneActionPerformed
        
        
        btnWyswietl.setEnabled(false);
        btnUsun.setEnabled(false);
        
        rbWyslane.setSelected(false);
        rbOdebrane.setEnabled(false);
        rbWyslane.setEnabled(true);
        
        
        AktualizujListeWiadomosci();
    }//GEN-LAST:event_rbOdebraneActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Kontakty k1 = new Kontakty(this, Kontakty);
        k1.setVisible(true);
        //dispose();
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Logowanie()
    {
        if((tfLogin.getText().equals("Mariusz@gmail.com")) && (pfHaslo.getText().equals("Qwerty123"))) 
        {
            pLogowanie.setVisible(false);
            pMain.setVisible(true);
            
            String login2 = tfLogin.getText();
            /*taWitaj.setText("Witaj " + login2 + " !\n"
                    + "Twoje imie to: Mariusz\n"+
                    "Twoja nazwisko: Nowak \n"+
                    "POP3\n"+
                    "SMTP\n"+
                    "Twoje haslo :Qwerty123\n"+
                    "Dzisiajsza data to: ");
            */
            
            Login.setText("Login:   " + login2);
            Haslo.setText("Hasło:   " + pfHaslo.getText());
            Imie.setText("Imię:   Mariusz");
            Nazwisko.setText("Nazwisko:   Kowalski");
            Email.setText("Mariusz@gmail.com");
            POP3.setText("POP3:  pop.pocztastudenta.com ");
            SMTP.setText("SMTP:  smtp.pocztastudenta.com ");
                        
        
        }
        else
        {
            lbLoginError.setText("Niepoprawne dane!");
            lbLoginError.setVisible(true);
        }
        
        String login2 = tfLogin.getText();
        lbWitaj.setText("Witaj " + login2 + " !");
    }
    
    private void btnZalogujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZalogujActionPerformed
        // TODO add your handling code here:\\
        Logowanie();
    }//GEN-LAST:event_btnZalogujActionPerformed

    private void pfHasloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfHasloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfHasloActionPerformed

    private void btnWyswietlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWyswietlActionPerformed
        // TODO add your handling code here:
        
        //wylacz guzik wyswietl
        btnWyswietl.setEnabled(false);
        //nowa formatka
        Wyswietlenie wys = new Wyswietlenie(this, listaOdebranych, listaWyslanych, lEmaile );
        wys.setVisible(true);
        wys.setSize(800,600);
        //setVisible(false);
        
        
        
    }//GEN-LAST:event_btnWyswietlActionPerformed

    private void rbWyslaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbWyslaneActionPerformed
        
        btnWyswietl.setEnabled(false);
        btnUsun.setEnabled(false);
        
        rbOdebrane.setSelected(false);
        rbWyslane.setEnabled(false);
        rbOdebrane.setEnabled(true);
        
        AktualizujListeWiadomosci();
    }//GEN-LAST:event_rbWyslaneActionPerformed

    private void btnNowaWiadomoscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNowaWiadomoscActionPerformed
              
        //nowa formatka
        NowaWiadomosc now = new NowaWiadomosc(this, listaWyslanych, lEmaile, isOdebrane );
        now.setVisible(true);
        now.setSize(800,600);
        
    }//GEN-LAST:event_btnNowaWiadomoscActionPerformed

    private void btnUsunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsunActionPerformed
        
        int index = lEmaile.getSelectedIndex();
        
        if(isOdebrane.isSelected())
        {                       
            listaOdebranych.DeleteAt(index);                                  
            AktualizujListeWiadomosci();       
        }
        
        else 
        {                        
            listaWyslanych.DeleteAt(index);                               
            AktualizujListeWiadomosci();
        }                
    }//GEN-LAST:event_btnUsunActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(pLogowanie.isVisible())
        {
            if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            {
                Logowanie();
            }
        }
       
    }//GEN-LAST:event_formKeyPressed

    private void pLogowanieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pLogowanieKeyTyped
        // TODO add your handling code here:
        
        
            if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            {
                Logowanie();
            }
        
    }//GEN-LAST:event_pLogowanieKeyTyped

    private void pLogowanieKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pLogowanieKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            {
                Logowanie();
            }
    }//GEN-LAST:event_pLogowanieKeyPressed

    private void pfHasloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfHasloKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            {
                Logowanie();
            }
    }//GEN-LAST:event_pfHasloKeyPressed

    private void AktualizujListeWiadomosci()
    {
        
        
        if(isOdebrane.isSelected())
        {    
            DefaultListModel<String> lm = new DefaultListModel<>();
        String[] emaile = listaOdebranych.getInfos();       // jakby inicjalizacja listy była poza konstruktorem
        for (String info : emaile) {
            lm.addElement(info);
            } 
        lEmaile.setModel(lm);
        }
        
        else
        {     
            DefaultListModel<String> lm = new DefaultListModel<>();
        String[] emaile = listaWyslanych.getInfos();       // jakby inicjalizacja listy była poza konstruktorem
        for (String info : emaile) {
            lm.addElement(info);
            }      
        lEmaile.setModel(lm);
        }
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
                
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Haslo;
    private javax.swing.JLabel Imie;
    private javax.swing.JList<String> Kontakty;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel Nazwisko;
    private javax.swing.JLabel POP3;
    private javax.swing.JLabel SMTP;
    private javax.swing.JButton btnNowaWiadomosc;
    private javax.swing.JButton btnUsun;
    private javax.swing.JButton btnWyswietl;
    private javax.swing.JButton btnZaloguj;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JList<String> lEmaile;
    private javax.swing.JLabel lbHaslo;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbLoginError;
    private javax.swing.JLabel lbWitaj;
    private javax.swing.JPanel pLogowanie;
    private javax.swing.JPanel pMain;
    private javax.swing.JPasswordField pfHaslo;
    private javax.swing.JRadioButton rbOdebrane;
    private javax.swing.JRadioButton rbWyslane;
    private javax.swing.JTextArea taInfo;
    private javax.swing.JTextField tfLogin;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
      
        if(e.getKeyCode() == KeyEvent.VK_ENTER)
            {
                Logowanie();
            }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ENTER)
            {
                Logowanie();
            }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
