/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.io.*;
import java.awt.BorderLayout;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectofinalpinocliente.RMI;
import proyectofinalpinocliente.RMIReporte;
import proyectofinalpinocliente.RMIVenta;

/**
 *
 * @author Yanglee DM
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    


    private Inicio panelInicio;
    
    
    public static String ipDinamica = "" ;
    
    

    
    
    public boolean Conectar(String ip) throws RemoteException{
        
        if(ip.equals(ipDinamica)){
        if(RMI.getIProductoController()!= null
                && RMIReporte.getIReporte() != null
                && RMIVenta.getIVentaController() != null
                ){
            return true;
        }
        JOptionPane.showMessageDialog(this,"No se pudo conectar al servidor","Aviso",JOptionPane.ERROR_MESSAGE);
        return false;
        
        }else{
            return false;
        }
        
    }
    
   private final String ruta = System.getProperties().getProperty("user.dir"); //Obtención de ruta
   
   FileWriter fw = null;
   File archivoIPS = null;
   File archivoIP = null;
   File archivoNuevaIP = null;
   FileReader fr = null;
   BufferedReader br = null;
   BufferedWriter bw = null;
   PrintWriter pw = null;
   
   

   
    
    
    
    
    public static String getIpDinamica() {
        return ipDinamica;
    }

    public  void setIpDinamica(String ipDinamica) {
        
        try { // Seteo de nueva IP
            
            archivoNuevaIP = new File (ruta + "//direccionIPActual.txt"); //Obtención de ruta del archivo sin importar el equipo
            
            fw = new FileWriter (archivoNuevaIP); //leyendo ip actual
            
            bw = new BufferedWriter(fw); //buffer para escribir
            
            pw = new PrintWriter(bw); //clase para escribir
            
            pw.write(ipDinamica);
            
            pw.close();
            
            bw.close();
            
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

   

    public VentanaPrincipal() {
        initComponents();
        setSize(800, 400);
        
        
        this.setLocationRelativeTo(null); //Centrando panel
        
        panelCentral.add(jPanel1, BorderLayout.CENTER);
        

 
      /*try {
         
         
         archivoIPS = new File (ruta + "//direccionesIP.txt"); //Obtención de ruta del archivo sin importar el equipo
         archivoIP = new File(ruta + "//direccionIPActual.txt"); //Obtención del archivo de IP actual
         
         fr = new FileReader(archivoIP);
         br = new BufferedReader(fr);
         
         ipDinamica = br.readLine();
         
         fr = new FileReader (archivoIPS);
         br = new BufferedReader(fr);
        
         String lineaLeida;
         
         
          DefaultListModel model_lista = new DefaultListModel();
          
          
         while((lineaLeida=br.readLine())!=null){ //Leyendo direccionesIP desde archivo de texto

            model_lista.addElement(lineaLeida);
  
            
         }
          direccionesIPList.setModel(model_lista);
          
      }      
      catch(IOException e){}finally{try{if( null != fr ){fr.close();}}catch (IOException e2){}
      }
        */
     
    }
    
      

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelCentral.setBackground(new java.awt.Color(0, 51, 51));
        panelCentral.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jButton1.setText("Ingresar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jButton2.setText("Salir");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cafe256.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(534, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelCentral.add(jPanel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

                panelInicio = new Inicio();
                panelCentral.removeAll();
                panelCentral.setLayout(new BorderLayout());
                panelCentral.setVisible(false);
                panelCentral.setVisible(true);
                
                panelCentral.add(panelInicio);

        
        /*try {
            if(Conectar(direccionIP.getText())){
                JOptionPane.showMessageDialog(this,"Conectado","Aviso",JOptionPane.INFORMATION_MESSAGE);
                panelInicio = new Inicio();
                panelCentral.removeAll();
                panelCentral.setLayout(new BorderLayout());
                panelCentral.setVisible(false);
                panelCentral.setVisible(true);
                
                panelCentral.add(panelInicio);
                
                // Guardado de la contraseña en TXT
                
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Deseas recordar la dirección IP?", "Advertencia", JOptionPane.YES_NO_OPTION);
            
            
             // Registro de nueva dirección ip en direccionesIP.txt
            if(confirmacion == JOptionPane.YES_OPTION){
                
                archivoIPS = new File (ruta + "//direccionesIP.txt"); //Obtención de ruta del archivo sin importar el equipo

                fw = new FileWriter (archivoIPS); //leyendo
                
                bw = new BufferedWriter(fw); //buffer para escribir
                
                pw = new PrintWriter(bw); //clase para escribir
                
                pw.write(direccionIP.getText());
                
                pw.close();
                bw.close();
                
            }
                
                
                
            }else{
                JOptionPane.showMessageDialog(this,"Dirección IP incorrecta","Error",JOptionPane.ERROR_MESSAGE);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel panelCentral;
    // End of variables declaration//GEN-END:variables
}
