import java.util.Scanner;
public class angleisvalidornot {
    int A,B,C,Z;
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the angle of A ");
        int A = sc.nextInt();
        System.out.println("enter the angle of B");
        int B = sc.nextInt();
        System.out.println("enter the angle of C");
        int C = sc.nextInt();
         System.out.println("the angle of A: "+A);
         System.out.println("the angle of B:"+B);
         System.out.println("the angle of C: "+C);
         int D = A+B+C;
         if(D==180)
         {
            System.out.println("angle is valid");

         }
       else{
         System.out.println("angle is not valid");
  }
        
    }
    
}
