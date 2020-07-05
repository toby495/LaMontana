
package proyectofinalpino;

import Interfaces.IProductoController;
import Interfaces.IReporte;
import proyectofinalpino.DBManager;
import Interfaces.IVentaController;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;



/*Yanglee DM*/
public class ProyectoFinalPino {
    public static void main(String[] args) {
        
        try {
            LocateRegistry.createRegistry(1099);
            IVentaController ventaController = new VentaController();
            
            Naming.rebind("rmi://localhost/VentaController", ventaController);
            System.out.println("Escuchando... Venta");
        } catch (RemoteException ex) {
            Logger.getLogger(ProyectoFinalPino.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ProyectoFinalPino.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            LocateRegistry.createRegistry(1098);
        IProductoController productoController = new ProductoController();
        Naming.rebind("rmi://localhost/ProductoController", productoController);
            System.out.println("Escuchando... Producto");
        } catch (RemoteException ex) {
            Logger.getLogger(ProyectoFinalPino.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ProyectoFinalPino.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            LocateRegistry.createRegistry(1097);
            
        IReporte rep = new Reporte();
        Naming.rebind("rmi://localhost/Reporte", rep);
            System.out.println("Escuchando... Reporte");
        } catch (RemoteException | MalformedURLException ex) {
            Logger.getLogger(ProyectoFinalPino.class.getName()).log(Level.SEVERE, null, ex);
        }
        DBManager.getInstance();
    }
}