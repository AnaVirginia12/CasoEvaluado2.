/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado2;

/**
 *
 * @author Ana Virginia
 */
public class Habitacion {
    
    //Creo las variables
    private String numero;  //Numero de Hapitacion 
    private String tipo;    //Tipo simple o doble 
    private double precio;  //Precio por noche  
    private String estado; // Estado:"Libre", "Ocupada", "Sucia"
    
    
    //Constructores para iniciar los datos de la habitacion 
    public Habitacion(String numero, String tipo, double precio, String estado) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
        this.estado = estado;   
    }   
    
    
    //Metodos 
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
   //Metodo para mostrar la informacion 
    public String mostrar() {
        return "Habitación " + numero + " - " + tipo + " - $" + precio + " - " + estado;
    }
   
    
}
