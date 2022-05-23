package gui;

import clases.Cliente;
import clases.Writing;
import java.util.ArrayList;
import javax.swing.JOptionPane;


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
        String tipoHabtacion = comboBoxTHab.getSelectedItem().toString();
        String tipoCamas = comboBoxTCamas.getSelectedItem().toString();
        
        String vip = null;
        if(VipNone.isSelected()){
            vip = null;
        }else if(VipSi.isSelected()){
             vip = "True";
        }else if(VipNo.isSelected()){
             vip = "False";
        }
        String garaje = null;
        if(GarajeNone.isSelected()){
            garaje = null;
        }else if(GarajeSi.isSelected()){
             garaje = "True";
        }else if(GarajeNo.isSelected()){
             garaje = "False";
        }
        
        Writing write = new Writing();
        write.escribirReservas(reservas,dni,nombre,telefono,direccion,correo,numeroHabitacion,tipoHabtacion,tipoCamas,vip,garaje);
        
        
        JOptionPane.showMessageDialog(null, "¡Cliente registrado correctamente!");
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupVIP = new javax.swing.ButtonGroup();
        buttonGroupGaraje = new javax.swing.ButtonGroup();
        panel2 = new javax.swing.JPanel();
        textFieldNHabitacion = new javax.swing.JTextField();
        textFieldDireccion = new javax.swing.JTextField();
        textFieldTelefono = new javax.swing.JTextField();
        textFieldNombre = new javax.swing.JTextField();
        textFieldDNI = new javax.swing.JTextField();
        registrarReservaButton = new javax.swing.JButton();
        labelDni = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelTlf = new javax.swing.JLabel();
        labelDir = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        textFieldCorreo = new javax.swing.JTextField();
        labelNHab = new javax.swing.JLabel();
        labelVIP = new javax.swing.JLabel();
        labelGaraje = new javax.swing.JLabel();
        labelTCamas = new javax.swing.JLabel();
        labelTHab = new javax.swing.JLabel();
        comboBoxTHab = new javax.swing.JComboBox<>();
        comboBoxTCamas = new javax.swing.JComboBox<>();
        VipSi = new javax.swing.JRadioButton();
        VipNo = new javax.swing.JRadioButton();
        GarajeNo = new javax.swing.JRadioButton();
        GarajeSi = new javax.swing.JRadioButton();
        VipNone = new javax.swing.JRadioButton();
        GarajeNone = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(400, 600));

        panel2.setPreferredSize(new java.awt.Dimension(400, 600));

        registrarReservaButton.setText("REGISTRAR");

        labelDni.setText("Dni:");

        labelNombre.setText("Nombre:");

        labelTlf.setText("Teléfono:");

        labelDir.setText("Dirección:");

        labelCorreo.setText("Correo electrónico:");

        labelNHab.setText("Número de habitación:");

        labelVIP.setText("Vip:");

        labelGaraje.setText("Garaje:");

        labelTCamas.setText("Tipo de camas:");

        labelTHab.setText("Tipo de habitación:");

        comboBoxTHab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Normal", "Suit", "Duplex" }));

        comboBoxTCamas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Individual", "Doble", "Matrimonio", "Triple", "Cama de agua" }));

        buttonGroupVIP.add(VipSi);
        VipSi.setText("Si");

        buttonGroupVIP.add(VipNo);
        VipNo.setText("No");

        buttonGroupGaraje.add(GarajeNo);
        GarajeNo.setText("No");

        buttonGroupGaraje.add(GarajeSi);
        GarajeSi.setText("Si");

        buttonGroupVIP.add(VipNone);
        VipNone.setSelected(true);
        VipNone.setText("None");

        buttonGroupGaraje.add(GarajeNone);
        GarajeNone.setSelected(true);
        GarajeNone.setText("None");

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel11.setText("REGISTRO DE RESERVA");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(200, 200, 200))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(registrarReservaButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel2Layout.createSequentialGroup()
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelDir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelTlf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelNHab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelTHab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelVIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelTCamas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelGaraje, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textFieldNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textFieldDNI, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textFieldDireccion)
                                    .addComponent(textFieldCorreo)
                                    .addComponent(textFieldNHabitacion)
                                    .addComponent(comboBoxTHab, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBoxTCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(VipNone, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(GarajeNone, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(VipSi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(GarajeSi, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(GarajeNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(VipNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(labelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTlf, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNHab, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTHab, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxTHab, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(comboBoxTCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelVIP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VipSi)
                            .addComponent(VipNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GarajeSi)
                            .addComponent(GarajeNo)
                            .addComponent(labelGaraje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(VipNone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GarajeNone)))
                .addGap(18, 18, 18)
                .addComponent(registrarReservaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton GarajeNo;
    private javax.swing.JRadioButton GarajeNone;
    private javax.swing.JRadioButton GarajeSi;
    private javax.swing.JRadioButton VipNo;
    private javax.swing.JRadioButton VipNone;
    private javax.swing.JRadioButton VipSi;
    private javax.swing.ButtonGroup buttonGroupGaraje;
    private javax.swing.ButtonGroup buttonGroupVIP;
    private javax.swing.JComboBox<String> comboBoxTCamas;
    private javax.swing.JComboBox<String> comboBoxTHab;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelDir;
    private javax.swing.JLabel labelDni;
    private javax.swing.JLabel labelGaraje;
    private javax.swing.JLabel labelNHab;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTCamas;
    private javax.swing.JLabel labelTHab;
    private javax.swing.JLabel labelTlf;
    private javax.swing.JLabel labelVIP;
    private javax.swing.JPanel panel2;
    private javax.swing.JButton registrarReservaButton;
    private javax.swing.JTextField textFieldCorreo;
    private javax.swing.JTextField textFieldDNI;
    private javax.swing.JTextField textFieldDireccion;
    private javax.swing.JTextField textFieldNHabitacion;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
