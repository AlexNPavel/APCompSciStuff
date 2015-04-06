import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	static ExecutorService pool;
	static int cores;
	static int[] myStuff;
	static int[] temp;
	static long time;

	public static void main(String[] args) {
		int arraySize = 20000000;
		myStuff = new int[arraySize];
		temp = new int[arraySize];
		int maxInt = Integer.MAX_VALUE;
		for (int i = 0; i < myStuff.length; i++) {
			myStuff[i] = new Random().nextInt(maxInt);
		}
//		System.out.println("Initial array "+Arrays.toString(myStuff));
		cores = Runtime.getRuntime().availableProcessors();

		time = System.currentTimeMillis();
		pool = Executors.newFixedThreadPool(cores);
		for (int i = 0; i < cores; i++) {
//			System.out.println("Array From " + i * (arraySize / cores) + " to " + ((i + 1) * (arraySize / cores) - 1));
			pool.execute(new Merge(myStuff, i * (arraySize / cores), ((i + 1) * (arraySize / cores) - 1), true, temp));
		}
		pool.shutdown();
		try {
			pool.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (cores /= 2; cores >= 1; cores /= 2) {
			pool = Executors.newFixedThreadPool(cores);
			for (int i = 0; i < cores; i++) {
//				System.out.println("Array From " + i * (arraySize / cores) + " to " + ((i + 1) * (arraySize / cores) - 1));
				pool.execute(new Merge(myStuff, i * (arraySize / cores), ((i + 1) * (arraySize / cores) - 1), false, temp));
			}
			pool.shutdown();
			try {
				pool.awaitTermination(1, TimeUnit.DAYS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("First Time: " + (System.currentTimeMillis() - time));
//		System.out.println("New array "+Arrays.toString(myStuff));
		for (int i = 0; i < myStuff.length; i++) {
			myStuff[i] = new Random().nextInt(maxInt);
		}
//		System.out.println("Initial array "+Arrays.toString(myStuff));
		time = System.currentTimeMillis();
		pool = Executors.newFixedThreadPool(1);
		pool.execute(new Merge(myStuff, 0, arraySize - 1, true, temp));
		pool.shutdown();
		try {
			pool.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Second Time: " + (System.currentTimeMillis() - time));
//		System.out.println("New array "+Arrays.toString(myStuff));
	}

}
