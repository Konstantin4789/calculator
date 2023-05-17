public class Calculator {
    private String line;
    private Symbol[] symbols;
    private static String[] operators = new String[] {"+", "-","*","/", "="};

    public  Calculator(String line) {
        this.line = line;

        createArray();
    }

    private void createArray() {
        symbols = new Symbol[line.length()];
        line.split(opera)

        for (int i = 0; i < line.length(); i++) {
            Symbol symbol = new Symbol(String.valueOf(line.charAt(i)), i);
            symbols[i] = symbol;
        }

        int number1 = Integer.parseInt(symbols[0].getSymbolName()), number2;

        for (int i = 1;i < symbols.length; i++) {
            for (int j = 0;j < operators.length; j++) {
                if (!symbols[i].getSymbolName().equals(operators[j])) {
//                    number2= Integer.parseInt(symbols[i].getSymbolName());
                } else {
                    exp(number1, symbols[i].getSymbolName(), Integer.parseInt(symbols[i + 1].getSymbolName()));
                    i++;
                }
            }
        }
    }

    private void exp(int num1, String operator, int num2) {
        int result = 0;
        switch (operator) {
            case "+": result = num1+num2;
            break;
            case "-": result = num1-num2;
            break;
            case "*" : result = num1*num2;
            break;
            case "/": result = num1/num2;
            break;
        }
        System.out.println(result);
    }
}
