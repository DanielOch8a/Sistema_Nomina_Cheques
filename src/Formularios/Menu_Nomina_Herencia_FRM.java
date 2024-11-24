package Formularios;

import java.awt.Component;
import java.awt.Dimension;

public class Menu_Nomina_Herencia_FRM extends javax.swing.JFrame {

    Empleado_Pago_Horas_IFRM Emp_Pago_Horas_IFRM = null;
    Empleado_Pago_Asalariado_IFRM Emp_Pago_Mensual_IFRM = null;
    Visualizar_Modelado_IFRM Visualizar_Modelado_IFRM = null;
    Ayuda_AcercaDe_IFRM Ayuda_Acerca_De_IFRM = null;
    Ayuda_Emp_Pago_Horas_IFRM Ayuda_Emp_Pago_Horas_IFRM = null;
    Ayuda_Emp_Pago_Asal_IFRM Ayuda_Emp_Pago_Asal_IFRM = null;

    public Menu_Nomina_Herencia_FRM() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Pestaña_Archivo = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();
        Pestaña_Cheques = new javax.swing.JMenu();
        Emp_Horas = new javax.swing.JMenuItem();
        Emp_Asal = new javax.swing.JMenuItem();
        Pestaña_Modelado = new javax.swing.JMenu();
        Visualizar_UML = new javax.swing.JMenuItem();
        Pestaña_Ayuda = new javax.swing.JMenu();
        Ayuda_Emp_Horas = new javax.swing.JMenuItem();
        Ayuda_Emp_Asal = new javax.swing.JMenuItem();
        Ayuda_Acerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Impresion de Cheques de Nomina");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        Pestaña_Archivo.setText("Archivo");

        Salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Pestaña_Archivo.add(Salir);

        jMenuBar1.add(Pestaña_Archivo);

        Pestaña_Cheques.setText("Cheques");

        Emp_Horas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Emp_Horas.setText("Empleado Por Horas");
        Emp_Horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emp_HorasActionPerformed(evt);
            }
        });
        Pestaña_Cheques.add(Emp_Horas);

        Emp_Asal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Emp_Asal.setText("Empleado Asalariado");
        Emp_Asal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emp_AsalActionPerformed(evt);
            }
        });
        Pestaña_Cheques.add(Emp_Asal);

        jMenuBar1.add(Pestaña_Cheques);

        Pestaña_Modelado.setText("Modelado");

        Visualizar_UML.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Visualizar_UML.setText("Visualizar Diagrama UML");
        Visualizar_UML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Visualizar_UMLActionPerformed(evt);
            }
        });
        Pestaña_Modelado.add(Visualizar_UML);

        jMenuBar1.add(Pestaña_Modelado);

        Pestaña_Ayuda.setText("Ayuda");

        Ayuda_Emp_Horas.setText("Empleados Pago Por Hora");
        Ayuda_Emp_Horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ayuda_Emp_HorasActionPerformed(evt);
            }
        });
        Pestaña_Ayuda.add(Ayuda_Emp_Horas);

        Ayuda_Emp_Asal.setText("Empleados Pago Asalariado");
        Ayuda_Emp_Asal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ayuda_Emp_AsalActionPerformed(evt);
            }
        });
        Pestaña_Ayuda.add(Ayuda_Emp_Asal);

        Ayuda_Acerca.setText("Acerca De");
        Ayuda_Acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ayuda_AcercaActionPerformed(evt);
            }
        });
        Pestaña_Ayuda.add(Ayuda_Acerca);

        jMenuBar1.add(Pestaña_Ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void Ayuda_AcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ayuda_AcercaActionPerformed
        Ayuda_Acerca_De_IFRM = new Ayuda_AcercaDe_IFRM();
        Iniciar_Ventana(Ayuda_Acerca_De_IFRM);
    }//GEN-LAST:event_Ayuda_AcercaActionPerformed

    private void Emp_HorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emp_HorasActionPerformed
        Emp_Pago_Horas_IFRM = new Empleado_Pago_Horas_IFRM();
        Iniciar_Ventana(Emp_Pago_Horas_IFRM);
    }//GEN-LAST:event_Emp_HorasActionPerformed

    private void Emp_AsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emp_AsalActionPerformed
        Emp_Pago_Mensual_IFRM = new Empleado_Pago_Asalariado_IFRM();
        Iniciar_Ventana(Emp_Pago_Mensual_IFRM);
    }//GEN-LAST:event_Emp_AsalActionPerformed

    private void Visualizar_UMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Visualizar_UMLActionPerformed
        Visualizar_Modelado_IFRM = new Visualizar_Modelado_IFRM();
        Iniciar_Ventana(Visualizar_Modelado_IFRM);
    }//GEN-LAST:event_Visualizar_UMLActionPerformed

    private void Ayuda_Emp_HorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ayuda_Emp_HorasActionPerformed
        Ayuda_Emp_Pago_Horas_IFRM = new Ayuda_Emp_Pago_Horas_IFRM();
        Iniciar_Ventana(Ayuda_Emp_Pago_Horas_IFRM);
    }//GEN-LAST:event_Ayuda_Emp_HorasActionPerformed

    private void Ayuda_Emp_AsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ayuda_Emp_AsalActionPerformed
        Ayuda_Emp_Pago_Asal_IFRM = new Ayuda_Emp_Pago_Asal_IFRM();
        Iniciar_Ventana(Ayuda_Emp_Pago_Asal_IFRM);    }//GEN-LAST:event_Ayuda_Emp_AsalActionPerformed

    private void Iniciar_Ventana(Component Objeto_FRM) {
        jDesktopPane1.add(Objeto_FRM);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = Objeto_FRM.getSize();
        Objeto_FRM.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        Objeto_FRM.setVisible(true);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_Nomina_Herencia_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Nomina_Herencia_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Nomina_Herencia_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Nomina_Herencia_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Nomina_Herencia_FRM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Ayuda_Acerca;
    private javax.swing.JMenuItem Ayuda_Emp_Asal;
    private javax.swing.JMenuItem Ayuda_Emp_Horas;
    private javax.swing.JMenuItem Emp_Asal;
    private javax.swing.JMenuItem Emp_Horas;
    private javax.swing.JMenu Pestaña_Archivo;
    private javax.swing.JMenu Pestaña_Ayuda;
    private javax.swing.JMenu Pestaña_Cheques;
    private javax.swing.JMenu Pestaña_Modelado;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem Visualizar_UML;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
