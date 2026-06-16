import java.util.Scanner;

public class SplitText {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[] splitWords(String text) {
        int len = findLength(text);

        int words = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }

        int[] spaces = new int[words + 1];
        int index = 0;
        spaces[index++] = -1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaces[index++] = i;
            }
        }

        spaces[index] = len;

        String[] result = new String[words];

        for (int i = 0; i < words; i++) {
            String word = "";
            for (int j = spaces[i] + 1; j < spaces[i + 1]; j++) {
                word += text.charAt(j);
            }
            result[i] = word;
        }

        return result;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] userSplit = splitWords(text);
        String[] builtInSplit = text.split(" ");

        boolean result = compareArrays(userSplit, builtInSplit);

        System.out.println("Words from user-defined method:");
        for (String word : userSplit) {
            System.out.println(word);
        }

        System.out.println("Comparison Result: " + result);

        sc.close();
    }
}