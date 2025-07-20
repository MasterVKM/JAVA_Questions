package JavaQues;
public class CountOccurrenceChar {
    public static void main(String[] args) {
        String s = "acha chalta hu";
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int count = 1;
            if (chars[i] == '0') continue; // Skip if already counted and marked

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    chars[j] = '0'; // mark as counted
                }
            }

            if (count > 1) {
                System.out.println("Duplicate char: '" + chars[i] + "' appears " + count + " times.");
            }
        }
    }
}
