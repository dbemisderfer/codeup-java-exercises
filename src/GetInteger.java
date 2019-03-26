import java.util.Scanner;
public class GetInteger {
    public static void main(String[] args) {
        getInteger(1, 10);
    }

    // Exercise 2
    public static int getInteger(int min, int max) {
        int output;
        Scanner sc = new Scanner(System.in);
        while(!sc.hasNextInt()){
            System.out.printf("Invalid input. Enter a valid integer between %d and %d: %n", min, max);
            sc.next();
        }
        output = sc.nextInt();
        if(output < min || output > max) {
            System.out.printf("Invalid range. Enter a valid integer between %d and %d: ", min, max);
            return getInteger(min, max);
        }
        return output;
    }
}
