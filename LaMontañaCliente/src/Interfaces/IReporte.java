/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yanglee DM
 */
public interface IReporte extends Remote {
    
    
    
    
    DefaultTableModel getProductosFechas(String fechaInicial, String fechaFinal) throws RemoteException;
    
    String getMonto(String fechaInicial, String fechaFinal) throws RemoteException;
    

    
    
    
    
}
