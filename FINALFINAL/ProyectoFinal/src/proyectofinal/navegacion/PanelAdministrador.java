    package proyectofinal.navegacion;

    import java.awt.Color;
    import java.time.LocalDate;
    import java.time.format.DateTimeFormatter;
    import proyectofinal.JPanelRedondeado;
    import proyectofinal.RegristrarAdmin;
    

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
        btnCerrar = new javax.swing.JPanel();
        closeText = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new JPanelRedondeado();
        jLabel1 = new javax.swing.JLabel();
        btnVerDestinos = new javax.swing.JPanel();
        txtVerDestinos = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JPanel();
        txtUsuarios = new javax.swing.JLabel();
        btnAggAdmin = new javax.swing.JPanel();
        txtUsuarios1 = new javax.swing.JLabel();
        txtUsuarios2 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JPanel();
        txtVerDestinos1 = new javax.swing.JLabel();
        btnVuelos = new javax.swing.JPanel();
        txtUsuarios3 = new javax.swing.JLabel();
        txtbienvenido = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });
        btnCerrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        closeText.setText("x");
        btnCerrar.add(closeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 10, 30));

        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 30, 30));

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

        txtVerDestinos.setFont(new java.awt.Font("Corbel Light", 0, 24)); // NOI18N
        txtVerDestinos.setForeground(new java.awt.Color(255, 255, 255));
        txtVerDestinos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtVerDestinos.setText("Ver destinos");

        javax.swing.GroupLayout btnVerDestinosLayout = new javax.swing.GroupLayout(btnVerDestinos);
        btnVerDestinos.setLayout(btnVerDestinosLayout);
        btnVerDestinosLayout.setHorizontalGroup(
            btnVerDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnVerDestinosLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(txtVerDestinos)
                .addGap(18, 18, 18))
        );
        btnVerDestinosLayout.setVerticalGroup(
            btnVerDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVerDestinosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtVerDestinos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(btnVerDestinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 60));

        btnUsuarios.setBackground(new java.awt.Color(117, 36, 165));
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseExited(evt);
            }
        });

        txtUsuarios.setFont(new java.awt.Font("Corbel Light", 0, 24)); // NOI18N
        txtUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUsuarios.setText("Usuarios");

        javax.swing.GroupLayout btnUsuariosLayout = new javax.swing.GroupLayout(btnUsuarios);
        btnUsuarios.setLayout(btnUsuariosLayout);
        btnUsuariosLayout.setHorizontalGroup(
            btnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnUsuariosLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(txtUsuarios)
                .addGap(37, 37, 37))
        );
        btnUsuariosLayout.setVerticalGroup(
            btnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnUsuariosLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(txtUsuarios)
                .addGap(18, 18, 18))
        );

        jPanel2.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 160, 70));

        btnAggAdmin.setBackground(new java.awt.Color(117, 36, 165));
        btnAggAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAggAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAggAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAggAdminMouseExited(evt);
            }
        });

        txtUsuarios1.setFont(new java.awt.Font("Corbel Light", 0, 24)); // NOI18N
        txtUsuarios1.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuarios1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUsuarios1.setText("Agregar ");

        txtUsuarios2.setFont(new java.awt.Font("Corbel Light", 0, 24)); // NOI18N
        txtUsuarios2.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuarios2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUsuarios2.setText("Administrador");

        javax.swing.GroupLayout btnAggAdminLayout = new javax.swing.GroupLayout(btnAggAdmin);
        btnAggAdmin.setLayout(btnAggAdminLayout);
        btnAggAdminLayout.setHorizontalGroup(
            btnAggAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAggAdminLayout.createSequentialGroup()
                .addGroup(btnAggAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnAggAdminLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtUsuarios2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(btnAggAdminLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(txtUsuarios1)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        btnAggAdminLayout.setVerticalGroup(
            btnAggAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAggAdminLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtUsuarios1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuarios2)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.add(btnAggAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 412, -1, 110));

        btnModificar.setBackground(new java.awt.Color(117, 36, 165));
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarMouseExited(evt);
            }
        });

        txtVerDestinos1.setFont(new java.awt.Font("Corbel Light", 0, 24)); // NOI18N
        txtVerDestinos1.setForeground(new java.awt.Color(255, 255, 255));
        txtVerDestinos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtVerDestinos1.setText("Modificar");

        javax.swing.GroupLayout btnModificarLayout = new javax.swing.GroupLayout(btnModificar);
        btnModificar.setLayout(btnModificarLayout);
        btnModificarLayout.setHorizontalGroup(
            btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnModificarLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtVerDestinos1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        btnModificarLayout.setVerticalGroup(
            btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnModificarLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(txtVerDestinos1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 160, 70));

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

        txtUsuarios3.setFont(new java.awt.Font("Corbel Light", 0, 24)); // NOI18N
        txtUsuarios3.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuarios3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUsuarios3.setText("Vuelos");

        javax.swing.GroupLayout btnVuelosLayout = new javax.swing.GroupLayout(btnVuelos);
        btnVuelos.setLayout(btnVuelosLayout);
        btnVuelosLayout.setHorizontalGroup(
            btnVuelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnVuelosLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(txtUsuarios3)
                .addGap(46, 46, 46))
        );
        btnVuelosLayout.setVerticalGroup(
            btnVuelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVuelosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtUsuarios3)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.add(btnVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 160, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 500));

        txtbienvenido.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        txtbienvenido.setForeground(new java.awt.Color(51, 51, 51));
        txtbienvenido.setText("Bienvenido, ");
        jPanel1.add(txtbienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        txtFecha.setFont(new java.awt.Font("Corbel Light", 0, 18)); // NOI18N
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

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        // TODO add your handling code here:
        btnCerrar.setBackground(Color.red);
        closeText.setForeground(Color.WHITE);

    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        // TODO add your handling code here:
        btnCerrar.setBackground(Color.WHITE);
        closeText.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnCerrarMouseExited

    private void btnVerDestinosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerDestinosMouseEntered
        // TODO add your handling code here:
        btnVerDestinos.setBackground(Color.decode("#AC35F2"));
    }//GEN-LAST:event_btnVerDestinosMouseEntered

    private void btnVerDestinosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerDestinosMouseExited
        // TODO add your handling code here:
        btnVerDestinos.setBackground(Color.decode("#7524A5"));
    }//GEN-LAST:event_btnVerDestinosMouseExited

    private void btnUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseEntered
        // TODO add your handling code here:
        btnUsuarios.setBackground(Color.decode("#AC35F2"));
    }//GEN-LAST:event_btnUsuariosMouseEntered

    private void btnUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseExited
        // TODO add your handling code here:
        btnUsuarios.setBackground(Color.decode("#7524A5"));
    }//GEN-LAST:event_btnUsuariosMouseExited

    private void btnAggAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggAdminMouseEntered
         btnAggAdmin.setBackground(Color.decode("#AC35F2"));
    }//GEN-LAST:event_btnAggAdminMouseEntered

    private void btnAggAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggAdminMouseExited
        btnAggAdmin.setBackground(Color.decode("#7524A5"));
    }//GEN-LAST:event_btnAggAdminMouseExited

    private void btnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseEntered
        btnModificar.setBackground(Color.decode("#AC35F2"));
    }//GEN-LAST:event_btnModificarMouseEntered

    private void btnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseExited
        btnModificar.setBackground(Color.decode("#7524A5"));
    }//GEN-LAST:event_btnModificarMouseExited

    private void btnVuelosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVuelosMouseEntered
        btnVuelos.setBackground(Color.decode("#AC35F2"));
    }//GEN-LAST:event_btnVuelosMouseEntered

    private void btnVuelosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVuelosMouseExited
        btnVuelos.setBackground(Color.decode("#7524A5"));
    }//GEN-LAST:event_btnVuelosMouseExited

    private void btnVuelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVuelosMouseClicked
        ListaVuelos lista = new ListaVuelos();
        lista.setVisible(true);    }//GEN-LAST:event_btnVuelosMouseClicked

    private void btnAggAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggAdminMouseClicked
        RegristrarAdmin ventanaNuevoAdmin = new RegristrarAdmin();
        ventanaNuevoAdmin.setVisible(true);    }//GEN-LAST:event_btnAggAdminMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAggAdmin;
    private javax.swing.JPanel btnCerrar;
    private javax.swing.JPanel btnModificar;
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
    private javax.swing.JLabel txtUsuarios;
    private javax.swing.JLabel txtUsuarios1;
    private javax.swing.JLabel txtUsuarios2;
    private javax.swing.JLabel txtUsuarios3;
    private javax.swing.JLabel txtVerDestinos;
    private javax.swing.JLabel txtVerDestinos1;
    private javax.swing.JLabel txtbienvenido;
    // End of variables declaration//GEN-END:variables
}
