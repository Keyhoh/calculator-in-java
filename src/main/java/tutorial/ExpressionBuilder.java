package tutorial;

import java.lang.reflect.InvocationTargetException;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/**
 * 計算式を組み立てるクラス
 */
public class ExpressionBuilder {
    private Expression expression = new Expression();
    private final Predicate<String> IS_NUMBER = Pattern.compile("-?\\d{0,9}").asMatchPredicate();
    private final Predicate<String> IS_OPERATOR = Pattern.compile("[+\\-*/]").asMatchPredicate();

    /**
     * 計算式を初期化する
     *
     * @param a 初期化する値
     */
    public void init(Long a) {
        expression.setA(a);
        expression.setB(null);
        expression.setOperator(null);
    }

    /**
     * 計算式を初期化する
     */
    public void init() {
        init(0L);
    }

    /**
     * 計算式を初期化する
     */
    public void init(String a) {
        if (IS_NUMBER.test(a)) {
            init(Long.valueOf(a));
        } else {
            init();
        }
    }

    /**
     * 入力値を使って計算式を組み立てる
     * 計算式が組み上がったらtrueを返す
     *
     * @param str キーボード入力値
     */
    public void composedOf(String str) {
        if (IS_OPERATOR.test(str)) {
            expression.setOperator(str);
        } else if (IS_NUMBER.test(str)) {
            Long i = Long.valueOf(str);
            if (expression.getOperator() == null) {
                expression.setA(i);
            } else {
                expression.setB(i);
            }
        }
    }

    public boolean isCalculable() {
        return expression.getB() != null;
    }

    public Expression build() {
        return this.expression;
    }
}
