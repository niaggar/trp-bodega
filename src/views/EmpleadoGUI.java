
package views;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 * Clase en la que se maneja la visualizacion de la aplicacion y se definen
 * los elementos a los que se tendra acceso desde el controlador.
 * 
 * @author nicho
 */
public class EmpleadoGUI extends JFrame {

    /**
     * Constructor de la UI para el empleado.
     */
    public EmpleadoGUI() {
        super("Manejo de Empleados - TRP");
        initComponents();
    }

    /**
     * Codigo generado automaticamente donde se define la construccion 
     * de la interfaz grafica.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NuevoEmpleadoPanel = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        ConsultasIdTexto = new javax.swing.JTextField();
        ConsultasNombreTexto = new javax.swing.JTextField();
        ConsultasConsultarBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ConsultasTabla = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        NuevoNombreTexto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        NuevoEdadTexto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        NuevoBodegasLista = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        NuevoCrearBtn = new javax.swing.JToggleButton();
        NuevoActualizarBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        EliminarIdTexto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        EliminarBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ActualizarNombreTexto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ActualizarEdadTexto = new javax.swing.JTextField();
        ActualizarBtn = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ActualizarBodegasLista = new javax.swing.JList<>();
        jLabel14 = new javax.swing.JLabel();
        ActualizarIdTexto = new javax.swing.JTextField();
        ActualizarBusctarBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NuevoEmpleadoPanel.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        ConsultasIdTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ConsultasIdTexto.setToolTipText("Identificador del empleado");

        ConsultasNombreTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ConsultasNombreTexto.setToolTipText("Nombre del empleado");

        ConsultasConsultarBtn.setText("Consultar");

        jLabel5.setText("Identificador");

        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Consultar empleado de Bodegas TRP");

        ConsultasTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Edad", "Bodega"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ConsultasTabla.setToolTipText("");
        ConsultasTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ConsultasTabla.setEnabled(false);
        ConsultasTabla.setFocusable(false);
        jScrollPane3.setViewportView(ConsultasTabla);

        jLabel9.setText("* Para consultar todos los empleados deja los campos libres");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                            .addComponent(ConsultasConsultarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ConsultasIdTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(ConsultasNombreTexto)))
                            .addComponent(jScrollPane3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultasIdTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultasNombreTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConsultasConsultarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );

        NuevoEmpleadoPanel.addTab("Consultar", jPanel1);

        NuevoNombreTexto.setToolTipText("Nombre");

        jLabel1.setText("Nombre");

        NuevoEdadTexto.setToolTipText("Nombre");

        jLabel2.setText("Edad");

        jLabel4.setText("Bodega en la que trabaja");

        NuevoBodegasLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(NuevoBodegasLista);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Crear nuevo empleado de Bodegas TRP");

        NuevoCrearBtn.setText("Crear empleado");

        NuevoActualizarBtn.setText("Actualizar bodegas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NuevoCrearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(NuevoNombreTexto)
                            .addComponent(NuevoEdadTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NuevoActualizarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(NuevoNombreTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NuevoEdadTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NuevoActualizarBtn))
                .addGap(31, 31, 31)
                .addComponent(NuevoCrearBtn)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        NuevoEmpleadoPanel.addTab("Nuevo empleado", jPanel2);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Eliminar un empleado de Bodegas TRP");

        jLabel3.setText("Id del empleado");

        EliminarBtn.setText("Eliminar empleado");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(EliminarIdTexto)
                    .addComponent(EliminarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EliminarIdTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EliminarBtn)
                .addContainerGap(170, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(278, Short.MAX_VALUE)))
        );

        NuevoEmpleadoPanel.addTab("Eliminar", jPanel3);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Actualizar datos de un empleado de Bodegas TRP");

        jLabel12.setText("Nombre");

        ActualizarNombreTexto.setToolTipText("Nombre");

        jLabel13.setText("Edad");

        ActualizarEdadTexto.setToolTipText("Nombre");

        ActualizarBtn.setText("Actualizar empleado");

        ActualizarBodegasLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(ActualizarBodegasLista);

        jLabel14.setText("Bodega en la que trabaja");

        ActualizarIdTexto.setToolTipText("Identificador del empleado");
        ActualizarIdTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarIdTextoActionPerformed(evt);
            }
        });

        ActualizarBusctarBtn.setText("Buscar");

        jLabel15.setText("Identificador");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(ActualizarIdTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ActualizarBusctarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ActualizarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(ActualizarNombreTexto)
                                    .addComponent(ActualizarEdadTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(60, 60, 60))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ActualizarIdTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ActualizarBusctarBtn))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(4, 4, 4)
                        .addComponent(ActualizarNombreTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(4, 4, 4)
                        .addComponent(ActualizarEdadTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(31, 31, 31)
                .addComponent(ActualizarBtn)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        NuevoEmpleadoPanel.addTab("Actualizar", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NuevoEmpleadoPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NuevoEmpleadoPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActualizarIdTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarIdTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarIdTextoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ActualizarBodegasLista;
    private javax.swing.JToggleButton ActualizarBtn;
    private javax.swing.JButton ActualizarBusctarBtn;
    private javax.swing.JTextField ActualizarEdadTexto;
    private javax.swing.JTextField ActualizarIdTexto;
    private javax.swing.JTextField ActualizarNombreTexto;
    private javax.swing.JButton ConsultasConsultarBtn;
    private javax.swing.JTextField ConsultasIdTexto;
    private javax.swing.JTextField ConsultasNombreTexto;
    private javax.swing.JTable ConsultasTabla;
    private javax.swing.JButton EliminarBtn;
    private javax.swing.JTextField EliminarIdTexto;
    private javax.swing.JButton NuevoActualizarBtn;
    private javax.swing.JList<String> NuevoBodegasLista;
    private javax.swing.JToggleButton NuevoCrearBtn;
    private javax.swing.JTextField NuevoEdadTexto;
    private javax.swing.JTabbedPane NuevoEmpleadoPanel;
    private javax.swing.JTextField NuevoNombreTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    
    /**
     * Get para obtener el boton para ejecutare las consultas.
     * @return 
     */
    public javax.swing.JButton getConsultasConsultarBtn() {
        return ConsultasConsultarBtn;
    }

    /**
     * Get para obtener el campo de texto del id al realizar una consulta.
     * @return 
     */
    public javax.swing.JTextField getConsultasIdTexto() {
        return ConsultasIdTexto;
    }

    /**
     * Get para obtener el campo de texto del nombre al realizar una consulta.
     * @return 
     */
    public javax.swing.JTextField getConsultasNombreTexto() {
        return ConsultasNombreTexto;
    }

    /**
     * Get para obtener la tabla donde se muestran los resultados de las consultas.
     * @return 
     */
    public javax.swing.JTable getConsultasTabla() {
        return ConsultasTabla;
    }

    /**
     * Get para obtener el boton que ejecuta la accion de elimianar un empleado.
     * @return 
     */
    public javax.swing.JButton getEliminarBtn() {
        return EliminarBtn;
    }

    /**
     * Get para obtener el campo de texto del id al eliminar un empleado.
     * @return 
     */
    public javax.swing.JTextField getEliminarIdTexto() {
        return EliminarIdTexto;
    }

    /**
     * Get para obtener el elemento donde se listan las bodegas al momento de
     * crear un nuevo empleado.
     * @return 
     */
    public javax.swing.JList<String> getNuevoBodegasLista() {
        return NuevoBodegasLista;
    }

    /**
     * Get para obtener el campo de texto de la edad al crear un nuevo empleado.
     * @return 
     */
    public javax.swing.JTextField getNuevoEdadTexto() {
        return NuevoEdadTexto;
    }

    /**
     * Get para obtener el campo de texto del nombre al crear un nuevo empleado.
     * @return 
     */
    public javax.swing.JTextField getNuevoNombreTexto() {
        return NuevoNombreTexto;
    }
    
    /**
     * Get para obtener el boton de actualizar la lista de bodegas.
     * @return 
     */
    public JButton getNuevoActualizarBtn() {
        return NuevoActualizarBtn;
    }

    /**
     * Get para obtener el boton para crear un nuevo empleado.
     * @return 
     */
    public JToggleButton getNuevoCrearBtn() {
        return NuevoCrearBtn;
    }

    public JList<String> getActualizarBodegasLista() {
        return ActualizarBodegasLista;
    }

    public JToggleButton getActualizarBtn() {
        return ActualizarBtn;
    }

    public JButton getActualizarBusctarBtn() {
        return ActualizarBusctarBtn;
    }

    public JTextField getActualizarEdadTexto() {
        return ActualizarEdadTexto;
    }

    public JTextField getActualizarNombreTexto() {
        return ActualizarNombreTexto;
    }
    
    public JTextField getActualizarIdTexto() {
        return ActualizarIdTexto;
    }
    
    
    /**
     * Metodo por el que se establece el controlador (EmpleadoController)
     * de los diferentes Listener de cada boton.
     * 
     * @param evento 
     */
    public void establecerControladorDeEventos(ActionListener evento) {
        ConsultasConsultarBtn.addActionListener(evento);
        NuevoCrearBtn.addActionListener(evento);
        NuevoActualizarBtn.addActionListener(evento);
        EliminarBtn.addActionListener(evento);

        ActualizarBtn.addActionListener(evento);
        ActualizarBusctarBtn.addActionListener(evento);
    }
}
