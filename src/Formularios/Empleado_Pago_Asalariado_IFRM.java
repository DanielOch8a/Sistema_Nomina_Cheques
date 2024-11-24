package Formularios;

import Clases_Modelo.Empleado_Asalariado_Clase_Derivada;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Empleado_Pago_Asalariado_IFRM extends javax.swing.JInternalFrame {

    Empleado_Asalariado_Clase_Derivada Obj_Empleado_Horas;
    public static DecimalFormat Decf = new DecimalFormat("$#,##0.00");
    int contador = 0;

    public Empleado_Pago_Asalariado_IFRM() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg1 = new javax.swing.JPanel();
        label_Nombre = new javax.swing.JLabel();
        txtField_Nombre = new javax.swing.JTextField();
        label_Depto = new javax.swing.JLabel();
        txtField_Depto = new javax.swing.JTextField();
        label_Puesto = new javax.swing.JLabel();
        txtField_Puesto = new javax.swing.JTextField();
        label_SueldoMensual = new javax.swing.JLabel();
        txtField_SueldoMensual = new javax.swing.JTextField();
        btn_Generar_Cheque = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        btn_Limpiar_Cheques = new javax.swing.JButton();
        bg_Empleados_Asalariados = new javax.swing.JPanel();
        label_Empleados_Asalariados = new javax.swing.JLabel();
        bg2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea_Impresion_Cheque = new javax.swing.JTextArea();
        label_Cheques = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Empleados Asalariados");

        bg1.setBackground(new java.awt.Color(204, 204, 204));
        bg1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        bg1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Nombre.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        label_Nombre.setForeground(new java.awt.Color(0, 0, 0));
        label_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_Nombre.setText("Nombre:");
        bg1.add(label_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 170, 30));

        txtField_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        txtField_Nombre.setForeground(new java.awt.Color(51, 51, 51));
        txtField_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtField_NombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtField_NombreKeyTyped(evt);
            }
        });
        bg1.add(txtField_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 490, 30));

        label_Depto.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        label_Depto.setForeground(new java.awt.Color(0, 0, 0));
        label_Depto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_Depto.setText("Departamento:");
        bg1.add(label_Depto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 170, 30));

        txtField_Depto.setBackground(new java.awt.Color(255, 255, 255));
        txtField_Depto.setForeground(new java.awt.Color(51, 51, 51));
        txtField_Depto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtField_DeptoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtField_DeptoKeyTyped(evt);
            }
        });
        bg1.add(txtField_Depto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 490, 30));

        label_Puesto.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        label_Puesto.setForeground(new java.awt.Color(0, 0, 0));
        label_Puesto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_Puesto.setText("Puesto:");
        bg1.add(label_Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 170, 30));

        txtField_Puesto.setBackground(new java.awt.Color(255, 255, 255));
        txtField_Puesto.setForeground(new java.awt.Color(51, 51, 51));
        txtField_Puesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtField_PuestoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtField_PuestoKeyTyped(evt);
            }
        });
        bg1.add(txtField_Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 490, 30));

        label_SueldoMensual.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        label_SueldoMensual.setForeground(new java.awt.Color(0, 0, 0));
        label_SueldoMensual.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_SueldoMensual.setText("Sueldo Mensual:");
        bg1.add(label_SueldoMensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 180, 30));

        txtField_SueldoMensual.setBackground(new java.awt.Color(255, 255, 255));
        txtField_SueldoMensual.setForeground(new java.awt.Color(51, 51, 51));
        txtField_SueldoMensual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtField_SueldoMensualKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtField_SueldoMensualKeyTyped(evt);
            }
        });
        bg1.add(txtField_SueldoMensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 490, 30));

        btn_Generar_Cheque.setBackground(new java.awt.Color(255, 255, 255));
        btn_Generar_Cheque.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        btn_Generar_Cheque.setForeground(new java.awt.Color(0, 0, 0));
        btn_Generar_Cheque.setText("Generar Cheque");
        btn_Generar_Cheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Generar_ChequeActionPerformed(evt);
            }
        });
        btn_Generar_Cheque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_Generar_ChequeKeyPressed(evt);
            }
        });
        bg1.add(btn_Generar_Cheque, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 150, 40));

        btn_Limpiar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Limpiar.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        btn_Limpiar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Limpiar.setText("Limpiar");
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });
        btn_Limpiar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_LimpiarKeyPressed(evt);
            }
        });
        bg1.add(btn_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 150, 40));

        btn_Limpiar_Cheques.setBackground(new java.awt.Color(255, 255, 255));
        btn_Limpiar_Cheques.setFont(new java.awt.Font("Mongolian Baiti", 1, 16)); // NOI18N
        btn_Limpiar_Cheques.setForeground(new java.awt.Color(0, 0, 0));
        btn_Limpiar_Cheques.setText("Limpiar Cheques");
        btn_Limpiar_Cheques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Limpiar_ChequesActionPerformed(evt);
            }
        });
        btn_Limpiar_Cheques.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_Limpiar_ChequesKeyPressed(evt);
            }
        });
        bg1.add(btn_Limpiar_Cheques, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 150, 40));

        bg_Empleados_Asalariados.setBackground(new java.awt.Color(0, 153, 153));
        bg_Empleados_Asalariados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        bg_Empleados_Asalariados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Empleados_Asalariados.setBackground(new java.awt.Color(32, 32, 32));
        label_Empleados_Asalariados.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        label_Empleados_Asalariados.setForeground(new java.awt.Color(32, 32, 32));
        label_Empleados_Asalariados.setText("EMPLEADOS ASALARIADOS");
        bg_Empleados_Asalariados.add(label_Empleados_Asalariados, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 6, -1, 20));

        bg1.add(bg_Empleados_Asalariados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        bg2.setBackground(new java.awt.Color(0, 153, 153));
        bg2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        bg2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtArea_Impresion_Cheque.setEditable(false);
        txtArea_Impresion_Cheque.setBackground(new java.awt.Color(255, 255, 255));
        txtArea_Impresion_Cheque.setColumns(20);
        txtArea_Impresion_Cheque.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtArea_Impresion_Cheque.setForeground(new java.awt.Color(32, 32, 32));
        txtArea_Impresion_Cheque.setRows(5);
        txtArea_Impresion_Cheque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtArea_Impresion_Cheque);

        bg2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 700, 260));

        label_Cheques.setBackground(new java.awt.Color(32, 32, 32));
        label_Cheques.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        label_Cheques.setForeground(new java.awt.Color(32, 32, 32));
        label_Cheques.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Cheques.setText("CHEQUES");
        bg2.add(label_Cheques, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bg2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtField_NombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_NombreKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtField_Depto.requestFocus();
        }
    }//GEN-LAST:event_txtField_NombreKeyPressed

    private void txtField_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_NombreKeyTyped
        LettersOnly(evt);
    }//GEN-LAST:event_txtField_NombreKeyTyped

    private void txtField_DeptoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_DeptoKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtField_Puesto.requestFocus();
        }
    }//GEN-LAST:event_txtField_DeptoKeyPressed

    private void txtField_DeptoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_DeptoKeyTyped
        LettersOnly(evt);
    }//GEN-LAST:event_txtField_DeptoKeyTyped

    private void txtField_PuestoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_PuestoKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtField_SueldoMensual.requestFocus();
        }
    }//GEN-LAST:event_txtField_PuestoKeyPressed

    private void txtField_PuestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_PuestoKeyTyped
        LettersOnly(evt);
    }//GEN-LAST:event_txtField_PuestoKeyTyped

    private void txtField_SueldoMensualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_SueldoMensualKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btn_Generar_Cheque.requestFocus();
        }
    }//GEN-LAST:event_txtField_SueldoMensualKeyPressed

    private void txtField_SueldoMensualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_SueldoMensualKeyTyped
        if (evt.getKeyChar() == '.') {
            return;
        }
        if (evt.getKeyChar() == ',') {
            return;
        }
        if (evt.getKeyChar() < '0') {
            evt.consume();
        }
        if (evt.getKeyChar() > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtField_SueldoMensualKeyTyped

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        Limpiar_Formulario();
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void btn_LimpiarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_LimpiarKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Limpiar_Formulario();
        }
    }//GEN-LAST:event_btn_LimpiarKeyPressed

    private void btn_Generar_ChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Generar_ChequeActionPerformed
        Algoritmo_Generar_Cheque();
    }//GEN-LAST:event_btn_Generar_ChequeActionPerformed

    private void btn_Generar_ChequeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_Generar_ChequeKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Algoritmo_Generar_Cheque();
            btn_Limpiar.requestFocus();
        }
    }//GEN-LAST:event_btn_Generar_ChequeKeyPressed

    private void btn_Limpiar_ChequesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Limpiar_ChequesActionPerformed
        Limpiar_Cheques();
    }//GEN-LAST:event_btn_Limpiar_ChequesActionPerformed

    private void btn_Limpiar_ChequesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_Limpiar_ChequesKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Limpiar_Cheques();
        }
    }//GEN-LAST:event_btn_Limpiar_ChequesKeyPressed

    private void Algoritmo_Generar_Cheque() {
        //Declarando Variables de Lectura
        String nombreEmp;
        String deptoEmp;
        String puestoEmp;
        double sueldoMensual;

        //Entrada
        nombreEmp = txtField_Nombre.getText();
        deptoEmp = txtField_Depto.getText();
        puestoEmp = txtField_Puesto.getText();

        try {
            sueldoMensual = Double.parseDouble(txtField_SueldoMensual.getText());
            if (sueldoMensual <= 0) {
                txtField_SueldoMensual.setText(null);
                txtField_SueldoMensual.requestFocus();
                JOptionPane.showMessageDialog(rootPane, "Error: Introduce un valor positivo");
                return;
            }
        } catch (NumberFormatException e) {
            txtField_SueldoMensual.setText(null);
            txtField_SueldoMensual.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Error de Java: Introduce un valor positivo");
            return;
        }

        Obj_Empleado_Horas = new Empleado_Asalariado_Clase_Derivada(nombreEmp, deptoEmp, puestoEmp, sueldoMensual);
        Obj_Empleado_Horas.setSueldoQnaAsal();
        contador += 1;

        txtArea_Impresion_Cheque.append("\t\t  ---------------------------------" + "\n");
        txtArea_Impresion_Cheque.append("\t\t           **CHEQUE #" + contador + "**" + "\n");
        txtArea_Impresion_Cheque.append("\t\t  Nombre............: " + Obj_Empleado_Horas.getNombreEmp() + "\n");
        txtArea_Impresion_Cheque.append("\t\t  Departamento..: " + Obj_Empleado_Horas.getDeptoEmp() + "\n");
        txtArea_Impresion_Cheque.append("\t\t  Puesto.............: " + Obj_Empleado_Horas.getPuestoEmp() + "\n");
        txtArea_Impresion_Cheque.append("\t\t  Sueldo Quinsenal...: " + Decf.format(Obj_Empleado_Horas.getSueldoQnaAsal()) + "\n");
        txtArea_Impresion_Cheque.append("\t\t  ---------------------------------" + "\n");

    }

    private void Limpiar_Formulario() {
        txtField_Nombre.setText(null);
        txtField_Depto.setText(null);
        txtField_Puesto.setText(null);
        txtField_SueldoMensual.setText(null);
        txtField_Nombre.requestFocus();
    }

    private void Limpiar_Cheques() {
        txtArea_Impresion_Cheque.setText(null);
        contador = 0;
        txtField_Nombre.requestFocus();
    }

    private void LettersOnly(java.awt.event.KeyEvent evt) {
        if (!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE) && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }

        /*  boolean Mayus = evt.getKeyChar() >= 65 && evt.getKeyChar() <= 90;
        boolean Minus = evt.getKeyChar() >= 97 && evt.getKeyChar() <= 122;
        boolean espacio = evt.getKeyChar() == 32;
        if (!(Mayus || Minus || espacio)) {
            evt.consume();
        }
         */
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg1;
    private javax.swing.JPanel bg2;
    private javax.swing.JPanel bg_Empleados_Asalariados;
    private javax.swing.JButton btn_Generar_Cheque;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_Limpiar_Cheques;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_Cheques;
    private javax.swing.JLabel label_Depto;
    private javax.swing.JLabel label_Empleados_Asalariados;
    private javax.swing.JLabel label_Nombre;
    private javax.swing.JLabel label_Puesto;
    private javax.swing.JLabel label_SueldoMensual;
    private javax.swing.JTextArea txtArea_Impresion_Cheque;
    private javax.swing.JTextField txtField_Depto;
    private javax.swing.JTextField txtField_Nombre;
    private javax.swing.JTextField txtField_Puesto;
    private javax.swing.JTextField txtField_SueldoMensual;
    // End of variables declaration//GEN-END:variables
}
