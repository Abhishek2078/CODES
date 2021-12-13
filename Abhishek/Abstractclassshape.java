package Abhishek;
abstract class shape
{
    String shapename;
    abstract double area();
    abstract String string1();
}
class sphere extends shape{
double radius=5;
static double pi=3.14;
String string1()
{
    shapename="sphere";
    return(shapename);
}
double area()
{
    return 4*pi*radius*radius;

}
}
class rectangle extends shape
{
    double length=8;
    double width =4;
    String string1()
    {
        shapename="Rectangle";
        return(shapename);
    }
    double area()
    {
        return(length*width);
    }
}
class triangle extends shape
{
    double base=5;
    double height=6;
    String string1()
    {
        shapename="Triangle ";
        return(shapename);
    }
    double area()
    {
        return(base*height);
    }

}
public class Abstractclassshape {
    public static void main(String[] args) {
        sphere s=new sphere();
        String s1=s.string1();
        System.out.println(s1);
        double s2=s.area();
        System.out.println("Area of sphere "+s2);
        System.out.println();
rectangle s3=new rectangle();
String s4=s3.string1();
System.out.println(s4);
double s5=s3.area();
System.out.println("Area of rectangle ="+s5);
System.out.println();
triangle s6=new triangle();
String s7=s6.string1();
System.out.println(s7);
double s8=s6.area();
System.out.println("Area of triangle ="+s8);


    }
    
}
