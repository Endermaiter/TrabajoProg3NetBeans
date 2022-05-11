package gui;

import clases.Cliente;
import clases.Writing;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Registro extends javax.swing.JFrame {
    
    public static void registro(ArrayList<Cliente>reservas) {
        java.awt.EventQueue.invokeLater(() -> {
            new Registro(reservas).setVisible(true);
        });
    }
    
    
    public Registro(ArrayList<Cliente>reservas) {
        super("REGISTRO");
        initComponents();
    registrarReservaButton.addActionListener((java.awt.event.ActionEvent evt) -> {                                                       
        String dni = textFieldDNI.getText();
        String nombre = textFieldNombre.getText();
        int telefono = Integer.parseInt(textFieldTelefono.getText());
        String direccion = textFieldDireccion.getText();
        String correo = textFieldCorreo.getText();
        int numeroHabitacion = Integer.parseInt(textFieldNHabitacion.getText());
        String tipoHabtacion = textFieldTHabitacion.getText();
        String tipoCamas = textFieldTCamas.getText();
        boolean vip = Boolean.parseBoolean(textFieldVIP.getText());
        boolean garaje = Boolean.parseBoolean(textFieldGaraje.getText());
        
        Writing write = new Writing();
        write.escribirReservas(reservas,dni,nombre,telefono,direccion,correo,numeroHabitacion,tipoHabtacion,tipoCamas,vip,garaje);
        
        
        mensajeLabel.setText("¡Cliente registrado correctamente!");
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new javax.swing.JPanel();
        mensajeLabel = new javax.swing.JLabel();
        textFieldGaraje = new javax.swing.JTextField();
        textFieldVIP = new javax.swing.JTextField();
        textFieldTCamas = new javax.swing.JTextField();
        textFieldTHabitacion = new javax.swing.JTextField();
        textFieldNHabitacion = new javax.swing.JTextField();
        textFieldCorreo = new javax.swing.JTextField();
        textFieldDireccion = new javax.swing.JTextField();
        textFieldTelefono = new javax.swing.JTextField();
        textFieldNombre = new javax.swing.JTextField();
        textFieldDNI = new javax.swing.JTextField();
        registrarReservaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mensajeLabel.setText("jLabel1");

        textFieldGaraje.setText("jTextField10");

        textFieldVIP.setText("jTextField9");

        textFieldTCamas.setText("jTextField8");

        textFieldTHabitacion.setText("jTextField7");

        textFieldNHabitacion.setText("jTextField6");

        textFieldCorreo.setText("jTextField5");

        textFieldDireccion.setText("jTextField4");

        textFieldTelefono.setText("jTextField3");

        textFieldNombre.setText("jTextField2");

        textFieldDNI.setText("jTextField1");

        registrarReservaButton.setText("jButton1");
        registrarReservaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarReservaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap(366, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldGaraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldNHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldTHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldTCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registrarReservaButton))
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addComponent(mensajeLabel)
                        .addGap(172, 172, 172))))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(textFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFieldNHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFieldTHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFieldTCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFieldVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFieldGaraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mensajeLabel)
                .addGap(18, 18, 18)
                .addComponent(registrarReservaButton)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarReservaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarReservaButtonActionPerformed
        
    }//GEN-LAST:event_registrarReservaButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel mensajeLabel;
    private javax.swing.JPanel panel2;
    private javax.swing.JButton registrarReservaButton;
    private javax.swing.JTextField textFieldCorreo;
    private javax.swing.JTextField textFieldDNI;
    private javax.swing.JTextField textFieldDireccion;
    private javax.swing.JTextField textFieldGaraje;
    private javax.swing.JTextField textFieldNHabitacion;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldTCamas;
    private javax.swing.JTextField textFieldTHabitacion;
    private javax.swing.JTextField textFieldTelefono;
    private javax.swing.JTextField textFieldVIP;
    // End of variables declaration//GEN-END:variables
}
