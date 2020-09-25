package co.edu.unaula.recursion;

public class calculatePotencia {

    private double exponent;
    private double answer;
    private final double ONE = 1;
    private final double ZERO = 0;

    public calculatePotencia(){
        answer = ZERO;
    }

    private boolean validate(){
        return (exponent < ZERO);
    }

    public double calPorRec(double exponent) {
        if (validate()) {
            System.out.println("El exponente es incorrecto");
            return -1;
        }

        if (exponent == ZERO) {
            return ONE;
        }
        answer = 2 * calPorRec(exponent - ONE);
        return answer;
    }
}
