/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Clases.Main;
import static Interfaces.Inicio.planta2;
import static Interfaces.Inicio.planta1;


/**
 *
 * @author ijlem
 */
public class Simulacion extends javax.swing.JFrame {

    /**
     * Creates new form Simulacion
     */
    public Simulacion() {
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

        planta2 = new javax.swing.JButton();
        planta1 = new javax.swing.JButton();
        ambas = new javax.swing.JButton();
        dashboard = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        planta2.setBackground(new java.awt.Color(255, 255, 255));
        planta2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        planta2.setText("Observar planta 2 (Xperia 10 III)");
        planta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planta2ActionPerformed(evt);
            }
        });

        planta1.setBackground(new java.awt.Color(255, 255, 255));
        planta1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        planta1.setText("Observar planta 1 (Xperia 10 IV)");
        planta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planta1ActionPerformed(evt);
            }
        });

        ambas.setBackground(new java.awt.Color(255, 255, 255));
        ambas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ambas.setText("Observar ambas plantas");
        ambas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambasActionPerformed(evt);
            }
        });

        dashboard.setBackground(new java.awt.Color(255, 255, 255));
        dashboard.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        dashboard.setText("Acceder al Dashboard");
        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 48)); // NOI18N
        jLabel1.setText("Sony");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(planta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ambas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(planta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(ambas)
                .addGap(18, 18, 18)
                .addComponent(planta1)
                .addGap(18, 18, 18)
                .addComponent(planta2)
                .addGap(38, 38, 38)
                .addComponent(dashboard)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void planta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planta2ActionPerformed
        Inicio.planta2.setLocationRelativeTo(null);
        Inicio.planta2.setVisible(true);
    }//GEN-LAST:event_planta2ActionPerformed

    private void planta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planta1ActionPerformed
        Inicio.planta1.setLocationRelativeTo(null);
        Inicio.planta1.setVisible(true);
    }//GEN-LAST:event_planta1ActionPerformed

    private void ambasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambasActionPerformed
        Inicio.planta2.setLocationRelativeTo(null);
        Inicio.planta2.setVisible(true);
        Inicio.planta1.setLocationRelativeTo(null);
        Inicio.planta1.setVisible(true);
        
    }//GEN-LAST:event_ambasActionPerformed

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dashboardActionPerformed

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
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ambas;
    private javax.swing.JButton dashboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton planta1;
    private javax.swing.JButton planta2;
    // End of variables declaration//GEN-END:variables
}
