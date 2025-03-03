/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import Interfaces.IReporte;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectofinalpinocliente.RMIReporte;

/**
 *
 * @author Yanglee DM
 */
public class PanelReportes extends javax.swing.JPanel {

    private JDialog dialogParent;
    
    
    public PanelReportes(JDialog dialogParent) {
        initComponents();
        this.dialogParent = dialogParent;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fechaTextoChoserInicial = new rojeru_san.componentes.RSDateChooser();
        jLabel3 = new javax.swing.JLabel();
        fechaTextoChoserTermino = new rojeru_san.componentes.RSDateChooser();
        generarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporteTable = new javax.swing.JTable();
        cancelarButton = new javax.swing.JButton();
        montoTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 51));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Generar reporte");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Introduce desde qué fecha deseas mostrar el reporte");

        fechaTextoChoserInicial.setColorBackground(new java.awt.Color(0, 153, 153));
        fechaTextoChoserInicial.setColorButtonHover(new java.awt.Color(0, 51, 51));
        fechaTextoChoserInicial.setColorForeground(new java.awt.Color(0, 153, 153));
        fechaTextoChoserInicial.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        fechaTextoChoserInicial.setFormatoFecha("yyyy-MM-dd");
        fechaTextoChoserInicial.setFuente(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        fechaTextoChoserInicial.setPlaceholder("Selecione la fecha");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Introduce hasta qué fecha deseas mostrar el reporte");

        fechaTextoChoserTermino.setColorBackground(new java.awt.Color(0, 153, 153));
        fechaTextoChoserTermino.setColorButtonHover(new java.awt.Color(0, 51, 51));
        fechaTextoChoserTermino.setColorForeground(new java.awt.Color(0, 153, 153));
        fechaTextoChoserTermino.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        fechaTextoChoserTermino.setFormatoFecha("yyyy-MM-dd");
        fechaTextoChoserTermino.setFuente(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        fechaTextoChoserTermino.setPlaceholder("Selecione la fecha");

        generarButton.setBackground(new java.awt.Color(255, 255, 255));
        generarButton.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        generarButton.setText("Generar");
        generarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarButtonActionPerformed(evt);
            }
        });

        reporteTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        reporteTable.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        reporteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        reporteTable.setGridColor(new java.awt.Color(0, 0, 0));
        reporteTable.setOpaque(false);
        jScrollPane1.setViewportView(reporteTable);

        cancelarButton.setBackground(new java.awt.Color(255, 255, 255));
        cancelarButton.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        cancelarButton.setText("Salir");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        montoTextField.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        montoTextField.setText("0.00");
        montoTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        montoTextField.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Monto de ventas entre fechas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(fechaTextoChoserInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(generarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(montoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(fechaTextoChoserTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaTextoChoserInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaTextoChoserTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(generarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(montoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        
            int confirmacion = JOptionPane.showConfirmDialog(this, "Está seguro de cancelar esta operación?", "Advertencia", JOptionPane.YES_NO_OPTION);
            
            if(confirmacion == JOptionPane.YES_OPTION){
                dialogParent.setVisible(false);
            }else{
                return;
            }         
        
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void generarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarButtonActionPerformed
        
        try {
            if(fechaTextoChoserInicial.getDatoFecha() == null){
                JOptionPane.showMessageDialog(
                        this, 
                        "Por favor seleccione la fecha de inicio del reporte",
                        "Validación",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if(fechaTextoChoserTermino.getDatoFecha() == null){
                JOptionPane.showMessageDialog(
                        this, 
                        "Por favor seleccione la fecha de termino del reporte",
                        "Validación",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Date fechaInicioValidacion = fechaTextoChoserInicial.getDatoFecha();
            Date fechaTerminoValidacion = fechaTextoChoserTermino.getDatoFecha();
            
            if(fechaInicioValidacion.after(fechaTerminoValidacion)){
                
                JOptionPane.showMessageDialog(
                        this, 
                        "La fecha inicial no puede ser posterior a la fecha de termino",
                        "Validación",
                        JOptionPane.ERROR_MESSAGE);
                return;   
                
            }else{  
                
            IReporte rp = RMIReporte.getIReporte(); //Creación del objeto rp para obtener los métodos remotos

            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            
            
            String fechaInicio = formatoFecha.format(fechaTextoChoserInicial.getDatoFecha());
            String fechaFinal = formatoFecha.format(fechaTextoChoserTermino.getDatoFecha());
            
            
            
            String monto = rp.getMonto(String.valueOf(fechaInicio), String.valueOf(fechaFinal));
            
            montoTextField.setText("$"+(monto));
            
            
            reporteTable.setModel(rp.getProductosFechas(fechaInicio, fechaFinal));
            

            }
            

            
            
            
        } catch (RemoteException ex) {
            Logger.getLogger(PanelReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_generarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private rojeru_san.componentes.RSDateChooser fechaTextoChoserInicial;
    private rojeru_san.componentes.RSDateChooser fechaTextoChoserTermino;
    private javax.swing.JButton generarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField montoTextField;
    private javax.swing.JTable reporteTable;
    // End of variables declaration//GEN-END:variables
}
