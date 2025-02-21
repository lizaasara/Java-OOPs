import java.util.Scanner;
class Product {
int price,pcode;
String pname;
public static void main(String []args)
{
Product obj1=new Product();
Product obj2=new Product();
Product obj3=new Product();
Scanner sc=new Scanner(System.in);

System.out.println("Enter details of 1st product");
obj1.pcode=sc.nextInt();
obj1.pname=sc.next();
obj1.price=sc.nextInt();

System.out.println("Enter details of 2nd product");
obj2.pcode=sc.nextInt();
obj2.pname=sc.next();
obj2.price=sc.nextInt();

System.out.println("Enter details of 3rd product");
obj3.pcode=sc.nextInt();
obj3.pname=sc.next();
obj3.price=sc.nextInt();

if(obj1.price < obj2.price && obj1.price < obj3.price)
{
System.out.println("Price of 1st product is lowest");
}
else if(obj2.price < obj1.price && obj2.price < obj3.price)
{
System.out.println("Price of 2nd product is lowest");
}
else
{
System.out.println("Price of  3rd product is lowest");
}
}
}