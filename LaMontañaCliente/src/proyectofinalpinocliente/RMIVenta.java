/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalpinocliente;


import Interfaces.IVentaController;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yanglee DM
 */
public class RMIVenta {

    
    private static IVentaController ventaController;
    
    public static IVentaController getIVentaController(){
       
       try {
           if (ventaController == null){
           ventaController =  (IVentaController) Naming.lookup("rmi://localhost/VentaController");
           }

       } catch (NotBoundException ex) {
           Logger.getLogger(RMI.class.getName()).log(Level.SEVERE, null, ex);
       } catch (MalformedURLException ex) {
           Logger.getLogger(RMI.class.getName()).log(Level.SEVERE, null, ex);
       } catch (RemoteException ex) {
           Logger.getLogger(RMI.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       return ventaController;
   }   
   

   
   
   
   
}
