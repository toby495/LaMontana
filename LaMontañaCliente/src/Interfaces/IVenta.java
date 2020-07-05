/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Yanglee DM
 */
public interface IVenta extends Remote {
    
    
    int getIdVenta() throws RemoteException;
    void setIdVenta(int idVenta) throws RemoteException;
    
    int getIdProducto() throws RemoteException;
    void setIdProducto(int idProducto) throws RemoteException;
    
    String getFechaVenta() throws RemoteException;
    void setFechaVenta(String fechaVenta) throws RemoteException;
    
    int getPrecioVenta() throws RemoteException;
    void setPrecioVenta(int precioVenta) throws RemoteException;
    
    String getEstadoVenta() throws RemoteException;
    void setEstadoVenta(String estadoVenta) throws RemoteException;
    
    String getString() throws RemoteException;
    
}
