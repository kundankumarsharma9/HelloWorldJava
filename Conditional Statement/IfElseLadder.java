import java.util.Scanner;
class IfElseLadder{
public static void main(String args[]){
System.out.println("Enter the Number: ");
Scanner sc=new Scanner(System.in);
int a = sc.nextInt();
if(a>=90){
System.out.println("Section -> A");
}else if (a>=50 & a<=89){
System.out.println("Section -> B");
}else{
System.out.println("Section -> C");
}

}
}