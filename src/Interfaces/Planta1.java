/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Clases.Main;

/**
 *
 * @author ijlem
 */
public class Planta1 extends javax.swing.JFrame {

    /**
     * Creates new form Planta2
     */
    public Planta1() {
        initComponents();
        botones1.setText(String.valueOf(Main.botones2Contratados));
        pantallas1.setText(String.valueOf(Main.pantallas2Contratados));
        pines1.setText(String.valueOf(Main.pines2Contratados));
        camaras1.setText(String.valueOf(Main.camaras2Contratados));
        ensambladores1.setText(String.valueOf(Main.ensambladores2));
        diasRestantes1.setText(String.valueOf(Main.diasRestantes));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pilladas2 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        gananciasNetas1 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        gerente1Gastos = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jefe1Gastos = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        gananciaTotal1 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        ganancia1 = new javax.swing.JLabel();
        ensambladores1Gastos = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        camaras1Gastos = new javax.swing.JLabel();
        botones1Gastos = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jefe1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        pantallas1Gastos = new javax.swing.JLabel();
        camaras1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        diasRestantes1 = new javax.swing.JLabel();
        gerente1 = new javax.swing.JLabel();
        producidos1Total = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pines1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        dias1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pantallas1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        producidos1 = new javax.swing.JLabel();
        botones1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ensambladores1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pines1Gastos = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        camaras1Progreso = new javax.swing.JProgressBar();
        pines1Progreso = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pantallas1Progreso = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        botones1Progreso = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Administrar Personal");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 669, -1, -1));

        pilladas2.setBackground(new java.awt.Color(255, 255, 255));
        pilladas2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pilladas2.setText("0");
        jPanel1.add(pilladas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 552, 110, -1));

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel31.setText("Atrapado:");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 552, -1, -1));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel30.setText("Ganancias Netas:");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 630, -1, -1));

        gananciasNetas1.setBackground(new java.awt.Color(255, 255, 255));
        gananciasNetas1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        gananciasNetas1.setText("0");
        jPanel1.add(gananciasNetas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 630, 47, -1));

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel29.setText("Gastos:");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 524, 68, -1));

        gerente1Gastos.setBackground(new java.awt.Color(255, 255, 255));
        gerente1Gastos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        gerente1Gastos.setText("0");
        jPanel1.add(gerente1Gastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 524, 90, -1));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel28.setText("Gastos:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 521, 78, -1));

        jefe1Gastos.setBackground(new java.awt.Color(255, 255, 255));
        jefe1Gastos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jefe1Gastos.setText("0");
        jPanel1.add(jefe1Gastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 521, 110, -1));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel27.setText("Ganancia Total:");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 388, 153, -1));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setText("Ganancia:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 388, 108, -1));

        gananciaTotal1.setBackground(new java.awt.Color(255, 255, 255));
        gananciaTotal1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        gananciaTotal1.setText("0");
        jPanel1.add(gananciaTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 388, 47, -1));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel25.setText("Gastos:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 388, 124, -1));

        ganancia1.setBackground(new java.awt.Color(255, 255, 255));
        ganancia1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ganancia1.setText("0");
        jPanel1.add(ganancia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 388, 47, -1));

        ensambladores1Gastos.setBackground(new java.awt.Color(255, 255, 255));
        ensambladores1Gastos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ensambladores1Gastos.setText("0");
        jPanel1.add(ensambladores1Gastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 388, 30, -1));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setText("Gastos:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 248, 76, -1));

        camaras1Gastos.setBackground(new java.awt.Color(255, 255, 255));
        camaras1Gastos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        camaras1Gastos.setText("0");
        jPanel1.add(camaras1Gastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 248, 47, -1));

        botones1Gastos.setBackground(new java.awt.Color(255, 255, 255));
        botones1Gastos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        botones1Gastos.setText("0");
        jPanel1.add(botones1Gastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 253, 47, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Ensambladores:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 361, -1, -1));

        jefe1.setBackground(new java.awt.Color(255, 255, 255));
        jefe1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jefe1.setText("Estado");
        jPanel1.add(jefe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 494, 110, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Ensamblados:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 361, -1, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel16.setText("Jefe/Gerente");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 448, -1, -1));

        pantallas1Gastos.setBackground(new java.awt.Color(255, 255, 255));
        pantallas1Gastos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pantallas1Gastos.setText("0");
        jPanel1.add(pantallas1Gastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 256, 47, -1));

        camaras1.setBackground(new java.awt.Color(255, 255, 255));
        camaras1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        camaras1.setText("0");
        jPanel1.add(camaras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 221, 47, -1));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setText("Gastos:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 253, 67, -1));

        diasRestantes1.setBackground(new java.awt.Color(255, 255, 255));
        diasRestantes1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        diasRestantes1.setText("0");
        jPanel1.add(diasRestantes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 496, 30, -1));

        gerente1.setBackground(new java.awt.Color(255, 255, 255));
        gerente1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        gerente1.setText("Estado");
        jPanel1.add(gerente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 494, 90, -1));

        producidos1Total.setBackground(new java.awt.Color(255, 255, 255));
        producidos1Total.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        producidos1Total.setText("0");
        jPanel1.add(producidos1Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 361, 43, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setText("Días Total:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 523, 106, -1));

        pines1.setBackground(new java.awt.Color(255, 255, 255));
        pines1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pines1.setText("0");
        jPanel1.add(pines1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 229, 47, -1));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setText("Gastos:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 256, 76, -1));

        dias1.setBackground(new java.awt.Color(255, 255, 255));
        dias1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dias1.setText("0");
        jPanel1.add(dias1, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 523, 30, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Cámaras:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 221, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Botones:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 226, -1, -1));

        pantallas1.setBackground(new java.awt.Color(255, 255, 255));
        pantallas1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pantallas1.setText("0");
        jPanel1.add(pantallas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 229, 47, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setText("Xperia 10 IV");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, -1, -1));

        producidos1.setBackground(new java.awt.Color(255, 255, 255));
        producidos1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        producidos1.setText("0");
        jPanel1.add(producidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 361, 47, -1));

        botones1.setBackground(new java.awt.Color(255, 255, 255));
        botones1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        botones1.setText("0");
        jPanel1.add(botones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 226, 47, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Pantallas:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 229, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Pines:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 229, 59, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("Ensamblados Total:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 361, -1, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setText("Jefe:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 494, 84, -1));

        ensambladores1.setBackground(new java.awt.Color(255, 255, 255));
        ensambladores1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ensambladores1.setText("0");
        jPanel1.add(ensambladores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 361, 30, -1));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setText("Gerente:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 494, -1, -1));

        pines1Gastos.setBackground(new java.awt.Color(255, 255, 255));
        pines1Gastos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pines1Gastos.setText("0");
        jPanel1.add(pines1Gastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 256, 47, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("Almacenes");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 23, -1, -1));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setText("Días Entrega:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 496, -1, -1));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setText("Gastos:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 256, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Cámaras:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 69, -1, -1));

        camaras1Progreso.setBackground(new java.awt.Color(204, 204, 204));
        camaras1Progreso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        camaras1Progreso.setForeground(new java.awt.Color(51, 102, 255));
        camaras1Progreso.setMaximum(Main.camaras2Almacen);
        camaras1Progreso.setString(String.valueOf(Main.camaras2Producidas)
        );
        camaras1Progreso.setStringPainted(true);
        jPanel1.add(camaras1Progreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 96, -1, 45));

        pines1Progreso.setBackground(new java.awt.Color(204, 204, 204));
        pines1Progreso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pines1Progreso.setForeground(new java.awt.Color(51, 102, 255));
        pines1Progreso.setMaximum(Main.pines2Almacen);
        pines1Progreso.setString(String.valueOf(Main.pines2Producidos)
        );
        pines1Progreso.setStringPainted(true);
        jPanel1.add(pines1Progreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 96, -1, 45));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Pines:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 69, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Pantallas:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 69, -1, -1));

        pantallas1Progreso.setBackground(new java.awt.Color(204, 204, 204));
        pantallas1Progreso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pantallas1Progreso.setForeground(new java.awt.Color(51, 102, 255));
        pantallas1Progreso.setMaximum(Main.pantallas2Almacen);
        pantallas1Progreso.setString(String.valueOf(Main.pantallas2Producidas));
        pantallas1Progreso.setStringPainted(true);
        jPanel1.add(pantallas1Progreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 96, -1, 45));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Botones:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 69, -1, -1));

        botones1Progreso.setBackground(new java.awt.Color(255, 255, 255));
        botones1Progreso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botones1Progreso.setForeground(new java.awt.Color(51, 102, 255));
        botones1Progreso.setMaximum(Main.botones2Almacen);
        botones1Progreso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botones1Progreso.setString(String.valueOf(Main.botones2Producidos));
        botones1Progreso.setStringPainted(true);
        jPanel1.add(botones1Progreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 96, -1, 45));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Ensambladores");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 315, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 170));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, 140));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, -1, 120));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/308e9738dadf54f790577584473a8909.png"))); // NOI18N
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, -1, -1));

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel33.setText("Productores");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 180, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Planta1Personal1 personal = new Planta1Personal1();
        personal.setLocationRelativeTo(null);
        personal.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Planta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Planta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Planta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Planta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Planta1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static volatile javax.swing.JLabel botones1;
    public static volatile javax.swing.JLabel botones1Gastos;
    public static volatile javax.swing.JProgressBar botones1Progreso;
    public static volatile javax.swing.JLabel camaras1;
    public static volatile javax.swing.JLabel camaras1Gastos;
    public static volatile javax.swing.JProgressBar camaras1Progreso;
    public static volatile javax.swing.JLabel dias1;
    public static volatile javax.swing.JLabel diasRestantes1;
    public static volatile javax.swing.JLabel ensambladores1;
    public static volatile javax.swing.JLabel ensambladores1Gastos;
    public static volatile javax.swing.JLabel ganancia1;
    public static volatile javax.swing.JLabel gananciaTotal1;
    public static volatile javax.swing.JLabel gananciasNetas1;
    public static volatile javax.swing.JLabel gerente1;
    public static volatile javax.swing.JLabel gerente1Gastos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static volatile javax.swing.JLabel jefe1;
    public static volatile javax.swing.JLabel jefe1Gastos;
    public static volatile javax.swing.JLabel pantallas1;
    public static volatile javax.swing.JLabel pantallas1Gastos;
    public static volatile javax.swing.JProgressBar pantallas1Progreso;
    public static volatile javax.swing.JLabel pilladas2;
    public static volatile javax.swing.JLabel pines1;
    public static volatile javax.swing.JLabel pines1Gastos;
    public static volatile javax.swing.JProgressBar pines1Progreso;
    public static volatile javax.swing.JLabel producidos1;
    public static volatile javax.swing.JLabel producidos1Total;
    // End of variables declaration//GEN-END:variables
}
