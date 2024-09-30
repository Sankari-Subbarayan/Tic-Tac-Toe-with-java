import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int bestSeed = -1;
        int bestMax = Integer.MAX_VALUE;

        // Iterate over each seed in the range [A, B]
        for (int seed = A; seed <= B; seed++) {
            Random random = new Random(seed);
            int currentMax = Integer.MIN_VALUE;

            // Generate N random numbers and find the maximum
            for (int i = 0; i < N; i++) {
                int randomNumber = random.nextInt(K);
                currentMax = Math.max(currentMax, randomNumber);
            }

            // Update the best seed if we found a better maximum
            if (currentMax < bestMax) {
                bestMax = currentMax;
                bestSeed = seed;
            } else if (currentMax == bestMax) {
                // If the maximum is the same, prefer the smaller seed
                bestSeed = Math.min(bestSeed, seed);
            }
        }

        // Output the best seed and its corresponding maximum
        System.out.println(bestSeed);
        System.out.println(bestMax);

        scanner.close();
    }
}
