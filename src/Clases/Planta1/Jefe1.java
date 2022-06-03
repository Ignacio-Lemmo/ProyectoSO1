/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.Planta1;

import Clases.Main;
import Interfaces.Planta1;
import java.util.concurrent.Semaphore;



/**
 *
 * @author mvlop
 */
public class Jefe1 extends Thread{    

    int horas;
    int cont;
    String work;
    String play;
    String check;
    Semaphore semJefe;
    boolean go = true;
    
    public Jefe1(Semaphore semJefe){
        this.semJefe = semJefe;
        this.work = "Trabajando";
        this.play = "Jugando";
        this.check = "Chequeando";
        this.horas = 24;
        this.cont = 7;

           
    }    
    
    public static int getGastos(int a, int b) {
        return a * b;
    }
    
    public static int getGananciasNetas(int a, int b, int c, int d, int g, int h) {
        return a+b+c+d+g+h;
    }
    
    
    
    public void run() {
        int tiempo = Main.tiempo;
        int contador = 0;
        
        while (go) {
            try {
                semJefe.acquire();
                /////
                Planta1.jefe1.setText(work);
                ///// como el jefe esta trabajando se settea el estado del jefe a 0
                
                Main.jefe1Estado = 0;
                
                //// se descuenta el tiempo
                
                Thread.sleep((tiempo/horas)*cont);
               
                //pasa un dia y se settea en interfaz el dia
                
                Main.dias++;
                Planta1.dias1.setText(String.valueOf(Main.dias));
                Main.diasRestantes--;
                Planta1.diasRestantes1.setText(String.valueOf(Main.diasRestantes));
                
                //se actualizan los gastos
                
                Main.botones1Gastos +=
                        getGastos(Clases.Planta1.Botones1.salary, Main.botones1Contratados);

                Main.pantallas1Gastos +=
                        getGastos(Clases.Planta1.Pantallas1.salary, Main.pantallas1Contratados);

                Main.pines1Gastos +=
                        getGastos(Clases.Planta1.Pines1.salary, Main.pines1Contratados);

                Main.camaras1Gastos +=
                        getGastos(Clases.Planta1.Camaras1.salary, Main.camaras1Contratados);  
                
                Main.ensambladores1Gastos +=
                        getGastos(Clases.Planta1.Ensambladores1.sueldo, Main.ensambladores1);
                
                Main.gerente1Gastos +=
                        Clases.Planta1.Gerente1.salary;
                
                
                Main.jefe1Gastos += 7;
                        
                
                
                /////me falta gerente
                
                //se settean en la interfaz
                
                Planta1.botones1Gastos.setText(String.valueOf(Main.botones1Gastos));
                Planta1.pantallas1Gastos.setText(String.valueOf(Main.pantallas1Gastos));
                Planta1.pines1Gastos.setText(String.valueOf(Main.pines1Gastos));
                Planta1.camaras1Gastos.setText(String.valueOf(Main.camaras1Gastos));
                Planta1.ensambladores1Gastos.setText(String.valueOf(Main.ensambladores1Gastos));
                Planta1.jefe1Gastos.setText(String.valueOf(Main.jefe1Gastos));
                Planta1.gerente1Gastos.setText(String.valueOf(Main.gerente1Gastos));
                
                
                
                
                Planta1.gananciasNetas1.setText(String.valueOf(Main.gananciaTotal - getGananciasNetas(Main.botones1Gastos, Main.pantallas1Gastos, Main.camaras1Gastos, Main.pines1Gastos, Main.jefe1Gastos, Main.gerente1Gastos)));
                
                // se hace release del sem
                
                semJefe.release();
                double timing = 14 * (tiempo/1000);  
                
                //Cuando el jefe no esta trabajando
                
                while (contador < 27) {
                    Planta1.jefe1.setText(play);
                    //se cambia el estado en el main
                    Main.jefe1Estado = 1;
                    Thread.sleep(Math.round(timing));
                    
                    
                    Planta1.jefe1.setText(check);
                    //se cambia cuando chequea
                    Main.jefe1Estado = 2;
                    Thread.sleep(Math.round(timing));
                    
                    contador +=1;
                    
                    
                }
                
            } catch (Exception e) {
                System.out.println(e);
        }
        }
    }
    
}