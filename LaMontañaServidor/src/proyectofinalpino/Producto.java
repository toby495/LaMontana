
package proyectofinalpino;

import Interfaces.IProducto;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;


public class Producto extends UnicastRemoteObject implements IProducto {
    
    
    private int IdProducto;
    private String NombreProducto;
    private int PrecioProducto;
    private String DescripProducto;
    private String FechaIngreso;
    private int Cantidad;
    
    public Producto() throws RemoteException {
       
    }

    public Producto(int IdProducto, String NombreProducto, int PrecioProducto, String DescripProducto) throws RemoteException  {
        this.IdProducto = IdProducto;
        this.NombreProducto = NombreProducto;
        this.PrecioProducto = PrecioProducto;
        this.DescripProducto = DescripProducto;
    }

    @Override
    public int getIdProducto() {
        return IdProducto;
    }

    @Override
    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    @Override
    public String getNombreProducto() {
        return NombreProducto;
    }

    @Override
    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    @Override
    public int getPrecioProducto() {
        return PrecioProducto;
    }

    @Override
    public void setPrecioProducto(int PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }

    @Override
    public String getDescripProducto() {
        return DescripProducto;
    }

    @Override
    public void setDescripProducto(String DescripProducto) {
        this.DescripProducto = DescripProducto;
    }



    @Override
    public String getFechaIngreso() {
        return FechaIngreso;
    }

    @Override
    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    @Override
    public int getCantidad() {
        return Cantidad;
    }

    @Override
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    
    
    
    
    
    @Override
    public String getString(){
        return String.format("idProducto: %d, Nombre Producto: %s, Precio: %s, Descripción: %s, Fecha Ingreso: %s, Cantidad: %d",IdProducto, NombreProducto, PrecioProducto, DescripProducto, FechaIngreso, Cantidad);
    }    

    public static IProducto fromMap ( Map<String, Object> map ) throws RemoteException{
       IProducto producto = new Producto();
       
       if (map.containsKey("idProducto"))
            producto.setIdProducto((Integer)map.get("idProducto"));
            
        if (map.containsKey("nombreProducto"))
            producto.setNombreProducto((String)map.get("nombreProducto"));
       
        if (map.containsKey("precioProducto"))
            producto.setPrecioProducto((Integer)map.get("precioProducto"));     

        
        if (map.containsKey("descripProducto"))
            producto.setDescripProducto((String)map.get("descripProducto"));
        
        if (map.containsKey("fechaIngreso"))
            producto.setFechaIngreso((String)map.get("fechaIngreso"));
        
        if (map.containsKey("cantidadProducto"))
            producto.setCantidad((Integer)map.get("cantidadProducto"));
        
        
        

            
        return producto;
    }
    
    
    public static Map<String, Object> toMap( IProducto producto) throws RemoteException{
        
        Map<String, Object> datos = new HashMap<>();
        
        
         if (producto.getIdProducto()!= 0 ){
             datos.put("idProducto", producto.getIdProducto());
         }
         
         if (producto.getNombreProducto()!= null ){
             datos.put("nombreProducto", producto.getNombreProducto());
         }
         
         if (producto.getPrecioProducto()!= 0 ){
             datos.put("precioProducto", producto.getPrecioProducto());
         }
         
         if (producto.getDescripProducto() != null ){
             datos.put("descripProducto", producto.getDescripProducto());
         }
         
         if (producto.getFechaIngreso()!= null ){
             datos.put("fechaIngreso", producto.getFechaIngreso());
         }
         
         if (producto.getCantidad()!= 0 ){
             datos.put("cantidadProducto", producto.getCantidad());
         }
         
         
         
         
         return datos;
         
    }
    
    
}
    
