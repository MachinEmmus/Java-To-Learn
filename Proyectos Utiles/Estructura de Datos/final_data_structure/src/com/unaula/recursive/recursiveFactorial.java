package com.unaula.recursive;

public class recursiveFactorial {

    private double Factorial;
    private final int NUMEROMENOSUNO = -1;
    private final int NUMEROUNO = 1;
    private final int NUMEROCERO = 0;


    public recursiveFactorial(){
        Factorial = 0;
    }

    public double calcFactRecur(int number){

        if(validate(number)){
            System.out.println("El número: "+ number + " es incorrecto" );
            return NUMEROMENOSUNO;
        }
        if (number == NUMEROCERO){
            return NUMEROUNO;
        }
            Factorial = number * (calcFactRecur(number -1));
            return Factorial;
    }

    private boolean validate(int Number){
        return (Number <0);
    }
}
