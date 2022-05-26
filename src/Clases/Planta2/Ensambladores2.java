package Clases.Planta2;

import Clases.Main;
import Interfaces.Simulacion;
import java.util.concurrent.Semaphore;

public class Ensambladores2 extends Thread{
    
    //Declariación de variables.
    Semaphore pantallas2Ensamblador;
    Semaphore botones2Ensamblador;
    Semaphore pines2Ensamblador;
    Semaphore camaras2Ensamblador;
    
    Semaphore pantallas2Mutex;
    Semaphore botones2Mutex;
    Semaphore pines2Mutex;
    Semaphore camaras2Mutex;
    
    Semaphore pantallas2Productor;
    Semaphore botones2Productor;
    Semaphore pines2Productor;
    Semaphore camaras2Productor;
    
    Semaphore ensamblador2Mutex;
    int contratados = Main.ensambladores2;
    double produccion = 1/2f;
    int sueldo = 6;
    
    //Declaración del constructor.
    public Ensambladores2(Semaphore pantallas2Ensamblador, Semaphore botones2Ensamblador, Semaphore pines2Ensamblador, Semaphore camaras2Ensamblador, Semaphore pantallas2Mutex, Semaphore botones2Mutex, Semaphore pines2Mutex, Semaphore camaras2Mutex, Semaphore pantallas2Productor, Semaphore botones2Productor, Semaphore pines2Productor, Semaphore camaras2Productor, Semaphore ensamblador2Mutex){
        this.pantallas2Ensamblador = pantallas2Ensamblador;
        this.botones2Ensamblador = botones2Ensamblador;
        this.pines2Ensamblador = pines2Ensamblador;
        this.camaras2Ensamblador = camaras2Ensamblador;

        this.pantallas2Mutex = pantallas2Mutex;
        this.botones2Mutex = botones2Mutex;
        this.pines2Mutex = pines2Mutex;
        this.camaras2Mutex = camaras2Mutex;

        this.pantallas2Productor = pantallas2Productor;
        this.botones2Productor = botones2Productor;
        this.pines2Productor = pines2Productor;
        this.camaras2Productor = camaras2Productor;
        
        this.ensamblador2Mutex = ensamblador2Mutex;
    }
    
    //Declaración de la ejecución.
    public void run(){
        while(true){
            try{
               if(contratados > 0){
                pantallas2Ensamblador.acquire(1);
                botones2Ensamblador.acquire(2);
                pines2Ensamblador.acquire(1);
                camaras2Ensamblador.acquire(2); 

                pantallas2Mutex.acquire();
                Main.pantallas2Producidas -= 1;
                pantallas2Mutex.release();
                pantallas2Productor.release(1);

                botones2Mutex.acquire();
                Main.botones2Producidos -= 2;
                botones2Mutex.release();
                botones2Productor.release(2);

                pines2Mutex.acquire();
                Main.pines2Producidos -= 1;
                pines2Mutex.release();
                pines2Productor.release(1);

                camaras2Mutex.acquire();
                Main.camaras2Producidas -= 2;
                camaras2Mutex.release();
                camaras2Productor.release(2);

                Thread.sleep(Math.round(Main.tiempo/(produccion)));

                ensamblador2Mutex.acquire();
                Main.producidos2 ++;
                Simulacion.producidos2.setText(String.valueOf(Main.producidos2));
                ensamblador2Mutex.release();
               }
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
