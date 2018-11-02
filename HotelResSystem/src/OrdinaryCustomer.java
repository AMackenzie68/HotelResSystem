import java.util.Scanner;

public class OrdinaryCustomer extends CustomerSuper {

    private final double discount = 0;

    public OrdinaryCustomer(){
        customerName = this.getName();
        customerEmail = this.getEmail();
    }

    public void display(){
        System.out.println("Details are "+customerName+ " "+customerEmail);
    }

    public String getName(){
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String tempName = inputScanner.nextLine();
        return tempName;
    }

    public String getEmail(){
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter your contact details");
        String tempEmail = inputScanner.nextLine();
        return tempEmail;

    }

    public void calcCost(double cost){
        double newCost = cost - (cost * discount);
        double displayCost = (Math.round(newCost * 100)/100);
        System.out.println("Final Cost= " + displayCost);
    }

}
