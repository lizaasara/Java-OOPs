import java.util.Scanner;
class Cpu {
int price;
class Processor {
int cores;
String manufacturer;
}
static class RAM {
    int memory;
    String manufacturer;
}
}

public class CPU1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
Cpu Obcpu = new Cpu();
Cpu.Processor Obprocessor = Obcpu.new Processor();
Cpu.RAM Obram = new Cpu.RAM();
System.out.print("Enter CPU Price: ");
Obcpu.price = sc.nextInt();
System.out.print("Enter Number of Cores: ");
Obprocessor.cores = sc.nextInt();
System.out.print("Enter Processor Manufacturer: ");
Obprocessor.manufacturer = sc.next();
System.out.print("Enter Memory: ");
Obram.memory = sc.nextInt();
System.out.print("Enter RAM Manufacturer: ");
Obram.manufacturer = sc.next();
System.out.println("\nDisplaying the information: ");
System.out.println("CPU Price: " + Obcpu.price);
System.out.println("Number of Cores: " + Obprocessor.cores);
System.out.println("Processor Manufacturer: " + Obprocessor.manufacturer);
System.out.println("Memory: " + Obram.memory + "GB");
System.out.println("RAM Manufacturer: " + Obram.manufacturer);
}
}

