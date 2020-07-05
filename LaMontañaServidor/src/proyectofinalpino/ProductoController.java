
package proyectofinalpino;

import Interfaces.IProducto;
import Interfaces.IProductoController;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;

import java.util.Map;



public class ProductoController extends UnicastRemoteObject implements IProductoController{
    
        
    DBManager dbManager = DBManager.getInstance();
    private final String TABLE = "Producto";
    
    
    public ProductoController() throws RemoteException {
        dbManager = DBManager.getInstance();
    }

    public IProducto newInstance() throws RemoteException{
        return new Producto();
    }
    
    @Override
    public int add (IProducto producto ) throws RemoteException {
        IProducto productoEncontrado = findOne( producto.getIdProducto());
        boolean existe = productoEncontrado.getIdProducto()!= 0;        
        
        if (existe){
           return ADD_ID_DUPLICADO;
        }
        
        Map<String, Object> datos = Producto.toMap(producto);
        int respuesta = dbManager.insertar(TABLE, datos);
        
        return (respuesta > 0 ) ? ADD_EXITO : ADD_SIN_EXITO;
    }

    @Override
    public int update(IProducto producto) throws RemoteException {
        if ( producto.getIdProducto()== 0 ){
            return UPDATE_ID_NULO;
        }
        
        //Verificar que existe un Producto con el ID recibido
        
        
        IProducto productoEncontrado = findOne(producto.getIdProducto());
        if( productoEncontrado.getIdProducto()== 0 ){
            return UPDATE_ID_INEXISTE;
        }
        
        Map<String, Object> datos = Producto.toMap(producto);
        Map<String, Object> where = new HashMap<>();
        where.put("idProducto", producto.getIdProducto());
        int respuesta = dbManager.actualizar(TABLE, datos, where);
        
        if ( respuesta > 0 )
            return UPDATE_EXITO;
        else
            return UPDATE_SIN_EXITO;
    }

    @Override
    public int delete(IProducto producto) throws RemoteException {
        IProducto productoTemp = findOne ( producto.getIdProducto());
        if ( productoTemp.getIdProducto()== 0 ){
            return DELETE_ID_INEXISTENTE; 
        }
        
        Map<String, Object> where = new HashMap<>();
        where.put("idProducto", producto.getIdProducto());
        int respuesta = dbManager.eliminar(TABLE, where);
        
        if ( respuesta == 0 ){
            return DELETE_SIN_EXITO; 
        }
        else{
            return DELETE_EXITO; 
        }
    }

    @Override
    public int delete(int idProducto ) throws RemoteException {
      IProducto productoTemp = findOne ( idProducto );
        if ( productoTemp.getIdProducto()== 0 ){
            return DELETE_ID_INEXISTENTE; 
        }
        
        Map<String, Object> where = new HashMap<>();
        where.put("idProducto", idProducto );
        int respuesta = dbManager.eliminar(TABLE, where);
        
        if ( respuesta == 0 ){
            return DELETE_SIN_EXITO; 
        }
        else{
            return DELETE_EXITO; 
        }
    }
    
    @Override
    public List<IProducto> list() throws RemoteException {
        
        List<IProducto> listaIProducto = new ArrayList<>();
        
        List< Map <String, Object> > registros = dbManager.listar(TABLE);
        
        for ( Map<String, Object> registro : registros ){
            
            IProducto producto = Producto.fromMap( registro );
            listaIProducto.add(producto);          
        }
        
        return listaIProducto;
    }

    @Override
    public IProducto findOne(int idProducto) throws RemoteException {
                
        Map<String, Object> where = new HashMap<>();
        where.put("idProducto", idProducto);
        Map<String, Object> registro = dbManager.buscarUno(TABLE, where);

        return Producto.fromMap(registro);
    }

    @Override
    public List<IProducto> find(IProducto producto) throws RemoteException {
        List<IProducto> listaProductos = new ArrayList<>();
        
        Map<String, Object> where = Producto.toMap( producto );
        List< Map <String, Object> > registros = dbManager.listar(TABLE, where);
        
        for ( Map<String, Object> registro : registros ){
            
            IProducto productoTemp = Producto.fromMap( registro );
            listaProductos.add(productoTemp);          
        }
        
        return listaProductos;
    }
    
    
}
