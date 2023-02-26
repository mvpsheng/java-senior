import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.IntStream;

/**
 * FileName: Alice3
 * author: gxs
 * Date: 2023/2/10  18:04
 */
public class Alice3 {
    private static boolean isPrime(int number){
        for(int i = 2; i < (int)(number / 2) + 1; i++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
    private static int calculatePermutations(int n) {
        int[] necklace = IntStream.rangeClosed(1, n).toArray();
        int[] beads = IntStream.rangeClosed(1, n).toArray();

        int beadIndex = 1;

        boolean[] used = new boolean[necklace.length+1];
        used[0] = true;
        used[1] = true;

        return countBeadPermutations(necklace, beads, used, beadIndex);
    }
    private static int countBeadPermutations(int[] necklace, int[] beads, boolean[] used, int beadIndex) {
        if (beadIndex == necklace.length) {
            boolean isNecklaceValid = isValidPermutation(necklace);
            return isNecklaceValid ? 1 : 0;
        }


        if ((beadIndex > 1) &&
                (!isPrime(necklace[beadIndex-1] + necklace[beadIndex-2]))) {
            return 0;
        }


        int count = 0;
        boolean isEvenBead = beadIndex % 2 != 0;

        for (int i=(isEvenBead ? 1 : 0); i < necklace.length; i+=2) {
            if (used[beads[i]]) continue;

            necklace[beadIndex] = beads[i];
            used[beads[i]] = true;
            count += countBeadPermutations(necklace, beads, used, beadIndex+1);
            used[beads[i]] = false;
        }


        return count;
    }
    private static boolean isValidPermutation(int[] beads) {
        for (int i = 0; i < beads.length; i++) {
            int j = (i + 1) % beads.length;

            if (!isPrime(beads[i] + beads[j])) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            int count = calculatePermutations(n);
            System.out.println(count);
        }
    }
}
