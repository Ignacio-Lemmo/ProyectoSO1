package Interfaces;

import Clases.Main;
import java.util.concurrent.Semaphore;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
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

        parametros = new javax.swing.JButton();
        iniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        parametros.setText("Modificar Parámetros");
        parametros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parametrosActionPerformed(evt);
            }
        });

        iniciar.setText("Iniciar Simulación");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(parametros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parametros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        //Creación de Semáforos de Productores.
        Semaphore pantallas1 = new Semaphore(Main.pantallas1Almacen);
        Semaphore botones1= new Semaphore(Main.botones1Almacen);
        Semaphore pines1= new Semaphore(Main.pines1Almacen);
        Semaphore camaras1= new Semaphore(Main.camaras1Almacen);
        
        Semaphore pantallas2 = new Semaphore(Main.pantallas2Almacen);
        Semaphore botones2 = new Semaphore(Main.botones2Almacen);
        Semaphore pines2 = new Semaphore(Main.pines2Almacen);
        Semaphore camaras2= new Semaphore(Main.camaras2Almacen);
        
        Semaphore pantallas1Mutex = new Semaphore(1);
        Semaphore botones1Mutex = new Semaphore(1);
        Semaphore pines1Mutex = new Semaphore(1);
        Semaphore camaras1Mutex = new Semaphore(1);
        
        Semaphore pantallas2Mutex = new Semaphore(1);
        Semaphore botones2Mutex = new Semaphore(1);
        Semaphore pines2Mutex = new Semaphore(1);
        Semaphore camaras2Mutex = new Semaphore(1);
        
        //Creación de Semáforoes de Ensambladores
        Semaphore pantallas1Ensamblador = new Semaphore(0);
        Semaphore botones1Ensamblador = new Semaphore(0);
        Semaphore pines1Ensamblador = new Semaphore(0);
        Semaphore camaras1Ensamblador = new Semaphore(0);
        
        Semaphore pantallas2nsamblador = new Semaphore(0);
        Semaphore botones2nsamblador = new Semaphore(0);
        Semaphore pines2Ensamblador = new Semaphore(0);
        Semaphore camaras2Ensamblador = new Semaphore(0);
        
        //Apertura de interfaz.
        Simulacion simulacion = new Simulacion();
        simulacion.setLocationRelativeTo(null);
        simulacion.setVisible(true);
        
        //Cierre de la ventana.
        this.dispose();
    }//GEN-LAST:event_iniciarActionPerformed

    private void parametrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parametrosActionPerformed
        Parametros parametros= new Parametros();
        parametros.setLocationRelativeTo(null);
        parametros.setVisible(true);
    }//GEN-LAST:event_parametrosActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iniciar;
    private javax.swing.JButton parametros;
    // End of variables declaration//GEN-END:variables
}