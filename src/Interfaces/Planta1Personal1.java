/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Clases.CSVEL;
import Clases.Main;
import static Clases.Main.listaBotones1;
import Clases.Planta1.Botones1;
import Clases.Planta1.Camaras1;
import Clases.Planta1.Ensambladores1;
import Clases.Planta1.Pantallas1;
import Clases.Planta1.Pines1;
import javax.swing.JOptionPane;

/**
 *
 * @author ijlem
 */
public class Planta1Personal1 extends javax.swing.JFrame {

    /**
     * Creates new form Planta2Personal
     */
    public Planta1Personal1() {
        initComponents();
        botones1.setText(String.valueOf(Main.botones1Contratados));
        pines1.setText(String.valueOf(Main.botones1Contratados));
        pantallas1.setText(String.valueOf(Main.pantallas1Contratados));
        pines1.setText(String.valueOf(Main.pines1Contratados));
        camaras1.setText(String.valueOf(Main.camaras1Contratados));
        ensambladores1.setText(String.valueOf(Main.ensambladores1));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        despedirEnsambladores1 = new javax.swing.JButton();
        pines1 = new javax.swing.JLabel();
        despedirPines1 = new javax.swing.JButton();
        contratarPines1 = new javax.swing.JButton();
        despedirPantallas1 = new javax.swing.JButton();
        contratarPantallas1 = new javax.swing.JButton();
        despedirBotones1 = new javax.swing.JButton();
        contratarBotones1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        contratarEnsambladores1 = new javax.swing.JButton();
        despedirCamaras1 = new javax.swing.JButton();
        contratarCamaras1 = new javax.swing.JButton();
        camaras1 = new javax.swing.JLabel();
        pantallas1 = new javax.swing.JLabel();
        botones1 = new javax.swing.JLabel();
        ensambladores1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        botones6.setBackground(new java.awt.Color(255, 255, 255));
        botones6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botones6.setText("0");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        despedirEnsambladores1.setBackground(new java.awt.Color(255, 153, 153));
        despedirEnsambladores1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        despedirEnsambladores1.setText("Despedir");
        despedirEnsambladores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despedirEnsambladores1ActionPerformed(evt);
            }
        });
        jPanel1.add(despedirEnsambladores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 279, -1, -1));

        pines1.setBackground(new java.awt.Color(255, 255, 255));
        pines1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pines1.setText("0");
        jPanel1.add(pines1, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 193, 34, -1));

        despedirPines1.setBackground(new java.awt.Color(255, 153, 153));
        despedirPines1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        despedirPines1.setText("Despedir");
        despedirPines1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despedirPines1ActionPerformed(evt);
            }
        });
        jPanel1.add(despedirPines1, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 193, -1, -1));

        contratarPines1.setBackground(new java.awt.Color(153, 255, 153));
        contratarPines1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        contratarPines1.setText("Contratar");
        contratarPines1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratarPines1ActionPerformed(evt);
            }
        });
        jPanel1.add(contratarPines1, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 193, -1, -1));

        despedirPantallas1.setBackground(new java.awt.Color(255, 153, 153));
        despedirPantallas1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        despedirPantallas1.setText("Despedir");
        despedirPantallas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despedirPantallas1ActionPerformed(evt);
            }
        });
        jPanel1.add(despedirPantallas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 150, -1, -1));

        contratarPantallas1.setBackground(new java.awt.Color(153, 255, 153));
        contratarPantallas1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        contratarPantallas1.setText("Contratar");
        contratarPantallas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratarPantallas1ActionPerformed(evt);
            }
        });
        jPanel1.add(contratarPantallas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 150, -1, -1));

        despedirBotones1.setBackground(new java.awt.Color(255, 153, 153));
        despedirBotones1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        despedirBotones1.setText("Despedir");
        despedirBotones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despedirBotones1ActionPerformed(evt);
            }
        });
        jPanel1.add(despedirBotones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 107, -1, -1));

        contratarBotones1.setBackground(new java.awt.Color(153, 255, 153));
        contratarBotones1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        contratarBotones1.setText("Contratar");
        contratarBotones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratarBotones1ActionPerformed(evt);
            }
        });
        jPanel1.add(contratarBotones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 107, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("C??maras:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 236, 150, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Ensambladores:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 279, 150, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Pines:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 193, 150, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Pantallas:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 150, 150, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Botones:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 107, 150, -1));

        contratarEnsambladores1.setBackground(new java.awt.Color(153, 255, 153));
        contratarEnsambladores1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        contratarEnsambladores1.setText("Contratar");
        contratarEnsambladores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratarEnsambladores1ActionPerformed(evt);
            }
        });
        jPanel1.add(contratarEnsambladores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 279, -1, -1));

        despedirCamaras1.setBackground(new java.awt.Color(255, 153, 153));
        despedirCamaras1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        despedirCamaras1.setText("Despedir");
        despedirCamaras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despedirCamaras1ActionPerformed(evt);
            }
        });
        jPanel1.add(despedirCamaras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 236, -1, -1));

        contratarCamaras1.setBackground(new java.awt.Color(153, 255, 153));
        contratarCamaras1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        contratarCamaras1.setText("Contratar");
        contratarCamaras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratarCamaras1ActionPerformed(evt);
            }
        });
        jPanel1.add(contratarCamaras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 236, -1, -1));

        camaras1.setBackground(new java.awt.Color(255, 255, 255));
        camaras1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        camaras1.setText("0");
        jPanel1.add(camaras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 236, 34, -1));

        pantallas1.setBackground(new java.awt.Color(255, 255, 255));
        pantallas1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pantallas1.setText("0");
        jPanel1.add(pantallas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 150, 34, -1));

        botones1.setBackground(new java.awt.Color(255, 255, 255));
        botones1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botones1.setText("0");
        jPanel1.add(botones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 107, 34, -1));

        ensambladores1.setBackground(new java.awt.Color(255, 255, 255));
        ensambladores1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ensambladores1.setText("0");
        jPanel1.add(ensambladores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 279, 34, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Personal");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/154-1548140_blue-brush-stroke-png-transparent-png.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contratarBotones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratarBotones1ActionPerformed
        if(Main.botones1Contratados < 15 && Main.botones1Contratados > 0 && (Main.botones1Contratados + Main.camaras1Contratados + Main.pantallas1Contratados + Main.pines1Contratados + Main.ensambladores1 < 15)){
            Main.botones1Contratados ++;
            Main.listaBotones1[Main.botones1Contratados-1] = new Botones1(Main.listaBotones1[0].botones1, Main.listaBotones1[0].botones1mut, Main.listaBotones1[0].botones1em);
            Main.listaBotones1[Main.botones1Contratados-1].start();
            botones1.setText(String.valueOf(Main.botones1Contratados));
            Planta1.botones1.setText(String.valueOf(Main.botones1Contratados));

            CSVEL csvEscritor = new CSVEL();
            csvEscritor.EscribirCsv(); 
            
            if((Main.dias - Main.diasTranscurridos) > 5){
                Main.diasTranscurridos = Main.dias;
                Main.telefonos1Ensamblados = Main.producidos1Total;
                Main.gananciasNetas1 = Main.gananciaTotal1 - (Main.botones1Gastos+Main.camaras1Gastos+Main.pantallas1Gastos+Main.pines1Gastos+Main.gerente1Gastos+Main.jefe1Gastos);
                Main.telefonos2Ensamblados = Main.producidos2Total;
                Main.gananciasNetas2 = Main.gananciaTotal2- (Main.botones2Gastos+Main.camaras2Gastos+Main.pantallas2Gastos+Main.pines2Gastos+Main.gerente2Gastos+Main.jefe2Gastos);
                csvEscritor.GuardarHistorico(); 
                Main.cambio = true;
            }
            
         }else{
            JOptionPane.showMessageDialog(null, "La planta ha llegado al n??mero m??ximo de empleados.");
        }
    }//GEN-LAST:event_contratarBotones1ActionPerformed

    private void despedirBotones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despedirBotones1ActionPerformed
        if(Main.botones1Contratados <= 15 && Main.botones1Contratados > 1){
            Main.botones1Contratados --;
            Main.listaBotones1[Main.botones1Contratados-1].setContratado(false);
            botones1.setText(String.valueOf(Main.botones1Contratados));
            Planta1.botones1.setText(String.valueOf(Main.botones1Contratados));
            
            CSVEL csvEscritor = new CSVEL();
            csvEscritor.EscribirCsv(); 
            
            if((Main.dias - Main.diasTranscurridos) > 5){
                Main.diasTranscurridos = Main.dias;
                Main.telefonos1Ensamblados = Main.producidos1Total;
                Main.gananciasNetas1 = Main.gananciaTotal1 - (Main.botones1Gastos+Main.camaras1Gastos+Main.pantallas1Gastos+Main.pines1Gastos+Main.gerente1Gastos+Main.jefe1Gastos);
                Main.telefonos2Ensamblados = Main.producidos2Total;
                Main.gananciasNetas2 = Main.gananciaTotal2- (Main.botones2Gastos+Main.camaras2Gastos+Main.pantallas2Gastos+Main.pines2Gastos+Main.gerente2Gastos+Main.jefe2Gastos);
                csvEscritor.GuardarHistorico(); 
                Main.cambio = true;
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No puedes despedir a todos los productores de botones ya que despedir??n al Gerente.");
        }
    }//GEN-LAST:event_despedirBotones1ActionPerformed

    private void contratarPantallas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratarPantallas1ActionPerformed
        if(Main.pantallas1Contratados < 15 && Main.pantallas1Contratados > 0 && (Main.botones1Contratados + Main.camaras1Contratados + Main.pantallas1Contratados + Main.pines1Contratados + Main.ensambladores1 < 15)){
            Main.pantallas1Contratados ++;
            Main.listaPantallas1[Main.pantallas1Contratados-1] = new Pantallas1(Main.listaPantallas1[0].pantallas1, Main.listaPantallas1[0].pantallas1mut, Main.listaPantallas1[0].pantallas1em);
            Main.listaPantallas1[Main.pantallas1Contratados-1].start();
            pantallas1.setText(String.valueOf(Main.pantallas1Contratados));
            Planta1.pantallas1.setText(String.valueOf(Main.pantallas1Contratados));

            CSVEL csvEscritor = new CSVEL();
            csvEscritor.EscribirCsv(); 
            
            if((Main.dias - Main.diasTranscurridos) > 5){
                Main.diasTranscurridos = Main.dias;
                Main.telefonos1Ensamblados = Main.producidos1Total;
                Main.gananciasNetas1 = Main.gananciaTotal1 - (Main.botones1Gastos+Main.camaras1Gastos+Main.pantallas1Gastos+Main.pines1Gastos+Main.gerente1Gastos+Main.jefe1Gastos);
                Main.telefonos2Ensamblados = Main.producidos2Total;
                Main.gananciasNetas2 = Main.gananciaTotal2- (Main.botones2Gastos+Main.camaras2Gastos+Main.pantallas2Gastos+Main.pines2Gastos+Main.gerente2Gastos+Main.jefe2Gastos);
                csvEscritor.GuardarHistorico(); 
                Main.cambio = true;
            }
            
         }else{
            JOptionPane.showMessageDialog(null, "La planta ha llegado al n??mero m??ximo de empleados.");
        }
    }//GEN-LAST:event_contratarPantallas1ActionPerformed

    private void despedirPantallas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despedirPantallas1ActionPerformed
        if(Main.pantallas1Contratados <= 15 && Main.pantallas1Contratados > 1){
            Main.pantallas1Contratados --;
            Main.listaPantallas1[Main.pantallas1Contratados-1].setContratado(false);
            pantallas1.setText(String.valueOf(Main.pantallas1Contratados));
            Planta1.pantallas1.setText(String.valueOf(Main.pantallas1Contratados));
            
            CSVEL csvEscritor = new CSVEL();
            csvEscritor.EscribirCsv(); 
            
            if((Main.dias - Main.diasTranscurridos) > 5){
                Main.diasTranscurridos = Main.dias;
                Main.telefonos1Ensamblados = Main.producidos1Total;
                Main.gananciasNetas1 = Main.gananciaTotal1 - (Main.botones1Gastos+Main.camaras1Gastos+Main.pantallas1Gastos+Main.pines1Gastos+Main.gerente1Gastos+Main.jefe1Gastos);
                Main.telefonos2Ensamblados = Main.producidos2Total;
                Main.gananciasNetas2 = Main.gananciaTotal2- (Main.botones2Gastos+Main.camaras2Gastos+Main.pantallas2Gastos+Main.pines2Gastos+Main.gerente2Gastos+Main.jefe2Gastos);
                csvEscritor.GuardarHistorico(); 
                Main.cambio = true;
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No puedes despedir a todos los productoes de pantallas ya que despedir??n al Gerente.");
        }
    }//GEN-LAST:event_despedirPantallas1ActionPerformed

    private void contratarPines1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratarPines1ActionPerformed
        if(Main.pines1Contratados < 15 && Main.pines1Contratados > 0 && (Main.botones1Contratados + Main.camaras1Contratados + Main.pantallas1Contratados + Main.pines1Contratados + Main.ensambladores1 < 15)){
            Main.pines1Contratados ++;
            Main.listaPines1[Main.pines1Contratados-1] = new Pines1(Main.listaPines1[0].pines1, Main.listaPines1[0].pines1mut, Main.listaPines1[0].pines1em);
            Main.listaPines1[Main.pines1Contratados-1].start();
            pines1.setText(String.valueOf(Main.pines1Contratados));
            Planta1.pines1.setText(String.valueOf(Main.pines1Contratados));

            CSVEL csvEscritor = new CSVEL();
            csvEscritor.EscribirCsv(); 
            
            if((Main.dias - Main.diasTranscurridos) > 5){
                Main.diasTranscurridos = Main.dias;
                Main.telefonos1Ensamblados = Main.producidos1Total;
                Main.gananciasNetas1 = Main.gananciaTotal1 - (Main.botones1Gastos+Main.camaras1Gastos+Main.pantallas1Gastos+Main.pines1Gastos+Main.gerente1Gastos+Main.jefe1Gastos);
                Main.telefonos2Ensamblados = Main.producidos2Total;
                Main.gananciasNetas2 = Main.gananciaTotal2- (Main.botones2Gastos+Main.camaras2Gastos+Main.pantallas2Gastos+Main.pines2Gastos+Main.gerente2Gastos+Main.jefe2Gastos);
                csvEscritor.GuardarHistorico(); 
                Main.cambio = true;
            }
            
         }else{
            JOptionPane.showMessageDialog(null, "La planta ha llegado al n??mero m??ximo de empleados.");
        }
    }//GEN-LAST:event_contratarPines1ActionPerformed

    private void despedirPines1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despedirPines1ActionPerformed
        if(Main.pines1Contratados <= 15 && Main.pines1Contratados > 1){
            Main.pines1Contratados --;
            Main.listaCamaras1[Main.pines1Contratados-1].setContratado(false);
            pines1.setText(String.valueOf(Main.pines1Contratados));
            Planta1.pines1.setText(String.valueOf(Main.pines1Contratados));
            
            CSVEL csvEscritor = new CSVEL();
            csvEscritor.EscribirCsv(); 
            
            if((Main.dias - Main.diasTranscurridos) > 5){
                Main.diasTranscurridos = Main.dias;
                Main.telefonos1Ensamblados = Main.producidos1Total;
                Main.gananciasNetas1 = Main.gananciaTotal1 - (Main.botones1Gastos+Main.camaras1Gastos+Main.pantallas1Gastos+Main.pines1Gastos+Main.gerente1Gastos+Main.jefe1Gastos);
                Main.telefonos2Ensamblados = Main.producidos2Total;
                Main.gananciasNetas2 = Main.gananciaTotal2- (Main.botones2Gastos+Main.camaras2Gastos+Main.pantallas2Gastos+Main.pines2Gastos+Main.gerente2Gastos+Main.jefe2Gastos);
                csvEscritor.GuardarHistorico(); 
                Main.cambio = true;
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No puedes despedir a todos los productores de pines ya que despedir??n al Gerente.");
        }
    }//GEN-LAST:event_despedirPines1ActionPerformed

    private void contratarCamaras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratarCamaras1ActionPerformed
        if(Main.camaras1Contratados < 15 && Main.camaras1Contratados > 0 && (Main.botones1Contratados + Main.camaras1Contratados + Main.pantallas1Contratados + Main.pines1Contratados + Main.ensambladores1 < 15)){
            Main.camaras1Contratados ++;
            Main.listaCamaras1[Main.camaras1Contratados-1] = new Camaras1(Main.listaCamaras1[0].camaras1, Main.listaCamaras1[0].camaras1mut, Main.listaCamaras1[0].camaras1em);
            Main.listaCamaras1[Main.camaras1Contratados-1].start();
            camaras1.setText(String.valueOf(Main.camaras1Contratados));
            Planta1.camaras1.setText(String.valueOf(Main.camaras1Contratados));

            CSVEL csvEscritor = new CSVEL();
            csvEscritor.EscribirCsv(); 
            
            if((Main.dias - Main.diasTranscurridos) > 5){
                Main.diasTranscurridos = Main.dias;
                Main.telefonos1Ensamblados = Main.producidos1Total;
                Main.gananciasNetas1 = Main.gananciaTotal1 - (Main.botones1Gastos+Main.camaras1Gastos+Main.pantallas1Gastos+Main.pines1Gastos+Main.gerente1Gastos+Main.jefe1Gastos);
                Main.telefonos2Ensamblados = Main.producidos2Total;
                Main.gananciasNetas2 = Main.gananciaTotal2- (Main.botones2Gastos+Main.camaras2Gastos+Main.pantallas2Gastos+Main.pines2Gastos+Main.gerente2Gastos+Main.jefe2Gastos);
                csvEscritor.GuardarHistorico(); 
                Main.cambio = true;
            }
            
         }else{
            JOptionPane.showMessageDialog(null, "La planta ha llegado al n??mero m??ximo de empleados.");
        }
    }//GEN-LAST:event_contratarCamaras1ActionPerformed

    private void despedirCamaras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despedirCamaras1ActionPerformed
        if(Main.camaras1Contratados <= 15 && Main.camaras1Contratados > 1){
            Main.camaras1Contratados --;
            Main.listaCamaras1[Main.camaras1Contratados-1].setContratado(false);
            camaras1.setText(String.valueOf(Main.camaras1Contratados));
            Planta1.camaras1.setText(String.valueOf(Main.camaras1Contratados));
            
            CSVEL csvEscritor = new CSVEL();
            csvEscritor.EscribirCsv(); 
            
            if((Main.dias - Main.diasTranscurridos) > 5){
                Main.diasTranscurridos = Main.dias;
                Main.telefonos1Ensamblados = Main.producidos1Total;
                Main.gananciasNetas1 = Main.gananciaTotal1 - (Main.botones1Gastos+Main.camaras1Gastos+Main.pantallas1Gastos+Main.pines1Gastos+Main.gerente1Gastos+Main.jefe1Gastos);
                Main.telefonos2Ensamblados = Main.producidos2Total;
                Main.gananciasNetas2 = Main.gananciaTotal2- (Main.botones2Gastos+Main.camaras2Gastos+Main.pantallas2Gastos+Main.pines2Gastos+Main.gerente2Gastos+Main.jefe2Gastos);
                csvEscritor.GuardarHistorico(); 
                Main.cambio = true;
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No puedes despedir a todos los productores de c??maras ya que despedir??n al Gerente.");
        }
    }//GEN-LAST:event_despedirCamaras1ActionPerformed

    private void contratarEnsambladores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratarEnsambladores1ActionPerformed
        if(Main.ensambladores1 < 15 && Main.ensambladores1 > 0 && (Main.botones1Contratados + Main.camaras1Contratados + Main.pantallas1Contratados + Main.pines1Contratados + Main.ensambladores1 < 15)){
            Main.ensambladores1 ++;
            Main.listaEnsambladores1[Main.ensambladores1-1] = new Ensambladores1(Main.listaEnsambladores1[0].pantallas1em, Main.listaEnsambladores1[0].botones1em, Main.listaEnsambladores1[0].pines1em, Main.listaEnsambladores1[0].camaras1em, Main.listaEnsambladores1[0].pantallas1mut, Main.listaEnsambladores1[0].botones1mut, Main.listaEnsambladores1[0].pines1mut, Main.listaEnsambladores1[0].camaras1mut, Main.listaEnsambladores1[0].pantallas1prod, Main.listaEnsambladores1[0].botones1prod, Main.listaEnsambladores1[0].pines1prod, Main.listaEnsambladores1[0].camaras1prod, Main.listaEnsambladores1[0].ensamblador1mut);
            Main.listaEnsambladores1[Main.ensambladores1-1].start();
            ensambladores1.setText(String.valueOf(Main.ensambladores1));
            Planta1.ensambladores1.setText(String.valueOf(Main.ensambladores1));
            
            CSVEL csvEscritor = new CSVEL();
            csvEscritor.EscribirCsv(); 
            
            if((Main.dias - Main.diasTranscurridos) > 5){
                Main.diasTranscurridos = Main.dias;
                Main.telefonos1Ensamblados = Main.producidos1Total;
                Main.gananciasNetas1 = Main.gananciaTotal1 - (Main.botones1Gastos+Main.camaras1Gastos+Main.pantallas1Gastos+Main.pines1Gastos+Main.gerente1Gastos+Main.jefe1Gastos);
                Main.telefonos2Ensamblados = Main.producidos2Total;
                Main.gananciasNetas2 = Main.gananciaTotal2- (Main.botones2Gastos+Main.camaras2Gastos+Main.pantallas2Gastos+Main.pines2Gastos+Main.gerente2Gastos+Main.jefe2Gastos);
                csvEscritor.GuardarHistorico(); 
                Main.cambio = true;
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "La planta ha llegado al n??mero m??ximo de empleados.");
        }
    }//GEN-LAST:event_contratarEnsambladores1ActionPerformed

    private void despedirEnsambladores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despedirEnsambladores1ActionPerformed
        if(Main.ensambladores1 <= 15 && Main.ensambladores1 > 1){
            Main.ensambladores1 --;
            Main.listaEnsambladores1[Main.ensambladores1-1].setContratado(false);
            ensambladores1.setText(String.valueOf(Main.ensambladores1));
            Planta1.ensambladores1.setText(String.valueOf(Main.ensambladores1));
            
            CSVEL csvEscritor = new CSVEL();
            csvEscritor.EscribirCsv(); 
            
            if((Main.dias - Main.diasTranscurridos) > 5){
                Main.diasTranscurridos = Main.dias;
                Main.telefonos1Ensamblados = Main.producidos1Total;
                Main.gananciasNetas1 = Main.gananciaTotal1 - (Main.botones1Gastos+Main.camaras1Gastos+Main.pantallas1Gastos+Main.pines1Gastos+Main.gerente1Gastos+Main.jefe1Gastos);
                Main.telefonos2Ensamblados = Main.producidos2Total;
                Main.gananciasNetas2 = Main.gananciaTotal2- (Main.botones2Gastos+Main.camaras2Gastos+Main.pantallas2Gastos+Main.pines2Gastos+Main.gerente2Gastos+Main.jefe2Gastos);
                csvEscritor.GuardarHistorico(); 
                Main.cambio = true;
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No puedes despedir a todos los ensambladores ya que despedir??n al Gerente.");
        }
    }//GEN-LAST:event_despedirEnsambladores1ActionPerformed

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
            java.util.logging.Logger.getLogger(Planta1Personal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Planta1Personal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Planta1Personal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Planta1Personal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Planta1Personal1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static volatile javax.swing.JLabel botones1;
    public static volatile javax.swing.JLabel botones6;
    public static volatile javax.swing.JLabel camaras1;
    private javax.swing.JButton contratarBotones1;
    private javax.swing.JButton contratarCamaras1;
    private javax.swing.JButton contratarEnsambladores1;
    private javax.swing.JButton contratarPantallas1;
    private javax.swing.JButton contratarPines1;
    private javax.swing.JButton despedirBotones1;
    private javax.swing.JButton despedirCamaras1;
    private javax.swing.JButton despedirEnsambladores1;
    private javax.swing.JButton despedirPantallas1;
    private javax.swing.JButton despedirPines1;
    public static volatile javax.swing.JLabel ensambladores1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public static volatile javax.swing.JLabel pantallas1;
    public static volatile javax.swing.JLabel pines1;
    // End of variables declaration//GEN-END:variables
}
