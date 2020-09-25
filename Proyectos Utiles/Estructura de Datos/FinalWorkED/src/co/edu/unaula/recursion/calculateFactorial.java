package co.edu.unaula.recursion;

public class calculateFactorial {

    private double Factorial;

    public calculateFactorial(){
        Factorial = 0;
    }

    public double calFacRec(int number){

        if(validate(number)){
            System.out.println("Número: "+ number + " es incorrecto");
            return -1;
        }
        if (number == 0){
            return 1;
        }
        Factorial = number * (calFacRec(number -1));
        return Factorial;
    }

    private boolean validate(int Number){
        return (Number <0);
    }
}
