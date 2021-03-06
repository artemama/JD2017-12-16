package by.it.patsko.calc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Parser {
    Var calc(String expression) throws CalcException {

        String[] operand = expression.split(Patterns.OPERATION);
        Var one = Var.createVar(operand[0]);
        Var two = Var.createVar(operand[1]);
        if (one == null || two == null)
            throw new CalcException(" Ошибка парсинга выражения: " + expression);

        //static final String OPERATION="[-+*/]";                             //операция
        Pattern operationPattern = Pattern.compile(Patterns.OPERATION);
        Matcher matcher = operationPattern.matcher(expression);
        if (matcher.find()) {
            String operation = matcher.group();
            switch (operation) {
                case "+":
                    return one.add(two);
                case "-":
                    return one.sub(two);
                case "*":
                    return one.mul(two);
                case "/":
                    return one.div(two);
                case "=":
                    return one.assign(two);

            }
        }
        return null;
    }
}
