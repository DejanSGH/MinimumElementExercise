import java.util.Scanner;

public class MinimumElement {

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int number){

        int counter = 0;
        int[] myArray = new int[number];

        Scanner scanner = new Scanner(System.in);

        while (counter < myArray.length) {
            boolean hasNextInt = scanner.hasNextInt();
            for (int i = 0; i < myArray.length; i++) {
                if (hasNextInt) {
                    myArray[i] = scanner.nextInt();
                    counter++;
                } else {
                    System.out.println("Invalid input");
                }
                scanner.nextLine();
            }
        }
        scanner.close();
        return myArray;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
            }

        }
        return min;
    }
}
