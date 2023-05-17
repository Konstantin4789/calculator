import java.util.ArrayList;

public class Calculator {
    /*
     * TODO:
     *  1. определение многозначных чисел
     *  2. игнорирование "="*/

    private String line;
    private String[] operators = new String[]{"+", "-", "*", "/", "="};
    private ArrayList<String> symbols;

    public Calculator(String line) {
        this.line = line;
        symbols = new ArrayList<>();
        createArray();
    }

    private void createArray() {
    for ( int i = 0; i< line.length(); i++) {
        String number = "";
        String symbol = String.valueOf(line.charAt(i));
        if ( isNumber(symbol)) {
            number = number.concat(symbol);
        }
    }

//        int number1 = Integer.parseInt(symbols[0].getSymbolName()), number2;
//
//        for (int i = 1;i < symbols.length; i++) {
//            for (int j = 0;j < operators.length; j++) {
//                if (!symbols[i].getSymbolName().equals(operators[j])) {
////                    number2= Integer.parseInt(symbols[i].getSymbolName());
//                } else {
//                    exp(number1, symbols[i].getSymbolName(), Integer.parseInt(symbols[i + 1].getSymbolName()));
//                    i++;
//                }
//            }
//        }
    }

    boolean isNumber (String symbol) {
        for ( int i = 0; i < operators.length; i++) {
            if (symbol.equals(operators[i])) {
                return false;
            }
        }
        return true;
    }
    private void exp(int num1, String operator, int num2) {
        int result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        System.out.println(result);
    }
}
