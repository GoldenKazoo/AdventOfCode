import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input"));
            String inputStr;
            int sum = 0, first = 0, last = 0;

            while ((inputStr = reader.readLine()) != null) {
                first = getFirstNumeric(inputStr);
                last = getLastNumeric(inputStr);
                sum += first * 10 + last;
            }

            System.out.println(sum);

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int getFirstNumeric(String inputStr) {
        for (char c : inputStr.toCharArray()) {
            if (Character.isDigit(c)) {
                return Character.getNumericValue(c);
            }
        }
        return 0; 
    }

    private static int getLastNumeric(String inputStr) {
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            char c = inputStr.charAt(i);
            if (Character.isDigit(c)) {
                return Character.getNumericValue(c);
            }
        }
        return 0; 
    }
}
