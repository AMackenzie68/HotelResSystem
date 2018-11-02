import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class Room {

    private int roomNos;
    private CustomerSuper occupier;
    private boolean status;

    public Room(int rnos)
    {
        roomNos = rnos;
        status = true; //free
    }

    public void display()
    {
        System.out.println("Room number: "+roomNos);
        if (status)
            System.out.println("Room is free");
        else
            occupier.display();
    }

    public void bookroom(CustomerSuper newPerson)
    {
        if (status)
        {
            status = false;
            occupier = newPerson;
        }
        else
            System.out.println("Sorry room booked");
    }

    public void bookroom()
    {
        System.out.println("Room "+roomNos);
        if (status)
        {
            String customerType = initialiseCustomer();
            boolean valid = false;

            while (!valid) {

                boolean ordCustomer = customerType.equalsIgnoreCase("ordinary");
                boolean goldCustomer = customerType.equalsIgnoreCase("gold");

                if (ordCustomer) {
                    valid = true;
                    CustomerSuper newPerson = new OrdinaryCustomer();
                    occupier = newPerson;
                } else if (goldCustomer) {
                    valid = true;
                    CustomerSuper newPerson = new GoldCustomer();
                    occupier = newPerson;
                }else{
                    customerType = initialiseCustomer();
                }
            }

            status = false;

        }
        else
            System.out.println("Sorry room booked");
    }

    public String initialiseCustomer() {
        Scanner customerScanner = new Scanner(System.in);

        System.out.println("Enter Customer type (Ordinary/Gold): ");
        return customerScanner.next();

    }

    public void cancelRoom()
    {
        status = true;
        occupier = null;
        System.out.println("Room cancelled");
    }

    public int returnRoomNos()
    {
        return(roomNos);
    }


}
