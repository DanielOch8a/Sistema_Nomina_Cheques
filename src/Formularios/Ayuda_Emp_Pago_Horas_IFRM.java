
package Formularios;


public class Ayuda_Emp_Pago_Horas_IFRM extends javax.swing.JInternalFrame {


    public Ayuda_Emp_Pago_Horas_IFRM() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setTitle("Info Empleado Pago Por Horas");

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(32, 32, 32));
        jTextArea1.setRows(5);
        jTextArea1.setText("                       Generacion de cheque para empleado de pago por horas\n\nIngrese en los campos de datos; nombre, departamento, puesto, horas trabajadas,\ncuota por hora del empleado, una vez llenado los datos dé clic en el boton \n\"Generar Cheque\". Ya oprimido el boton, se le generará un cheque con los datos del \nempleado y con su respectivo sueldo (Horas trabajadas X Cuota Por Hora).");
        jScrollPane1.setViewportView(jTextArea1);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
