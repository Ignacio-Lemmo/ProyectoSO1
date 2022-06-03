/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.Planta1;

import Clases.Main;
import Interfaces.Planta1;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author mvlop
 */
public class Gerente1 extends Thread{
    Semaphore mutex;
    public static int salary = 180;
    String work = "Trabajando";
    String watch = "Vigilando";
    String wait = "Esperando";
    Boolean go = true;

    public Gerente1(Semaphore mutex) {
        this.mutex = mutex;
}

    public void run() {
        while (go){
            int count = 0;
            try {
                int randomNum = ThreadLocalRandom.current().nextInt(12, 18 + 1);
                mutex.acquire();
                if (Main.diasRestantes <= 0){
                    //acquire
                    mutex.acquire();
                    //settea el texto
                    Planta1.gerente1.setText(work);
                    Main.producidos1 = 0;
                    Main.ganancias1 = 0;
                    Planta1.ganancia1.setText(String.valueOf(0));
                    Planta1.producidos1.setText(String.valueOf(0));
                    //release
                    mutex.release();
                    
                } else {
                    //release
                    mutex.release();
                    
                    while (randomNum > count) {
                        int randomNum2 = ThreadLocalRandom.current().nextInt(30, 90 + 1);
                        double watching = (Main.tiempo/24) * (randomNum2/60);
                        
                        Planta1.gerente1.setText(watch);
                        if (Main.jefe1Estado == 1) {
                            Main.jefe1Gastos -=2;
                            Main.jefe1Pilladas +=1;
                            Planta1.pilladas2.setText(String.valueOf(Main.jefe1Pilladas));
                        }
                        Thread.sleep(Math.round(watching));
                        Planta1.gerente1.setText(wait);
                        Thread.sleep(Math.round(watching));
                        count += (watching/60);
                    }
                    
                }
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}

