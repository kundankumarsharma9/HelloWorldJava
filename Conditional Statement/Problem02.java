import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Problem02 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the year to check if it's a leap year or not:");
        String str = br.readLine();
        int year = Integer.parseInt(str);

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year: " + year);
        } else {
            System.out.println("Not a Leap Year: " + year);
        }
    }
}
