/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.filacaminhoneiro;

import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class FilaCaminhoneiro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        
        Fila fila = new Fila(10);
        int op = 1;
        while (op != 4) {
            System.out.println("BEM VINDO A FILA DE CAMINHONEIROS");
            System.out.println("DIGITE A OPCAO DESEJADA:");
            System.out.println("1- CADASTRAR");
            System.out.println("2- ATENDER");
            System.out.println("3- MOSTRAR FILA");
            System.out.println("4- ENCERRAR APLICACAO");
            op = scan.nextInt();
            if (op == 1) {
                System.out.println("DIGITE O NOME DO MOTORISTA:");
                String nome = sc.nextLine();
                System.out.println("DIGITE A PLACA DO VEICULO");
                String placa = sc.nextLine();
                LocalTime hora = LocalTime.now();
                Caminhoneiro caminhoneiro = new Caminhoneiro(nome, placa, hora);
                fila.enqueue(caminhoneiro);
                 System.out.println(fila.toString());
            }
            if (op == 2) {
                fila.dequeue();
                 System.out.println(fila.toString());
            }
            if(op == 3){
                System.out.println(fila.toString());
            }
            if(op == 4){
                break;
            }
        }
    }

}
