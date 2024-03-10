import java.util.Scanner;
class Simple_IF{
public static void main(String args[]){
System.out.print("Enter the Number:");
Scanner sc = new Scanner(System.in);
int FirstNumber = sc.nextInt();
int SecondNumber = sc.nextInt();
if(FirstNumber < SecondNumber){
System.out.println("First Number is Greater then Second Number :"+FirstNumber);
}
System.out.println("Second Number is Greater then First Number :"+SecondNumber);
}
}