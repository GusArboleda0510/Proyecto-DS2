/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author kevin
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLInicioSesion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLCerrar = new javax.swing.JButton();
        jlFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuVerAgenda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgSesion.png"))); // NOI18N
        jLInicioSesion.setBorderPainted(false);
        jLInicioSesion.setContentAreaFilled(false);
        jLInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscuchaInicioS(evt);
            }
        });
        jPanel1.add(jLInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 250, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondorojo2.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 500, 60));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(175, 50, 75));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MENU");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 140, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgCerrar.png"))); // NOI18N
        jLCerrar.setBorderPainted(false);
        jLCerrar.setContentAreaFilled(false);
        jLCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscuchaCerrar(evt);
            }
        });
        jPanel1.add(jLCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 210, -1));

        jlFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoRegistro.jpg"))); // NOI18N
        jPanel1.add(jlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 500, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        jMenuVerAgenda.setText("Archivo");
        jMenuVerAgenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuBar1.add(jMenuVerAgenda);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(518, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EscuchaCerrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscuchaCerrar
        dispose();
    }//GEN-LAST:event_EscuchaCerrar

    private void EscuchaInicioS(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscuchaInicioS
        new Login_Usuario();
    }//GEN-LAST:event_EscuchaInicioS

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jLCerrar;
    private javax.swing.JButton jLInicioSesion;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuVerAgenda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlFondo;
    // End of variables declaration//GEN-END:variables

}
