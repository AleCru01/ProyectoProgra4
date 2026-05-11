package proyectofinal.navegacion;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.*;
import proyectofinal.ConexionBD;
import proyectofinal.navegacion.FormularioParaVuelos;
/**
 *
 * @author 186377
 */
public final class ListaVuelos extends javax.swing.JFrame {


    public ListaVuelos() {
       
        initComponents();
        cargarTabla();
        ocultarColumnas();

    }
    public void cargarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tblVuelos.getModel();
        modelo.setRowCount(0); 

        String query = "SELECT v.*, c1.nombre AS origen_nombre, c2.nombre AS destino_nombre " +
                       "FROM vuelo v " +
                       "JOIN ciudad c1 ON v.id_origen = c1.id_ciudad " +
                       "JOIN ciudad c2 ON v.id_destino = c2.id_ciudad";
                       
        try (Connection con = ConexionBD.getConnection();
             java.sql.Statement st = con.createStatement();
             java.sql.ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {
                modelo.addRow(new Object[]{
                rs.getInt("id_vuelo"),     
                rs.getInt("id_origen"), 
                rs.getInt("id_destino"),     
                rs.getString("origen_nombre"), 
                rs.getString("destino_nombre"),
                rs.getString("numVuelo"),   
                rs.getString("horarioSalida"),  
                rs.getString("horarioLlegada"), 
                rs.getString("fecha"),          
                rs.getString("estado"),         
                rs.getInt("capacidadTotal"),   
                rs.getDouble("precioBoleto") 
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }
    

    private void ocultarColumnas() {

    tblVuelos.getColumnModel().getColumn(1).setMinWidth(0);
    tblVuelos.getColumnModel().getColumn(1).setMaxWidth(0);
    
    tblVuelos.getColumnModel().getColumn(2).setMinWidth(0);
    tblVuelos.getColumnModel().getColumn(2).setMaxWidth(0);

}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVuelos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblVuelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID vuelo", "IdOrigen", "Idestino", "Origen", "Destino", "N. de Vuelo", "Hora - Salida", "Hora - Llegada", "Fecha", "Estado", "Capacidad total", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tblVuelos);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    new FormularioParaVuelos().setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    int fila = tblVuelos.getSelectedRow();

        if (fila >= 0) {
            int idVuelo = Integer.parseInt(tblVuelos.getModel().getValueAt(fila, 0).toString());
            int idO = Integer.parseInt(tblVuelos.getModel().getValueAt(fila, 1).toString());
            int idD = Integer.parseInt(tblVuelos.getModel().getValueAt(fila, 2).toString());

            String nomOrigen = tblVuelos.getModel().getValueAt(fila, 3).toString(); 
            String nomDestino = tblVuelos.getModel().getValueAt(fila, 4).toString();

            String numV = tblVuelos.getModel().getValueAt(fila, 5).toString();
            String hSal = tblVuelos.getModel().getValueAt(fila, 6).toString();
            String hLleg = tblVuelos.getModel().getValueAt(fila, 7).toString();
            String fec = tblVuelos.getModel().getValueAt(fila, 8).toString();
            String est = tblVuelos.getModel().getValueAt(fila, 9).toString();
            int cap = Integer.parseInt(tblVuelos.getModel().getValueAt(fila, 10).toString());
            double prec = Double.parseDouble(tblVuelos.getModel().getValueAt(fila, 11).toString());

            FormularioParaVuelos form = new FormularioParaVuelos();
            form.cargarDatos(idVuelo, numV, idO, idD, hSal, hLleg, fec, est, cap, prec);
            form.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila primero.");
    }    }//GEN-LAST:event_btnModificarActionPerformed

    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    int fila = tblVuelos.getSelectedRow();
        if (fila >= 0) {
            int id = Integer.parseInt(tblVuelos.getModel().getValueAt(fila, 0).toString());
            int confirm = JOptionPane.showConfirmDialog(this, "Seguro que quieres eliminar este vuelo?");
            
            if (confirm == JOptionPane.YES_OPTION) {
                try (Connection con = ConexionBD.getConnection();
                     PreparedStatement pst = con.prepareStatement("DELETE FROM vuelo WHERE id_vuelo = ?")) {
                    pst.setInt(1, id);
                    pst.executeUpdate();
                    cargarTabla();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error al eliminar: " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila");
        }    }//GEN-LAST:event_btnEliminarActionPerformed

    
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
    cargarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ListaVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(ListaVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }java.awt.EventQueue.invokeLater(() -> {
            new ListaVuelos().setVisible(true);
        }); 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVuelos;
    // End of variables declaration//GEN-END:variables

}
