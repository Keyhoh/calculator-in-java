package tutorial;

import java.io.PrintStream;
import java.util.Objects;
import java.util.Scanner;

public class MainThread implements Runnable {
    private Scanner sc = new Scanner(System.in);
    private PrintStream ps = new PrintStream(System.out);
    private ExpressionBuilder eb = new ExpressionBuilder();

    @Override
    public void run() {
        ps.println("Start Calculator!");
        ps.println("Enter 'q' if quit.");
        eb.init();
        while (true) {
            try {
                String in = sc.next();
                if (Objects.equals(in, "q")) {
                    break;
                }
                eb.composedOf(in);
                ps.println("expression: " + eb.build());
                if (eb.isCalculable()) {
                    String result = Calculator.calculate(eb.build());
                    ps.println("result: " + result);
                    eb.init(result);
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
                e.printStackTrace();
                break;
            }
        }
        ps.println("see you!");
    }
}
