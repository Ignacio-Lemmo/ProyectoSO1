/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import javax.swing.JFrame;

/**
 *
 * @author mvlop
 */
public class Graficos extends javax.swing.JFrame {

    /**
     * Creates new form Graficos
     */
    public Graficos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        graphGN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        graphPerday = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        graphGastos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        graphGN.setText("Ganancia Neta");
        graphGN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphGNActionPerformed(evt);
            }
        });
        jPanel2.add(graphGN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 140, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 520, 100));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        graphPerday.setText("Producción diaria");
        graphPerday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphPerdayActionPerformed(evt);
            }
        });
        jPanel3.add(graphPerday, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 140, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 520, 100));

        jPanel4.setBackground(new java.awt.Color(204, 51, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        graphGastos.setText("Gastos");
        graphGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphGastosActionPerformed(evt);
            }
        });
        jPanel4.add(graphGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 140, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 520, 90));

        jLabel1.setText("Escoja qué gráfico desea ver:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 340, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void graphGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphGastosActionPerformed

        
        Clases.GraphicsChart graphG = new Clases.GraphicsChart("Pie Chart","Gastos", 80, 20);
        graphG.pack();;
        graphG.setVisible(true);
        graphG.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_graphGastosActionPerformed

    private void graphGNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphGNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_graphGNActionPerformed

    private void graphPerdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphPerdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_graphPerdayActionPerformed

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
            java.util.logging.Logger.getLogger(Graficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton graphGN;
    private javax.swing.JButton graphGastos;
    private javax.swing.JButton graphPerday;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
