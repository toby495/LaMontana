
package GUI;

import Interfaces.IProducto;
import Interfaces.IProductoController;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import proyectofinalpinocliente.RMI;


/**
 *
 * @author Yanglee DM
 */
public class PanelAgregarProducto extends javax.swing.JPanel {

    private JDialog dialogParent;

    public PanelAgregarProducto(JDialog dialogParent) {
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

        exitButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        precioTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        descTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cantidadTextField = new javax.swing.JTextField();
        aceptarButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 51));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        exitButton.setBackground(new java.awt.Color(255, 0, 51));
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/close.png"))); // NOI18N
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar producto");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresa el nombre del producto");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingresa el precio del producto");

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingresa una descripción del producto");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingresa la cantidad de productos a ingresar");

        aceptarButton.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        aceptarButton.setText("Aceptar");
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/boxProducto_1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nombreTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(precioTextField)
                                .addComponent(descTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cantidadTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(aceptarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aceptarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(11, 11, 11))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        
            int confirmacion = JOptionPane.showConfirmDialog(this, "Está seguro de cancelar esta operación?", "Advertencia", JOptionPane.YES_NO_OPTION);
            
            if(confirmacion == JOptionPane.YES_OPTION){
                dialogParent.setVisible(false);
            }else{
                return;
            } 

    }//GEN-LAST:event_exitButtonMouseClicked

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        
        try {
            String nombre = nombreTextField.getText();
            String precio = precioTextField.getText();
            String desc = descTextField.getText();
            //Fecha
            Date miFecha = new Date();

            //Formato de fecha
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = formatoFecha.format(miFecha);
            
            String cant = cantidadTextField.getText();
            
            IProducto producto = RMI.getIProductoController().newInstance();
            
            
            
            if (nombre.length() == 0 ){
                JOptionPane.showMessageDialog(
                        this, 
                        "Ingrese el nombre del producto",
                        "Validación",
                        JOptionPane.ERROR_MESSAGE);
                nombreTextField.requestFocus();
                return;
            }else{
                producto.setNombreProducto(nombre);
            } //Fin if-else
            if (precio.length() > 0){
                producto.setPrecioProducto(Integer.parseInt(precio));
            }
            if(desc.length() == 0){
                JOptionPane.showMessageDialog(
                        this, 
                        "Ingrese la descripción del producto",
                        "Validación",
                        JOptionPane.ERROR_MESSAGE);
                descTextField.requestFocus();
                return;
            }else{
                producto.setDescripProducto(desc);
                producto.setFechaIngreso(fecha);
            }//Fin if-else
            if(cant.length()>0){
                producto.setCantidad(Integer.parseInt(cant));
            }else{
                JOptionPane.showMessageDialog(
                        this, 
                        "La cantidad minima es 1",
                        "Validación",
                        JOptionPane.ERROR_MESSAGE);
                descTextField.requestFocus();
                return; 
            }
            
            int respuesta = RMI.getIProductoController().add(producto);
            
            if(respuesta == IProductoController.ADD_EXITO){
                JOptionPane.showMessageDialog(this,
                        "Producto añadido exitosamente",
                        "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
                dialogParent.dispose();
                
            }else if(respuesta == IProductoController.ADD_SIN_EXITO){
                JOptionPane.showMessageDialog(this,
                        "Ocurrió un error al añadir el producto",
                        "Operación interrumpida",
                        JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (RemoteException ex) {
            Logger.getLogger(PanelAgregarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
    }//GEN-LAST:event_aceptarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarButton;
    private javax.swing.JTextField cantidadTextField;
    private javax.swing.JTextField descTextField;
    private javax.swing.JLabel exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JTextField precioTextField;
    // End of variables declaration//GEN-END:variables
}
