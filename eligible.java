import java.util.Scanner;
public class eligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("enter the age");
 int age = sc.nextInt();
 if(age<=18){
    System.out.println("eligible of vote"+age);
 }
 else{
    System.out.println("not eligible for vote");
 }
    }
}



