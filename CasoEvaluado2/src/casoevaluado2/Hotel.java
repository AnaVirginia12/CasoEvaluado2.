/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado2;

import casoevaluado2.Habitacion;
import javax.swing.JOptionPane;

/**
 *
 * @author Ana Virginia
 */
public class Hotel {
    
//Clase que representa el hotel como una matriz de habitaciones
    
    private Habitacion[][] habitaciones; // Matriz de habitaciones
    
    //Constructor del hotel con cantidad de pisos y habitaciones por piso.
     public Hotel(int pisos, int habitacionesPorPiso) {
         habitaciones = new Habitacion[pisos]
         [habitacionesPorPiso];
         
         for (int i = 0; i < pisos; i++) {
             for (int j = 0; j <habitacionesPorPiso; j++) {
                 String numero= (i + 1) + "0" + (j + 1);
                 String tipo = (j % 2 == 0) ? "Simple" : "Doble";
                 double precio = tipo.equals("Simple") ? 40 : 60;
                 habitaciones[i][j] = new Habitacion(numero, tipo, precio, "Libre");  
             }  
         }                   
    }
     
    //Muestra todas las habitaciones del hotel 
     public void mostrarHotel(){
        String texto = "";
        for (Habitacion[] piso : habitaciones) {
            for (Habitacion h : piso) {
                texto += h.mostrar() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, texto);
    }
      
      //Permite modificar una habitación específica 
     public void modificarHabitacion(String numero) {
        for (Habitacion[] piso : habitaciones) {
            for (Habitacion h : piso) {
                if (h.getNumero().equals(numero)) {
                    String nuevoTipo = JOptionPane.showInputDialog("Nuevo tipo:");//El tipo
                    double nuevoPrecio = Double.parseDouble(JOptionPane.showInputDialog("Nuevo precio:")); //Mostra el precio nuevo
                    String nuevoEstado = JOptionPane.showInputDialog("Nuevo estado (Libre/Ocupada/Sucia):"); //Mostar el estado

                    h.setTipo(nuevoTipo);
                    h.setPrecio(nuevoPrecio);
                    h.setEstado(nuevoEstado);

                    JOptionPane.showMessageDialog(null, "Actualizado:\n" + h.mostrar());
                    return;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Habitación no encontrada.");
    }      
        
         //Genera un resumen con total de habitaciones por estado y ganancia actual.
        public void resumenHotel(){
            int libres = 0, ocupadas = 0, sucias = 0;
             double ganancia = 0;

        for (Habitacion[] piso : habitaciones) {
            for (Habitacion h : piso) {
                switch (h.getEstado()) {
                    case "Libre": libres++; break;
                    case "Ocupada": ocupadas++; ganancia += h.getPrecio(); break;
                    case "Sucia": sucias++; break;
                }
            }
        }
        int total = habitaciones.length * habitaciones[0].length;

        
        String resumenHotel = "Resumen del Hotel: \n"+
                "Libres:" + libres + "\n" +
                "Ocupadas:" + libres + "\n" +
                "Sucias:" + sucias + "\n" +
                "Total:" + total + "\n" +
                "Ganancia actual:  $" + ganancia;
        JOptionPane.showMessageDialog(null, resumenHotel);
                
                      

                
                
            
    }
       
 }        
        
        
    
     
     
       
     
     

