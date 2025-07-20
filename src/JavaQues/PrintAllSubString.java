package JavaQues;
public class PrintAllSubString {
    public static void main(String[] args) {
        String str = "apex";
        printSubstrings(str);
    }

    public static void printSubstrings(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}