/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControlBorrarPersona;
import co.edu.modelo.Personas;
import co.edu.univalle.persistencia.DAOFactory;
import co.edu.univalle.persistencia.EntityManagerHelper;

/**
 *
 * @author ANDRES ARBOLEDA
 */
public class BorrarPersona extends javax.swing.JFrame {
    ControlBorrarPersona cbp = new ControlBorrarPersona();
    Personas person;
    public BorrarPersona() {
        initComponents();
        setVisible(true);
        jLMensaje.setVisible(false);
        jLCargo.setText("");
        jLCiudad.setText("");
        jtDocumento.setText("");
        jLNombreCompleto.setText("");

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtDocumento = new javax.swing.JTextField();
        jBBorrar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLNombreCompleto = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLCiudad = new javax.swing.JLabel();
        jLCargo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jBBuscar = new javax.swing.JButton();
        jLMensaje = new javax.swing.JLabel();
        jLCerrar = new javax.swing.JButton();
        jL_fondo1 = new javax.swing.JLabel();
        jL_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondorojo2.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 510, 60));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(175, 50, 75));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BORRAR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 380, 70));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 90));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel6.setText("Documento:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 120, 50));

        jtDocumento.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDocumentoActionPerformed(evt);
            }
        });
        jPanel1.add(jtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 190, 40));

        jBBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgBorrarPersona2.png"))); // NOI18N
        jBBorrar.setBorderPainted(false);
        jBBorrar.setContentAreaFilled(false);
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(jBBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 170, 70));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel10.setText("Nombre:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 100, 50));

        jLNombreCompleto.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLNombreCompleto.setText("NombreCompleto");
        jPanel1.add(jLNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 280, 50));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel14.setText("Ciudad:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 70, 50));

        jLCiudad.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLCiudad.setText("Ciudad:");
        jPanel1.add(jLCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 280, 50));

        jLCargo.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLCargo.setText("Cargo:");
        jPanel1.add(jLCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 280, 50));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel13.setText("Cargo:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 70, 50));

        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgBuscar.png"))); // NOI18N
        jBBuscar.setBorderPainted(false);
        jBBuscar.setContentAreaFilled(false);
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarEscuchaBuscar(evt);
            }
        });
        jPanel1.add(jBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 130, 60));

        jLMensaje.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        jLMensaje.setForeground(new java.awt.Color(204, 0, 0));
        jLMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLMensaje.setText("MSJ1");
        jPanel1.add(jLMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 490, 50));

        jLCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgCerrar.png"))); // NOI18N
        jLCerrar.setBorderPainted(false);
        jLCerrar.setContentAreaFilled(false);
        jLCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLCerrarEscuchaCerrar(evt);
            }
        });
        jPanel1.add(jLCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 210, -1));

        jL_fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoSalida.jpg"))); // NOI18N
        jPanel1.add(jL_fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 530, 530));

        jL_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoRegistro.jpg"))); // NOI18N
        jL_fondo.setText("Enfermedades Preexistentes:");
        jPanel1.add(jL_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 400, 540, 740));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 640));

        setSize(new java.awt.Dimension(508, 667));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDocumentoActionPerformed
    }//GEN-LAST:event_jtDocumentoActionPerformed

    private void jBBuscarEscuchaBuscar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarEscuchaBuscar
        jLMensaje.setVisible(false);
        try {
            cbp.validarDato(jtDocumento.getText(),"Documento");
            int auxDoc = Integer.parseInt(jtDocumento.getText());
            person = DAOFactory.getPersona().consultarID(auxDoc);
            cbp.buscar(person);
            jLNombreCompleto.setText(cbp.getNombreCompleto());
            jLCargo.setText(cbp.getCargo());
            jLCiudad.setText(cbp.getCiudad());
        } catch (Exception e) {
            mensaje(e.getMessage());
            jLNombreCompleto.setText("");
            jLCargo.setText("");
            jLCiudad.setText("");
        }
    }//GEN-LAST:event_jBBuscarEscuchaBuscar

    private void jLCerrarEscuchaCerrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLCerrarEscuchaCerrar
        dispose();
    }//GEN-LAST:event_jLCerrarEscuchaCerrar

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        jLMensaje.setVisible(false);
        try {
            jBBuscar.doClick();
            borradoLogico();
            mensaje("Usuario borrado con exito");
            limpiarTodo();
        } catch (Exception e) {
            mensaje(e.getMessage());
            jLNombreCompleto.setText("");
            jLCargo.setText("");
            jLCiudad.setText("");
        }
    }//GEN-LAST:event_jBBorrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JLabel jLCargo;
    private javax.swing.JButton jLCerrar;
    private javax.swing.JLabel jLCiudad;
    public javax.swing.JLabel jLMensaje;
    private javax.swing.JLabel jLNombreCompleto;
    private javax.swing.JLabel jL_fondo;
    private javax.swing.JLabel jL_fondo1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jtDocumento;
    // End of variables declaration//GEN-END:variables

    private void mensaje(String message) {
        jLMensaje.setVisible(true);
        jLMensaje.setText(message);
    }

    private void limpiarTodo() {
        jLNombreCompleto.setText("");
        jLCargo.setText("");
        jLCiudad.setText("");
        jtDocumento.setText("");
    }
    private void borradoLogico() throws Exception{
        person.setActivo((short)0);
        EntityManagerHelper.beginTransaction();
        DAOFactory.getPersona().insertar(person);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
    }  
}
