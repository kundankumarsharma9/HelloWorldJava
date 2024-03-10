import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Problem03 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the Number to check Day: ");
        String str = br.readLine();
        int Days = Integer.parseInt(str);
        switch (Days) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday"); // Capitalized the 'F' in "Friday"
                break;
            case 6:
                System.out.println("Saturday"); // Corrected the typo from "Stausday" to "Saturday"
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not Found extra Days");
        }
    }
}
