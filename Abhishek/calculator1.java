package Abhishek;
import java.util.Scanner;
public class calculator1 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        float result = 0;
        System.out.print("Enter First Number : ");
        float a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        float b = sc.nextInt();
        System.out.print("Enter the operation : ");
        char operation = sc.next().charAt(0);
        System.out.println();
        switch(operation){
        case '+' :
        result = add(a,b);
        System.out.println("Result = "+ result);
        break ;
        case '-' :
        result = sub(a, b);
        System.out.println("Result = "+ result);
        break;
        case '*' :
        result = multiply(a, b);
        System.out.println("Result = "+ result);
        break;
        case '/':
        result = div(a,b);
        System.out.println("Result = "+ result);
        break;
        }
        sc.close();
        }
        static float add (float a, float b) {
        float result = a+b;
        return result;
        }
        static float sub (float a, float b) {
            float result = a-b;
return result;
}
static float multiply (float a, float b) {
float result = a*b;
return result;
}
static float div (float a, float b) {
float result = a/b;
return result;
}
}
    

