package gui;

import LoginLogout.Menu_Login;
import clases.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {
    
     // Clase Meu, que sirve para proporcionarle al consumidor un menú donde realizar las funciones de la aplicacion, extiende de JFrame por que usamos GUI

    ArrayList<Cliente> listadoReservas = new ArrayList<>(); //inicializacion del arraylist listadoReservas

    //constructor de la iterfaz grafica
    public Menu() {
        super("RESERVAS DEL HOTEL");//mensaje de la parte superior de la ventana
        initComponents(); //Composicion de la interfaz grafica
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        insertarReserva = new javax.swing.JButton();
        mostrarReservasButton = new javax.swing.JButton();
        eliminarReservaButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        salirButton = new javax.swing.JButton();
        modificarReservaButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(1500, 800));

        panel1.setLayout(null);

        insertarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/añadirReserva.png"))); // NOI18N
        insertarReserva.setText("Añadir Reserva");
        insertarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarReservaActionPerformed(evt);
            }
        });
        panel1.add(insertarReserva);
        insertarReserva.setBounds(120, 20, 180, 68);

        mostrarReservasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mostrarReservas.png"))); // NOI18N
        mostrarReservasButton.setText("Mostrar Reservas");
        mostrarReservasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarReservasButtonActionPerformed(evt);
            }
        });
        panel1.add(mostrarReservasButton);
        mostrarReservasButton.setBounds(330, 20, 190, 68);

        eliminarReservaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N
        eliminarReservaButton.setText("Eliminar Reserva");
        eliminarReservaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarReservaButtonActionPerformed(evt);
            }
        });
        panel1.add(eliminarReservaButton);
        eliminarReservaButton.setBounds(780, 20, 188, 68);

        logOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrarSesion.png"))); // NOI18N
        logOutButton.setText("Cerrar Sesión");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });
        panel1.add(logOutButton);
        logOutButton.setBounds(990, 20, 180, 68);

        salirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salir.png"))); // NOI18N
        salirButton.setText("Salir");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });
        panel1.add(salirButton);
        salirButton.setBounds(1200, 20, 145, 68);

        modificarReservaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificarReserva.png"))); // NOI18N
        modificarReservaButton.setText("Modificar Reserva");
        modificarReservaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarReservaButtonActionPerformed(evt);
            }
        });
        panel1.add(modificarReservaButton);
        modificarReservaButton.setBounds(550, 20, 200, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoMenu.jpg"))); // NOI18N
        panel1.add(jLabel1);
        jLabel1.setBounds(-240, -90, 1880, 970);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //evento del boton eliminarReserva
    private void eliminarReservaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarReservaButtonActionPerformed
        //ArrayMethods.eliminarReservas(listadoReservas);
        EliminarReserva.eliminarReserva(); //llamada del metodo correspondiente que contiene la GUI
    }//GEN-LAST:event_eliminarReservaButtonActionPerformed
    //evento del boton cerrarSesion
    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea cerrar sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) { //si la decision es afirmativa entonces...
            this.dispose(); //cierra la ventana actual
            Menu_Login.login(); //llamada del metodo correspondiente que contiene la GUI
        }
    }//GEN-LAST:event_logOutButtonActionPerformed
    //evento del boton insertarReserva
    private void insertarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarReservaActionPerformed
        Registro.registro(listadoReservas); //llamada del metodo correspondiente que contiene la GUI
    }//GEN-LAST:event_insertarReservaActionPerformed
    //evento del boton mostrarReserva
    private void mostrarReservasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarReservasButtonActionPerformed
        //ArrayMethods.mostrarReservas(listadoReservas);
        MostrarReservas.mostrarReservas(listadoReservas); //llamada del metodo correspondiente que contiene la GUI
    }//GEN-LAST:event_mostrarReservasButtonActionPerformed
    //evento del boton salir
    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea cerrar la aplicacion?", "Cerrar Apliación", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) { //si la decision es afirmativa entonces...
            System.exit(0); //salida limpia de la aplicacion
        }
    }//GEN-LAST:event_salirButtonActionPerformed
    //evento del boton modificarReserva
    private void modificarReservaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarReservaButtonActionPerformed
        ModificarReservas.modificarReservas(); //llamada del metodo correspondiente que contiene la GUI
    }//GEN-LAST:event_modificarReservaButtonActionPerformed
    
     //metodo para ejecutar la interfaz
    public static void menu() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true); //hace que la interfaz sea visible

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminarReservaButton;
    private javax.swing.JButton insertarReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton modificarReservaButton;
    private javax.swing.JButton mostrarReservasButton;
    private javax.swing.JPanel panel1;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables


}
