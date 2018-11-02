public class CustomerInheritDriver {

    public static void main(String[] args)
    {
        double cost =100;
        CustomerSuper occupiers[] = new CustomerSuper[10];
        occupiers[0] = new OrdinaryCustomer();
        occupiers[1] = new GoldCustomer();

        occupiers[0].display();
        occupiers[0].calcCost(cost);

        occupiers[1].display();
        occupiers[1].calcCost(cost);

    }


}
