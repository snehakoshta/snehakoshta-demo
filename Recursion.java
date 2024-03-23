public class Recursion {
    public static void main(String[] args) {
        int marks = sum(20);
        System.out.println(marks);}
        public static int sum(int k){
            if(k>=20){
                return k+sum(k-1);
            }
                else
                {
                   return 0;
                }
            }
        }

        

   

