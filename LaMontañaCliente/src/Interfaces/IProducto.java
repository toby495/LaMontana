
package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface IProducto extends Remote {

    
    
    int getIdProducto() throws RemoteException;
    void setIdProducto(int id) throws RemoteException;
    
    String getNombreProducto() throws RemoteException;
    void setNombreProducto(String nombre) throws RemoteException;
    
    int getPrecioProducto() throws RemoteException;
    void setPrecioProducto(int precio) throws RemoteException;
    
    String getDescripProducto() throws RemoteException;
    void setDescripProducto(String descrip) throws RemoteException;
    
    
    String getFechaIngreso() throws RemoteException;
    void setFechaIngreso(String fechaIngreso) throws RemoteException;
    
    int getCantidad() throws RemoteException;
    void setCantidad(int cantidad) throws RemoteException;
    
    
    String getString() throws RemoteException;
     
    
}
