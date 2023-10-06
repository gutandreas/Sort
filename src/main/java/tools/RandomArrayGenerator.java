package tools;

import java.util.Random;

public class RandomArrayGenerator {


    public static int[] generateRandomArray(int size) {
        int[] randomArray = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            randomArray[i] = random.nextInt(1000000);
        }

        return randomArray;
    }
}