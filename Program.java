import java.util.Scanner;

public class Program7Driver{
    public double convert(int stanOld, int klevOld, int schruteOld) {
        double total = schruteOld;
        double newKlev = klevOld;
        newKlev += (double) schruteOld/12;
        total += newKlev/20;
        total *= 100;
        total = (int)(total + 0.5);
        total /= 100;
        return total;
    }
    
    public static void main(String[] args){
        //scanners get input
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter Schrute-bucks: ");
        int schruteOld = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter Klevins: ");
        int klevOld = scan2.nextInt();
        Scanner scan3 = new Scanner(System.in);
        System.out.print("Enter Stanley-nickels: ");
        int stanOld = scan3.nextInt();
        
        //convert
        Program7 myTester = new Program7();
        double totalVal = myTester.convert(stanOld, klevOld, schruteOld);
        //print new value
        System.out.print("New value: "+totalVal);
    }
}
