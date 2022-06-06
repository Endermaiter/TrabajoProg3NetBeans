package gui;

import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import libreriatrabajoprog.Libreria;

public class EliminarReserva extends javax.swing.JFrame {
    
    // Clase ElminarReserva, que sirve para eliminar ua reserva, extiende de JFrame por que usamos GUI

    PreparedStatement ps = null; //inicializamos la variale ps, usada mas adelate a la hora de conectar con la base de datos
  DefaultTableModel modelo;  //inicializamos la variale modelo, usada mas adelate para trabajar con la tabla de datos

    //constructor de la iterfaz grafica
    public EliminarReserva() {

        initComponents(); //Composicion de la interfaz grafica
        Libreria.llenarTabla(tablaDatos); //metodo tomado de la libreria externa usado para llenar la tabla con los datos que esten actualmente en la base de datos. Recibe como parametro la tabla de esta clase
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        botoneliminarReserva = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombre", "Telefono", "Dirección", "Correo ", "Nº habitación", "Tipo Habitación", "Tipo Camas", "Vip", "Garaje"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaDatos);

        botoneliminarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar2.png"))); // NOI18N
        botoneliminarReserva.setText("Eliminar Reserva");
        botoneliminarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneliminarReservaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel1.setText("ELIMINAR RESERVAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 924, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(botoneliminarReserva)
                .addGap(11, 11, 11))
            .addGroup(layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(botoneliminarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //evento de boton para eliminar la reserva
    private void botoneliminarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneliminarReservaActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea eliminar la reserva?", "Confirmacion de eliminar", JOptionPane.YES_NO_OPTION); //confirmación de eliminacion de reserva
        if (opcion == JOptionPane.YES_OPTION) { //si la decision fue afirmativa entonces...
            Connection con = null; //inicializamos la conexion con la BD
            try {

                //conexion base de datos  
                
                con = Libreria.establecerConexionBD(); //establecemos la conexion con la BD

                int fila = tablaDatos.getSelectedRow(); //recogemos en una variable int la fila que hemos seleccionado para su eliminacion
                String codigo = tablaDatos.getValueAt(fila, 0).toString(); //recogemos en una variable de tipo String el dato de la columna 0 y de la fila que hayamos seleccionado, es decir, el DNI.

                ps = (PreparedStatement) con.prepareStatement("DELETE FROM reservas WHERE DNI=?"); //instruccion de la eliminacion de la reserva en la base de datos
                ps.setString(1, codigo); //le damos el dni previamente seleccionado a la instruccion 
                ps.execute();//ejecutamos la instruccion

                //tabla
         
                modelo = (DefaultTableModel)tablaDatos.getModel() ;
                modelo.removeRow(fila); //eliminamos la fila seleccionada de la tabla a tiempo real

                JOptionPane.showMessageDialog(null, "¡Producto Eliminado!"); //mensaje de confirmacion

                con.close(); //cierre de la conexion con la base de datos
            } catch (SQLException e) {
                System.out.println(e);// mensanje de error de tipo SQL
            }
        }
    }//GEN-LAST:event_botoneliminarReservaActionPerformed

    //metodo para ejecutar la interfaz
    public static void eliminarReserva() {
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
            java.util.logging.Logger.getLogger(EliminarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EliminarReserva().setVisible(true); //permite que sea visible
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoneliminarReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
