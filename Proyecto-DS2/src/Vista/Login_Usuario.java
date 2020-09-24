/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControlLogin;

/**
 *
 * @author Kevin Cuadros
 */
public class Login_Usuario extends javax.swing.JFrame {
ControlLogin cl;
    
    
    public Login_Usuario() {
        initComponents();
        jl_error.setVisible(false);
        setVisible(true);
        jt_Usuario.setText("funcionario@gmail.com");
        jt_Contraseña.setText("123");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jt_Usuario = new javax.swing.JTextField();
        jt_Contraseña = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jlCerrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jl_error = new javax.swing.JLabel();
        jLInicioSesion = new javax.swing.JButton();
        jl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 482));

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel1.setText("USUARIO:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 220, 130, 30);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel2.setText("CONTRASEÑA:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 280, 140, 30);

        jt_Usuario.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jt_Usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jt_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_UsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jt_Usuario);
        jt_Usuario.setBounds(220, 210, 214, 40);

        jt_Contraseña.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jt_Contraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jt_Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_ContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(jt_Contraseña);
        jt_Contraseña.setBounds(220, 270, 214, 40);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 29)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(175, 50, 75));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INGRESO DE FUNCIONARIOS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 50, 400, 37);

        jlCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgCerrar.png"))); // NOI18N
        jlCerrar.setBorderPainted(false);
        jlCerrar.setContentAreaFilled(false);
        jlCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscuchaCerrar(evt);
            }
        });
        jPanel1.add(jlCerrar);
        jlCerrar.setBounds(140, 410, 220, 69);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 100, 90);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondorojo2.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 100, 510, 60);

        jl_error.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jl_error.setForeground(new java.awt.Color(204, 0, 0));
        jl_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_error.setText("MSJ1");
        jPanel1.add(jl_error);
        jl_error.setBounds(20, 170, 480, 30);

        jLInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgSesion.png"))); // NOI18N
        jLInicioSesion.setBorderPainted(false);
        jLInicioSesion.setContentAreaFilled(false);
        jLInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscuchaInicioS(evt);
            }
        });
        jPanel1.add(jLInicioSesion);
        jLInicioSesion.setBounds(130, 330, 260, 79);

        jl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoRegistro.jpg"))); // NOI18N
        jPanel1.add(jl_fondo);
        jl_fondo.setBounds(0, 0, 510, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(518, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jt_ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_ContraseñaActionPerformed

    private void jt_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_UsuarioActionPerformed

    private void EscuchaInicioS(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscuchaInicioS
    try {
            jl_error.setVisible(false);
            cl = new ControlLogin(jt_Usuario.getText(),jt_Contraseña.getText());
            cl.iniciar();
            new Entrada_Salida(jt_Usuario.getText());
                    
        } catch (Exception e) {
            jl_error.setText(e.getMessage());
            jl_error.setVisible(true);
        }
    }//GEN-LAST:event_EscuchaInicioS

    private void EscuchaCerrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscuchaCerrar
        dispose();
    }//GEN-LAST:event_EscuchaCerrar

   
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jLInicioSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jlCerrar;
    public javax.swing.JLabel jl_error;
    private javax.swing.JLabel jl_fondo;
    public javax.swing.JTextField jt_Contraseña;
    public javax.swing.JTextField jt_Usuario;
    // End of variables declaration//GEN-END:variables
}
