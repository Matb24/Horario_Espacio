/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package horario_espacio;

import java.awt.Font;
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu1 extends javax.swing.JFrame {
    
    DefaultTableModel modelo = new DefaultTableModel();
    JTable tabla = new JTable(modelo);
    JRadioButton[] activityButtons;
    int selectedActivities = 0;

    public Menu1() {
        
        initComponents();
        cabecera();
        visibilidad();
        cxbPlaneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxbPlanetaActionPerformed(evt);
            }
        });
        }
    

    public void cabecera() {
        modelo.addColumn("Lunes");
        modelo.addColumn("Martes");
        modelo.addColumn("Miércoles");
        modelo.addColumn("Jueves");
        modelo.addColumn("Viernes");
        modelo.addColumn("Sábado");
        modelo.addColumn("Domingo");
        tblHorarios.setModel(modelo);
            }
    
    public void tamaño(){
        Font font = OPCIONES.getFont();
        OPCIONES.setFont(new Font(font.getName(), Font.PLAIN, 36));
    }
    
    public void visibilidad() {
        pnlDatos1.setVisible(false);
        txtPlanetas.setVisible(false);
        pnlHorario.setVisible(false);
        rxbActividad7.setVisible(false);
        Reiniciar.setVisible(false);
    }
   
    public void ReinicioRadio(boolean B1){
        rxbActividad1.setSelected(B1);
        rxbActividad2.setSelected(B1);
        rxbActividad3.setSelected(B1);
        rxbActividad4.setSelected(B1);
        rxbActividad5.setSelected(B1);
        rxbActividad6.setSelected(B1);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rxbActividad7 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        OPCIONES = new javax.swing.JLabel();
        cxbPlaneta = new javax.swing.JComboBox<>();
        txtPlanetas = new javax.swing.JLabel();
        pnlHorario = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHorarios = new javax.swing.JTable();
        pnlDatos1 = new javax.swing.JPanel();
        rxbActividad1 = new javax.swing.JRadioButton();
        rxbActividad2 = new javax.swing.JRadioButton();
        rxbActividad3 = new javax.swing.JRadioButton();
        rxbActividad4 = new javax.swing.JRadioButton();
        rxbActividad5 = new javax.swing.JRadioButton();
        rxbActividad6 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Reiniciar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        rxbActividad7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rxbActividad7ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(235, 239, 246));

        jPanel2.setForeground(new java.awt.Color(0, 34, 105));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OPCIONES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OPCIONES.setText("OPCIONES");
        OPCIONES.setToolTipText("");
        jPanel2.add(OPCIONES, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 260, 39));

        cxbPlaneta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---- Seleccionar ----", "Moon", "Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto", "Io and Europa", "Titan" }));
        cxbPlaneta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cxbPlanetaItemStateChanged(evt);
            }
        });
        cxbPlaneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxbPlanetaActionPerformed(evt);
            }
        });
        jPanel2.add(cxbPlaneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        txtPlanetas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPlanetas.setText("(Nombre Planeta)");
        jPanel2.add(txtPlanetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 237, 120));

        tblHorarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblHorarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblHorarios.setRowHeight(129);
        jScrollPane1.setViewportView(tblHorarios);

        javax.swing.GroupLayout pnlHorarioLayout = new javax.swing.GroupLayout(pnlHorario);
        pnlHorario.setLayout(pnlHorarioLayout);
        pnlHorarioLayout.setHorizontalGroup(
            pnlHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlHorarioLayout.setVerticalGroup(
            pnlHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(pnlHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 226, 1070, 180));

        rxbActividad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rxbActividad2ActionPerformed(evt);
            }
        });

        rxbActividad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rxbActividad3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Actividades:");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Reiniciar.setText("Reiniciar");
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatos1Layout = new javax.swing.GroupLayout(pnlDatos1);
        pnlDatos1.setLayout(pnlDatos1Layout);
        pnlDatos1Layout.setHorizontalGroup(
            pnlDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatos1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnlDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDatos1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDatos1Layout.createSequentialGroup()
                        .addGroup(pnlDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rxbActividad1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(rxbActividad6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatos1Layout.createSequentialGroup()
                                .addGroup(pnlDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rxbActividad3, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                    .addComponent(rxbActividad2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rxbActividad4, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(rxbActividad5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(29, 29, 29))
                            .addGroup(pnlDatos1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(77, 77, 77)
                                .addComponent(Reiniciar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        pnlDatos1Layout.setVerticalGroup(
            pnlDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatos1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rxbActividad3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rxbActividad5)
                    .addComponent(rxbActividad1))
                .addGap(18, 18, 18)
                .addGroup(pnlDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rxbActividad2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rxbActividad4)
                    .addComponent(rxbActividad6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30)
                .addGroup(pnlDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Reiniciar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.add(pnlDatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 810, -1));
        jPanel2.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-630, 0, 580, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1073, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    private void cxbPlanetaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cxbPlanetaItemStateChanged
        String decision = cxbPlaneta.getSelectedItem().toString();
        Reiniciar.setVisible(false);
        jButton1.setEnabled(true);
        while (modelo.getRowCount() > 0) {
        modelo.removeRow(0);
        
    }
        if (!decision.equalsIgnoreCase("---- Seleccionar ----")) {
            ReinicioRadio(false);
            pnlHorario.setVisible(false);
            pnlDatos1.setVisible(true);
            txtPlanetas.setVisible(true);
            txtPlanetas.setText(decision);
            Font font = txtPlanetas.getFont();
        txtPlanetas.setFont(new Font(font.getName(), Font.PLAIN, 26));
            switch (decision) {
                case "Moon":
                    rxbActividad1.setText("Apollo Landing Site Tours");
                    rxbActividad2.setText("Moon Base Camp");
                    rxbActividad3.setText("Lunar Rover Races");
                    rxbActividad4.setText("Lunar Underground Lava Tube Exploration");
                    rxbActividad5.setText("Lunar Hiking and Rock Climbing");
                    rxbActividad6.setText("Lunar Golf Tournament");
                    
                    break;
                case "Mercury":
                    rxbActividad1.setText("Solar Observatory Visit");
                    rxbActividad2.setText("Extreme Temperature Hike");
                    rxbActividad3.setText("Magnetic Anomaly Exploration");
                    rxbActividad4.setText("Caloris Basin Hot Air Balloon Ride");
                    rxbActividad5.setText("Space History Museum");
                    rxbActividad6.setText("Night Sky Stargazing");
                    break;
                case "Venus":
                    rxbActividad1.setText("Venusian Volcano Hike");
                    rxbActividad2.setText("Sulphuric Acid Cave Exploration");
                    rxbActividad3.setText("Venusian Cuisine Tasting");
                    rxbActividad4.setText("Venusian Geology Tour");
                    rxbActividad5.setText("Venusian Spa Retreat");
                    rxbActividad6.setText("Venusian Cloud City Tour");
                    break;
                case "Mars":
                    rxbActividad1.setText("Martian Rover Expedition");
                    rxbActividad2.setText("Olympus Mons Summit Trek");
                    rxbActividad3.setText("Martian Archaeology Dig");
                    rxbActividad4.setText("Martian Night Sky Photography");
                    rxbActividad5.setText("Mars Base Visit");
                    rxbActividad6.setText("Martian Microbiology Safari");
                    break;
                case "Jupiter":
                    rxbActividad1.setText("Jupiter's Great Red Spot Observation");
                    rxbActividad2.setText("Jupiter's Ring Dive");
                    rxbActividad3.setText("Ganymede Ice Cave Exploration");
                    rxbActividad4.setText("Jovian Storm Chasing");
                    rxbActividad5.setText("Io's Volcanic Eruption Viewing");
                    rxbActividad6.setText("Europa Subsurface Ice Diving");
                    break;
                case "Saturn":
                    // Cambia los nombres de los botones de opción
                    rxbActividad1.setText("Saturn's Ring Walk");
                    rxbActividad2.setText("Titan Hydrocarbon Kayaking");
                    rxbActividad3.setText("Enceladus Geysers Tour");
                    rxbActividad4.setText("Cassini Museum Visit");
                    rxbActividad5.setText("Hyperion Bouldering");
                    rxbActividad6.setText("Saturnian Astrology Workshop");
                    break;
                case "Neptune":
                    rxbActividad1.setText("Magnetic Storm Observation");
                    rxbActividad2.setText("Neptune's Deep Dive");
                    rxbActividad3.setText("Poseidon's Palace Visit");
                    rxbActividad4.setText("Neptunian Cloud Surfing");
                    rxbActividad5.setText("Neptune's Great Dark Spot Observatory");
                    rxbActividad6.setText("Ice Crystal Cavern Tours");
                    break;
                case "Uranus":
                    
                    rxbActividad1.setText("Uranian Ring Gliding");
                    rxbActividad2.setText("Miranda Cliff Diving");
                    rxbActividad3.setText("Uranian Magnetic Anomaly Exploration");
                    rxbActividad4.setText("Underground Tunnel Rides");
                    rxbActividad5.setText("Uranus' Blue Giant Storm Chase");
                    rxbActividad6.setText("Atmospheric Balloon Rides");
                    break;
                case "Pluto":
                    
                    rxbActividad1.setText("Pluto's Frozen Tundra Hike");
                    rxbActividad2.setText("Charon's Canyon Rafting");
                    rxbActividad3.setText("Pluto's Heart Observatory");
                    rxbActividad4.setText("Pluto Archaeological Expedition");
                    rxbActividad5.setText("Pluto Ice Sculpture Workshop");
                    rxbActividad6.setText("Pluto's Aurora Borealis Photography");
                    break;
                case "Io and Europa":
                    
                    rxbActividad1.setText("Lava Tube Exploration");
                    rxbActividad2.setText("Geothermal Hot Springs Bath");
                    rxbActividad3.setText("Magnetic Field Observations");
                    rxbActividad4.setText("Europan Ice Fishing");
                    rxbActividad5.setText("Io's Volcano Watching");
                    rxbActividad6.setText("Europa Subsurface Caving");
                    break;
                case "Titan":
                    
                    rxbActividad1.setText("Methane Lake Cruises");
                    rxbActividad2.setText("Titanian Wildlife Safaris");
                    rxbActividad3.setText("Titan's Desert Dune Buggy Adventure");
                    rxbActividad4.setText("Titanian Geothermal Bathing");
                    rxbActividad5.setText("Titan's Polar Bear Watching");
                    rxbActividad6.setText("Subsurface Ice Cavern Exploration");
                    break;

                default:
                    pnlDatos1.setVisible(false);
                    pnlHorario.setVisible(false);
            }
        } else {
            pnlDatos1.setVisible(false);
            pnlHorario.setVisible(false);
            txtPlanetas.setText(null);
        }
    
    }//GEN-LAST:event_cxbPlanetaItemStateChanged

    private void cxbPlanetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxbPlanetaActionPerformed
        
    }//GEN-LAST:event_cxbPlanetaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                                       
    pnlHorario.setVisible(true);
    
    
    List<String> actividadesSeleccionadas = new ArrayList<>();
    
    
    if (rxbActividad1.isSelected()) {
        actividadesSeleccionadas.add(rxbActividad1.getText());
    }
    if (rxbActividad2.isSelected()) {
        actividadesSeleccionadas.add(rxbActividad2.getText());
    }
    if (rxbActividad3.isSelected()) {
        actividadesSeleccionadas.add(rxbActividad3.getText());
    }
    if (rxbActividad4.isSelected()) {
        actividadesSeleccionadas.add(rxbActividad4.getText());
    }
    if (rxbActividad5.isSelected()) {
        actividadesSeleccionadas.add(rxbActividad5.getText());
    }
    if (rxbActividad6.isSelected()) {
        actividadesSeleccionadas.add(rxbActividad6.getText());
    }

    
    Manejador manejador = new Manejador(cxbPlaneta.getSelectedItem().toString());
    manejador.AsignarActividad(actividadesSeleccionadas.toArray(new String[0]), actividadesSeleccionadas.size());

    String[][] horarioCompleto = manejador.obtenerHorarioCompleto();
    
    
    if (horarioCompleto.length >= 7) {
        modelo.addRow(new Object[7]);
    for (int i = 0; i < 7; i++) {
        String actividad = horarioCompleto[i][0];
        modelo.setValueAt(actividad, 0, i);
    }
    } else {
    
    JOptionPane.showMessageDialog(this, "No se pudo obtener un horario completo.");
    
    }
    jButton1.setEnabled(false);
    Reiniciar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rxbActividad7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rxbActividad7ActionPerformed
        
    }//GEN-LAST:event_rxbActividad7ActionPerformed

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
        ReinicioRadio(false);
        while (modelo.getRowCount() > 0) {
        modelo.removeRow(0);
    }
    jButton1.setEnabled(true);
        
    }//GEN-LAST:event_ReiniciarActionPerformed

    public void rxbActividad3ActionPerformed(java.awt.event.ActionEvent evt) {
    
}
    
    public void rxbActividad2ActionPerformed(java.awt.event.ActionEvent evt) {
    
}
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel OPCIONES;
    private javax.swing.JButton Reiniciar;
    private javax.swing.JComboBox<String> cxbPlaneta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlDatos1;
    private javax.swing.JPanel pnlHorario;
    private javax.swing.JRadioButton rxbActividad1;
    private javax.swing.JRadioButton rxbActividad2;
    private javax.swing.JRadioButton rxbActividad3;
    private javax.swing.JRadioButton rxbActividad4;
    private javax.swing.JRadioButton rxbActividad5;
    private javax.swing.JRadioButton rxbActividad6;
    private javax.swing.JRadioButton rxbActividad7;
    private javax.swing.JTable tblHorarios;
    private javax.swing.JLabel txtPlanetas;
    // End of variables declaration//GEN-END:variables
        
}
