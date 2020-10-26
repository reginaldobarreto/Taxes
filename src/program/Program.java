package program;

import model.Taxpayer;
import model.TaxpayerLP;
import model.TaxpayerPP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        List<Taxpayer> taxpayers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of tax payers:");
        int payers = scanner.nextInt();

        for (int i = 1; i <= payers; i++) {
            System.out.println("Tax payer data #" + i + " data:");
            System.out.print("Individual or Company (i/c):");
            char choice = scanner.next().charAt(0);
            if (choice == 'i'){
                System.out.print("Name: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.print("Anual income: ");
                Double annual_Income = scanner.nextDouble();
                System.out.print("Health expenditures: ");
                Double healthSpending = scanner.nextDouble();
                taxpayers.add(new TaxpayerPP( name,annual_Income,healthSpending));
            }else if (choice == 'c'){
                System.out.print("Name: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.print("Anual income: ");
                Double annual_Income = scanner.nextDouble();
                System.out.print("Number of employees: ");
                int numberEmployees = scanner.nextInt();
                taxpayers.add(new TaxpayerLP(name,annual_Income,numberEmployees));
            }
        }

        System.out.println("");
        System.out.println("TAXES PAID:");
        double sumTaxes = 0;
        for (Taxpayer obj: taxpayers) {
            System.out.println("Name: " + obj.getName() + String.format(" %.2f ",obj.tax()));
            sumTaxes += obj.tax();
        }
        System.out.printf("TOTAL TAXES: $ %.2f" , sumTaxes);



        scanner.close();

    }
}
