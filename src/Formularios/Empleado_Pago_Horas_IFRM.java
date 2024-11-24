package Formularios;

import Clases_Modelo.Empleado_Por_Horas_Clase_Derivada;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Empleado_Pago_Horas_IFRM extends javax.swing.JInternalFrame {

    Empleado_Por_Horas_Clase_Derivada Obj_Empleado_Horas;
    public static DecimalFormat Decf = new DecimalFormat("$#,##0.00");
    int contador = 0;

    public Empleado_Pago_Horas_IFRM() {
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
        label_HorasTrab = new javax.swing.JLabel();
        label_CuotaXHr = new javax.swing.JLabel();
        txtField_HorasTrab = new javax.swing.JTextField();
        txtField_CuotaXHr = new javax.swing.JTextField();
        btn_Limpiar = new javax.swing.JButton();
        btn_Generar_Cheque = new javax.swing.JButton();
        bg_Empleado_Pago_Por_Hora = new javax.swing.JPanel();
        label_Empleado_Pago_Por_Hora = new javax.swing.JLabel();
        btn_Limpiar_Cheques = new javax.swing.JButton();
        bg2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea_Impresion_Cheque = new javax.swing.JTextArea();
        label_Cheques = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Empleados Por Hora");

        bg1.setBackground(new java.awt.Color(204, 204, 204));
        bg1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        bg1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Nombre.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        label_Nombre.setForeground(new java.awt.Color(0, 0, 0));
        label_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_Nombre.setText("Nombre:");
        bg1.add(label_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 170, 30));

        txtField_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        txtField_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtField_NombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtField_NombreKeyTyped(evt);
            }
        });
        bg1.add(txtField_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 490, 30));

        label_Depto.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        label_Depto.setForeground(new java.awt.Color(0, 0, 0));
        label_Depto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_Depto.setText("Departamento:");
        bg1.add(label_Depto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 170, 30));

        txtField_Depto.setBackground(new java.awt.Color(255, 255, 255));
        txtField_Depto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtField_DeptoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtField_DeptoKeyTyped(evt);
            }
        });
        bg1.add(txtField_Depto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 490, 30));

        label_Puesto.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        label_Puesto.setForeground(new java.awt.Color(0, 0, 0));
        label_Puesto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_Puesto.setText("Puesto:");
        bg1.add(label_Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 170, 30));

        txtField_Puesto.setBackground(new java.awt.Color(255, 255, 255));
        txtField_Puesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtField_PuestoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtField_PuestoKeyTyped(evt);
            }
        });
        bg1.add(txtField_Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 490, 30));

        label_HorasTrab.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        label_HorasTrab.setForeground(new java.awt.Color(0, 0, 0));
        label_HorasTrab.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_HorasTrab.setText("Horas trabajadas:");
        bg1.add(label_HorasTrab, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 190, 30));

        label_CuotaXHr.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        label_CuotaXHr.setForeground(new java.awt.Color(0, 0, 0));
        label_CuotaXHr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_CuotaXHr.setText("Cuota x Hora:");
        bg1.add(label_CuotaXHr, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 170, 30));

        txtField_HorasTrab.setBackground(new java.awt.Color(255, 255, 255));
        txtField_HorasTrab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtField_HorasTrabKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtField_HorasTrabKeyTyped(evt);
            }
        });
        bg1.add(txtField_HorasTrab, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 490, 30));

        txtField_CuotaXHr.setBackground(new java.awt.Color(255, 255, 255));
        txtField_CuotaXHr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtField_CuotaXHrKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtField_CuotaXHrKeyTyped(evt);
            }
        });
        bg1.add(txtField_CuotaXHr, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 490, 30));

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
        bg1.add(btn_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 150, 40));

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
        bg1.add(btn_Generar_Cheque, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 150, 40));

        bg_Empleado_Pago_Por_Hora.setBackground(new java.awt.Color(204, 204, 0));
        bg_Empleado_Pago_Por_Hora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        bg_Empleado_Pago_Por_Hora.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Empleado_Pago_Por_Hora.setBackground(new java.awt.Color(32, 32, 32));
        label_Empleado_Pago_Por_Hora.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        label_Empleado_Pago_Por_Hora.setForeground(new java.awt.Color(32, 32, 32));
        label_Empleado_Pago_Por_Hora.setText("EMPLEADOS PAGO POR HORA");
        bg_Empleado_Pago_Por_Hora.add(label_Empleado_Pago_Por_Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, 30));

        bg1.add(bg_Empleado_Pago_Por_Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

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
        bg1.add(btn_Limpiar_Cheques, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 150, 40));

        bg2.setBackground(new java.awt.Color(204, 204, 0));
        bg2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        bg2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtArea_Impresion_Cheque.setEditable(false);
        txtArea_Impresion_Cheque.setBackground(new java.awt.Color(255, 255, 255));
        txtArea_Impresion_Cheque.setColumns(20);
        txtArea_Impresion_Cheque.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtArea_Impresion_Cheque.setRows(5);
        txtArea_Impresion_Cheque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtArea_Impresion_Cheque);

        bg2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 700, 240));

        label_Cheques.setBackground(new java.awt.Color(32, 32, 32));
        label_Cheques.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        label_Cheques.setForeground(new java.awt.Color(32, 32, 32));
        label_Cheques.setText("CHEQUES");
        bg2.add(label_Cheques, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, 30));

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
                .addComponent(bg1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bg2, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtField_NombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_NombreKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtField_Depto.requestFocus();
        }
    }//GEN-LAST:event_txtField_NombreKeyPressed

    private void txtField_DeptoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_DeptoKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtField_Puesto.requestFocus();
        }
    }//GEN-LAST:event_txtField_DeptoKeyPressed

    private void txtField_PuestoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_PuestoKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtField_HorasTrab.requestFocus();
        }
    }//GEN-LAST:event_txtField_PuestoKeyPressed

    private void txtField_HorasTrabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_HorasTrabKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtField_CuotaXHr.requestFocus();
        }
    }//GEN-LAST:event_txtField_HorasTrabKeyPressed

    private void txtField_CuotaXHrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_CuotaXHrKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btn_Generar_Cheque.requestFocus();
        }
    }//GEN-LAST:event_txtField_CuotaXHrKeyPressed

    private void btn_Generar_ChequeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_Generar_ChequeKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Algoritmo_Generar_Cheque();
        }
    }//GEN-LAST:event_btn_Generar_ChequeKeyPressed

    private void btn_LimpiarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_LimpiarKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Limpiar_Formulario();
        }
    }//GEN-LAST:event_btn_LimpiarKeyPressed

    private void txtField_HorasTrabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_HorasTrabKeyTyped
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
    }//GEN-LAST:event_txtField_HorasTrabKeyTyped

    private void txtField_CuotaXHrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_CuotaXHrKeyTyped
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
    }//GEN-LAST:event_txtField_CuotaXHrKeyTyped

    private void txtField_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_NombreKeyTyped
        LettersOnly(evt);
    }//GEN-LAST:event_txtField_NombreKeyTyped

    private void txtField_DeptoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_DeptoKeyTyped
        LettersOnly(evt);
    }//GEN-LAST:event_txtField_DeptoKeyTyped

    private void txtField_PuestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_PuestoKeyTyped
        LettersOnly(evt);
    }//GEN-LAST:event_txtField_PuestoKeyTyped

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        Limpiar_Formulario();
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void btn_Generar_ChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Generar_ChequeActionPerformed
        Algoritmo_Generar_Cheque();
    }//GEN-LAST:event_btn_Generar_ChequeActionPerformed

    private void btn_Limpiar_ChequesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Limpiar_ChequesActionPerformed
        Limpiar_Cheques();
    }//GEN-LAST:event_btn_Limpiar_ChequesActionPerformed

    private void btn_Limpiar_ChequesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_Limpiar_ChequesKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Limpiar_Cheques();
        }
    }//GEN-LAST:event_btn_Limpiar_ChequesKeyPressed

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

    private void Algoritmo_Generar_Cheque() {
        //Declarando Variables de Lectura
        String nombreEmp;
        String deptoEmp;
        String puestoEmp;
        int horasTrab;
        double cuotaXHr;

        //Entrada
        nombreEmp = txtField_Nombre.getText();
        deptoEmp = txtField_Depto.getText();
        puestoEmp = txtField_Puesto.getText();

        try {
            horasTrab = Integer.parseInt(txtField_HorasTrab.getText());
            if (horasTrab <= 0 || horasTrab > 40) {
                txtField_HorasTrab.setText(null);
                txtField_HorasTrab.requestFocus();
                JOptionPane.showMessageDialog(rootPane, "Error: Introduce de 1 a 40 horas");
                return;
            }
        } catch (NumberFormatException e) {
            txtField_HorasTrab.setText(null);
            txtField_HorasTrab.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Error de Java: Introduce un valor positivo");
            return;
        }

        try {
            cuotaXHr = Double.parseDouble(txtField_CuotaXHr.getText());
            if (cuotaXHr <= 0) {
                txtField_CuotaXHr.requestFocus();
                JOptionPane.showMessageDialog(rootPane, "Error: Introduce un valor positivo");
                return;
            }
        } catch (NumberFormatException e) {
            txtField_CuotaXHr.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Error de Java: Introduce un valor positivo");
            return;
        }

        Obj_Empleado_Horas = new Empleado_Por_Horas_Clase_Derivada();

        Obj_Empleado_Horas.setNombreEmp(nombreEmp);
        Obj_Empleado_Horas.setDeptoEmp(deptoEmp);
        Obj_Empleado_Horas.setPuestoEmp(puestoEmp);
        Obj_Empleado_Horas.setHorasTrab(horasTrab);
        Obj_Empleado_Horas.setCuotaHora(cuotaXHr);

        Obj_Empleado_Horas.setSueldoQnaHoras();
        contador += 1;

        txtArea_Impresion_Cheque.append("\t\t  ---------------------------------" + "\n");
        txtArea_Impresion_Cheque.append("\t\t         **CHEQUE #" + contador + "**" + "\n");
        txtArea_Impresion_Cheque.append("\t\t  Nombre............: " + Obj_Empleado_Horas.getNombreEmp() + "\n");
        txtArea_Impresion_Cheque.append("\t\t  Departamento..: " + Obj_Empleado_Horas.getDeptoEmp() + "\n");
        txtArea_Impresion_Cheque.append("\t\t  Puesto.............: " + Obj_Empleado_Horas.getPuestoEmp() + "\n");
        txtArea_Impresion_Cheque.append("\t\t  Sueldo.............: " + Decf.format(Obj_Empleado_Horas.getSueldoQnaHoras()) + "\n");
        txtArea_Impresion_Cheque.append("\t\t  ---------------------------------" + "\n");

    }

    private void Limpiar_Formulario() {
        txtField_Nombre.setText(null);
        txtField_Depto.setText(null);
        txtField_Puesto.setText(null);
        txtField_HorasTrab.setText(null);
        txtField_CuotaXHr.setText(null);
        txtField_Nombre.requestFocus();
    }

    private void Limpiar_Cheques() {
        txtArea_Impresion_Cheque.setText(null);
        contador = 0;
        txtField_Nombre.requestFocus();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg1;
    private javax.swing.JPanel bg2;
    private javax.swing.JPanel bg_Empleado_Pago_Por_Hora;
    private javax.swing.JButton btn_Generar_Cheque;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_Limpiar_Cheques;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_Cheques;
    private javax.swing.JLabel label_CuotaXHr;
    private javax.swing.JLabel label_Depto;
    private javax.swing.JLabel label_Empleado_Pago_Por_Hora;
    private javax.swing.JLabel label_HorasTrab;
    private javax.swing.JLabel label_Nombre;
    private javax.swing.JLabel label_Puesto;
    private javax.swing.JTextArea txtArea_Impresion_Cheque;
    private javax.swing.JTextField txtField_CuotaXHr;
    private javax.swing.JTextField txtField_Depto;
    private javax.swing.JTextField txtField_HorasTrab;
    private javax.swing.JTextField txtField_Nombre;
    private javax.swing.JTextField txtField_Puesto;
    // End of variables declaration//GEN-END:variables
}
