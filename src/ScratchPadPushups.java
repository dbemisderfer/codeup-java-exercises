import java.util.ArrayList;
import java.util.Arrays;

public class ScratchPadPushups {
//    ArrayList<Integer> numbers = new ArrayList<>();
//    numbers.add(5);

//    private static boolean search(int[] array, int number) {
//        boolean found = false;
//        for (int i = 0; i < array.length; i +=1) {
//            if (array[i] == number) return true;
//        }
//        return found;
//    }

    private static boolean search(String[] array, String searchTerm) {
        boolean found = false;
        for (int i = 0; i < array.length; i +=1) {
            if (array[i].equalsIgnoreCase(searchTerm)) return true;
        }
        return found;
    }

    public static void main(String[] args) {
//        int[] numbers = {126, 4, 21, 12, 100008, 333, -42, 10, 007};
//        int lookingFor = 007;
//        System.out.println(search(numbers, lookingFor));

        String[] petNames = {"Brisket", "Faso", "Brody", "Pikachu", "Colt the Spitz", "Paco", "Gandalf"};
        String lostPet = "paco";
        System.out.println(search(petNames, lostPet));

//        System.out.println(Arrays.toString(numbers));
//        for (int i = 0; i < numbers.length; i +=1) {
//            System.out.println(numbers[i]);
//        }
//
//        for (int num : numbers) {
//
//            System.out.println(num);
//        }

    }
}
