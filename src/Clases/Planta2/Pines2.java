package Clases.Planta2;

import Clases.Main;
import static Clases.Main.pines2Producidos;
import Interfaces.Simulacion;
import java.util.concurrent.Semaphore;

public class Pines2 extends Thread{
    
    //Declaración de variables.
    Semaphore pines2;
    Semaphore pines2Mutex;
    Semaphore ensambladorPines2;
    int contratados = Main.pines2Contratados;
    int produccion = 2;
    int sueldo = 4;
    
    //Declaración del constructor.
    public Pines2 (Semaphore pines2, Semaphore pines2Mutex, Semaphore ensambladorPines2){
        this.pines2 = pines2;
        this.pines2Mutex = pines2Mutex;
        this.ensambladorPines2 = ensambladorPines2;
    }
    //Declaración de la ejecución/
    public void run(){
        while(true){
            try {
                pines2Mutex.acquire();
                    pines2.acquire();
                        Main.pines2Producidos ++;
                        Simulacion.pines2.setText(String.valueOf(Main.pines2Producidos));
                        Simulacion.pines2Progreso.setValue(pines2Producidos);
                    ensambladorPines2.release();
                pines2Mutex.release();
                Thread.sleep(Main.tiempo);
            } catch (Exception e) {
                System.out.println(e);
        }
        }
    }
}
