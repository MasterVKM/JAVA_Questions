package JavaQues;
public class FirstNonRepeat {
    public static void main(String[] args) {
        String s = "vikaas";
        boolean found = false;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == current) 
                    count++;
            }

            if (count == 1) {
                System.out.println("First non-repeating character: " + current);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character found.");
        }
    }
}
