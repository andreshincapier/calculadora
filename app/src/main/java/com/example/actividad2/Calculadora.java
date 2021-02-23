
package com.example.actividad2;

public class Calculadora {

    private int num1;
    private int num2;
    private float result;


    public float suma() {
        /**
         * Este metodo es el encargado efectuar la suma
         * @param num1 Este es el primer parametro para efecturar la suma
         * @param num2 Este es el segundo parametro para efecturar la suma
         * @return result retorna la suma de num1 y num2.
         */
        this.result = 0;
        this.result = this.num1 + this.num2;

        return this.result;
    }

    public float resta() {
        /**
         * Este metodo es el encargado efectuar la resta
         * @param num1 Este es el primer parametro para efecturar la resta
         * @param num2 Este es el segundo parametro para efecturar la resta
         * @return result retorna la resta de num1 y num2.
         */
        this.result = 0;
        this.result = this.num1 - this.num2;

        return this.result;
    }


    public float multiplicacion() {
        /**
         * Este metodo es el encargado efectuar la resta
         * @param num1 Este es el primer parametro para efecturar la resta
         * @param num2 Este es el segundo parametro para efecturar la resta
         * @return result retorna la resta de num1 y num2.
         */
        this.result = 0;
        this.result = this.num1 * this.num2;

        return this.result;
    }


    public float division() {
        /**
         * Este metodo es el encargado efectuar la division
         * @param num1 Este es el primer parametro para efecturar la division
         * @param num2 Este es el segundo parametro para efecturar la division
         * @return result retorna la division de num1 y num2.
         */

        this.result = 0;

        try {
            this.result = this.num1 / this.num2;

        } catch (ArithmeticException ex) {
            /** Se maneja la divicion por cero usando un catch ye el
             * ArithmeticException
             */
            System.out.println("No se acepta la divicion por cero ");
        }
        return result;
    }

    // Get y Set
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
}
