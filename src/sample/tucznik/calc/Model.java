package sample.tucznik.calc;

public class Model {
    public static long calculate(long number1, long number2, String operator)
    {
        switch(operator)
        {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if(number2==0)
                    return 0;
                return number1 / number2;
        }
        System.out.println("Nieznany operator -" + operator);
        return 0;
    }
}
