package Abhishek;
class outer{
    int outdata=10;
    void display()
    {
        inner inobj=new inner();
        System.out.println("Accessing from the outer class");
        System.out.println("*********************************");
        System.out.println("The value of outdata="+outdata);
        System.out.println("The value of in-data="+inobj.indata);
    }

class inner
{
int indata=20;
void inmethod()
{
    System.out.println();
    System.out.println("Accessing inner classes ");
    System.out.println("****************************");
    System.out.println("The sum of indata and outdata="+(outdata+indata));
}
}
}
public class innerclasses {
    public static void main(String[] args) {
        outer outobj= new outer();
        outobj.display();
        outer.inner inob1=outobj.new inner();
        inob1.inmethod();
    }
    
}
