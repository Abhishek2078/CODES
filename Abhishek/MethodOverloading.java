//1.) METHOD OVERLOADING
package Abhishek;
class Overload
{
int a=0,b=0;
void add()
{
System.out.println("NO or DEFAULT argument add method, sum="+(a+b));
}
//overloaded Method add
void add(int k,int j)
{
a=k;
b=j;
System.out.println("Parameterized argument add method, sum= "+(a+b));
}
}

public class MethodOverloading {
    public static void main(String args[])
{
Overload ga=new Overload();

System.out.println("Default Method call");
ga.add();
System.out.println("Parameterized Method call");
ga.add(12,23);
}
    
}
