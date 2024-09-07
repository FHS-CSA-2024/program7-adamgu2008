import java.util.Scanner;

public class Program7Driver{

    // Conversion rates as final variables
    private final int klevsPerSchrute = 20;
    private final int stansPerKlev = 12;
    private final int stansPerSchrute = klevsPerSchrute * stansPerKlev;

    public double convert(int schruteOld, int klevOld, int stanOld) {
        // Convert the old format to decimal schrute-bucks
        double decimalSchruteBucks = schruteOld
                + (double) klevOld / klevsPerSchrute
                + (double) stanOld / stansPerSchrute;
        decimalSchruteBucks *= 100;
        decimalSchruteBucks = (int) (decimalSchruteBucks + 0.5);
        decimalSchruteBucks /= 100;
        return decimalSchruteBucks;
    }

    public static void main(String[] args){
        //scanners get input
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter Schrute-bucks: ");
        int schruteOld = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter Klevins: ");
        int klevOld = scan2.nextInt();
        Scanner scan3 = new Scanner(System.in);
        System.out.print("Enter Stanley-nickels: ");
        int stanOld = scan3.nextInt();
        
        //convert
        Program7Driver myTester = new Program7Driver();
        double totalVal = myTester.convert(schruteOld, klevOld, stanOld);
        //print new value
        System.out.print("Decimal Schrute-Bucks: "+totalVal);
    }
}

/*
Output:
Enter Schrute-bucks: 7
Enter Klevins: 17
Enter Stanley-nickels: 9
Decimal Schrute-Bucks: 7.89 
*/
