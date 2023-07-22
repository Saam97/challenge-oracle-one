/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alura;

/**
 *
 * @author pc
 */
public class Distancia extends Metodos{
    
    private double metros = 1;
    private double kilometros = 1000;
    private double millas = 1609.34;

    
    
    public double getMetros() {
        return metros;
    }

    public double getKilometros() {
        return kilometros;
    }

    public double getMillas() {
        return millas;
    }
    

    public double MetrosKilometros(double cantidad) {
        return cantidad / getKilometros();
    }

    public double MetrosMillas(double cantidad) {
        return cantidad / getMillas();
    }

    public double KilometrosMetros(double cantidad) {
        return cantidad * getKilometros();
    }

    public double KilometroAMillas(double cantidad) {
        return cantidad / (getMillas()/getKilometros());
    }
    
    public  double MillasMetros(double cantidad){
        return cantidad * getMillas();
    }
    
    public  double MillasKilometros(double cantidad){
        return cantidad / (getMillas()/getKilometros());
    }    
}
