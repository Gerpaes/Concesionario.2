/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percistencia;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import modelo.Vehiculo;

/**
 *
 * @author Estudio-Trabajo
 */
public class FicheroVhiculos {
    
   private static String rutaArchivo = "data/vehiculos.txt";

    public FicheroVhiculos() {
       
    }
    
public static void guardar(ArrayList<Vehiculo> vehiculos) {
    // 1. Crear carpeta si no existe
    File carpeta = new File("data");
    if (!carpeta.exists()) carpeta.mkdirs();

   

    // 2. Usar try-with-resources (esto cierra el archivo automáticamente y guarda los datos)
    try (BufferedWriter out = new BufferedWriter(new FileWriter(rutaArchivo))) {
        
        for (Vehiculo v : vehiculos) {
            String linea = v.getMatricula() + ";" + v.getMarca() + ";" + 
                           v.getModelo() + ";" + v.getPrecio() + ";" + v.getTipo();
            out.write(linea);
            out.newLine();
        }
        
        // Forzamos que los datos salgan de la memoria al disco
        out.flush(); 
        System.out.println("¡Datos escritos correctamente!");

    } catch (IOException e) {
        System.out.println("Error de escritura: " + e.getMessage());
    }
}

public static ArrayList<Vehiculo> cargar() {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        
        // Verificación de seguridad
        if (rutaArchivo == null) {
            System.out.println("Error: No se ha definido la ruta del archivo.");
            return vehiculos;
        }

        File archivo = new File(rutaArchivo);
        if (!archivo.exists()) return vehiculos;

        try (BufferedReader in = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = in.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;
                String[] datos = linea.split(";");
                if (datos.length >= 5) {
                    vehiculos.add(new Vehiculo(
                        datos[0].trim(), 
                        datos[1].trim(), 
                        datos[2].trim(), 
                        Double.parseDouble(datos[3].trim()), 
                        datos[4].trim()
                    ));
                }
            }
        } catch (Exception e) {
            System.out.println("Error al cargar: " + e.getMessage());
        }
        return vehiculos;
    }

}
