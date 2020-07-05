
package proyectofinalpinocliente;


import Interfaces.IReporte;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RMIReporte {
    
    private static IReporte rep;
    
    
    public static IReporte getIReporte() throws RemoteException{
        
        
    if (rep == null){
        
        try {   
            rep = (IReporte) Naming.lookup("rmi://localhost/Reporte");
        } catch (NotBoundException ex) {
            Logger.getLogger(RMIReporte.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(RMIReporte.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        return rep;
        
    }
    


}
