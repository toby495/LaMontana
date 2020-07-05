/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import Interfaces.IVenta;
import Interfaces.IVentaController;
import java.awt.BorderLayout;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectofinalpinocliente.RMI;
import proyectofinalpinocliente.RMIVenta;

/**
 *
 * @author Yanglee DM
 */
public class VerVentas extends javax.swing.JPanel {
    
    public Inicio inicio;
    private static String ID = "ID";
    private static String ESTADO = "Estado";

    
    
    public VerVentas() {
        initComponents();
        refrescarTabla();
        
    }
    
    
    
    public void refrescarTabla(){
        try { 
            
            Vector<Vector> datos = new Vector(); // Dónde van datos
            String textoBuscar = buscarTextField.getText(); //Recucperando texto que se va buscar
            
            List<IVenta> listVenta; //Donde quedan asignadas todas o un fragmento
            if(textoBuscar.length() == 0 ){ // Si tiene texto o no
                
                listVenta = RMIVenta.getIVentaController().list(); //Si no tiene texto, recuperamos a todos
                
            }else{ //CONSULTA
                IVenta venta = RMIVenta.getIVentaController().newInstance();
                
                String columna = columnasComboBox.getSelectedItem().toString();
                
                if(columna.compareTo(ID) == 0){
                    try{
                    venta.setIdVenta(Integer.parseInt(textoBuscar));
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(this, "Se requiere un valor númerico", "Número requerido",
                        JOptionPane.ERROR_MESSAGE
                        );
                        
                        return;
                    }
                }else if(columna.compareTo(ESTADO) == 0){
                    venta.setEstadoVenta(textoBuscar);
                }
                
                listVenta = RMIVenta.getIVentaController().find(venta);
            }
            
            
            for (IVenta venta : listVenta){
                Vector registro = new Vector();
                registro.add(venta.getIdVenta());
                registro.add(venta.getFechaVenta());
                registro.add(venta.getPrecioVenta());
                registro.add(venta.getEstadoVenta());
                registro.add(venta.getIdProducto());
                
                
                
                datos.add(registro);
            }
            
            
            Vector<String> columnas = new Vector();
            
            columnas.add("Folio de venta");
            columnas.add("Fecha de la venta");
            columnas.add("Monto vendido");
            columnas.add("Estado");
            columnas.add("Identificador del producto vendido");
            personasTable.setModel(new DefaultTableModel(datos, columnas));
        } catch (RemoteException ex) {
            Logger.getLogger(VerVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        agregarButton = new javax.swing.JButton();
        exitButton = new javax.swing.JLabel();
        modificarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        actualizarButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personasTable = new javax.swing.JTable();
        columnasComboBox = new javax.swing.JComboBox();
        buscarTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        buscarButton.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ventas");

        agregarButton.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        agregarButton.setText("Agregar");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 0, 51));
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/close.png"))); // NOI18N
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        modificarButton.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        modificarButton.setText("Modificar");
        modificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarButtonActionPerformed(evt);
            }
        });

        eliminarButton.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cafe65.png"))); // NOI18N

        actualizarButton.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        actualizarButton.setText("Actualizar");
        actualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("La montaña");

        personasTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(personasTable);

        columnasComboBox.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        columnasComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID", "Estado" }));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logout.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(agregarButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modificarButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eliminarButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(actualizarButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(columnasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarTextField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(columnasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarButton)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(agregarButton)
                        .addGap(18, 18, 18)
                        .addComponent(modificarButton)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarButton)
                        .addGap(18, 18, 18)
                        .addComponent(actualizarButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        refrescarTabla();
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed

        DialogAgregarVenta dialogAgregarVenta = new DialogAgregarVenta(null, true);

        dialogAgregarVenta.setLocationRelativeTo(this);
        dialogAgregarVenta.setVisible(true);
        
        refrescarTabla();

    }//GEN-LAST:event_agregarButtonActionPerformed

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked

        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarButtonActionPerformed

        
        try {
            int filaSeleccionada = personasTable.getSelectedRow();
            if (filaSeleccionada == -1){
                JOptionPane.showMessageDialog(
                        this,
                        "Por favor selecciona un registro para modificar",
                        "Error: Registro no seleccionado",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            int idVenta = (Integer) personasTable.getValueAt(filaSeleccionada, 0);
            IVenta venta = RMIVenta.getIVentaController().findOne(idVenta);
            
            if(venta.getIdVenta()== 0){
                
                JOptionPane.showMessageDialog(
                        this,
                        "Es probable que el producto haya sido eliminada previamente",
                        "Error: Persona no encontrada",
                        JOptionPane.ERROR_MESSAGE);
                refrescarTabla();
            return;
            }
            
            
        DialogModificarVenta dialogModificarVenta = new DialogModificarVenta(null, true, venta);

        dialogModificarVenta.setLocationRelativeTo(this);
        dialogModificarVenta.setVisible(true);
        
        refrescarTabla();

            
            
        } catch (RemoteException ex) {
            Logger.getLogger(VerProductos.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
       

    }//GEN-LAST:event_modificarButtonActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

        setVisible(false);
        inicio = new Inicio();
        removeAll();
        setLayout(new BorderLayout());
        setVisible(true);

        add(inicio);

    }//GEN-LAST:event_jLabel6MouseClicked

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed

        
        try {
            int filaSeleccionada = personasTable.getSelectedRow();
            if (filaSeleccionada == -1){
                JOptionPane.showMessageDialog(
                        this,
                        "Por favor selecciona un registro para eliminar",
                        "Error: Registro no seleccionado",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar este registro?", "Advertencia", JOptionPane.YES_NO_OPTION);
            
            if(confirmacion != JOptionPane.YES_OPTION){
                return;
            }
            
            int idVenta = (Integer) personasTable.getValueAt(filaSeleccionada, 0);
            
            int respuesta = RMIVenta.getIVentaController().delete(idVenta);
            
            if (respuesta == IVentaController.DELETE_EXITO){
                JOptionPane.showMessageDialog(this,
                        "Venta eliminada con éxito",
                        "Operación exitosa",
                        JOptionPane.INFORMATION_MESSAGE);
                refrescarTabla();
            }else if(respuesta == IVentaController.DELETE_ID_INEXISTENTE){
                JOptionPane.showMessageDialog(this,
                        "Venta no encontrada\n"+
                                "Es posible que el producto haya sido eliminada previamente",
                        "Persona no encontrada",
                        JOptionPane.ERROR_MESSAGE); 
            }else{
                JOptionPane.showMessageDialog(this,
                        "Operación incompleta",
                        "Ocurrió un error",
                        JOptionPane.ERROR_MESSAGE); 
            }
            
        } catch (RemoteException ex) {
            Logger.getLogger(VerVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void actualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarButtonActionPerformed
        refrescarTabla();
    }//GEN-LAST:event_actualizarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarButton;
    private javax.swing.JButton agregarButton;
    private javax.swing.JButton buscarButton;
    private javax.swing.JTextField buscarTextField;
    private javax.swing.JComboBox columnasComboBox;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JLabel exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarButton;
    private javax.swing.JTable personasTable;
    // End of variables declaration//GEN-END:variables
}
