package Clases.Planta2;

import Clases.Main;
import static Clases.Main.camaras2Producidas;
import Interfaces.Simulacion;
import java.util.concurrent.Semaphore;

public class Camaras2 extends Thread {
    //Declaración de variables.
    Semaphore camaras2;
    Semaphore camaras2Mutex;
    Semaphore ensambladorCamaras2;
    int contratados = Main.camaras2Contratados;
    int produccion = 2;
    int sueldo = 4;
    
    //Declaración del constructor.
    public Camaras2 (Semaphore camaras2, Semaphore camaras2Mutex, Semaphore ensambladorCamaras2){
        this.camaras2 = camaras2;
        this.camaras2Mutex = camaras2Mutex;
        this.ensambladorCamaras2 = ensambladorCamaras2;
    }
    //Declaración de la ejecución.
    public void run(){
        while(true){
            try {
                camaras2Mutex.acquire();
                    camaras2.acquire();
                        Main.camaras2Producidas ++;
                        Simulacion.camaras2.setText(String.valueOf(Main.camaras2Producidas));
                        Simulacion.camaras2Progreso.setValue(camaras2Producidas);
                    ensambladorCamaras2.release();
                camaras2Mutex.release();
                Thread.sleep(Main.tiempo);
            } catch (Exception e) {
                System.out.println(e);
        }
        }
    }
}
