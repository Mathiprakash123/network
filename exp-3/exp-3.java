import java.util.Scanner;

public class BitStuffing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the message:");
        String input = sc.nextLine();
        String stuffed = "";
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current == '1') {
                count++;
                stuffed += current;
            } else {
                stuffed += current;
                count = 0;
            }
            if (count == 5) {
                stuffed += '0';
                count = 0;
            }
        }
        System.out.println("Stuffed data: " + stuffed);

        String destuffed = "";
        count = 0;
        for (int i = 0; i < stuffed.length(); i++) {
            char current = stuffed.charAt(i);
            if (current == '1') {
                count++;
                destuffed += current;
            } else {
                destuffed += current;
                count = 0;
            }
            if (count == 5) {
                if (i + 2 < stuffed.length()) {
                    destuffed += stuffed.charAt(i + 2);
                } else {
                    destuffed += '1';
                }
                i += 2;
                count = 1;
            }
        }
        System.out.println("Destuffed data: " + destuffed);
    }
}