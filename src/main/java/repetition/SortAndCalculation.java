package repetition;

public class SortAndCalculation {
    public static void main(String[] args) {
        int[] array = new int[]{9, 3, 4, 6, 2, 11, 33, 2};
    }

    //TODO: Implementiere ohne im Skript nachzuschauen einen eigenen Sortieralgorithmus,
    //      der ein beliebiges Array aus Ganzzahlen korrekt sortiert.
    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int tempNumber = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tempNumber;
        }
    }

    //TODO: Implementiere einen Algorithmus, der aus einem übergebenen Array den Median findet. Der Median ist der
    //      mittlere Wert einer sortierten Liste. Enthält die Liste eine gerade Anzahl von Elementen, so entspricht
    //      der Median dem Durchschnitt der mittleren beiden Elemente.
    public static double calculateMedian(int[] array){
        sort(array);
        if (array.length % 2 == 1){
            return array[array.length/2];
        }
        else {
            return (array[array.length/2-1] + array[array.length/2])/2.0;
        }
    }


    //TODO: Implementiere einen Algorithmus, der die Spannweite des übergebenen Arrays berechnet. Die Methode soll
    //      also zurückgeben, wie viel zwischen der höchsten und tiefsten Zahl im Array liegt.
    public static double calculateRange(int[] array){
        sort(array);
        return array[array.length-1] - array[0];
    }
}
