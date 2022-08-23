/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;
/**
 *
 * @author IFMaker
 */
public class Calculadora {
    
    //pla = 83,82 m usou 32.60
    
    private double pla = 83.82;
    private double abs = 99.94;
    
    
    private double kWh = 0.58;
    private double hora;
    private int potenciaFinder = 65;
    private int potenciaCore = 300;
    
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
    public double getPotenciaFinder(){
        return this.potenciaFinder;
    }

    private void setPotenciaFinder(int potencia){
        this.potenciaFinder = potencia;
    }
    public double getPotenciaCore(){
        return this.potenciaFinder;
    }

    private void setPotenciaCore(int potencia){
        this.potenciaFinder = potencia;
    }
    public void calcularEnergiaFinder(){
        setCustoEnergia(((this.potenciaFinder*this.hora)/1000)*kWh);
    }
    public void calcularEnergiaCore(){
        setCustoEnergia(((this.potenciaCore*this.hora)/1000)*kWh);
    }
    public void calcularPla(int peso, double metrospeca, double preco){
        double quantidade = this.pla*peso;
        double qtd = (metrospeca*100)/quantidade;
        setGastoFilamento(qtd);
        double ppeca = preco/(quantidade/metrospeca);
        setCustoFilamento(ppeca);
        
    }
    public void calcularAbs(int peso, double metrospeca, double preco){
        double quantidade = this.abs*peso;
        double qtd = (metrospeca*100)/quantidade;
        setGastoFilamento(qtd);
        double ppeca = preco/(quantidade/metrospeca);
        setCustoFilamento(ppeca);
        
    }
    
    
}