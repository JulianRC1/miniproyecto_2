/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.miniproyecto_2;

import Modelo.Jugador;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author julda
 */
public class VentanaPrincipal extends JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        abrirVentana();
        initComponents();
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
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnIniciarJuego = new javax.swing.JButton();
        btnInstrucciones = new javax.swing.JButton();
        lJugador = new javax.swing.JLabel();
        txtNombreJugador = new javax.swing.JTextField();
        lTitulo = new javax.swing.JLabel();
        btnParaQueSirve = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        setForeground(java.awt.Color.white);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));

        btnIniciarJuego.setBackground(new java.awt.Color(204, 204, 204));
        btnIniciarJuego.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnIniciarJuego.setText("JUGAR");
        btnIniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarJuegoActionPerformed(evt);
            }
        });

        btnInstrucciones.setBackground(new java.awt.Color(204, 204, 204));
        btnInstrucciones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInstrucciones.setText("INSTRUCCIONES");
        btnInstrucciones.setActionCommand("jButton2");
        btnInstrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstruccionesActionPerformed(evt);
            }
        });

        lJugador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lJugador.setForeground(new java.awt.Color(255, 255, 255));
        lJugador.setText("Jugador:");

        txtNombreJugador.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreJugador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        lTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lTitulo.setText("MEMORIA");

        btnParaQueSirve.setBackground(new java.awt.Color(204, 204, 204));
        btnParaQueSirve.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnParaQueSirve.setText("??PARA QUE SIRVE?");
        btnParaQueSirve.setActionCommand("jButton3");
        btnParaQueSirve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParaQueSirveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btnInstrucciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnParaQueSirve)
                .addGap(107, 107, 107))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(lJugador)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(btnIniciarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(lTitulo)))
                .addGap(134, 240, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lJugador)
                    .addComponent(txtNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnIniciarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnParaQueSirve, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        btnInstrucciones.getAccessibleContext().setAccessibleName("jButton2");
        btnParaQueSirve.getAccessibleContext().setAccessibleName("jButton3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        
    
    private void iniciarJuego(){
       String nombre =txtNombreJugador.getText();
        if(!nombre.trim().isEmpty() || nombre.trim().length() > 0){
            Jugador jugador = new Jugador(nombre);        
            dispose(); 
            VentanaJuego ventanaJuego = new VentanaJuego();
            ventanaJuego.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,"Por favor ingrese su nombre", 
                    "Advertencia", JOptionPane.ERROR_MESSAGE);
            txtNombreJugador.requestFocusInWindow();
        }
    }    
    private void irAParaQueSirve(){
        VentanaParaQueSirve ventanaSirve = new VentanaParaQueSirve();
        ventanaSirve.setVisible(true);
        
    }
    
    private void irAInstrucciones(){
        VentanaInstrucciones ventanaInstrucciones = new VentanaInstrucciones();
        ventanaInstrucciones.setVisible(true);
    }
    
    private void btnParaQueSirveActionPerformed(java.awt.event.ActionEvent evt) {                                                
        if (evt.getSource() == btnParaQueSirve){
                irAParaQueSirve();
                this.dispose();
        }
        
    }                                               

    private void btnIniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        if (evt.getSource() == btnIniciarJuego){
                iniciarJuego();
        }      
    }                                               

    private void btnInstruccionesActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        if (evt.getSource()== btnInstrucciones){
                irAInstrucciones();
                this.dispose();
        }
    }                                                
    
   
    
    /** class ManejadoraDeEventos implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btnIniciarJuego){
                iniciarJuego();
            }
        }
        
    }*/

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnIniciarJuego;
    private javax.swing.JButton btnInstrucciones;
    private javax.swing.JButton btnParaQueSirve;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lJugador;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JTextField txtNombreJugador;
    // End of variables declaration                   
}
