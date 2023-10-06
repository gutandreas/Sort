package tools;

public class StopWatch {
    private static long startTime;

    public static void start() {
        startTime = System.currentTimeMillis();
    }

    public static void stop() {
        long endTime = System.currentTimeMillis();
        System.out.println("Dauer: " + (endTime - startTime) + " Millisekunden");
    }

}