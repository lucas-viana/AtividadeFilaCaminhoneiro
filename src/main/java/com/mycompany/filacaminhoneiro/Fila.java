/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filacaminhoneiro;

/**
 *
 * @author lucas
 */
public class Fila {

    private int inicio;
    private int fim;
    private int qtd;
    private Object[] elementos;

    public Fila(int tamanho) {
        this.inicio = 0;
        this.fim = -1;
        this.qtd = 0;
        this.elementos = new Object[tamanho];
    }

    public boolean isFull() {
        return this.fim == this.elementos.length-1;
    }

    public boolean enqueue(Object elemento) {
        if (!isFull()) {
            if (this.fim == this.elementos.length - 1) {
                this.fim = 0;
            }else{
            this.fim++;
            }
            this.elementos[this.fim] = elemento;
            this.qtd++;
            return true;
        } else {
            System.out.println("A fila está cheia, atenda alguem para desocupar");
        }
        return false;
    }

    public Object dequeue() {
        Object elemento = this.elementos[this.inicio];
        if (this.inicio == this.elementos.length-1) {
           this.inicio=0;
        } else {
            this.inicio++;
        }
        this.qtd--;
        return elemento;
    }

    public boolean isEmpty() {
        return this.qtd == 0;
    }

    public Object first() {
        return this.elementos[this.inicio];
    }

    public Object last() {
        return this.elementos[this.fim];
    }

    @Override
    public String toString() {
        String elementosFila = "";
        int i = this.inicio;
        for (int cont = 0; cont < this.qtd; cont++) {
            elementosFila+= this.elementos[i] +" |";
            if(i == this.elementos.length-1){
                i=0;
            }else{
                i++;
            }
        }
        return elementosFila;
    }
}
