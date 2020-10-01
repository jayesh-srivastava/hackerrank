import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] arr) {
        int sum=0;
        for(int x=0;x<arr.length;x++)
        {
            sum+=arr[x];
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(scanner.nextLine().trim());

        int[] arr = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arrItr = 0; arItr < arrCount; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            ar[arrItr] = arrItem;
        }

        int result = simpleArraySum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
