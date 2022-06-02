/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.Planta1;

import java.util.concurrent.Semaphore;

/**
 *
 * @author mvlop
 */
public class Gerente1 {
    Semaphore mutex;
    int tiempoVerificar;
    String name;
    int diasParaDespachar;
    Semaphore mutexEscritorios;    
}
