package tutorial;

import java.io.PrintStream;
import java.util.Objects;
import java.util.Scanner;

public class MainThread implements Runnable {
    private Scanner sc = new Scanner(System.in);
    private PrintStream ps = new PrintStream(System.out);
    private CalculateController cc = new CalculateController();

    @Override
    public void run() {
        ps.println("Start Calculator!");
        ps.println("Enter 'q' if quit.");
        cc.init();
        while (true) {
            try {
                String in = sc.next();
                if (Objects.equals(in, "q")) {
                    break;
                }
                cc.input(in);
                ps.println("expression: " + cc.getExpression());
                if (cc.isCalculable()) {
                    String result = cc.calculate();
                    ps.println("result: " + result);
                    cc.init(result);
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
