/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.util.ArrayList;
import modelo.MatriculaExcepcion;
import modelo.Vehiculo;
import percistencia.FicheroVhiculos;


/**
 *
 * @author Estudio-Trabajo
 */
public class Concesionario {
   public static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    
    
public static void insertarVehiculo(Vehiculo v) throws MatriculaExcepcion{
    for(Vehiculo ve : vehiculos){
    if(ve.getMatricula().equalsIgnoreCase(v.getMatricula())){
    throw  new MatriculaExcepcion("La matricula ya existe");
    }
    }
    vehiculos.add(v);
    FicheroVhiculos.guardar(vehiculos);
    }
    
   

public static Vehiculo buscarVehiculo(String matricula) throws Exception{
    
    for(Vehiculo v : vehiculos){
        
      if(v.getMatricula().equalsIgnoreCase(matricula)){
          
        return  v;
      }
    }
    throw new Exception("No Existe ningin coche con esa Matricula");
    
}

public static void eliminarVehiculo(String matricula) throws MatriculaExcepcion{
    
    for(Vehiculo v : vehiculos){
        
      if(v.getMatricula().equals(matricula)){
          vehiculos.remove(v);
        FicheroVhiculos.guardar(vehiculos);
        return;  
      }
    }
    throw new MatriculaExcepcion("No Existe ningin coche con esa Matricula");
}

public static ArrayList<Vehiculo> listarVehiculos() throws MatriculaExcepcion{
    if(vehiculos != null){
//    FicheroVhiculos.cargar(vehiculos);
    return vehiculos;
    }
    throw new MatriculaExcepcion("La lista esta vacia");
}
}


