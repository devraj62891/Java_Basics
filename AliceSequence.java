
//Given a number N. Your task is to create a program to calculate the N-th term of the Alice choice.

// Alice's sequence consists of the squares of prime numbers: 2^2, 3^2, 5^2, 7^2, 11^2,13^2,17^2,19^2, 23^2, 29^2,…………

import java.util.*;

class AliceSequence {
    static boolean prime(int a){
        if(a==1 || a==0){
            return false;

        }else{
            for(int i=2;i<=Math.sqrt(a);i++){
                if(a%i==0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=0;
        int arr[]=new int[n];
        int c=0;

        for(int i=1;i>0;i++){
            if(prime(i)){
                arr[m++]=i;
                c++;
            }
            if(c==n){
                break;
            }
        }

        System.out.print(arr[n-1]*arr[n-1]);
    }
}