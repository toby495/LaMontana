
package proyectofinalpino;

import Interfaces.IProducto;
import Interfaces.IReporte;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Reporte extends UnicastRemoteObject implements IReporte{

    
    private String monto;

    


    public Reporte()throws RemoteException{
        
    }






  

    @Override
    public String getMonto(String fechaInicio, String fechaTermino)throws RemoteException{
        
        
        DBManager dbManager = DBManager.getInstance();
        return String.valueOf(dbManager.sumaVentasFechas(fechaInicio, fechaTermino));
        

        
        
        
    }


    @Override
    public DefaultTableModel getProductosFechas(String fechaInicial, String fechaFinal) throws RemoteException {
        
        DBManager dbManager = DBManager.getInstance();
        
        DefaultTableModel model = new DefaultTableModel();
        
        model = dbManager.getProductos(fechaInicial, fechaFinal);
        
        return model;

    }


    
    
    
}
