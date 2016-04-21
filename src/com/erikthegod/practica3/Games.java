package com.erikthegod.practica3;

import javax.swing.JOptionPane;

/**
 * Interfaz Grafica
 *
 * @author Erik The God
 */
public class Games extends javax.swing.JFrame {

    /**
     * Creates new form Games
     */
    public Games() {
        initComponents();
        jlPreci.setText("50€");
        this.setBounds(500, 200, 400, 600);
        this.setTitle("Coleccion videojuegos ErikTheGod");
    }

    private Videojuego vid;
    private GestorFichero gest = new GestorFichero();
    private Exportador export = new Exportador();
    private IU interfaz = new IU();
    private int codigo;
    private String titulo;
    private String categoria;
    private String plataforma;
    private int precio;
    private boolean disponible;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlCodigo = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jsCodigo = new javax.swing.JSpinner();
        jtfTitulo = new javax.swing.JTextField();
        jlCategoria = new javax.swing.JLabel();
        jcbCategoria = new javax.swing.JComboBox<>();
        jlPlataforma = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLista = new javax.swing.JList<>();
        jlPrecio = new javax.swing.JLabel();
        jslPrecio = new javax.swing.JSlider();
        jcbDisponible = new javax.swing.JCheckBox();
        jlPreci = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmFile = new javax.swing.JMenu();
        jmiLoad = new javax.swing.JMenuItem();
        jmlSave = new javax.swing.JMenuItem();
        jmiExit = new javax.swing.JMenuItem();
        jmExport = new javax.swing.JMenu();
        jmiXls = new javax.swing.JMenuItem();
        jmiHtml = new javax.swing.JMenuItem();
        jmiXml = new javax.swing.JMenuItem();
        jmiSql = new javax.swing.JMenuItem();
        jmHelp = new javax.swing.JMenu();
        jmiAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlCodigo.setText("Código");

        jlTitulo.setText("Título");

        jlCategoria.setText("Categoria");

        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FPS", "Futbol", "Accion", "Aventura", "Plataformas" }));
        jcbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCategoriaActionPerformed(evt);
            }
        });

        jlPlataforma.setText("Plataforma");

        jLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Play Station 4", "Xbox One", "Nintendo 3DS", "PC", "OUYA", "Android" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jLista);

        jlPrecio.setText("Precio");

        jslPrecio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jslPrecioStateChanged(evt);
            }
        });

        jcbDisponible.setText("Disponible");

        jlPreci.setBackground(new java.awt.Color(255, 102, 102));
        jlPreci.setText("0 €");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlCategoria)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlPlataforma)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlCodigo)
                                    .addComponent(jlTitulo))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jsCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlPrecio)
                                .addGap(41, 41, 41)
                                .addComponent(jslPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jcbDisponible))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jlPreci, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodigo)
                    .addComponent(jsCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTitulo)
                    .addComponent(jtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCategoria)
                    .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlPlataforma)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jslPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlPreci)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbDisponible)
                .addGap(58, 58, 58))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jmFile.setText("File");

        jmiLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/images.jpg"))); // NOI18N
        jmiLoad.setText("Load");
        jmiLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLoadActionPerformed(evt);
            }
        });
        jmFile.add(jmiLoad);

        jmlSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/descarga.png"))); // NOI18N
        jmlSave.setText("Save");
        jmlSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlSaveActionPerformed(evt);
            }
        });
        jmFile.add(jmlSave);

        jmiExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Log Out.png"))); // NOI18N
        jmiExit.setText("Exit");
        jmiExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExitActionPerformed(evt);
            }
        });
        jmFile.add(jmiExit);

        jMenuBar1.add(jmFile);

        jmExport.setText("Export");

        jmiXls.setText("xls format");
        jmiXls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiXlsActionPerformed(evt);
            }
        });
        jmExport.add(jmiXls);

        jmiHtml.setText("html format");
        jmiHtml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiHtmlActionPerformed(evt);
            }
        });
        jmExport.add(jmiHtml);

        jmiXml.setText("xml format");
        jmiXml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiXmlActionPerformed(evt);
            }
        });
        jmExport.add(jmiXml);

        jmiSql.setText("sql format");
        jmiSql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSqlActionPerformed(evt);
            }
        });
        jmExport.add(jmiSql);

        jMenuBar1.add(jmExport);

        jmHelp.setText("Help");

        jmiAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icon-contactar.png"))); // NOI18N
        jmiAbout.setText("About");
        jmiAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAboutActionPerformed(evt);
            }
        });
        jmHelp.add(jmiAbout);

        jMenuBar1.add(jmHelp);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void resetear() {
        jtfTitulo.setText("");
        jsCodigo.setValue(0);
        jslPrecio.setValue(50);
        jcbCategoria.setSelectedItem(null);
        jLista.setSelectedValue(null, true);
        jcbDisponible.setSelected(false);
    }
    private void jmlSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlSaveActionPerformed

        codigo = (int) jsCodigo.getValue();
        if (interfaz.verificador(codigo) == 1) {//Indica que el fichero ya existe
            int resp = JOptionPane.showConfirmDialog(null, "El codigo introducido ya esta usado,acepta si quieres sobreescribirlo", "Precaucion", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_OPTION);
            if (JOptionPane.YES_OPTION == resp) {//Si el usuario decide aceptar se sobreescribe el fichero
                titulo = jtfTitulo.getText();
                categoria = (String) jcbCategoria.getSelectedItem();
                plataforma = (String) jLista.getSelectedValue();
                precio = (int) jslPrecio.getValue();
                disponible = jcbDisponible.isSelected();
                vid = new Videojuego(codigo, titulo, categoria, plataforma, precio, disponible);
                gest.guardarJuego(vid);
                resetear();
            } else {

            }
        } else {
            titulo = jtfTitulo.getText();
            categoria = (String) jcbCategoria.getSelectedItem();
            plataforma = (String) jLista.getSelectedValue();
            precio = (int) jslPrecio.getValue();
            disponible = jcbDisponible.isSelected();
            vid = new Videojuego(codigo, titulo, categoria, plataforma, precio, disponible);
            gest.guardarJuego(vid);
            resetear();
        }
    }//GEN-LAST:event_jmlSaveActionPerformed

    private void jcbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCategoriaActionPerformed

    }//GEN-LAST:event_jcbCategoriaActionPerformed

    private void jmiLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLoadActionPerformed

        codigo = (int) jsCodigo.getValue();
        gest.leerJuego(codigo);
        jsCodigo.setValue(gest.juego.getCodigo());
        jtfTitulo.setText(gest.juego.getTitulo());
        jcbCategoria.setSelectedItem(gest.juego.getCategoria());
        jLista.setSelectedValue(gest.juego.getPlataforma(), true);
        jslPrecio.setValue(gest.juego.getPrecio());
        jcbDisponible.setSelected(gest.juego.isDisponible());
    }//GEN-LAST:event_jmiLoadActionPerformed

    private void jslPrecioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jslPrecioStateChanged

        jlPreci.setText(jslPrecio.getValue() + "€");
    }//GEN-LAST:event_jslPrecioStateChanged

    private void jmiExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExitActionPerformed

        interfaz.salir();
    }//GEN-LAST:event_jmiExitActionPerformed

    private void jmiXlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiXlsActionPerformed

        codigo = (int) jsCodigo.getValue();
        if (interfaz.verificador(codigo) == 1) {//Indica que el fichero ya existe
            int resp = JOptionPane.showConfirmDialog(null, "Si desea exportar debe sobreescribir el juego ya existente", "Precaucion", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_OPTION);
            if (JOptionPane.YES_OPTION == resp) {//Si el usuario decide aceptar se sobreescribe el fichero
                titulo = jtfTitulo.getText();
                categoria = (String) jcbCategoria.getSelectedItem();
                plataforma = (String) jLista.getSelectedValue();
                precio = (int) jslPrecio.getValue();
                disponible = jcbDisponible.isSelected();
                vid = new Videojuego(codigo, titulo, categoria, plataforma, precio, disponible);
                gest.guardarJuego(vid);
                export.exportarXls(vid);
                resetear();
            } else {

            }
        } else {
            titulo = jtfTitulo.getText();
            categoria = (String) jcbCategoria.getSelectedItem();
            plataforma = (String) jLista.getSelectedValue();
            precio = (int) jslPrecio.getValue();
            disponible = jcbDisponible.isSelected();
            vid = new Videojuego(codigo, titulo, categoria, plataforma, precio, disponible);
            gest.guardarJuego(vid);
            export.exportarXls(vid);
            resetear();
        }
    }//GEN-LAST:event_jmiXlsActionPerformed

    private void jmiHtmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiHtmlActionPerformed

        codigo = (int) jsCodigo.getValue();
        if (interfaz.verificador(codigo) == 1) {//Indica que el fichero ya existe
            int resp = JOptionPane.showConfirmDialog(null, "Si desea exportar debe sobreescribir el juego ya existente", "Precaucion", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_OPTION);
            if (JOptionPane.YES_OPTION == resp) {//Si el usuario decide aceptar se sobreescribe el fichero
                titulo = jtfTitulo.getText();
                categoria = (String) jcbCategoria.getSelectedItem();
                plataforma = (String) jLista.getSelectedValue();
                precio = (int) jslPrecio.getValue();
                disponible = jcbDisponible.isSelected();
                vid = new Videojuego(codigo, titulo, categoria, plataforma, precio, disponible);
                gest.guardarJuego(vid);
                export.exportarHtml(vid);
                resetear();
            } else {

            }
        } else {
            titulo = jtfTitulo.getText();
            categoria = (String) jcbCategoria.getSelectedItem();
            plataforma = (String) jLista.getSelectedValue();
            precio = (int) jslPrecio.getValue();
            disponible = jcbDisponible.isSelected();
            vid = new Videojuego(codigo, titulo, categoria, plataforma, precio, disponible);
            gest.guardarJuego(vid);
            export.exportarHtml(vid);
            resetear();
        }
    }//GEN-LAST:event_jmiHtmlActionPerformed

    private void jmiXmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiXmlActionPerformed

        codigo = (int) jsCodigo.getValue();
        if (interfaz.verificador(codigo) == 1) {//Indica que el fichero ya existe
            int resp = JOptionPane.showConfirmDialog(null, "Si desea exportar debe sobreescribir el juego ya existente", "Precaucion", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_OPTION);
            if (JOptionPane.YES_OPTION == resp) {//Si el usuario decide aceptar se sobreescribe el fichero
                titulo = jtfTitulo.getText();
                categoria = (String) jcbCategoria.getSelectedItem();
                plataforma = (String) jLista.getSelectedValue();
                precio = (int) jslPrecio.getValue();
                disponible = jcbDisponible.isSelected();
                vid = new Videojuego(codigo, titulo, categoria, plataforma, precio, disponible);
                gest.guardarJuego(vid);
                export.exportarXml(vid);
                resetear();
            } else {

            }
        } else {
            titulo = jtfTitulo.getText();
            categoria = (String) jcbCategoria.getSelectedItem();
            plataforma = (String) jLista.getSelectedValue();
            precio = (int) jslPrecio.getValue();
            disponible = jcbDisponible.isSelected();
            vid = new Videojuego(codigo, titulo, categoria, plataforma, precio, disponible);
            gest.guardarJuego(vid);
            export.exportarXml(vid);
            resetear();
        }
    }//GEN-LAST:event_jmiXmlActionPerformed

    private void jmiSqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSqlActionPerformed

        codigo = (int) jsCodigo.getValue();
        if (interfaz.verificador(codigo) == 1) {//Indica que el fichero ya existe
            int resp = JOptionPane.showConfirmDialog(null, "Si desea exportar debe sobreescribir el juego ya existente", "Precaucion", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_OPTION);
            if (JOptionPane.YES_OPTION == resp) {//Si el usuario decide aceptar se sobreescribe el fichero
                titulo = jtfTitulo.getText();
                categoria = (String) jcbCategoria.getSelectedItem();
                plataforma = (String) jLista.getSelectedValue();
                precio = (int) jslPrecio.getValue();
                disponible = jcbDisponible.isSelected();
                vid = new Videojuego(codigo, titulo, categoria, plataforma, precio, disponible);
                gest.guardarJuego(vid);
                export.exportarSql(vid);
                resetear();
            } else {

            }
        } else {
            titulo = jtfTitulo.getText();
            categoria = (String) jcbCategoria.getSelectedItem();
            plataforma = (String) jLista.getSelectedValue();
            precio = (int) jslPrecio.getValue();
            disponible = jcbDisponible.isSelected();
            vid = new Videojuego(codigo, titulo, categoria, plataforma, precio, disponible);
            gest.guardarJuego(vid);
            export.exportarSql(vid);
            resetear();
        }
    }//GEN-LAST:event_jmiSqlActionPerformed

    private void jmiAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAboutActionPerformed

        interfaz.about();
    }//GEN-LAST:event_jmiAboutActionPerformed

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
            java.util.logging.Logger.getLogger(Games.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Games.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Games.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Games.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Games().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jLista;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbCategoria;
    private javax.swing.JCheckBox jcbDisponible;
    private javax.swing.JLabel jlCategoria;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlPlataforma;
    private javax.swing.JLabel jlPreci;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JMenu jmExport;
    private javax.swing.JMenu jmFile;
    private javax.swing.JMenu jmHelp;
    private javax.swing.JMenuItem jmiAbout;
    private javax.swing.JMenuItem jmiExit;
    private javax.swing.JMenuItem jmiHtml;
    private javax.swing.JMenuItem jmiLoad;
    private javax.swing.JMenuItem jmiSql;
    private javax.swing.JMenuItem jmiXls;
    private javax.swing.JMenuItem jmiXml;
    private javax.swing.JMenuItem jmlSave;
    private javax.swing.JSpinner jsCodigo;
    private javax.swing.JSlider jslPrecio;
    private javax.swing.JTextField jtfTitulo;
    // End of variables declaration//GEN-END:variables
}
