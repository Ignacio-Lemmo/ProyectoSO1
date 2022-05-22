package Clases.Planta2;

import Clases.Main;
import static Clases.Main.pantallas2Producidas;
import Interfaces.Simulacion;
import java.util.concurrent.Semaphore;

public class Pantallas2 extends Thread{
    
    //Declaración de variables.
    Semaphore pantallas2;
    Semaphore pantallas2Mutex;
    Semaphore ensambladorPantallas2;
    int contratados = Main.pantallas2Contratados;
    int produccion = 2;
    int sueldo = 4;
    
    //Declaración del constructor.
    public Pantallas2 (Semaphore pantallas2, Semaphore pantallas2Mutex, Semaphore ensambladorPantallas2){
        this.pantallas2 = pantallas2;
        this.pantallas2Mutex = pantallas2Mutex;
        this.ensambladorPantallas2 = ensambladorPantallas2;
    }
    //Declaración de la ejecución/
    public void run(){
        while(true){
            try {
                pantallas2Mutex.acquire();
                    pantallas2.acquire();
                        Main.pantallas2Producidas ++;
                        Simulacion.pantallas2.setText(String.valueOf(Main.pantallas2Producidas));
                        Simulacion.pantallas2Progreso.setValue(pantallas2Producidas);
                    ensambladorPantallas2.release();
                pantallas2Mutex.release();
                Thread.sleep(Main.tiempo);
            } catch (Exception e) {
                System.out.println(e);
        }
        }
    }
}
