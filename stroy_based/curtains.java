// Q1. A furnishing company is manufacturing a new collection of curtains. The curtains are of two colors aqua(a) and black (b). The curtains color is represented as a string(str) consisting of a's and b's of length N. Then, they are packed (substring) into L number of curtains in each box. The box with the maximum number of 'aqua' (a) color curtains is labeled. The task here is to find the number of 'aqua' color curtains in the labeled box.

// Note:

// If 'L' is not a multiple of N, the remaining number of curtains should be considered as a substring too. In simple words, after dividing the curtains in sets of 'L', any curtains left will be another set(refer example 1) Hence, the output is 3

// Example 1:

// Input:

// bbbaaababa -> Value of str

// 3 -> Value of L

// Output:

// 3 -> Maximum number of a's

// Explanation:

// From the input given above.

// Dividing the string into sets of 3 characters each

// Set 1: {b,b,b}

// Set 2: {a,a,a}

// Set 3: {b,a,b}

// Set 4: {a} -> leftover characters also as taken as another set

// Among all the sets, Set 2 has more number of a's. The number of a's in set 2 is 3.

import java.util.Scanner;

public class curtains {
    static int count(String s){
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='a'){
                c++;
            }
        }
        return c;
    }
    static int find(String s,int l){
        int i=0;
        int c=0;
        int max=Integer.MIN_VALUE;
        while(i<=s.length()-2){
            String sbs=s.substring(i,i+3);
            int ct=count(sbs);
            max=Math.max(ct,max);
            i=i+l;
            

        }

        if(i<s.length()){
            String temp=s.substring(i);
            int ct=count(temp);
            max=Math.max(ct,max);
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter the sting ");
        String s=sc.nextLine();
        System.err.println("enter the lenght of the curtains");
        int l=sc.nextInt();

        int f= find(s,l);
        System.err.println(f);

    }
}
