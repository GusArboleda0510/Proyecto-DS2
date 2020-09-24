/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControlRegistro;
import co.edu.modelo.Personas;
import co.edu.modelo.Programas;
import co.edu.univalle.persistencia.DAOFactory;
import java.util.ArrayList;

/**
 *
 * @author Alejandra Becerra
 */
public class Registro extends javax.swing.JFrame {

    ControlRegistro cr;
    ArrayList inf_programas = new ArrayList();
    ArrayList cod_programa = new ArrayList();

    String nombre, apellido, direccion, ciudad, tipoDocumento, cargo;
    int numeroDocumento, telefono, codigoPrograma;

    public Registro() {
        initComponents();
        setVisible(true);

    }

    private ArrayList llenar_programa(String op) {
        jc_Programa.removeAllItems();
        cod_programa = new ArrayList();
        ArrayList inf = new ArrayList();
        switch (op) {
            case "Ciencias de la administracion":
                inf.add("Administración de empresas");
                cod_programa.add("3845");
                inf.add("Comercio exterior");
                cod_programa.add("3857");
                inf.add("Contaduria pública");
                cod_programa.add("3841");
                ;
                break;
            case "Ciencias naturales y exactas":
                inf.add("Fisica");
                cod_programa.add("3146");
                inf.add("Tecnología química");
                cod_programa.add("2131");
                ;
                break;
            case "Ciencias sociales y economicas":
                inf.add("Economia");
                cod_programa.add("3340");
                ;
                break;
            case "Humanidades":
                inf.add("Licenciatura en historia");
                cod_programa.add("3251");
                ;
                break;
            case "Ingenieria":
                inf.add("Ingenieria sanitaria y ambiental");
                cod_programa.add("3754");
                inf.add("Ingenieria agrícola");
                cod_programa.add("3745");
                inf.add("Ingenieria civil");
                cod_programa.add("3747");
                inf.add("Ingenieria de alimentos");
                cod_programa.add("3753");
                inf.add("Tecnología en electronica");
                cod_programa.add("2710");
                inf.add("Tecnología en sistemas de informacion");
                cod_programa.add("2711");
                inf.add("Ingenieria de sistemas");
                cod_programa.add("3743");
                inf.add("Ingenieria eléctrica");
                cod_programa.add("3744");
                inf.add("Ingenieria industrial");
                cod_programa.add("3751");
                inf.add("Ingenieria mecanica");
                cod_programa.add("3748");
                inf.add("Ingenieria quimica");
                cod_programa.add("3749");
                ;
                break;
            case "Salud":
                inf.add("Bacteriología y laboratorio clínico");
                cod_programa.add("3647");
                inf.add("Enfermeria");
                cod_programa.add("3645");
                inf.add("Fisioterapia");
                cod_programa.add("3646");
                inf.add("Fonoaudiología");
                cod_programa.add("3648");
                inf.add("Odontología");
                cod_programa.add("3661");
                inf.add("Tecnología en atención prehospitalaria");
                cod_programa.add("2635");
                inf.add("Terapia ocupacional");
                cod_programa.add("3651");
                ;
                break;
            case "Educacion y Pedagogia":
                inf.add("Estudios políticos y resolución de conflitos");
                cod_programa.add("3489");
                inf.add("Licenciatura en educacion fisica");
                cod_programa.add("3490");
                inf.add("Licenciatura en matematicas");
                cod_programa.add("3492");
                ;
                break;
        }

        return inf;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jL_fondo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jt_NumeroDocumento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jr_CedulaExtranjeria = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jc_Programa = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jt_Direccion = new javax.swing.JTextField();
        jt_Nombre = new javax.swing.JTextField();
        jt_Telefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jr_TarjetaIdentidad = new javax.swing.JRadioButton();
        jc_Cargo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jc_Facultad = new javax.swing.JComboBox();
        jt_Apellido = new javax.swing.JTextField();
        jt_Ciudad = new javax.swing.JTextField();
        jl_codigoPrograma = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jr_CedulaCiudadania = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jlFondo = new javax.swing.JLabel();

        jL_fondo.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jL_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoRegistro.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jt_NumeroDocumento.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jt_NumeroDocumento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jt_NumeroDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_NumeroDocumentoKeyTyped(evt);
            }
        });
        jPanel1.add(jt_NumeroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 270, 30));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel9.setText("Programa:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 750, 90, 30));

        buttonGroup1.add(jr_CedulaExtranjeria);
        jr_CedulaExtranjeria.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jr_CedulaExtranjeria.setText("CE");
        jr_CedulaExtranjeria.setOpaque(false);
        jPanel1.add(jr_CedulaExtranjeria, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 60, 40));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel1.setText("Tipo Doc.:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 100, 60));

        mensaje.setFont(new java.awt.Font("Yu Gothic UI", 1, 22)); // NOI18N
        mensaje.setForeground(new java.awt.Color(255, 0, 0));
        mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 850, 470, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgGuardar.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscuchaBuscar(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 900, 190, 70));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgCerrar.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscuchaCerrar(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 900, 180, 70));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel5.setText("Direccion:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 110, 40));

        jc_Programa.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jc_Programa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administración de empresas", "Comercio exterior", "Contaduria pública" }));
        jc_Programa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jc_Programa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_ProgramaActionPerformed(evt);
            }
        });
        jPanel1.add(jc_Programa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 790, 270, 40));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel2.setText("Documento:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 130, 40));

        jt_Direccion.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jt_Direccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jt_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 270, 30));

        jt_Nombre.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jt_Nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jt_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_NombreKeyTyped(evt);
            }
        });
        jPanel1.add(jt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 270, 30));

        jt_Telefono.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jt_Telefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jt_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_TelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(jt_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 270, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel3.setText("Apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 90, 40));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel8.setText("Facultad:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, 110, 40));

        buttonGroup1.add(jr_TarjetaIdentidad);
        jr_TarjetaIdentidad.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jr_TarjetaIdentidad.setText("TI");
        jr_TarjetaIdentidad.setOpaque(false);
        jPanel1.add(jr_TarjetaIdentidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 60, 40));

        jc_Cargo.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jc_Cargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Docente", "Estudiante", "Administrativo" }));
        jc_Cargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jc_Cargo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jc_Cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_CargoActionPerformed(evt);
            }
        });
        jPanel1.add(jc_Cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 640, 270, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel4.setText("Telefono:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 110, 40));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel6.setText("Ciudad:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 110, 40));

        jc_Facultad.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jc_Facultad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ciencias de la administracion", "Ciencias naturales y exactas", "Ciencias sociales y economicas", "Humanidades", "Ingenieria", "Salud", "Educacion y pedagogia" }));
        jc_Facultad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jc_Facultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_FacultadActionPerformed(evt);
            }
        });
        jPanel1.add(jc_Facultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 700, 270, 30));

        jt_Apellido.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jt_Apellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jt_Apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_ApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(jt_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 270, 30));

        jt_Ciudad.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jt_Ciudad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jt_Ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_GuardarActionPerformed(evt);
            }
        });
        jt_Ciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_CiudadKeyTyped(evt);
            }
        });
        jPanel1.add(jt_Ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, 270, 30));

        jl_codigoPrograma.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jl_codigoPrograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_codigoPrograma.setText("3845");
        jl_codigoPrograma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jl_codigoPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 790, 80, 40));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel7.setText("Cargo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 110, 40));

        buttonGroup1.add(jr_CedulaCiudadania);
        jr_CedulaCiudadania.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jr_CedulaCiudadania.setSelected(true);
        jr_CedulaCiudadania.setText("CC");
        jr_CedulaCiudadania.setOpaque(false);
        jPanel1.add(jr_CedulaCiudadania, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 60, 40));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel14.setText("Nombre:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 90, 40));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 90));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(175, 50, 75));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("REGISTRO");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 330, 50));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondorojo3.jpg"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 500, 60));

        jlFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoRegistro.jpg"))); // NOI18N
        jPanel1.add(jlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 540, 1010));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 630));

        setSize(new java.awt.Dimension(518, 672));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_GuardarActionPerformed

    }//GEN-LAST:event_jb_GuardarActionPerformed

    public void llamarInformacion() throws Exception {

        try {
            if (jr_TarjetaIdentidad.isSelected()) {
                tipoDocumento = "TI";
            } else if (jr_CedulaExtranjeria.isSelected()) {
                tipoDocumento = "CE";
            } else if (jr_CedulaCiudadania.isSelected()) {
                tipoDocumento = "CC";
            }
            nombre = jt_Nombre.getText();
            apellido = jt_Apellido.getText();
            direccion = jt_Direccion.getText();
            ciudad = jt_Ciudad.getText();
            numeroDocumento = Integer.parseInt(jt_NumeroDocumento.getText());
            telefono = Integer.parseInt(jt_Telefono.getText());
            cargo = jc_Cargo.getSelectedItem().toString();
            codigoPrograma = Integer.parseInt(jl_codigoPrograma.getText());

        } catch (Exception e) {
            mensaje.setText("Ingrese todos los campos");
        }

    }

    public void objetoPersona() {

        try {
            Personas persona = new Personas();

            persona.setDocumento(numeroDocumento);
            persona.setNombre(nombre);
            persona.setApellido(apellido);
            persona.setTelefono(telefono);
            persona.setDireccion(direccion);
            persona.setCiudad(ciudad);
            persona.setTipoDocumento(tipoDocumento);
            persona.setActivo((short) 1);
            persona.setCargo(cargo);
            if (cargo != "Administrativo") {
                Programas p = DAOFactory.getProgramasDAO().consultarID(codigoPrograma);
                if (p != null) {
                    if (p.getIdPrograma() == codigoPrograma) {
                        persona.setPrograma(p);
                    }
                }
            } else {
                persona.setPrograma(null);
            }

            ControlRegistro cr = new ControlRegistro();
            cr.validarObjeto(persona);
            limpiar();
            new MostrarMensaje("Persona Registrada", null, true);

        } catch (Exception ex) {

            mensaje.setText(ex.getMessage());
            if(ex.getMessage().equals("La persona esta registrada")){
                jt_NumeroDocumento.setText("");
            }
        }

    }

    public void limpiar() {
        jt_Nombre.setText("");
        jt_Apellido.setText("");
        jt_Direccion.setText("");
        jt_Ciudad.setText("");
        jt_NumeroDocumento.setText("");
        jt_Telefono.setText("");
    }
    private void jc_FacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_FacultadActionPerformed
        inf_programas.clear();
        String opcion = (String) jc_Facultad.getSelectedItem();
        inf_programas = llenar_programa(opcion);
        for (int i = 0; i < inf_programas.size(); i++) {
            jc_Programa.addItem(inf_programas.get(i));
        }
    }//GEN-LAST:event_jc_FacultadActionPerformed

    private void jc_ProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_ProgramaActionPerformed
        String opc = (String) jc_Programa.getSelectedItem();
        for (int i = 0; i < inf_programas.size(); i++) {
            if (opc.equals(inf_programas.get(i))) {
                jl_codigoPrograma.setText((String) cod_programa.get(i));
            }

        }
    }//GEN-LAST:event_jc_ProgramaActionPerformed

    private void jt_NumeroDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_NumeroDocumentoKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_jt_NumeroDocumentoKeyTyped


    private void jt_TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_TelefonoKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_jt_TelefonoKeyTyped

    private void jt_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_NombreKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_jt_NombreKeyTyped

    private void jt_ApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_ApellidoKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_jt_ApellidoKeyTyped

    private void jt_CiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_CiudadKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_jt_CiudadKeyTyped

    private void jc_CargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_CargoActionPerformed
        String opcion = jc_Cargo.getSelectedItem().toString();
        if (opcion == "Administrativo") {
            jc_Facultad.setVisible(false);
            jc_Programa.setVisible(false);
            jl_codigoPrograma.setVisible(false);
            jLabel8.setText("");
            jLabel9.setText("");

        } else {
            jc_Facultad.setVisible(true);
            jc_Programa.setVisible(true);
            jl_codigoPrograma.setVisible(true);
            jLabel8.setText("Facultad:");
            jLabel9.setText("Programa:");
        }
    }//GEN-LAST:event_jc_CargoActionPerformed


    private void EscuchaBuscar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscuchaBuscar
        try {

            mensaje.setText("");

            llamarInformacion();
            objetoPersona();

        } catch (Exception ex) {
            System.out.print("boton" + ex.getMessage());
        }


    }//GEN-LAST:event_EscuchaBuscar

    private void EscuchaCerrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscuchaCerrar
        dispose();
    }//GEN-LAST:event_EscuchaCerrar


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jL_fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    public javax.swing.JComboBox jc_Cargo;
    public javax.swing.JComboBox jc_Facultad;
    public javax.swing.JComboBox jc_Programa;
    private javax.swing.JLabel jlFondo;
    public javax.swing.JLabel jl_codigoPrograma;
    public javax.swing.JRadioButton jr_CedulaCiudadania;
    public javax.swing.JRadioButton jr_CedulaExtranjeria;
    public javax.swing.JRadioButton jr_TarjetaIdentidad;
    public javax.swing.JTextField jt_Apellido;
    public javax.swing.JTextField jt_Ciudad;
    public javax.swing.JTextField jt_Direccion;
    public javax.swing.JTextField jt_Nombre;
    public javax.swing.JTextField jt_NumeroDocumento;
    public javax.swing.JTextField jt_Telefono;
    public javax.swing.JLabel mensaje;
    // End of variables declaration//GEN-END:variables

}
