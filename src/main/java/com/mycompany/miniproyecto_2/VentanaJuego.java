package com.mycompany.miniproyecto_2;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author julda
 */
public class VentanaJuego extends javax.swing.JFrame {
    public String botonDescubierto1;
    public String botonDescubierto2;
    public Timer tiempo;
    int numeroRonda  = 0;
    int numeroDeFigurasDescubiertas = 1;
    
    /**
     * Creates new form VentanaJuego
     */
    public VentanaJuego(){
        initComponents();
        abrirVentana();
        iniciarPartida();  
    }
    
    private void iniciarPartida() {
        darNumeroRandomAFigura();
    }
    
private void darNumeroRandomAFigura(){//aqui se le asigna un numero a cada boton, el cual se usa para asignar cual se debera adivinar
        jButton1.setText(""+ (int) (1+Math.random()*21));
        jButton2.setText(""+ (int) (1+Math.random()*21));
        jButton3.setText(""+ (int) (1+Math.random()*21));
        jButton4.setText(""+ (int) (1+Math.random()*21));
        jButton5.setText(""+ (int) (1+Math.random()*21));
        jButton6.setText(""+ (int) (1+Math.random()*21));
        jButton7.setText(""+ (int) (1+Math.random()*21));
        jButton8.setText(""+ (int) (1+Math.random()*21));
        jButton9.setText(""+ (int) (1+Math.random()*21));
        jButton10.setText(""+ (int) (1+Math.random()*21));
        jButton11.setText(""+ (int) (1+Math.random()*21));
        jButton12.setText(""+ (int) (1+Math.random()*21));
        jButton13.setText(""+ (int) (1+Math.random()*21));
        jButton14.setText(""+ (int) (1+Math.random()*21));
        jButton15.setText(""+ (int) (1+Math.random()*21));
        jButton16.setText(""+ (int) (1+Math.random()*21));
        jButton17.setText(""+ (int) (1+Math.random()*21));
        jButton18.setText(""+ (int) (1+Math.random()*21));
        jButton19.setText(""+ (int) (1+Math.random()*21));
        jButton20.setText(""+ (int) (1+Math.random()*21));
        jButton21.setText(""+ (int) (1+Math.random()*21));
        
        lExplicacion.setText("Observe las figuras atentamente"); 
        verificarFigura();        
    }    
    
    public void verificarFigura(){ 
        //aqui se verifica si el numero asignado a la figura (lFigura) coincide con el numero de algun boton
        //si es asi, ese boton sera el que se deba pulsar para subir de nivel
        //si no coincide ningun numero, se vuelve a asignar un numero a cada boton
        lFigura.setText(""+ (int) (1+Math.random()*21));
        lFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png")));
   
        if (lFigura.getText().equals(jButton1.getText())){
            botonDescubierto1="1";
            escogerFigura();
        } else if(lFigura.getText().equals(jButton2.getText())){
            botonDescubierto1="2";
            escogerFigura();
        } else if(lFigura.getText().equals(jButton3.getText())){
            botonDescubierto1="3";
            escogerFigura();
        } else if(lFigura.getText().equals(jButton4.getText())){
            botonDescubierto1="4";
            escogerFigura();
        } else if(lFigura.getText().equals(jButton5.getText())){
            botonDescubierto1="5";
            escogerFigura();
        } else if(lFigura.getText().equals(jButton6.getText())){
            botonDescubierto1="6";
            escogerFigura();
        } else if(lFigura.getText().equals(jButton7.getText())){
            botonDescubierto1="7";
            escogerFigura();
        } else if(lFigura.getText().equals(jButton8.getText())){
            botonDescubierto1="8";            
            escogerFigura();
        } else if(lFigura.getText().equals(jButton9.getText())){
            botonDescubierto1="9";
            escogerFigura();
        } else if(lFigura.getText().equals(jButton10.getText())){
            botonDescubierto1="10";            
            escogerFigura();
        } else if(lFigura.getText().equals(jButton11.getText())){
            botonDescubierto1="11";            
            escogerFigura();
        } else if(lFigura.getText().equals(jButton12.getText())){
            botonDescubierto1="12";            
            escogerFigura();
        } else if(lFigura.getText().equals(jButton13.getText())){
            botonDescubierto1="13";            
            escogerFigura();
        } else if(lFigura.getText().equals(jButton14.getText())){
            botonDescubierto1="14";            
            escogerFigura();
        } else if(lFigura.getText().equals(jButton15.getText())){
            botonDescubierto1="15";            
            escogerFigura();
        } else if(lFigura.getText().equals(jButton16.getText())){
            botonDescubierto1="16";            
            escogerFigura();
        } else if(lFigura.getText().equals(jButton17.getText())){
            botonDescubierto1="17";            
            escogerFigura();
        } else if(lFigura.getText().equals(jButton18.getText())){
            botonDescubierto1="18";            
            escogerFigura();
        } else if(lFigura.getText().equals(jButton19.getText())){
            botonDescubierto1="19";            
            escogerFigura();
        } else if(lFigura.getText().equals(jButton20.getText())){
            botonDescubierto1="20";            
            escogerFigura();
        } else if(lFigura.getText().equals(jButton21.getText())){
            botonDescubierto1="21";            
            escogerFigura();
        } else{
            darNumeroRandomAFigura();
        }
    }
    
    
    private void escogerFigura(){               
        botonDescubierto2 = botonDescubierto1;
        numeroRonda++;
        numeroDeFigurasDescubiertas++;
        System.out.println(botonDescubierto1);
                
        switch(botonDescubierto1){
            //se verifica que boton coincidio, y este sera uno de los que se muestre al inicio de la ronda
            case "1":
                jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono1.png")));
                break;
            case "2":
                jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono2.png")));
                break;
            case "3":
                jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono3.png")));
                break;
            case "4":
                jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono4.png")));
                break;
            case "5":
                jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono5.png")));
                break;
            case "6":
                jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono6.png")));
                break;      
            case "7":
                jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono7.png")));
                break;                      
            case "8":
                jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono8.png")));
                break;      
            case "9":
                jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono9.png")));
                break;      
            case "10":
                jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono10.png")));
                break;  
            case "11":
                jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono11.png")));
                break;  
            case "12":
                jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono12.png")));
                break;  
            case "13":
                jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono13.png")));
                break;  
            case "14":
                jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono14.png")));
                break; 
            case "15":
                jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono15.png")));
                break;
            case "16":
                jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono16.png")));
                break;      
            case "17":
                jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono17.png")));
                break;                      
            case "18":
                jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono18.png")));
                break;      
            case "19":
                jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono19.png")));
                break;      
            case "20":
                jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono20.png")));
                break;  
            case "21":
                jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono21.png")));
                break;                
        }
        //esto serviria para mostrar otras figuras distintas a la que se debe adivinar
        while(botonDescubierto2.equals(botonDescubierto1)){
            botonDescubierto2 = (""+(int) (1+Math.random()*9));
        }
        System.out.println(botonDescubierto2);
        switch(botonDescubierto2){
            case "1":
                jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono1.png")));
                break;           
            case "2":
                jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono2.png")));
                break;            
            case "3":
                jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono3.png")));
                break; 
            case "4":
                jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono4.png")));
                break;                
            case "5":
                jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono5.png")));
                break;
            case "6":
                jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono6.png")));
                break;           
            case "7":
                jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono7.png")));
                break;            
            case "8":
                jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono8.png")));
                break; 
            case "9":
                jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono9.png")));
                break;                
            case "10":
                jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono10.png")));
                break;
            case "11":
                jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono11.png")));
                break;           
            case "12":
                jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono12.png")));
                break;            
            case "13":
                jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono13.png")));
                break; 
            case "14":
                jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono14.png")));
                break;                
            case "15":
                jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono15.png")));
                break;
            case "16":
                jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono16.png")));
                break;           
            case "17":
                jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono17.png")));
                break;            
            case "18":
                jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono18.png")));
                break; 
            case "19":
                jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono19.png")));
                break;                
            case "20":
                jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono20.png")));
                break;  
            case "21":
                jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono21.png")));
                break;                  
        }
        //essta funcion se ejecuta 3000(o el numero que se coloque en el Timer)milisegundos despues de abierta la ventana
        //sirve para dejar de mostrar las figuras que salen al  inicio y para mostrar la que debes adivinar
        tiempo = new Timer(3000, null);
        tiempo.start();
        
        tiempo.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                cambioDeIconos();
            }
            private void cambioDeIconos() {
                //aqui se le vuelve a poner el icono inicial (en blanco sin ninguna figura)
                jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png")));
                jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png")));
                jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png")));                
                jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png")));
                jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png")));
                jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png")));
                jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png")));
                jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png")));
                jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png")));  
                jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png")));
                jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png")));
                jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png")));
                jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png")));
                jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png")));
                jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png"))); 
                jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png")));
                jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png")));
                jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png")));
                jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png")));  
                jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png")));
                jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png")));                
                
                switch(botonDescubierto1){
                    //aqui se coloca el icono de la figura que hay de adivinar en la esquina inferior izq.
                    case "1":
                        lFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono1.png")));
                        break;
                    case "2":
                        lFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono2.png")));
                        break;
                    case "3":
                        lFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono3.png")));
                        break;
                    case "4":
                        lFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono4.png")));
                        break;
                    case "5":
                        lFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono5.png")));
                        break;
                    case "6":
                        lFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono6.png")));
                        break;    
                    case "7":
                        lFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono7.png")));
                        break;
                    case "8":
                        lFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono8.png")));
                        break;
                    case "9":
                        lFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono9.png")));
                        break;  
                    case "10":
                        lFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono10.png")));
                        break;                        
                    case "11":
                        lFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono11.png")));
                        break;
                    case "12":
                        lFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono12.png")));
                        break;
                    case "13":
                        lFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono13.png")));
                        break;
                    case "14":
                        lFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono14.png")));
                        break;
                    case "15":
                        lFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono15.png")));
                        break;
                    case "16":
                        lFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono16.png")));
                        break;    
                    case "17":
                        lFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono17.png")));
                        break;
                    case "18":
                        lFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono18.png")));
                        break;
                    case "19":
                        lFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono19.png")));
                        break;   
                    case "20":
                        lFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono20.png")));
                        break;                        
                    case "21":
                        lFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono21.png")));
                        break;                        
            }
                //se cambia el texto que decia "Observe las figuras atentamente"
                lExplicacion.setText("Destapa la figura que cumpla con la condición.");
            }
        }); 
    }
    
    private void abrirVentana(){
        setTitle ("Juego de Memoria");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); 
        setResizable(false);
        setLayout(null);    
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        txtPuntos = new javax.swing.JTextField();
        lPuntuacion = new javax.swing.JLabel();
        lVidas = new javax.swing.JLabel();
        lNumero1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        lExplicacion = new javax.swing.JLabel();
        jButton37 = new javax.swing.JButton();
        lFigura = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        jScrollPane1.setViewportView(jTextPane1);

        txtPuntos.setText("0-0-0-0");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lPuntuacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lPuntuacion.setText("PUNTUACIÓN:");

        lVidas.setText("VIDAS");

        lNumero1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lNumero1.setText("0");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("0");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("0");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("0");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png"))); // NOI18N
        jButton1.setText("1");
        jButton1.setIconTextGap(-8);
        jButton1.setMaximumSize(new java.awt.Dimension(60, 60));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png"))); // NOI18N
        jButton2.setText("1");
        jButton2.setIconTextGap(-8);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png"))); // NOI18N
        jButton3.setText("3");
        jButton3.setIconTextGap(-8);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png"))); // NOI18N
        jButton4.setText("4");
        jButton4.setToolTipText("");
        jButton4.setIconTextGap(-8);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png"))); // NOI18N
        jButton5.setText("5");
        jButton5.setIconTextGap(-8);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png"))); // NOI18N
        jButton6.setText("6");
        jButton6.setIconTextGap(-8);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png"))); // NOI18N
        jButton7.setText("7");
        jButton7.setIconTextGap(-8);

        lExplicacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lExplicacion.setText("jLabel4");

        jButton37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton37.setText("TERMINAR JUEGO");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        lFigura.setText("jLabel4");

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png"))); // NOI18N
        jButton8.setText("1");
        jButton8.setIconTextGap(-8);
        jButton8.setMaximumSize(new java.awt.Dimension(60, 60));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png"))); // NOI18N
        jButton9.setText("1");
        jButton9.setIconTextGap(-8);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png"))); // NOI18N
        jButton10.setText("3");
        jButton10.setIconTextGap(-8);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png"))); // NOI18N
        jButton11.setText("4");
        jButton11.setToolTipText("");
        jButton11.setIconTextGap(-8);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png"))); // NOI18N
        jButton12.setText("5");
        jButton12.setIconTextGap(-8);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png"))); // NOI18N
        jButton13.setText("6");
        jButton13.setIconTextGap(-8);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png"))); // NOI18N
        jButton14.setText("7");
        jButton14.setIconTextGap(-8);

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png"))); // NOI18N
        jButton15.setText("1");
        jButton15.setIconTextGap(-8);
        jButton15.setMaximumSize(new java.awt.Dimension(60, 60));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png"))); // NOI18N
        jButton16.setText("1");
        jButton16.setIconTextGap(-8);

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png"))); // NOI18N
        jButton17.setText("3");
        jButton17.setIconTextGap(-8);

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png"))); // NOI18N
        jButton18.setText("4");
        jButton18.setToolTipText("");
        jButton18.setIconTextGap(-8);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png"))); // NOI18N
        jButton19.setText("5");
        jButton19.setIconTextGap(-8);

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png"))); // NOI18N
        jButton20.setText("6");
        jButton20.setIconTextGap(-8);

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconInicial.png"))); // NOI18N
        jButton21.setText("7");
        jButton21.setIconTextGap(-8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lExplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(lPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lNumero1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(41, 41, 41)
                                .addComponent(lVidas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lVidas))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lFigura, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lExplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lExplicacion;
    private javax.swing.JLabel lFigura;
    private javax.swing.JLabel lNumero1;
    private javax.swing.JLabel lPuntuacion;
    private javax.swing.JLabel lVidas;
    private javax.swing.JTextField txtPuntos;
    // End of variables declaration//GEN-END:variables

}
