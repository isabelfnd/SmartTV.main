/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smarttv.main;

/**
 *
 * @author PERSONAL
 */
public class SmartTV implements Conectividad, controlRemoto, Multimedia {
    private String marca;
    private int volumen;
    private boolean conectarInternet;
  
    
    public SmartTV(String marca){
        this.marca = marca;
        this.volumen =15;
        this.conectarInternet= false;
            
    }

    @Override
    public void conectarInternet() {
        conectarInternet = true;
    System.out.println("El tv "+ marca+" se encuentra conectado");
    }

    @Override
    public void desconectarInternet() {
        conectarInternet = false;
        System.out.println("El tv "+marca+" se encuentra desconetado");
         }

    

    @Override
    public void reproducir() {
        System.out.println("El tv "+marca+" se encuentra reproduciendo la multimedia");
    }

    @Override
    public void detener() {
        System.out.println("El tv "+marca+" a detenido la multimedia");
 }

    @Override
    public void subirVolumen(int valor) {
      volumen += valor; 
    System.out.println("El volumen actual es: " + volumen);
}

    @Override
    public void bajarVolumen(int valor) {
       if (volumen - valor >= 0) {
        volumen -= valor;
    } else {
        System.out.println("No se puede reducir más el volumen");
    }
    System.out.println("El volumen actual es: " + volumen);
}
}
