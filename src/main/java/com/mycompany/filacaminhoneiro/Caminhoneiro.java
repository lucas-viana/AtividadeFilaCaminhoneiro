/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filacaminhoneiro;

import java.time.LocalTime;

/**
 *
 * @author lucas
 */
class Caminhoneiro {
    private String nome;
    private String placa;
    private LocalTime horarioChegada;

    public Caminhoneiro(String nome, String placa, LocalTime horarioChegada) {
        this.nome = nome;
        this.placa = placa;
        this.horarioChegada = horarioChegada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalTime getHorarioChegada() {
        return horarioChegada;
    }

    public void setHorarioChegada(LocalTime horarioChegada) {
        this.horarioChegada = horarioChegada;
    }

    @Override
    public String toString() {
        return "Caminhoneiro{" + "nome=" + nome + ", placa=" + placa + ", horarioChegada=" + horarioChegada.getHour()+":"+horarioChegada.getMinute()+":"+horarioChegada.getSecond()+ '}';
    }
}