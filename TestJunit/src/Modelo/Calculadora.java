/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author saita
 */
public class Calculadora {
    
    private int num1;
    private int num2;

    public Calculadora() {
    }

    public Calculadora(int num1, int num2) {
       
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    
    public int Sumar(){
        return this.num1+this.num2;
    }
    public int Restar(){
        return this.num1-this.num2;
    }
    public int Multiplicar(){
        return this.num1*this.num2;
    }
    public int Dividir(){
        return this.num1/this.num2;
    }

    
}
