package tutorial;

import java.util.function.BiFunction;

public abstract class Calculator {
    private static final BiFunction<Long, Long, Long> add = (a, b) -> a + b;
    private static final BiFunction<Long, Long, Long> sub = (a, b) -> a - b;
    private static final BiFunction<Long, Long, Long> mul = (a, b) -> a * b;
    private static final BiFunction<Long, Long, Long> div = (a, b) -> (a - a % b) / b;

    /**
     * 計算式を計算する
     *
     * @param expression 計算式
     * @return Long
     */
    public static String calculate(Expression expression) {
        switch (expression.getOperator()) {
            case "+":
                return String.valueOf(add.apply(expression.getA(), expression.getB()));
            case "-":
                return String.valueOf(sub.apply(expression.getA(), expression.getB()));
            case "*":
                return String.valueOf(mul.apply(expression.getA(), expression.getB()));
            case "/":
                if(expression.getB() == 0){
                    return "E";
                }
                return String.valueOf(div.apply(expression.getA(), expression.getB()));
        }
        return "E";
    }
}
