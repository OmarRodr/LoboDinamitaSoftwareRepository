/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Conexion.UConnection;
import static Vista.PrincipalAdmi.jlbIdUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Omar
 */
public class VistaInventario extends javax.swing.JFrame {

    /**
     * Creates new form VistaInventario
     */
    public VistaInventario() {
        initComponents();
    }
    public void inventarioAlbum(){
    try{
            DefaultTableModel modelo = new DefaultTableModel();
            jTable1.setModel(modelo);
            PreparedStatement ps1 = null;
            ResultSet rs1 = null;
            Conexion.UConnection conn =new Conexion.UConnection();
            Connection con = Conexion.UConnection.getConnection();
            String sql = "SELECT * FROM Album";
            ps1=con.prepareStatement(sql);
            rs1 = ps1.executeQuery();
            ResultSetMetaData rsmd = rs1.getMetaData();
            int columnas = rsmd.getColumnCount();
            modelo.addColumn("Id");
            modelo.addColumn("Artista");
            modelo.addColumn("Nombre");
            modelo.addColumn("Genero");
            modelo.addColumn("Año de estreno");
            modelo.addColumn("Numero de canciones");
            modelo.addColumn("Duración");
            while(rs1.next()){
                Object[]filas = new Object[columnas];
                for (int i=0; i<columnas;i++){
                    filas[i]=rs1.getObject(i+1);
                }
                modelo.addRow(filas);
               //con.close();
            }
        }catch(SQLException e){
         System.out.println(e.toString());
        }   
    }
    public void inventarioCancion(){
    try{
            DefaultTableModel modelo = new DefaultTableModel();
            jTable1.setModel(modelo);
            PreparedStatement ps1 = null;
            ResultSet rs1 = null;
            Conexion.UConnection conn =new Conexion.UConnection();
            Connection con = Conexion.UConnection.getConnection();
            String sql = "SELECT * FROM Cancion";
            ps1=con.prepareStatement(sql);
            rs1 = ps1.executeQuery();
            ResultSetMetaData rsmd = rs1.getMetaData();
            int columnas = rsmd.getColumnCount();
            modelo.addColumn("Id");
            modelo.addColumn("Nombre");
            modelo.addColumn("Artista");
            modelo.addColumn("Autor");
            modelo.addColumn("Genero");
            modelo.addColumn("Año de estreno");
            modelo.addColumn("Álbum");
            modelo.addColumn("Duración");
            while(rs1.next()){
                Object[]filas = new Object[columnas];
                for (int i=0; i<columnas;i++){
                    filas[i]=rs1.getObject(i+1);
                }
                modelo.addRow(filas);
               //con.close();
            }
        }catch(SQLException e){
         System.out.println(e.toString());
        }    
    }
    public void inventarioVideo(){
     try{
            DefaultTableModel modelo = new DefaultTableModel();
            jTable1.setModel(modelo);
            PreparedStatement ps1 = null;
            ResultSet rs1 = null;
            Conexion.UConnection conn =new Conexion.UConnection();
            Connection con = Conexion.UConnection.getConnection();
            String sql = "SELECT * FROM Video";
            ps1=con.prepareStatement(sql);
            rs1 = ps1.executeQuery();
            ResultSetMetaData rsmd = rs1.getMetaData();
            int columnas = rsmd.getColumnCount();
            modelo.addColumn("Id");
            modelo.addColumn("Titulo");
            modelo.addColumn("Artista");
            modelo.addColumn("Protagonista");
            modelo.addColumn("Genero");
            modelo.addColumn("Año de estreno");
            modelo.addColumn("Idioma Subtitulos");
            modelo.addColumn("Duración");
            while (rs1.next()) {
                Object[]filas = new Object[columnas];
                for (int i=0; i<columnas;i++){
                    filas[i]=rs1.getObject(i+1);
                }
                modelo.addRow(filas);
               //con.close();
            }
        }catch(SQLException e){
         System.out.println(e.toString());
        }    
    }
     public int NumeroDeRegistros(String cad1) {
      try {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = UConnection.getConnection();
        String sql = "SELECT COUNT(*) FROM "+cad1+" ";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        if (rs.next()) {
          return rs.getInt(1);
        }
        return rs.getInt(1);
       } catch (SQLException e) {
            Logger.getLogger(InicioAdmi.class.getName()).log(Level.SEVERE, null, e);
            return 1;
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlbNombreInv = new javax.swing.JLabel();
        jlbUsuarioInv = new javax.swing.JLabel();
        btnInventario = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jlbNumero = new javax.swing.JLabel();
        jlbRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel2MouseMoved(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("Inventario");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Selecciona el tipo de multimedia");

        cbxTipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Album", "Cancion", "Video" }));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("Biemvenido");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setText("Usuario:");

        jlbNombreInv.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jlbUsuarioInv.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        btnInventario.setText("Ver");
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInventario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(jlbNombreInv, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbUsuarioInv, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jlbNombreInv)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jlbUsuarioInv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInventario))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jlbNumero.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jlbNumero.setText("jLabel1");

        jlbRegistro.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jlbRegistro.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbRegistro))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNumero)
                    .addComponent(jlbRegistro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved
    try{
            PreparedStatement ps = null;
            ResultSet rs = null;
            UConnection conn = new UConnection();
            Connection con = UConnection.getConnection();
            String sql = "SELECT nombre FROM administrador WHERE idAdmi=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, jlbIdUsuario.getText());
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnas = rsmd.getColumnCount();
            while (rs.next()) {
            //txtNombreUsuario.setText(rs.getString(1));
            jlbUsuarioInv.setText(rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jPanel2MouseMoved

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
    String cbx = (String) cbxTipo.getSelectedItem();
        System.out.println(cbx);
    if(cbx == "Album"){    
      inventarioAlbum();
      jlbNumero.setText("Total de Álbums");
      String aux = Integer.toString(NumeroDeRegistros(cbx));
      jlbRegistro.setText(aux);
      if(NumeroDeRegistros(cbx) == 1){
        JOptionPane.showMessageDialog(null,"El número de álbums es igual a 1"
                + "\nHata que el número de álbums sea mayor a 1\nEl sistema podra volver a realizar prestamos de este multimedia"
                + "","¡¡Advertencia..!!",JOptionPane.INFORMATION_MESSAGE); 
      }
      
    }
    if(cbx == "Cancion"){    
      inventarioCancion();
      jlbNumero.setText("Total de canciones");
      jlbNumero.setText("Total de Álbums");
      String aux = Integer.toString(NumeroDeRegistros(cbx));
      jlbRegistro.setText(aux);
      if(NumeroDeRegistros(cbx) == 1){
        JOptionPane.showMessageDialog(null,"El número de canciones es igual a 1"
                + "\nHata que el número de canciones sea mayor a 1\nEl sistema podra volver a realizar prestamos de este multimedia"
                + "","¡¡Advertencia..!!",JOptionPane.INFORMATION_MESSAGE); 
      }
    }
     if(cbx == "Video"){    
      inventarioVideo();
      jlbNumero.setText("Total de Videos");
      String aux = Integer.toString(NumeroDeRegistros(cbx));
      jlbRegistro.setText(aux);
      if(NumeroDeRegistros(cbx) == 1){
        JOptionPane.showMessageDialog(null,"El número de videos es igual a 1"
                + "\nHata que el número de videos sea mayor a 1\nEl sistema podra volver a realizar prestamos de este multimedia"
                + "","¡¡Advertencia..!!",JOptionPane.INFORMATION_MESSAGE); 
      }
    }
    }//GEN-LAST:event_btnInventarioActionPerformed

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
            java.util.logging.Logger.getLogger(VistaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInventario;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlbNombreInv;
    private javax.swing.JLabel jlbNumero;
    private javax.swing.JLabel jlbRegistro;
    public static javax.swing.JLabel jlbUsuarioInv;
    // End of variables declaration//GEN-END:variables
}
