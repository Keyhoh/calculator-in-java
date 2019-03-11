package tutorial;

public class Expression {
    private Integer a = 0;
    private Integer b = null;
    private String operator = null;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (a == null) return sb.toString();

        sb.append(a);
        if (operator == null) return sb.toString();

        sb.append(" ").append(operator);
        if (b == null) return sb.toString();

        sb.append(" ").append(b);
        return sb.toString();
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
