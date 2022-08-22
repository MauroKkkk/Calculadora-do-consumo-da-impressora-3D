/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetos.main;
/**
 *
 * @author IFMaker
 */
public class Calculadora {
    
    //pla = 83,82 m usou 32.60
    
    private double pla = 83.82;
    private double abs = 99.94;
    private double regra3;
    
    
    private double kWh = 0.58;
    private double hora = 2;
    private int potencia = 65;
    
    private double custoEnergia;
    private double custoFilamento;
    private double gastoFilamento;

    public void setCustoFilamento(double custoFilamento){
        this.custoFilamento = custoFilamento;
    }
    public double getCustoFilamento(){
        return this.custoFilamento;
    }
    public void setGastoFilamento(double gastoFilamento){
        this.gastoFilamento = gastoFilamento;
    }
    public double getGastoFilamento(){
        return this.gastoFilamento;
    }
    
    public double getKWh(){
        return this.kWh;
    }
    public void setKWh(double kWh){
        this.kWh = kWh;
    }
    public double getRegra3(){
        return this.regra3;
    }
    public void setRegra3(double regra3){
        this.regra3 = regra3;
    }
    
    public double getPla(){
        return this.pla;
    }
    
    public void setPla(double pla){
        this.pla = pla;
    }
    
    public double getAbs(){
        return this.abs;
    }
    
    public void setAbs(double abs){
        this.abs = abs;
    }
    
    public double getHora(){
        return this.hora;
    }

    public void setHora(double hora){
        this.hora = hora;
    }

    public double getCustoEnergia(){
        return this.custoEnergia;
    }

    private void setCustoEnergia(double custoEnergia){
        this.custoEnergia = custoEnergia;
    }
    public double getPotencia(){
        return this.potencia;
    }

    private void setPotencia(int potencia){
        this.potencia = potencia;
    }
    public double calcularEnergia(){
        
        custoEnergia = ((potencia*hora)/1000)*kWh;
        
        return this.custoEnergia;
    }
    public double calcularAbs(int peso){
        double quantidade = this.abs * peso;
        System.out.println(quantidade);
        return this.custoFilamento;
    }
    public double calcularPla(int peso, double preco){
        double quantidade = this.pla*peso;
        //double qtd = regraDe3(quantidade);
       custoFilamento = 10;
        return this.custoFilamento;
    }
    
    public void regraDe3(double x, double y){
        setRegra3((x*y)/100);
    }
    
    
}