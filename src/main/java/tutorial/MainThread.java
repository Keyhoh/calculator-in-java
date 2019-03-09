package tutorial;

import java.util.Scanner;

public class MainThread extends Thread {
    @Override
    public void run() {
        var sc = new Scanner(System.in);
        System.out.println(sc.nextInt());
    }
}
