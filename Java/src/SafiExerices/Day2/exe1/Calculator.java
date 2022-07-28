package SafiExerices.Day2.exe1;

public class Calculator {
    private double num1;
    private double num2;

    Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    double add() {
        //write definition here
        return num1 + num2;
    }

    double subtract() {
        //write definition here

        return num2 - num1;
    }

    double multiply() {
        //write definition here

        return num1 * num2;
    }

    double divide() {
        //write definition here
        return num2 / num1;
    }
}
