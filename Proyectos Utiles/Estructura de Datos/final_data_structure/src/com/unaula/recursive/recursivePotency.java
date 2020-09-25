package com.unaula.recursive;

public class recursivePotency {

    private double exponent;
    private double result;
    private final double UNO = 1;
    private final double CERO = 0;
    private final double MENOSUNO = -1;

    public recursivePotency(){
        exponent = MENOSUNO;
        result = CERO;
    }

    public double calcRecurExpo(double exponent){
        if(exponent < CERO){
            System.out.println("El exponente es incorrecto");
            return MENOSUNO;
        }

        if(exponent == CERO){
            return UNO;
        }
        result = 2 * calcRecurExpo(exponent - UNO);
        return result;
    }
}
