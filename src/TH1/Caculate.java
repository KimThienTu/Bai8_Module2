package TH1;

public class Caculate {

    public static int Caculate (int firstOperand, int secondOperand, char operator){
        switch (operator){
            case '+':
                return firstOperand + secondOperand;
            case '-':
                return firstOperand - secondOperand;
            case '*':
                return firstOperand * secondOperand;
            case '/':
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by O");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
