import java.util.Scanner;

public class Duke {

    public static void messageWithHorizontalLines(String message) {
        System.out.println("____________________________________________________________\n" +
                           message + "\n" +
                           "____________________________________________________________");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String botName = "Hammy";
        String welcomeStr = " Hello! I'm " + botName + "\n What can I do for you?";
        String byeStr = "Bye. Hope to see you again soon!";

        System.out.println(welcomeStr);
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("bye")) {
                // If the user enters "bye", exit the loop and say goodbye
                messageWithHorizontalLines(" Bye. Hope to see you again soon!");
                break;
            } else {
                // For any other input, just display it
                messageWithHorizontalLines(" " + userInput);
            }
        }

        scanner.close();
    }
}
