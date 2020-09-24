/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControlNovedad;
import co.edu.modelo.Novedades;
import co.edu.modelo.Personas;
import co.edu.univalle.persistencia.DAOFactory;
import co.edu.univalle.persistencia.EntityManagerHelper;

/**
 *
 * @author ANDRES ARBOLEDA
 */
public class Novedad extends javax.swing.JFrame {
    ControlNovedad nov = new ControlNovedad();
    //funcionario@gmail.com
    String usuario;
    Personas person;
    public Novedad(String u) {
        this.usuario=u;
        initComponents();
        jLError.setVisible(false);
        jLNombreCompleto.setText("");
        jLCargo.setText("");
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCNinios = new javax.swing.JComboBox();
        jLNombreCompleto = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtTemperatura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAObservaciones = new javax.swing.JTextArea();
        jtDocumento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLEnviar = new javax.swing.JButton();
        jLError = new javax.swing.JLabel();
        jCEnfermedades = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLCargo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLCerrar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jCMayores = new javax.swing.JComboBox();
        jL_fondo1 = new javax.swing.JLabel();
        jL_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondorojo2.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 510, 60));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(175, 50, 75));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NOVEDAD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 370, 70));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel6.setText("Documento:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 120, 50));

        jCNinios.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jCNinios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        jCNinios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCNinios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCNinios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCNiniosActionPerformed(evt);
            }
        });
        jPanel1.add(jCNinios, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 680, 110, 40));

        jLNombreCompleto.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLNombreCompleto.setText("NombreCompleto");
        jPanel1.add(jLNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 280, 50));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel7.setText("Temperatura:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 130, 60));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Personas vulnerables");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 430, 50));

        jtTemperatura.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jtTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTemperaturaActionPerformed(evt);
            }
        });
        jPanel1.add(jtTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 230, 40));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel2.setText("¿Convive con niños menores?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, 260, 40));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel4.setText("Obsevaciones:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 830, 260, 50));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTAObservaciones.setColumns(20);
        jTAObservaciones.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jTAObservaciones.setRows(5);
        jScrollPane1.setViewportView(jTAObservaciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 880, 400, 130));

        jtDocumento.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDocumentoActionPerformed(evt);
            }
        });
        jPanel1.add(jtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 190, 40));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel10.setText("Nombre:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 50));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 90));

        jLEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgEnviarNov.png"))); // NOI18N
        jLEnviar.setBorderPainted(false);
        jLEnviar.setContentAreaFilled(false);
        jLEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscuchaCorreo(evt);
            }
        });
        jPanel1.add(jLEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1040, 240, -1));

        jLError.setFont(new java.awt.Font("Yu Gothic UI", 1, 22)); // NOI18N
        jLError.setForeground(new java.awt.Color(204, 0, 0));
        jLError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLError.setText("MSJ1");
        jPanel1.add(jLError, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 490, 50));

        jCEnfermedades.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jCEnfermedades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Diabetes", "Hipertension", "Enfermedades Pulmonares", "Enfermedades Cardiacas", "Otro" }));
        jCEnfermedades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCEnfermedades.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jCEnfermedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 250, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgBuscar.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscuchaBuscar(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 130, 60));

        jLCargo.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLCargo.setText("Cargo:");
        jPanel1.add(jLCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 280, 50));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel13.setText("Cargo:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 70, 50));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel9.setText("¿Convive con adultos mayores?");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 760, 310, 40));

        jLCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgCerrar.png"))); // NOI18N
        jLCerrar.setBorderPainted(false);
        jLCerrar.setContentAreaFilled(false);
        jLCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscucharCerrar(evt);
            }
        });
        jPanel1.add(jLCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1040, -1, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel12.setText("Enfermedades preexistentes:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 260, 50));

        jCMayores.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jCMayores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        jCMayores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCMayores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCMayores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCMayoresActionPerformed(evt);
            }
        });
        jPanel1.add(jCMayores, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 760, 110, 40));

        jL_fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoSalida.jpg"))); // NOI18N
        jPanel1.add(jL_fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 530, 530));

        jL_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoRegistro.jpg"))); // NOI18N
        jL_fondo.setText("Enfermedades Preexistentes:");
        jPanel1.add(jL_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 400, 540, 740));

        jScrollPane2.setViewportView(jPanel1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 570));

        setSize(new java.awt.Dimension(518, 617));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDocumentoActionPerformed

    private void jtTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTemperaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTemperaturaActionPerformed

    private void jCNiniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCNiniosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCNiniosActionPerformed

    private void jCMayoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCMayoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCMayoresActionPerformed

    private void EscuchaBuscar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscuchaBuscar
         jLError.setVisible(false);
        try {
            validacion(jtDocumento.getText());
            nov.buscar(person);
            jLNombreCompleto.setText(nov.getNombreCompleto());
            jLCargo.setText(nov.getCargo());
        } catch (Exception e) {
            mensaje(e.getMessage());
            jLNombreCompleto.setText("");
            jLCargo.setText("");
        }

    }//GEN-LAST:event_EscuchaBuscar

    private void EscuchaCorreo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscuchaCorreo
        jLError.setVisible(false);

        try {     
            validacion(jtDocumento.getText());
            nov.buscar(person);
            String datos[] = {jtDocumento.getText(),jtTemperatura.getText(),
                            (String)jCEnfermedades.getSelectedItem(),
                            (String)jCNinios.getSelectedItem(),(String)jCMayores.getSelectedItem(),
                            jTAObservaciones.getText(),jLCargo.getText(),usuario};
            nov.validarDato(jtTemperatura.getText(), "Temperatura");
            Novedades novedad = nov.guardarBD(datos,person);
            EntityManagerHelper.beginTransaction();
            DAOFactory.getNovedadesDAO().insertar(novedad);
            EntityManagerHelper.commit();
            EntityManagerHelper.closeEntityManager();
            dispose();
        } catch (Exception e) {
            mensaje(e.getMessage());
            jLNombreCompleto.setText("");
            jLCargo.setText("");

        }
    }//GEN-LAST:event_EscuchaCorreo

    private void EscucharCerrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscucharCerrar
        dispose();
    }//GEN-LAST:event_EscucharCerrar

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public javax.swing.JComboBox jCEnfermedades;
    public javax.swing.JComboBox jCMayores;
    public javax.swing.JComboBox jCNinios;
    private javax.swing.JLabel jLCargo;
    private javax.swing.JButton jLCerrar;
    private javax.swing.JButton jLEnviar;
    public javax.swing.JLabel jLError;
    private javax.swing.JLabel jLNombreCompleto;
    private javax.swing.JLabel jL_fondo;
    private javax.swing.JLabel jL_fondo1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTAObservaciones;
    public javax.swing.JTextField jtDocumento;
    public javax.swing.JTextField jtTemperatura;
    // End of variables declaration//GEN-END:variables

    private void mensaje(String message) {
        jLError.setVisible(true);
        jLError.setText(message);
    }

    private void validacion(String documento) throws Exception {
        nov.validarDato(documento, "Documento");
        int auxDoc = Integer.parseInt(jtDocumento.getText());
        person = DAOFactory.getPersona().consultarID(auxDoc);
    }
}
