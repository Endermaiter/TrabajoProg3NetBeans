package gui;

import clases.Cliente;
import clases.Writing;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;
import libreriatrabajoprog.Libreria;

public class Registro extends javax.swing.JFrame {
    
    // Clase Registro, que sirve para registrar reservas tanto en la tabla como en la base de datos, extiende de JFrame por que usamos GUI

    PreparedStatement ps = null; //inicializamos la variale ps, usada mas adelate a la hora de conectar con la base de datos

    //metodo para ejecutar la interfaz
    public static void registro(ArrayList<Cliente> reservas) {
        //le damos a este metodo el arraylist reservas de tipo cliete para que este se lo de al contructor
        java.awt.EventQueue.invokeLater(() -> {
            new Registro(reservas).setVisible(true);//permite que sea visible
        });
    }
    
    //constructor de la interfaz grafica
    public Registro(ArrayList<Cliente> reservas) {
        super("REGISTRO"); //mensaje de la parte superior de la ventana
        initComponents(); //Composicion de la interfaz grafica
        super.setLocationRelativeTo(null); //coloca la ventana en el centro de la pantalla
        
        //evento de boton de registro
        registrarReservaButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            
            //recogemos en unas variables los datos introducidos en cada elemento de la GUI
            
            String dni = textFieldDNI.getText();
            String nombre = textFieldNombre.getText();
            int telefono = Integer.parseInt(textFieldTelefono.getText());
            String direccion = textFieldDireccion.getText();
            String correo = textFieldCorreo.getText();
            int numeroHabitacion = Integer.parseInt(textFieldNHabitacion.getText());
            String tipoHabtacion = comboBoxTHab.getSelectedItem().toString();
            String tipoCamas = comboBoxTCamas.getSelectedItem().toString();

            //las variables de los radioButton tienen que ser asignadas mediante condicionales
            String vip = null;
            if (VipNone.isSelected()) {
                vip = null;
            } else if (VipSi.isSelected()) {
                vip = "Si";
            } else if (VipNo.isSelected()) {
                vip = "No";
            }
            String garaje = null;
            if (GarajeNone.isSelected()) {
                garaje = null;
            } else if (GarajeSi.isSelected()) {
                garaje = "Si";
            } else if (GarajeNo.isSelected()) {
                garaje = "No";
            }

            Writing write = new Writing(); //inicializamos un objeto de tipo writing
            write.escribirReservas(reservas, dni, nombre, telefono, direccion, correo, numeroHabitacion, tipoHabtacion, tipoCamas, vip, garaje); //llamamos al metodo esceribir reservas, proporcionandole todos los datos recogidos
            insertarBD(); //llamamos al metodo nsertarBD que introduce la nueva reserva en la base de datos

            JOptionPane.showMessageDialog(null, "¡Cliente registrado correctamente!");//mensaje de confirmacion
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
        setResizable(false);
        setSize(new java.awt.Dimension(400, 600));

        panel2.setPreferredSize(new java.awt.Dimension(400, 600));

        registrarReservaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/añadir2.png"))); // NOI18N
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

        comboBoxTHab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Normal", "Suit", "Dúplex" }));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
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

    //método que reinicia los elementos, donde se introduce los datos, a su estado inicial
    private void limpiarCajasRegistro() {

        
        textFieldDNI.setText("");
        textFieldNombre.setText("");
        textFieldTelefono.setText("");
        textFieldDireccion.setText("");
        textFieldCorreo.setText("");
        textFieldNHabitacion.setText("");
        comboBoxTHab.setSelectedIndex(0);
        comboBoxTCamas.setSelectedIndex(0);
        VipNone.setSelected(true);
        VipSi.setSelected(false);
        VipNo.setSelected(false);
        GarajeNone.setSelected(true);
        GarajeSi.setSelected(false);
        GarajeNo.setSelected(false);
    }
    
    //metodo para realizar la insercion en la base de datos
    private void insertarBD() {

      
        try {

            //Conexion Base de Datos   
            
            //instruccion de la inserción de la reserva en la base de datos
            ps = (PreparedStatement) Libreria.getInstance().establecerConexionBD().prepareStatement("INSERT INTO reservas(dni,nombre,telefono,direccion,correoElectronico,numeroHabitacion,tipoHabitacion,tipoCamas,vip,garaje) VALUES(?,?,?,?,?,?,?,?,?,?)");
            //le proporcionamos los valores a la instruccion
            ps.setString(1, textFieldDNI.getText());
            ps.setString(2, textFieldNombre.getText());
            ps.setInt(3, Integer.valueOf(textFieldTelefono.getText()));
            ps.setString(4, textFieldDireccion.getText());
            ps.setString(5, textFieldCorreo.getText());
            ps.setInt(6, Integer.valueOf(textFieldNHabitacion.getText()));
            ps.setString(7, comboBoxTHab.getSelectedItem().toString());
            ps.setString(8, comboBoxTCamas.getSelectedItem().toString());

            if (VipNone.isSelected()) {
                ps.setString(9, VipNone.getLabel());

            } else if (VipSi.isSelected()) {
                ps.setString(9, VipSi.getLabel());

            } else if (VipNo.isSelected()) {
                ps.setString(9, VipNo.getLabel());
            }

            if (GarajeNone.isSelected()) {
                ps.setString(10, GarajeNone.getLabel());

            } else if (GarajeSi.isSelected()) {
                ps.setString(10, GarajeSi.getLabel());

            } else if (GarajeNo.isSelected()) {
                ps.setString(10, GarajeNo.getLabel());

            }

            ps.execute(); //ejecutamos la instruccion

            
            limpiarCajasRegistro();//llamamos al metodo que reestablece los elementos a su estado original
            Libreria.getInstance().establecerConexionBD().close(); //cerramos la conexion
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "La inserción fue rechazada");//mensaje de rechazo
        }

    }

}
