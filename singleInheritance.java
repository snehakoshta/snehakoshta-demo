import java.util.Scanner;
    class A{
      public  int x;
        
        void get(){
            System.out.println("enter the value x");
            Scanner sc = new Scanner(System.in);
             x = sc.nextInt();
            
        }
        void show(){
            System.out.println(" x = "+x);
        }

    }

class B extends A{
   public int y;
    
     void get(){
        System.out.println("enter the value of y");
        Scanner sc = new Scanner(System.in);
        y= sc.nextInt();
     }
     void show(){
        System.out.println("y="+y);
     }
    }
    public class singleInheritance{


    public static void main(String args[]) {
        B b1 = new B();
        b1.get();
        b1.show();
    }
}
