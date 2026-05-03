    package proyectofinal.navegacion;

    import java.awt.Color;
    import java.time.LocalDate;
    import java.time.format.DateTimeFormatter;
    import proyectofinal.JPanelRedondeado;
    

    /**
     *
     * @author victo
     */
    public class PanelAdministrador extends javax.swing.JFrame {


    public PanelAdministrador(String nombreAdmin) {
        initComponents();
        this.setLocationRelativeTo(null);
        txtbienvenido.setText("Bienvenido, " + nombreAdmin);
        java.time.LocalDate fechaActual = java.time.LocalDate.now();
        java.time.format.DateTimeFormatter formateador = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");
        txtFecha.setText(fechaActual.format(formateador));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new JPanelRedondeado();
        Cerrar = new javax.swing.JPanel();
        closeText = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new JPanelRedondeado();
        jLabel1 = new javax.swing.JLabel();
        btnVerDestinos = new javax.swing.JPanel();
        txtVerDestinos = new javax.swing.JLabel();
        btnModificarDestinos = new javax.swing.JPanel();
        txtModificarDestinos = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JPanel();
        txtUsuarios = new javax.swing.JLabel();
        btnVuelos = new javax.swing.JPanel();
        txtVuelos = new javax.swing.JLabel();
        txtbienvenido = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cerrar.setBackground(new java.awt.Color(255, 255, 255));
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarMouseExited(evt);
            }
        });
        Cerrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        closeText.setText("x");
        Cerrar.add(closeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 10, 30));

        jPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 30, 30));

        jPanel2.setBackground(new java.awt.Color(117, 36, 165));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 531, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/loco peque .jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btnVerDestinos.setBackground(new java.awt.Color(117, 36, 165));
        btnVerDestinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerDestinosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerDestinosMouseExited(evt);
            }
        });

        txtVerDestinos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtVerDestinos.setForeground(new java.awt.Color(255, 255, 255));
        txtVerDestinos.setText("Ver destinos");

        javax.swing.GroupLayout btnVerDestinosLayout = new javax.swing.GroupLayout(btnVerDestinos);
        btnVerDestinos.setLayout(btnVerDestinosLayout);
        btnVerDestinosLayout.setHorizontalGroup(
            btnVerDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
            .addGroup(btnVerDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnVerDestinosLayout.createSequentialGroup()
                    .addContainerGap(35, Short.MAX_VALUE)
                    .addComponent(txtVerDestinos)
                    .addGap(28, 28, 28)))
        );
        btnVerDestinosLayout.setVerticalGroup(
            btnVerDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(btnVerDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnVerDestinosLayout.createSequentialGroup()
                    .addContainerGap(31, Short.MAX_VALUE)
                    .addComponent(txtVerDestinos)
                    .addGap(14, 14, 14)))
        );

        jPanel2.add(btnVerDestinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 160, 70));

        btnModificarDestinos.setBackground(new java.awt.Color(117, 36, 165));
        btnModificarDestinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarDestinosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarDestinosMouseExited(evt);
            }
        });

        txtModificarDestinos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtModificarDestinos.setForeground(new java.awt.Color(255, 255, 255));
        txtModificarDestinos.setText("Modificar destinos");

        javax.swing.GroupLayout btnModificarDestinosLayout = new javax.swing.GroupLayout(btnModificarDestinos);
        btnModificarDestinos.setLayout(btnModificarDestinosLayout);
        btnModificarDestinosLayout.setHorizontalGroup(
            btnModificarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnModificarDestinosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtModificarDestinos)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        btnModificarDestinosLayout.setVerticalGroup(
            btnModificarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnModificarDestinosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtModificarDestinos)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.add(btnModificarDestinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 160, 70));

        btnUsuarios.setBackground(new java.awt.Color(117, 36, 165));
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseExited(evt);
            }
        });

        txtUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuarios.setText("Usuarios");

        javax.swing.GroupLayout btnUsuariosLayout = new javax.swing.GroupLayout(btnUsuarios);
        btnUsuarios.setLayout(btnUsuariosLayout);
        btnUsuariosLayout.setHorizontalGroup(
            btnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUsuariosLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(txtUsuarios)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        btnUsuariosLayout.setVerticalGroup(
            btnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUsuariosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtUsuarios)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 160, 70));

        btnVuelos.setBackground(new java.awt.Color(117, 36, 165));
        btnVuelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVuelosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVuelosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVuelosMouseExited(evt);
            }
        });

        txtVuelos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtVuelos.setForeground(new java.awt.Color(255, 255, 255));
        txtVuelos.setText("Vuelos");

        javax.swing.GroupLayout btnVuelosLayout = new javax.swing.GroupLayout(btnVuelos);
        btnVuelos.setLayout(btnVuelosLayout);
        btnVuelosLayout.setHorizontalGroup(
            btnVuelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVuelosLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(txtVuelos)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        btnVuelosLayout.setVerticalGroup(
            btnVuelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnVuelosLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(txtVuelos)
                .addGap(21, 21, 21))
        );

        jPanel2.add(btnVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 160, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 500));

        txtbienvenido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtbienvenido.setForeground(new java.awt.Color(51, 51, 51));
        txtbienvenido.setText("Bienvenido, ");
        jPanel1.add(txtbienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        txtFecha.setText("13/04/2026");
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseEntered
        // TODO add your handling code here:
        Cerrar.setBackground(Color.red);
        closeText.setForeground(Color.WHITE);

    }//GEN-LAST:event_CerrarMouseEntered

    private void CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseExited
        // TODO add your handling code here:
        Cerrar.setBackground(Color.WHITE);
        closeText.setForeground(Color.BLACK);
    }//GEN-LAST:event_CerrarMouseExited

    private void btnVerDestinosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerDestinosMouseEntered
        // TODO add your handling code here:
        btnVerDestinos.setBackground(Color.decode("#AC35F2"));
    }//GEN-LAST:event_btnVerDestinosMouseEntered

    private void btnVerDestinosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerDestinosMouseExited
        // TODO add your handling code here:
        btnVerDestinos.setBackground(Color.decode("#7524A5"));
    }//GEN-LAST:event_btnVerDestinosMouseExited

    private void btnModificarDestinosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarDestinosMouseEntered
        // TODO add your handling code here:
        btnModificarDestinos.setBackground(Color.decode("#AC35F2"));
    }//GEN-LAST:event_btnModificarDestinosMouseEntered

    private void btnModificarDestinosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarDestinosMouseExited
        // TODO add your handling code here:
        btnModificarDestinos.setBackground(Color.decode("#7524A5"));
    }//GEN-LAST:event_btnModificarDestinosMouseExited

    private void btnVuelosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVuelosMouseEntered
        // TODO add your handling code here:
         btnVuelos.setBackground(Color.decode("#AC35F2"));
    }//GEN-LAST:event_btnVuelosMouseEntered

    private void btnVuelosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVuelosMouseExited
        // TODO add your handling code here:
        btnVuelos.setBackground(Color.decode("#7524A5"));
    }//GEN-LAST:event_btnVuelosMouseExited

    private void btnUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseEntered
        // TODO add your handling code here:
        btnUsuarios.setBackground(Color.decode("#AC35F2"));
    }//GEN-LAST:event_btnUsuariosMouseEntered

    private void btnUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseExited
        // TODO add your handling code here:
        btnUsuarios.setBackground(Color.decode("#7524A5"));
    }//GEN-LAST:event_btnUsuariosMouseExited

    private void btnVuelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVuelosMouseClicked
        ListaVuelos lista = new ListaVuelos();
        lista.setVisible(true);
    }//GEN-LAST:event_btnVuelosMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cerrar;
    private javax.swing.JPanel btnModificarDestinos;
    private javax.swing.JPanel btnUsuarios;
    private javax.swing.JPanel btnVerDestinos;
    private javax.swing.JPanel btnVuelos;
    private javax.swing.JLabel closeText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtModificarDestinos;
    private javax.swing.JLabel txtUsuarios;
    private javax.swing.JLabel txtVerDestinos;
    private javax.swing.JLabel txtVuelos;
    private javax.swing.JLabel txtbienvenido;
    // End of variables declaration//GEN-END:variables
}
