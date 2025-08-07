/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoevaluado2;

import javax.swing.JOptionPane;

/**
 *
 * @author Ana Virginia
 */
public class CasoEvaluado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hotel hotel = new Hotel (3,4);
        
        //Opcion de menu
        while (true) {            
            String opcion = JOptionPane.showInputDialog(
            "Menu del Hotel:\n"+
            "1.Ver habitaciones:\n"+
            "2.Modificar habitacion:\n"+
            "3.Ver resumen:\n"+
            "4.Salir"    
            );
            
            if (opcion== null || opcion.equals("4")) break;
            
            switch (opcion) {
                case "1":
                    hotel.mostrarHotel();
                    break;
                case "2":
                    try {
                        String numero = JOptionPane.showInputDialog("Numero De habitacion");
                        String tipo  = JOptionPane.showInputDialog("Nuevo tipo:");
                        double precio = Double.parseDouble(JOptionPane.showInputDialog("Nuevo precios:"));
                        String estado  = JOptionPane.showInputDialog("Nuevo estado (Libre/Ocupado/Sucia):");
                        Hotel.modificarHabitacion(numero, tipo, precio, estado);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error al ingresar datos.");
                    }
                    break;
                case "3":
                    resumenHotel();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
                    
                    
                    
                    
                    }
            
                    
                
            }
                
            
        }
        
        
        
        
        
        
    }
    

