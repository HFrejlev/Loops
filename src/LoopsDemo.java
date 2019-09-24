import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {

        //Counts up with 3
        for (int i=0; i<=100; i=i+3) {

            System.out.println(i);
        }
        //Counts up with 1
        for (int i=0; i<=10; i=i+1) {

            System.out.println(i);
        }
        //Counts down from -2 til -100
        for (int i=-2; i>=-1000; i=i-1) {

            System.out.println(i);
        }
        //Counts with 5 from 42-77
        for (int i=42; i<=77; i=i+5) {

            System.out.println(i);
        }

        //While loop
        int w = 0;
        while (w < 10) {
            w = w+1;
            System.out.println("Hi" + w);
        }

        Scanner scanner = new Scanner(System.in);
        String message;
        message="";

        //As long as message isn't exit, then read new messages
        while (!message.equals("exit")) {
            message = scanner.nextLine();
            System.out.println(message+message);
        }

        do {
            System.out.println("Something secret");
        } while (false);



    }
}
