/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalpino;

import Interfaces.IVenta;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Yanglee DM
 */
public class Venta extends UnicastRemoteObject implements IVenta{
    
    private int idVenta;
    private String  fechaVenta;
    private int precioVenta;
    private String estadoVenta;
    private int idProducto;
    
    
    
        public Venta() throws RemoteException {
       
    }

    public Venta(int idVenta, String fechaVenta, int precioVenta, String estadoVenta, int idProducto) throws RemoteException{
        this.idVenta = idVenta;
        this.fechaVenta = fechaVenta;
        this.precioVenta = precioVenta;
        this.estadoVenta = estadoVenta;
        this.idProducto = idProducto;
    }

    @Override
    public int getIdVenta() {
        return idVenta;
    }

    @Override
    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    @Override
    public int getPrecioVenta() {
        return precioVenta;
    }

    @Override
    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    @Override
    public String getFechaVenta() {
        return fechaVenta;
    }

    @Override
    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @Override
    public String getEstadoVenta() {
        return estadoVenta;
    }

    @Override
    public void setEstadoVenta(String estadoVenta) {
        this.estadoVenta = estadoVenta;
    }

    @Override
    public int getIdProducto() {
        return idProducto;
    }

    @Override
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    
    
    
    @Override
    public String getString(){
        
        return String.format("idVenta: %d, fechaVenta: %s, precioVenta: %s, estadoVenta: %s, idProducto: %d",idVenta, fechaVenta, precioVenta, estadoVenta, idProducto);
    }
    
    
    
    public static IVenta fromMap ( Map<String, Object> map ) throws RemoteException{
        
        IVenta venta = new Venta();
       
       if (map.containsKey("idVenta"))
            venta.setIdVenta((Integer)map.get("idVenta"));
            
        if (map.containsKey("fechaVenta"))
            venta.setFechaVenta((String)map.get("fechaVenta"));
            
       if (map.containsKey("precioVenta"))
            venta.setPrecioVenta((Integer)map.get("precioVenta"));
            
        if (map.containsKey("estadoVenta"))
            venta.setEstadoVenta((String)map.get("estadoVenta"));
        
       if (map.containsKey("idProducto"))
            venta.setIdProducto((Integer)map.get("idProducto"));    
            
        return venta;
    }
    
    public static Map<String, Object> toMap(IVenta venta) throws RemoteException{
        
        Map<String, Object> datos = new HashMap<>();
        
        
         if (venta.getIdVenta()!= 0 ){
             datos.put("idVenta", venta.getIdVenta());
         }
         
         if (venta.getFechaVenta()!= null ){
             datos.put("fechaVenta", venta.getFechaVenta());
         }
         
         if (venta.getPrecioVenta() != 0 ){
             datos.put("precioVenta", venta.getPrecioVenta());
         }
         
         if (venta.getEstadoVenta() != null ){
             datos.put("estadoVenta", venta.getEstadoVenta());
         }
         
         if (venta.getIdProducto() != 0){
             datos.put("idProducto", venta.getIdProducto());
         }
         
         
         
         return datos;
    }
        
    
}
