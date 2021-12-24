package questionbank;

import java.util.Scanner;

public class foreach {
    public static void main(String[] args) {
        int i,n;

        int A[]={1,2,3,4,5};
        System.out.println("Enter the element to be searched");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=0;i<A.length-1;i++)
        {
            System.out.println(A[i]);
        }
for(int x: A)
{
    if(A[i]==n)
    {
        System.out.println("The number is found ");
        
    }
    else
        System.out.println("Bad try");
}
        
    }

}
