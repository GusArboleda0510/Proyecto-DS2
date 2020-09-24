
package Vista;

import Controlador.ControlRegistroEntrada;
import Controlador.UtilidadHora;
import co.edu.modelo.Personas;
import co.edu.modelo.Programas;
import co.edu.modelo.RegistroEntradaSalida;
import co.edu.univalle.persistencia.DAOFactory;
import co.edu.univalle.persistencia.EntityManagerHelper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
/**
 *
 * @author ANDRES ARBOLEDA
 */
public class RegistroEntrada extends javax.swing.JFrame implements Runnable{
    ArrayList inf = new ArrayList();
    Thread hilo = new Thread(this);
    ControlRegistroEntrada ce;
    
    Date fechaActual;
    String hora;
    
    Programas pr;
    Personas p;
    RegistroEntradaSalida es;
    
    public RegistroEntrada() {
        initComponents();
        jlMensaje.setVisible(false);
        jLNombre.setVisible(false);
        jlCargo.setVisible(false);
        jlCarrera.setVisible(false);
        //////////////////////////HORA//////////////////
        hilo.start();
        //////////////////////////////////////////////
        setVisible(true);
        
    }
    private void menaje(String mensaje){
        jlMensaje.setVisible(true);
        jlMensaje.setText(mensaje);
        
    }
    private void hora(){
        Calendar calend = new GregorianCalendar();
        Calendar c = Calendar.getInstance();
        String minutos =  ""+calend.get(c.MINUTE);      
        String segundos =  ""+calend.get(c.SECOND);
        if(minutos.length()==1){
           minutos = 0 + minutos; 
        }
        if(segundos.length()==1){
           segundos = 0 + segundos; 
        } 

        hora =""+calend.get(c.HOUR_OF_DAY)+":"+minutos+":"+segundos;        
    }
    private void vaciar(){
        jtCodEstudiante.setText("");
        jLNombre.setText("");
        jlCargo.setText("");
        jlCarrera.setText("");
    }
    
    public ArrayList personaBuscar(int documento)throws Exception{
        ArrayList inf = new ArrayList();
        if(p.getDocumento()== documento){
            inf.add(p.getNombre());//Nombre
            inf.add(p.getCargo());//Cargo
            
            if(!p.getCargo().equals("Administrativo")){
            
                pr = DAOFactory.getProgramasDAO().consultarID(p.getPrograma().hashCode());
                
                    if(pr.getIdPrograma()==p.getPrograma().hashCode()){
                        inf.add(pr.getNombrePrograma());//Nombre Programa
                    }
            }else{
              inf.add("");  
            }
            ///////////////////////////////////////////////////////
            List<RegistroEntradaSalida> reg = DAOFactory.getRegistroEntradaSalidaDAO().consultarTodos();
            if(ce.opcionCrear(p, reg)){
                 menaje("El usuario no tiene registro de salida");
            }
        }
        return inf;
    }
    private void insertar(String hora,Date fechaActual, Personas p) throws Exception{
    
        Date auxHora = null;
        RegistroEntradaSalida es = new RegistroEntradaSalida();
        es.setFecha(fechaActual);
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
        auxHora = formato.parse(hora);
        es.setHoraEntrada(auxHora);
        es.setCedula(p);
        es.setHoraSalida(null);
        
        EntityManagerHelper.beginTransaction();
        DAOFactory.getRegistroEntradaSalidaDAO().insertar(es);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jlHora1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtCodEstudiante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jlMensaje = new javax.swing.JLabel();
        jlCargo = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jlCarrera = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLCerrar = new javax.swing.JButton();
        jLBuscar = new javax.swing.JButton();
        jLFondo2 = new javax.swing.JLabel();
        jL_fondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlHora1.setFont(new java.awt.Font("Yu Gothic UI", 0, 30)); // NOI18N
        jlHora1.setText("HH:MM:SS");
        jPanel1.add(jlHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 180, 50));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 90, 50));

        jtCodEstudiante.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jPanel1.add(jtCodEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 200, 40));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel2.setText("Documento:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 110, 50));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(175, 50, 75));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ENTRADA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 370, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondorojo2.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, 60));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgHora.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscuchaHora(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 240, 70));

        jlMensaje.setFont(new java.awt.Font("Yu Gothic UI", 1, 22)); // NOI18N
        jlMensaje.setForeground(new java.awt.Color(204, 0, 0));
        jlMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMensaje.setText("mensaje");
        jPanel1.add(jlMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 470, 50));

        jlCargo.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jlCargo.setText("cargo");
        jPanel1.add(jlCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 280, 50));

        jLabel49.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel49.setText("Carrera:");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 90, 50));

        jlCarrera.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jlCarrera.setText("DEPENDE");
        jPanel1.add(jlCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 260, 50));

        jLNombre.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLNombre.setText("Nombre");
        jPanel1.add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 270, 50));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel11.setText("Cargo:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 90, 50));

        jLCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgCerrar.png"))); // NOI18N
        jLCerrar.setBorderPainted(false);
        jLCerrar.setContentAreaFilled(false);
        jLCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscuchaCerrar(evt);
            }
        });
        jPanel1.add(jLCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 630, 200, 70));

        jLBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgBuscar.png"))); // NOI18N
        jLBuscar.setBorderPainted(false);
        jLBuscar.setContentAreaFilled(false);
        jLBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscuchaBuscar(evt);
            }
        });
        jPanel1.add(jLBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 130, 60));

        jLFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoSalida.jpg"))); // NOI18N
        jPanel1.add(jLFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 510, 500));

        jL_fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoSalida.jpg"))); // NOI18N
        jPanel1.add(jL_fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(518, 633));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EscuchaBuscar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscuchaBuscar
        
        try {
            jlMensaje.setVisible(false);
            jLabel49.setVisible(true);
            int documento=Integer.parseInt(jtCodEstudiante.getText());
            
            ce = new ControlRegistroEntrada();
            p = DAOFactory.getPersona().consultarID(documento);
            
            ce.validacionRegEntrada(p,documento);
            inf=personaBuscar(documento);
            
            jLNombre.setText((String) inf.get(0));
            jlCargo.setText((String) inf.get(1));
            jLNombre.setVisible(true);
            jlCargo.setVisible(true);
            jlCarrera.setVisible(true);
            
            if(inf.get(2).equals("")){
                jlCarrera.setVisible(false);
                jLabel49.setVisible(false);
            }else{
                jlCarrera.setText((String) inf.get(2));
            }
            
        } catch (NumberFormatException e) {
            menaje("El codigo debe ser numerico");
        }catch (Exception ex) {
            menaje(ex.getMessage());
            System.out.println("Error en boton BUSCAR:  " +  ex);
            
        }
    }//GEN-LAST:event_EscuchaBuscar

    private void EscuchaHora(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscuchaHora
         try {
             List<RegistroEntradaSalida> reg = DAOFactory.getRegistroEntradaSalidaDAO().consultarTodos();
            if(!"".equals(jLNombre.getText())){
                if (!ce.opcionCrear(p,reg)) {
                    fechaActual = new Date();//Fecha
                    hora = UtilidadHora.getinstance().getHora();
                    insertar(hora, fechaActual,p);
                    vaciar();
                    new MostrarMensaje("Se ha registrado la entrada con exito" ,null,true);
                }else{
                    menaje("El usuario no tiene registro de salida");
                }
            }else{
                menaje("Debes buscar usuario");
            }
        } catch (Exception ex) {
            System.out.println("ERROR = "+ ex);
        }
    }//GEN-LAST:event_EscuchaHora

    private void EscuchaCerrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscuchaCerrar
        dispose();
    }//GEN-LAST:event_EscuchaCerrar
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jLBuscar;
    private javax.swing.JButton jLCerrar;
    private javax.swing.JLabel jLFondo2;
    public javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jL_fondo1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel jlCargo;
    public javax.swing.JLabel jlCarrera;
    public javax.swing.JLabel jlHora1;
    private javax.swing.JLabel jlMensaje;
    public javax.swing.JTextField jtCodEstudiante;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        while (current == hilo) {
            hora();
            jlHora1.setText(hora);
        }
    }
}
