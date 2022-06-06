package gui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import libreriatrabajoprog.Libreria;


public class ModificarReservas extends javax.swing.JFrame {

    // Clase ModificarReservas, que sirve para modificar una reserva, extiende de JFrame por que usamos GUI
    
    PreparedStatement ps = null; //inicializamos la variale ps, usada mas adelate a la hora de conectar con la base de datos
    DefaultTableModel modelo; //inicializamos la variale modelo, usada mas adelate para trabajar con la tabla de datos

    //constructor de la interfaz grafica
    public ModificarReservas() {
        initComponents(); //Composicion de la interfaz grafica
        Libreria.llenarTabla(tablaDatos); //metodo tomado de la libreria externa usado para llenar la tabla con los datos que esten actualmente en la base de datos. Recibe como parametro la tabla de esta clase
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoVip = new javax.swing.ButtonGroup();
        grupoGaraje = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        labelDni = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelTlf = new javax.swing.JLabel();
        labelDir = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        labelNHab = new javax.swing.JLabel();
        labelTHab = new javax.swing.JLabel();
        labelTCamas = new javax.swing.JLabel();
        labelVIP = new javax.swing.JLabel();
        labelGaraje = new javax.swing.JLabel();
        textFieldDNI = new javax.swing.JTextField();
        textFieldNombre = new javax.swing.JTextField();
        textFieldTelefono = new javax.swing.JTextField();
        textFieldDireccion = new javax.swing.JTextField();
        textFieldCorreo = new javax.swing.JTextField();
        textFieldNHabitacion = new javax.swing.JTextField();
        comboBoxTHab = new javax.swing.JComboBox<>();
        comboBoxTCamas = new javax.swing.JComboBox<>();
        VipSi = new javax.swing.JRadioButton();
        GarajeSi = new javax.swing.JRadioButton();
        GarajeNone = new javax.swing.JRadioButton();
        VipNone = new javax.swing.JRadioButton();
        VipNo = new javax.swing.JRadioButton();
        GarajeNo = new javax.swing.JRadioButton();
        labelDni1 = new javax.swing.JLabel();
        botonModificar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombre", "Telefono", "Direccion", "CorreoElectronico", "Num. Hab", "Tipo. Hab", "Tipo Camas", "Vip", "Garaje"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDatos);

        labelDni.setText("Dni:");

        labelNombre.setText("Nombre:");

        labelTlf.setText("Teléfono:");

        labelDir.setText("Dirección:");

        labelCorreo.setText("Correo electrónico:");

        labelNHab.setText("Número de habitación:");

        labelTHab.setText("Tipo de habitación:");

        labelTCamas.setText("Tipo de camas:");

        labelVIP.setText("Vip:");

        labelGaraje.setText("Garaje:");

        comboBoxTHab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Normal", "Suit", "Dúplex" }));

        comboBoxTCamas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Individual", "Doble", "Matrimonio", "Triple", "Cama de agua" }));

        grupoVip.add(VipSi);
        VipSi.setText("Si");

        grupoGaraje.add(GarajeSi);
        GarajeSi.setText("Si");

        grupoGaraje.add(GarajeNone);
        GarajeNone.setSelected(true);
        GarajeNone.setText("None");

        grupoVip.add(VipNone);
        VipNone.setSelected(true);
        VipNone.setText("None");

        grupoVip.add(VipNo);
        VipNo.setText("No");

        grupoGaraje.add(GarajeNo);
        GarajeNo.setText("No");

        labelDni1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        labelDni1.setText("MODIFICAR RESERVA");
        labelDni1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificar2.png"))); // NOI18N
        botonModificar.setText("MODIFICAR");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textFieldDNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelDir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                        .addComponent(labelTlf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(labelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                                    .addComponent(textFieldDireccion)
                                    .addComponent(textFieldCorreo)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelNHab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelTHab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelVIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelTCamas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelGaraje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textFieldNHabitacion)
                                        .addComponent(comboBoxTHab, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(GarajeNone, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(GarajeSi, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(VipNone, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(VipSi, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(VipNo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(GarajeNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(comboBoxTCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(454, 454, 454)
                        .addComponent(labelDni1)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTlf, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(textFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelNHab, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(textFieldNHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTHab, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxTHab, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxTCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVIP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VipNone)
                    .addComponent(VipSi)
                    .addComponent(VipNo))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGaraje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GarajeNone)
                    .addComponent(GarajeSi)
                    .addComponent(GarajeNo))
                .addGap(35, 35, 35)
                .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(labelDni1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //evento del boton modificar
    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        Connection con = null; //inicializamos la conexion
        try {

            //BASE DE DATOS
            
            con = Libreria.getInstance().establecerConexionBD(); //establecemos la conexion con la BD
            //Le damos la instruccion de actualizar toda una fila. Dicho de otra forma, la sobreescribimos con los datos que hayamos cambiado en la interfaz.
            ps = (PreparedStatement) con.prepareStatement("UPDATE reservas SET dni=?,nombre=?,telefono=?, direccion=?,correoElectronico=?,numeroHabitacion=?,tipoHabitacion=?,tipoCamas=?, vip=?,garaje=? WHERE dni=?");
           //le damos a la instruccion sus respectivos valores sacados de los datos que hemos actualizado en nuestra interfaz grafica.
            ps.setString(1, textFieldDNI.getText());
            ps.setString(2, textFieldNombre.getText());
            ps.setInt(3, Integer.valueOf(textFieldTelefono.getText()));
            ps.setString(4, textFieldDireccion.getText());
            ps.setString(5, textFieldCorreo.getText());
            ps.setInt(6, Integer.valueOf(textFieldNHabitacion.getText()));
            ps.setString(7, comboBoxTHab.getSelectedItem().toString());
            ps.setString(8, comboBoxTCamas.getSelectedItem().toString());
            //como estos son radioButtons, necesitaremos tomar los valores seleccionados con un if
            if (VipNone.isSelected()) { //si el primero esta seleccionado entonces...
                ps.setString(9, VipNone.getLabel()); //que la instruccion tome como valor su etiqueta
            } else if (VipSi.isSelected()) { //si no, si este esta selecconado, entonces...
                ps.setString(9, VipSi.getLabel());//que la instruccion tome como valor su etiqueta
            } else if (VipNo.isSelected()) { //si no, si este esta selecconado, entonces...
                ps.setString(9, VipNo.getLabel());//que la instruccion tome como valor su etiqueta
            }

            if (GarajeNone.isSelected()) { //si el primero esta seleccionado entonces...
                ps.setString(10, GarajeNone.getLabel());//que la instruccion tome como valor su etiqueta
            } else if (GarajeSi.isSelected()) { //si no, si este esta selecconado, entonces...
                ps.setString(10, GarajeSi.getLabel());//que la instruccion tome como valor su etiqueta
            } else if (GarajeNo.isSelected()) { //si no, si este esta selecconado, entonces...
                ps.setString(10, GarajeNo.getLabel());//que la instruccion tome como valor su etiqueta
            }
            ps.setString(11, textFieldDNI.getText()); //por ultimo le volvemos a dar otra vez el dato del dni para que haga un update de una fila segun este dni
            ps.executeUpdate(); //ejecutamos la instruccion de actualizacion de la fila

            //TABLA
            
            int fila = tablaDatos.getSelectedRow(); //recogemos en una variable int la fila que hemos seleccionado para su modificacion
            //ahora cambiaremos todos y cada uno de los datos de esa fila seleccionada por los nuevos datos proporconados en la interfaz
            //solo cambiaremos la columna y por supuesto el dato que vamos a cambiar, segun la columna en la que se encuentre
            tablaDatos.setValueAt(textFieldDNI.getText(), fila, 0);
            tablaDatos.setValueAt(textFieldNombre.getText(), fila, 1);
            tablaDatos.setValueAt(textFieldTelefono.getText(), fila, 2);
            tablaDatos.setValueAt(textFieldDireccion.getText(), fila, 3);
            tablaDatos.setValueAt(textFieldCorreo.getText(), fila, 4);
            tablaDatos.setValueAt(textFieldNHabitacion.getText(), fila, 5);
            tablaDatos.setValueAt(comboBoxTHab.getSelectedItem().toString(), fila, 6);
            tablaDatos.setValueAt(comboBoxTCamas.getSelectedItem().toString(), fila, 7);
            //como estos son radioButtons, modificar los valores en la tabla con un if
            if (VipNone.isSelected()) { //si el primero esta seleccionado entonces...
                tablaDatos.setValueAt(VipNone.getLabel(), fila, 8); //que la tabla sobreescriba el dato tomandolo del label del radioButton que esta seleccionado
            } else if (VipSi.isSelected()) { //si no, si este esta selecconado, entonces...
                tablaDatos.setValueAt(VipSi.getLabel(), fila, 8); //que la tabla sobreescriba el dato tomandolo del label del radioButton que esta seleccionado
            } else if (VipNo.isSelected()) { //si no, si este esta selecconado, entonces...
                tablaDatos.setValueAt(VipNo.getLabel(), fila, 8); //que la tabla sobreescriba el dato tomandolo del label del radioButton que esta seleccionado
            }

            if (GarajeNone.isSelected()) { //si el primero esta seleccionado entonces...
                tablaDatos.setValueAt(GarajeNone.getLabel(), fila, 9); //que la tabla sobreescriba el dato tomandolo del label del radioButton que esta seleccionado
            } else if (GarajeSi.isSelected()) { //si no, si este esta selecconado, entonces...
                tablaDatos.setValueAt(GarajeSi.getLabel(), fila, 9); //que la tabla sobreescriba el dato tomandolo del label del radioButton que esta seleccionado
            } else if (GarajeNo.isSelected()) { //si no, si este esta selecconado, entonces...
                tablaDatos.setValueAt(GarajeNo.getLabel(), fila, 9); //que la tabla sobreescriba el dato tomandolo del label del radioButton que esta seleccionado

            }
            JOptionPane.showMessageDialog(null, "¡Reserva Modificada!"); //mensaje de confirmacion

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al modificar la reserva, intentelo de nuevo"); //mensaje de error de tipo sql
            System.out.println(e);
        }
    }//GEN-LAST:event_botonModificarActionPerformed
    
    //evento de raton que nos permitira colocar los datos de una reserva en sus repectivos elementos de interfaz grafica (comboBox, textField...etc) al seleccionar la fila
    private void tablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDatosMouseClicked

        Connection con = null; //inicializamos la conexion con la BD
        try {
            con = Libreria.getInstance().establecerConexionBD(); //establecemos la conexion con la BD
            int fila = tablaDatos.getSelectedRow();  //recogemos en una variable int la fila que hemos seleccionado para su modificacon
            String codigo = tablaDatos.getValueAt(fila, 0).toString();  //recogemos en una variable de tipo String el dato de la columna 0 y de la fila que hayamos seleccionado, es decir, el DNI.
            //instruccion de la seleccion de la reserva en la base de datos
            ps = (PreparedStatement) con.prepareStatement("SELECT dni,nombre,telefono,direccion,correoElectronico,numeroHabitacion,tipoHabitacion,tipoCamas, vip,garaje FROM reservas  WHERE dni=?");
            //le damos a la instruccion el dni de la fila que hemos seleccioado
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery(); //ejecutamos la instruccion

            if (rs.next()) { //si existe ua fila en la base de datos con ese dni entonces...
                //pondremos los datos en los textFiel tomandolos de su respectiva columna previamente seleccionada por la instruccion
                textFieldDNI.setText(rs.getString("dni"));
                textFieldNombre.setText(rs.getString("nombre"));
                textFieldTelefono.setText(rs.getString("telefono"));
                textFieldDireccion.setText(rs.getString("direccion"));
                textFieldCorreo.setText(rs.getString("correoElectronico"));
                textFieldNHabitacion.setText(rs.getString("numeroHabitacion"));
                //en el caso de los comboBox tendremos que hacerlo con un if ya que habra que igualar el dato que cojamos de esas columnas de la base de datos a la palabra que a nosotros nos convenga
                if ("Normal".equals(rs.getString("tipoHabitacion"))) { //si en esta columna seleccionada el tipo de habitacin es igual a "Normal", entonces...
                    comboBoxTHab.setSelectedItem("Normal"); //poner el combobox en el elemento de su respectivo modelo llamado "Normal". Asi hacemos con los demas

                } else if ("Suit".equals(rs.getString("tipoHabitacion"))) {

                    comboBoxTHab.setSelectedItem("Suit");

                } else if ("Dúplex".equals(rs.getString("tipoHabitacion"))) {

                    comboBoxTHab.setSelectedItem("Dúplex");

                }

                if ("Individual".equals(rs.getString("tipoCamas"))) {
                    comboBoxTCamas.setSelectedItem("Individual");

                } else if ("Doble".equals(rs.getString("tipoCamas"))) {

                    comboBoxTCamas.setSelectedItem("Doble");

                } else if ("Matrimonio".equals(rs.getString("tipoCamas"))) {

                    comboBoxTCamas.setSelectedItem("Matrimonio");

                } else if ("Triple".equals(rs.getString("tipoCamas"))) {

                    comboBoxTCamas.setSelectedItem("Triple");

                } else if ("Cama de agua".equals(rs.getString("tipoCamas"))) {

                    comboBoxTCamas.setSelectedItem("Cama de agua");

                }
                
                //en el caso de los radioButtons la idea es la misma solo que cambia la sentencia dentro de cada if
                if ("None".equals(rs.getString("vip"))) {
                    VipNone.setSelected(true); //marcar esta casilla. (NOTA: Al formar parte de un radioButton Group, si se seleccioa este, los otros automaticamente se deseleccionan.) Y asi con el resto de radioButtons

                } else if ("Si".equals(rs.getString("vip"))) {

                    VipSi.setSelected(true);

                } else if ("No".equals(rs.getString("vip"))) {

                    VipNo.setSelected(true);

                }

                if ("None".equals(rs.getString("garaje"))) {
                    GarajeNone.setSelected(true);

                } else if ("Si".equals(rs.getString("garaje"))) {

                    GarajeSi.setSelected(true);

                } else if ("No".equals(rs.getString("garaje"))) {

                    GarajeNo.setSelected(true);

                }

            }
        } catch (SQLException ex) {
            System.out.println(ex); //mensaje de error(SQL)
        }
    }//GEN-LAST:event_tablaDatosMouseClicked
    //metodo para ejecutar la interfaz
    public static void modificarReservas() {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarReservas().setVisible(true); //permite que sea visible
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton GarajeNo;
    private javax.swing.JRadioButton GarajeNone;
    private javax.swing.JRadioButton GarajeSi;
    private javax.swing.JRadioButton VipNo;
    private javax.swing.JRadioButton VipNone;
    private javax.swing.JRadioButton VipSi;
    private javax.swing.JButton botonModificar;
    private javax.swing.JComboBox<String> comboBoxTCamas;
    private javax.swing.JComboBox<String> comboBoxTHab;
    private javax.swing.ButtonGroup grupoGaraje;
    private javax.swing.ButtonGroup grupoVip;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelDir;
    private javax.swing.JLabel labelDni;
    private javax.swing.JLabel labelDni1;
    private javax.swing.JLabel labelGaraje;
    private javax.swing.JLabel labelNHab;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTCamas;
    private javax.swing.JLabel labelTHab;
    private javax.swing.JLabel labelTlf;
    private javax.swing.JLabel labelVIP;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextField textFieldCorreo;
    private javax.swing.JTextField textFieldDNI;
    private javax.swing.JTextField textFieldDireccion;
    private javax.swing.JTextField textFieldNHabitacion;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
