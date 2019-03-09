package tutorial;

import java.util.Objects;
import java.util.Scanner;

public class MainThread implements Runnable {
    private Scanner sc = new Scanner(System.in);
    private StringBuilder sb = new StringBuilder();

    @Override
    public void run() {
        System.out.println( "Start Calculator!" );
        System.out.println("Enter 'q' if quit.");
        while(true){
            String input = sc.next();
            if(Objects.equals(input, "q")){
                break;
            }
            sb.append(input);
        }
        System.out.println(sb);
        System.out.println("see you!");
    }
}
