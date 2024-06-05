/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unipacifico.edu.pasantias.logica;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ConvenioDAO {
    
    public void guardar(ArrayList<ConvenioMacro>listaConvenios)throws IOException{
        File archivo = new File("Convenios.tur") ;
        FileOutputStream fos = new FileOutputStream(archivo);
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(listaConvenios);
        oos.close();
        fos.close();
        
    }
     public ArrayList<ConvenioMacro> leer()throws IOException, ClassNotFoundException{
     ArrayList<ConvenioMacro> lista = new ArrayList<ConvenioMacro>();
     File archivo = new File("Convenios.tur") ;
     FileInputStream fis = new FileInputStream(archivo);
     ObjectInputStream ois= new ObjectInputStream(fis);
     lista = (ArrayList<ConvenioMacro>)ois.readObject();
     
     return lista;   
    }
    
}
