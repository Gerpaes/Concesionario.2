/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author Estudio-Trabajo
 */
public class Vehiculo {
    
    private String matricula;
    
    private String marca;
    
    private String modelo;
    
    private double precio;
    
    private String tipo;

    public Vehiculo(String matricula, String marca, String modelo, double precio, String tipo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.tipo = tipo;
    }

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }
    
    

    /**
     * Get the value of tipo
     *
     * @return the value of tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Set the value of tipo
     *
     * @param tipo new value of tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    /**
     * Get the value of precio
     *
     * @return the value of precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Set the value of precio
     *
     * @param precio new value of precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }


    /**
     * Get the value of modelo
     *
     * @return the value of modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Set the value of modelo
     *
     * @param modelo new value of modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    /**
     * Get the value of marca
     *
     * @return the value of marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Set the value of marca
     *
     * @param marca new value of marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }


    /**
     * Get the value of matricula
     *
     * @return the value of matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Set the value of matricula
     *
     * @param matricula new value of matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "matricula= " + matricula + ", marca= " + marca + ", modelo= " + modelo + ", precio= " + precio + ", tipo= " + tipo + "\n";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        return Objects.equals(this.matricula, other.matricula);
    }
    
    

}
