/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen;

import java.util.Scanner;

/**
 *
 * @author diegd
 */
public class Examen {

    public static void main(String[] args) {
       double compu = Math.random();
       int juga, com;
       String jugador;
       Scanner captu = new Scanner(System.in);
        System.out.println("Elige entre Piedra = 1, Papel = 2 o Tijera = 3?");
        juga = captu.nextInt();
        
        if(juga <= 1)
            jugador = "Piedra";
        
        else
            jugador = "Papel";
        if( com > 0.5){
            System.out.println("Tu elegiste, "+jugador+" Tu oponente saco Piedra");
            com =+ 1;
        }
        else{
            System.out.println("Tu elegiste, "+jugador+" Tu oponente saco Papel");
            compu = 0;
            if(juga == com)
            System.out.println("Ganaste");
        else
            System.out.println("Perdiste");
        }
}
    }