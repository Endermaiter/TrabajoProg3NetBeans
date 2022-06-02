package gui;

import LoginLogout.Menu_Login;
import clases.ArrayMethods;
import clases.Cliente;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Menu extends javax.swing.JFrame {
    
    ArrayList<Cliente>listadoReservas = new ArrayList<>();

    ImagenFondo imagen = new ImagenFondo();
    
    public Menu() {
        super("RESERVAS DEL HOTEL");
        this.setContentPane(imagen);
        initComponents();
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
        setPreferredSize(new java.awt.Dimension(1820, 800));
        setResizable(false);

        panel1.setLayout(null);

        insertarReserva.setText("Añadir Reserva");
        insertarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarReservaActionPerformed(evt);
            }
        });
        panel1.add(insertarReserva);
        insertarReserva.setBounds(120, 20, 295, 68);

        mostrarReservasButton.setText("Mostrar Reservas");
        mostrarReservasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarReservasButtonActionPerformed(evt);
            }
        });
        panel1.add(mostrarReservasButton);
        mostrarReservasButton.setBounds(440, 20, 149, 68);

        eliminarReservaButton.setText("Eliminar Reserva");
        eliminarReservaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarReservaButtonActionPerformed(evt);
            }
        });
        panel1.add(eliminarReservaButton);
        eliminarReservaButton.setBounds(750, 20, 188, 68);

        logOutButton.setText("Cerrar Sesión");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });
        panel1.add(logOutButton);
        logOutButton.setBounds(970, 20, 162, 68);

        salirButton.setText("Salir");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });
        panel1.add(salirButton);
        salirButton.setBounds(1170, 20, 145, 68);

        modificarReservaButton.setText("Modificar Reserva");
        modificarReservaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarReservaButtonActionPerformed(evt);
            }
        });
        panel1.add(modificarReservaButton);
        modificarReservaButton.setBounds(600, 20, 140, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoMenu.jpg"))); // NOI18N
        panel1.add(jLabel1);
        jLabel1.setBounds(0, 10, 1880, 970);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1792, Short.MAX_VALUE)
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

    
    
    private void eliminarReservaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarReservaButtonActionPerformed
        //ArrayMethods.eliminarReservas(listadoReservas);
        EliminarReserva.eliminarReserva();
    }//GEN-LAST:event_eliminarReservaButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null,"¿Está seguro de que desea cerrar sesión?","Cerrar Sesión",JOptionPane.YES_NO_OPTION);
        if(opcion == JOptionPane.YES_OPTION){
            this.dispose();
            Menu_Login.login();
        } 
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void insertarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarReservaActionPerformed
        Registro.registro(listadoReservas);
    }//GEN-LAST:event_insertarReservaActionPerformed

    private void mostrarReservasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarReservasButtonActionPerformed
        //ArrayMethods.mostrarReservas(listadoReservas);
        MostrarReservas.mostrarReservas();
    }//GEN-LAST:event_mostrarReservasButtonActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null,"¿Está seguro de que desea cerrar la aplicacion?","Cerrar Apliación",JOptionPane.YES_NO_OPTION);
        if(opcion == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_salirButtonActionPerformed

    private void modificarReservaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarReservaButtonActionPerformed
       ModificarReservas.modificarReservas();
    }//GEN-LAST:event_modificarReservaButtonActionPerformed

    
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
            new Menu().setVisible(true);
            
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

class ImagenFondo extends JPanel{
    
    private Image imagen;
    
    public void ImagenDeFondoMenu(Graphics g){
        imagen = new ImageIcon(getClass().getResource("fondoMenu.jpg")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), HEIGHT, this);
        setOpaque(false);
        super.paint(g);
    }
}

}
