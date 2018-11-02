import java.util.Scanner;

public class GoldCustomer extends CustomerSuper {

    private final double discount = 0.2;
    private String gCustomerAddress;


    public GoldCustomer(){
        customerName = this.getName();
        customerEmail = this.getEmail();
        gCustomerAddress = this.getAddress();
    }

    public void display(){
        System.out.println("Details are "+customerName+ " "+customerEmail + " " + gCustomerAddress);
    }

    public String getAddress(){
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter your Address");
        String tempAddress = inputScanner.nextLine();
        return tempAddress;
    }

    public String getName(){
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String tempName = inputScanner.next();
        return tempName;
    }

    public String getEmail(){
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter your contact details");
        String tempEmail = inputScanner.next();
        return tempEmail;

    }

    public void calcCost(double cost){
        double newCost = cost - (cost * discount);
        double displayCost = (Math.round(newCost * 100)/100);
        System.out.println("Final Cost= " + displayCost);
    }



}
