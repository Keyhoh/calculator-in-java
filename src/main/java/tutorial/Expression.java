package tutorial;

public class Expression {
    private Long a;
    private Long b;
    private String operator;

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

    public Long getA() {
        return a;
    }

    public void setA(Long a) {
        this.a = a;
    }

    public Long getB() {
        return b;
    }

    public void setB(Long b) {
        this.b = b;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
