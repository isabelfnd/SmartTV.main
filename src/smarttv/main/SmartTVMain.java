/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smarttv.main;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class SmartTVMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner smart = new Scanner(System.in);
       int numero;
       
        do { 
        
        System.out.println("DISPOSITIVOS");
        System.out.println("Elige un dispositivo");
        System.out.println("1. Smart TV");
        System.out.println("2. Parlante Inteligente");
        System.out.println("3. Salir");
         numero = smart.nextInt();
        smart.nextLine();
        
        switch(numero){
            case 1:
                
            System.out.println("Ingrese el nombre de la marca del tv");
            String marca = smart.nextLine();
            
            SmartTV TV = new SmartTV(marca);
            
            System.out.println("_________________________________________________");
            System.out.println("Elija la opcion que desea realizar en control remoto:");
            System.out.println("1. Subir volumen");
            System.out.println("2. Bajar volumen");
            int n = smart.nextInt(); 
            smart.nextLine();
            
            switch(n){
               case 1:
                System.out.println("Ingrese el valor que desea aumentar:");
                int valorSubir = smart.nextInt();
                TV.subirVolumen(valorSubir);
                break;

                case 2:
                System.out.println("Ingrese el valor que desea disminuir:");
                int valorBajar = smart.nextInt();
                TV.bajarVolumen(valorBajar);
                break;           
                default:               
                System.out.println("Esta opcion no se encuentra disponible");
            break;    
            }
 System.out.println("_______________________________________________");     
 
            System.out.println("Elija la opcion que desea realizar en Conectividad:");
            System.out.println("1. conectar internet");
            System.out.println("2. desconectar internet");           
            int c = smart.nextInt();
            smart.nextLine();
            
            switch(c){
                case 1:
                TV.conectarInternet();
                break;
                case 2:
                TV.desconectarInternet();  
                break;
                default: 
                System.out.println("Esta opcion no se encuentra disponible");
            break;    
            }
            
 System.out.println("_______________________________________________");           
            System.out.println("Elija la opcion que desea realizar en Multimedia:");
            System.out.println("1. Reproduci contenido");
            System.out.println("2. Detener contenido");           
            int r = smart.nextInt();
            smart.nextLine();
            
             switch(r){
                case 1:
                TV.reproducir();
                break;
                case 2:
                TV.detener();              
                break;
                default:
                System.out.println("Esta opcion no se encuentra disponible");
                break;
             }
            
                break;
        
    case 2:
    
    System.out.println("Ingrese el nombre de la marca del Parlante");
    String Marca = smart.nextLine();            
    ParlanteInteligente parlante = new ParlanteInteligente(Marca);
            
            System.out.println("_________________________________________________");
            System.out.println("Elija la opcion que desea realizar en control remoto:");
            System.out.println("1. Subir volumne");
            System.out.println("2. Bajar volumen");
            int N = smart.nextInt(); 
            smart.nextLine();
            
            switch(N){
                case 1:
                System.out.println("Ingrese el valor que desea aumentar:");
                int valor3 = smart.nextInt();
                smart.nextLine();
                parlante.subirVolumen(valor3);
                break;
                
                case 2:
                System.out.println("Ingrese el valor que desea disminuir:");
                int valor2 = smart.nextInt();
                smart.nextLine();
                parlante.bajarVolumen(valor2);   
                break;
                
            }
            
            System.out.println("_______________________________________________");           
            System.out.println("Elija la opcion que desea realizar en Conectividad:");
            System.out.println("1. conectar internet");
            System.out.println("2. desconectar internet");           
            int C = smart.nextInt();
            smart.nextLine();
            
            switch(C){
                case 1:
                parlante.conectarInternet();
                break;
                case 2:
                parlante.desconectarInternet();
                break;                
            } 
            break;
    case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            } 
        } 
         while(numero != 3);
        }

}


