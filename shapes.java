import java.util.Scanner;
public class shapes
{
    void area(double r)
    {
        System.out.println("area of circle is:"+3.14*r*r);
    }
    void area(double l,double b)
    {
        System.out.println("area of rectangle is:"+l*b);
    }
    void area(int s)
    {
        System.out.println("area of square:"+s*s);
    }
    void area(double b,int h)
    {
        System.out.println("area of triangle is:"+0.5*b*h);
    }


public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    shapes sh=new shapes();
    System.out.print("Enter the radius of the circle: ");
    double r = sc.nextDouble();
    sh.area(r);
    System.out.print("Enter the length of the rectangle: ");
    double l = sc.nextDouble();
    System.out.print("Enter the width of the rectangle: ");
    double w = sc.nextDouble();
    sh.area(l,w);
    System.out.print("Enter the side of the square: ");
    int s= sc.nextInt();
    sh.area(s);
    System.out.println("Enter base and heiaght for triangle");
    double  b=sc.nextDouble();
    int h=sc.nextInt();
    sh.area(b,h);

}
}
