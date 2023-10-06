import tools.RandomArrayGenerator;
import tools.StopWatch;

public class Main {

    public static void main(String[] args) {

        int mode = 2; // 1 = drucken, 2 = Stoppuhr
        int algorithm = 1; // 1 = SelectionSort, 2 = MergeSort //
        int arraySize = 1000; // Anzahl der zu sortierenden Zahlen

        int[] array = RandomArrayGenerator.generateRandomArray(arraySize);

        if (mode == 2){
            StopWatch.start();}

        switch (algorithm){

            case 1:
                System.out.println("Custom Sort");
                CustomSort.sort(array);
            case 2:
                System.out.println("Selection Sort");
                SelectionSort.sort(array);
                break;
            case 3:
                System.out.println("Merge Sort");
                MergeSort.sort(array, 0, array.length-1);
                break;
        }


        if (mode == 2) {
            StopWatch.stop();
        }

        if (mode == 1) {
            printArray(array);
        }

    }


    public static void printArray(int[] array){
        for (int i : array){
            System.out.println(i);
        }
    }
}
