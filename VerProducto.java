
package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class VerProducto extends javax.swing.JFrame {
    
    public VerProducto() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        SetImageLabel(jLabelConsola, "src/imagenes/FotoConsola4.png");
        SetImageLabel(jLabelVideojuego, "src/imagenes/FotoVideojuego4.jpg");
        SetImageLabel(jLabelAccesorio, "src/imagenes/FotoAccesorio4.png");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnConsola = new javax.swing.JButton();
        jLabelConsola = new javax.swing.JLabel();
        btnVideojuego = new javax.swing.JButton();
        jLabelVideojuego = new javax.swing.JLabel();
        jLabelAccesorio = new javax.swing.JLabel();
        btnAccesorio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        informe = new javax.swing.JTable();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 40)); // NOI18N
        jLabel1.setText("¿Que informe quieres ver?");

        btnConsola.setText("CONSOLAS");
        btnConsola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsolaActionPerformed(evt);
            }
        });

        btnVideojuego.setText("VIDEOJUEGOS");
        btnVideojuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVideojuegoActionPerformed(evt);
            }
        });

        btnAccesorio.setText("ACCESORIOS");
        btnAccesorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccesorioActionPerformed(evt);
            }
        });

        informe.setBackground(new java.awt.Color(204, 204, 204));
        informe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        informe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Plataforma", "Cantidad", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        informe.setName("INFORMES\n"); // NOI18N
        informe.setRowHeight(50
        );
        jScrollPane1.setViewportView(informe);
        if (informe.getColumnModel().getColumnCount() > 0) {
            informe.getColumnModel().getColumn(0).setMinWidth(40);
            informe.getColumnModel().getColumn(0).setPreferredWidth(50);
            informe.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnConsola, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAccesorio, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(btnVideojuego, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelConsola, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabelAccesorio, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelVideojuego, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(283, 283, 283))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelAccesorio, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelVideojuego, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVideojuego, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAccesorio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelConsola, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsola, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVideojuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVideojuegoActionPerformed
        
        mostrarVideojuegos();
        
    }//GEN-LAST:event_btnVideojuegoActionPerformed

    private void btnConsolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsolaActionPerformed
        
        mostrarConsolas();
        
    }//GEN-LAST:event_btnConsolaActionPerformed

    private void btnAccesorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccesorioActionPerformed

        mostrarAccesorios();
        
    }//GEN-LAST:event_btnAccesorioActionPerformed

    
    private void mostrarVideojuegos() {
        
        try {
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM videojuegos");

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Nombre");
            model.addColumn("Plataforma");
            model.addColumn("Cantidad");
            model.addColumn("Precio");

            while (rs.next()) {
                int id_videojuego = rs.getInt("id_videojuego");
                String nombre_videojuego = rs.getString("nombre_videojuego");
                String plataforma = rs.getString("plataforma");
                int cantidad = rs.getInt("cantidad");
                int precio = rs.getInt("precio");
                model.addRow(new Object[] { id_videojuego, nombre_videojuego, plataforma, cantidad, precio });
            }

            informe.setModel(model);

            rs.close();
            stmt.close();
            conn.close();
            
        } catch (SQLException ex) {
            
            ex.printStackTrace();
        }
    }
    
    private void mostrarConsolas() {
        
        try {
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM consolas");

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Nombre");
            model.addColumn("Cantidad");
            model.addColumn("Precio");

            while (rs.next()) {
                int id_consola = rs.getInt("id_consola");
                String nombre_consola = rs.getString("nombre_consola");
                int cantidad = rs.getInt("cantidad");
                int precio = rs.getInt("precio");
                model.addRow(new Object[] { id_consola, nombre_consola, cantidad, precio });
            }

            informe.setModel(model);

            rs.close();
            stmt.close();
            conn.close();
            
        } catch (SQLException ex) {
        }
    }
    
    private void mostrarAccesorios() {
        
        try {
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM accesorios");

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Nombre");
            model.addColumn("Plataforma");
            model.addColumn("Cantidad");
            model.addColumn("Precio");

            while (rs.next()) {
                int id_accesorio = rs.getInt("id_accesorio");
                String nombre_accesorio = rs.getString("nombre_accesorio");
                String plataforma = rs.getString("plataforma");
                int cantidad = rs.getInt("cantidad");
                int precio = rs.getInt("precio");
                model.addRow(new Object[] { id_accesorio, nombre_accesorio, plataforma, cantidad, precio });
            }

            informe.setModel(model);

            rs.close();
            stmt.close();
            conn.close();
            
        } catch (SQLException ex) {
        }
    }
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerProducto().setVisible(true);
            }
        });
    }
    
    private void SetImageLabel (JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT)
        );
        labelName.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccesorio;
    public javax.swing.JButton btnConsola;
    private javax.swing.JButton btnVideojuego;
    public javax.swing.JTable informe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAccesorio;
    private javax.swing.JLabel jLabelConsola;
    private javax.swing.JLabel jLabelVideojuego;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
