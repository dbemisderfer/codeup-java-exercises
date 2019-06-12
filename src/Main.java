public class Main {
    public static void main(String[] args) {
        int[][] primes = new int[3][3];
        primes[2][2] = 1;

        for (int[] prime : primes) {
            System.out.println("+---+---+---+");
            System.out.print("| ");
            for (int num : prime) {
                System.out.print(num + " | ");
            }
            System.out.println();
        }
        System.out.println("+---+---+---+");

    }
}