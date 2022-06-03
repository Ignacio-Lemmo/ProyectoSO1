package Clases.Planta1;

import Clases.Main;
import Interfaces.Planta1;
import java.util.concurrent.Semaphore;

public class Ensambladores1 extends Thread{
  
    public static volatile Semaphore pantallas1em;
    public static volatile Semaphore botones1em;
    public static volatile Semaphore pines1em;
    public static volatile Semaphore camaras1em;
    
    public static volatile Semaphore pantallas1mut;
    public static volatile Semaphore botones1mut;
    public static volatile Semaphore pines1mut;
    public static volatile Semaphore camaras1mut;
    
    public static volatile Semaphore pantallas1prod;
    public static volatile Semaphore botones1prod;
    public static volatile Semaphore pines1prod;
    public static volatile Semaphore camaras1prod;
    
    public static volatile Semaphore ensamblador1mut;
    int contratados = Main.ensambladores1;
    double produccion = 1/2f;
    public static int sueldo = 5;
    boolean contratado = true;
    
    public Ensambladores1(Semaphore pantallas1em, Semaphore botones1em, Semaphore pines1em, Semaphore camaras1em, Semaphore pantallas1mut, Semaphore botones1mut, Semaphore pines1mut, Semaphore camaras1mut, Semaphore pantallas1prod, Semaphore botones1prod, Semaphore pines1prod, Semaphore camaras1prod, Semaphore ensamblador1mut){
        this.pantallas1em = pantallas1em;
        this.botones1em = botones1em;
        this.pines1em = pines1em;
        this.camaras1em = camaras1em;

        this.pantallas1mut = pantallas1mut;
        this.botones1mut = botones1mut;
        this.pines1mut = pines1mut;
        this.camaras1mut = camaras1mut;

        this.pantallas1prod = pantallas1prod;
        this.botones1prod = botones1prod;
        this.pines1prod = pines1prod;
        this.camaras1prod = camaras1prod;
        
        this.ensamblador1mut = ensamblador1mut;
    }    
 
    public void setContratado(boolean setter){
        contratado = setter;
    }

//Xperia 10 IV: 3 cámaras, 1 pantalla, 4 botones ➔ costo: 900$
    
    public void run(){
        while(contratado == true){
            try{
               if(contratados > 0){
                   // dependera del modelo del telefono
                   pantallas1em.acquire(1);
                   botones1em.acquire(4);
                   pines1em.acquire(1);
                   camaras1em.acquire(3);
                   
                   /////////
                   pantallas1mut.acquire();
                   
                   Main.pantallas1Producidas --;
                   
                   pantallas1mut.release();
                   /////////
                   
                   pantallas1prod.release(1);
                   botones1mut.acquire();
                   
                   Main.botones1Producidos -=4;
                   botones1mut.release();
                   botones1prod.release(4);
                   
                   pines1mut.release();
                   Main.pines1Producidos --;
                   
                   pines1mut.release();
                   pines1prod.release(1);
                   
                   camaras1mut.acquire();
                   Main.camaras1Producidas -=3;
                   
                   camaras1mut.release();
                   camaras1prod.release(3);
                   
                   Thread.sleep(Math.round(Main.tiempo/(produccion)));
                   
                   ensamblador1mut.acquire();
                   
                   Main.producidos1 ++;
                   Main.producidos1Total ++;
                   
                   //ganancias 
                   
                   Main.ganancias += 900;
                   Main.gananciaTotal += 900;
                   
                   //setters de texto
                   
                   Planta1.producidos1.setText(String.valueOf(Main.producidos1));
                   Planta1.producidos1Total.setText(String.valueOf(Main.producidos1Total));
                   Planta1.ganancia1.setText(String.valueOf(Main.ganancias));
                   Planta1.gananciaTotal1.setText(String.valueOf(Main.ganancias));
                   
                   //release del mut del ensamblador
                   
                   ensamblador1mut.release();
                   
               }
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }    


    
    
}
