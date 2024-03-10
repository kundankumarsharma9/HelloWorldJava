import java.util.Scanner;
class Problem01{
public static void main(String args[]){
System.out.println("Enter your Experience");
Scanner sc = new Scanner(System.in);
float a = sc.nextFloat();
if(a>=0 & a<=2){
System.out.println("Associate Engineer");
}else if(a>2 & a<=5){
System.out.println("Software Engineer");
}else if(a>5 & a<=7){
System.out.println("Sr.Software Engineer");
}else{
System.out.println("Manager");
}
}
}