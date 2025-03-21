import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;

   
    Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }


    void printDetails() {
        System.out.println("Employee Number: " + this.eNo);
        System.out.println("Employee Name: " + this.eName);
        System.out.println("Employee Salary: " + this.eSalary);
    }
}

public class employee {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.of employees");
        int n= sc.nextInt();
        sc.nextLine();
    Employee employee[] = new Employee[n];
         

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee");
            System.out.print("Enter Employee Number: ");
            int eNo = sc.nextInt();
            sc.nextLine();
           
            System.out.print("Enter Employee Name: ");
            String eName = sc.nextLine();
           
            System.out.print("Enter Employee Salary: ");
            double eSalary = sc.nextDouble();
            sc.nextLine();  

           employee[i] = new Employee(eNo, eName, eSalary);
        }
       
        System.out.println("Enter the eNo of employee to be searched");
        int searchno = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
          if(employee[i].eNo==searchno)
          {
           System.out.println("Employee found:");
                employee[i].printDetails();
                break;
          }
          if(employee[i].eNo!=searchno)
          {
           System.out.println("Employee not found");
          }
        }
       
      }
}


       