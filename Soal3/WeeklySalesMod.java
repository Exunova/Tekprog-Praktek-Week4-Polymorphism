// WeeklySales.java (Modified - Optional No. 7)
import java.util.Scanner;

public class WeeklySalesMod
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many salespeople? ");
        int size = scan.nextInt();
        scan.nextLine();

        Salesperson[] salesStaff = new Salesperson[size];

        for (int i = 0; i < size; i++)
        {
            System.out.println("\nSalesperson #" + (i + 1));
            System.out.print("First name: ");
            String first = scan.nextLine();
            System.out.print("Last name: ");
            String last = scan.nextLine();
            System.out.print("Total sales: ");
            int sales = scan.nextInt();
            scan.nextLine();

            salesStaff[i] = new Salesperson(first, last, sales);
        }

        Sorting.insertionSort(salesStaff);

        System.out.println("\nRanking of Sales for the Week\n");
        for (Salesperson s : salesStaff)
            System.out.println(s);
    }
}