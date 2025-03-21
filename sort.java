import java.util.Scanner;
public class sort
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[5];
        System.out.print("enter the arrat elements");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextLine();
        }grape
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i].compareTo(arr[j])>0)
                {
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
    }

}