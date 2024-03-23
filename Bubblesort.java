import java.util.*;
public class Bubblesort {
    
    

    public static void main(String args[]) {
        int temp,size;
        int[] A = {34 , 67, 12, 56 ,89};
        
    
        
        for(int i=0;i<5;i++){
            
        System.out.println(A[i]);
    } 
        
        for(int i=0;i<5;i++){
            for(int j=0;j<5-1-i;j++){
                if(A[j]>A[j+1]){
                temp = A[j];
                A[j] = A[j+1];
                A[j+1] = temp;

            }
        }

    }
    for(int i=0;i<4;i++){
            for(int j=0;j<4-1-i;j++){
                if(A[j]>A[j+1]){
                temp = A[j];
                A[j] = A[j+1];
                A[j+1] = temp;

            }
        }

    }
    for(int i=0;i<3;i++){
            for(int j=0;j<3-1-i;j++){
                if(A[j]>A[j+1]){
                temp = A[j];
                A[j] = A[j+1];
                A[j+1] = temp;

            }
        }

    }
    System.out.print(A);
    

    
    

    
}
}
