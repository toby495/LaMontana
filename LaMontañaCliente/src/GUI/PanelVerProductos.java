/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Interfaces.IProducto;
import GUI.PanelAgregarVenta;


import java.rmi.RemoteException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectofinalpinocliente.RMI;

/**
 *
 * @author Yanglee DM
 */
public class PanelVerProductos extends javax.swing.JPanel{
    
    private static String ID = "ID";
    private static String NOMBRE = "Nombre";

    private JDialog dialogParent;    
    public String idProducto;
    
    
    public PanelVerProductos(JDialog dialogParent) {
        initComponents();
        this.dialogParent = dialogParent;        
        refrescarTabla();
        

                JOptionPane.showMessageDialog(
                        this,
                        "Por favor selecciona un registro",
                        "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);

            
            
       
    }



    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        personasTable = new javax.swing.JTable();
        regresarButton = new javax.swing.JButton();
        columnasComboBox = new javax.swing.JComboBox();
        buscarTextField = new javax.swing.JTextField();
        buscarButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 51));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        personasTable.setBackground(new java.awt.Color(0, 51, 51));
        personasTable.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        personasTable.setForeground(new java.awt.Color(255, 255, 255));
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

        regresarButton.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        regresarButton.setText("Seleccionar");
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });

        columnasComboBox.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        columnasComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID", "Nombre" }));

        buscarButton.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regresarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(columnasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(columnasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regresarButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed

        int filaSeleccionada = personasTable.getSelectedRow();
            if (filaSeleccionada == -1){
                JOptionPane.showMessageDialog(
                        this,
                        "Por favor selecciona un registro",
                        "Error: Registro no seleccionado",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        
        
        DefaultTableModel tm = (DefaultTableModel) personasTable.getModel();
 
        String idProducto = String.valueOf(tm.getValueAt(personasTable.getSelectedRow(),0));
        
        String precioProducto = String.valueOf(tm.getValueAt(personasTable.getSelectedRow(), 2));
        
        
        
        String nombreProducto = String.valueOf(tm.getValueAt(personasTable.getSelectedRow(),1));
        
        int confirmacion = JOptionPane.showConfirmDialog(this,
                "¿Seleccionar "+ nombreProducto + "?\n$"+precioProducto, "Confirmación", JOptionPane.YES_NO_OPTION);
            

        
        if(confirmacion == JOptionPane.YES_OPTION){
            
            ProductoVentaProperties properties = new ProductoVentaProperties();
            
            properties.setProductoID(idProducto);
            properties.setPrecioProducto(precioProducto);
            
            dialogParent.setVisible(false);
            
        }else{
            
            return;
            
        } 
        
        

        
        

    }//GEN-LAST:event_regresarButtonActionPerformed

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        refrescarTabla();
    }//GEN-LAST:event_buscarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarButton;
    private javax.swing.JTextField buscarTextField;
    private javax.swing.JComboBox columnasComboBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable personasTable;
    private javax.swing.JButton regresarButton;
    // End of variables declaration//GEN-END:variables

    private void refrescarTabla() {
        try { 
            
            Vector<Vector> datos = new Vector(); // Dónde van datos
            String textoBuscar = buscarTextField.getText(); //Recucperando texto que se va buscar
            
            List<IProducto> listProducto; //Donde quedan asignadas todas o un fragmento
            if(textoBuscar.length() == 0 ){ // Si tiene texto o no
                
                listProducto = RMI.getIProductoController().list(); //Si no tiene texto, recuperamos a todos
                
            }else{ //CONSULTA
                IProducto producto = RMI.getIProductoController().newInstance();
                
                String columna = columnasComboBox.getSelectedItem().toString();
                
                if(columna.compareTo(ID) == 0){
                    try{
                    producto.setIdProducto(Integer.parseInt(textoBuscar));
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(this, "Se requiere un valor númerico", "Número requerido",
                        JOptionPane.ERROR_MESSAGE
                        );
                        
                        return;
                    }
                }else if(columna.compareTo(NOMBRE) == 0){
                    producto.setNombreProducto(textoBuscar);
                }
                
                listProducto = RMI.getIProductoController().find(producto);
            }
            
            
            for (IProducto producto : listProducto){
                Vector registro = new Vector();
                registro.add(producto.getIdProducto());
                registro.add(producto.getNombreProducto());
                registro.add(producto.getPrecioProducto());
                registro.add(producto.getDescripProducto());
                registro.add(producto.getFechaIngreso());
                registro.add(producto.getCantidad());
                
                
                
                datos.add(registro);
            }
            
            
            Vector<String> columnas = new Vector();
            
            columnas.add("ID");
            columnas.add("Nombre");
            columnas.add("Precio");
            columnas.add("Descripción");
            columnas.add("Fecha de ingreso");
            columnas.add("Cantidad");
            personasTable.setModel(new DefaultTableModel(datos, columnas));
        } catch (RemoteException ex) {
            Logger.getLogger(VerProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
