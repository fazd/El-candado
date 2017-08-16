
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] A = new int [4];
        A[0]=scan.nextInt();
        A[1]=scan.nextInt();
        A[2]=scan.nextInt();
        A[3]=scan.nextInt();
        int totalD=1080;
        int sentido= 0;   // 0 hacia la izquierda, 1 derecha
        int i=0;
        int suma=A[0]+A[1]+A[2]+A[3];
        while(suma!=0){
            while(i<=2){
                if(sentido ==0){
                    if(A[i]<A[i+1]){
                        A[i]=A[i]+40;
                        totalD=totalD+(A[i]-A[i+1])*9;
                    }
                    else{
                        totalD=totalD+(A[i]-A[i+1])*9;
                    }
                    sentido=1;
                }
                else{
                    
                    if(A[i]<=A[i+1]){
                        totalD=totalD+(A[i+1]-A[i])*9;
                    }
                    else {
                        totalD=totalD+(40+A[i+1]-A[i])*9;
                    }
                    sentido=0;
                }
                i++;
            }
            System.out.println(totalD);
            i=0;
            A[0]=scan.nextInt();
            A[1]=scan.nextInt();
            A[2]=scan.nextInt();
            A[3]=scan.nextInt();
            totalD=1080;
            sentido= 0;   // 0 hacia la izquierda, 1 derecha
            suma=A[0]+A[1]+A[2]+A[3];
        }
    }
}