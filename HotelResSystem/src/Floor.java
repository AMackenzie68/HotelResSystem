import java.util.Scanner;

public class Floor {

    private int floornumber;
    Room rooms[] = new Room[4];

    public Floor(int nos)
    {
        floornumber = nos;
        Room r1 = new Room(1);
        Room r2  = new Room(2);
        Room r3 = new Room(3);
        Room r4 = new Room(4);

        rooms[0] = r1; rooms[1] = r2; rooms[2] = r3; 	rooms[3] = r4;
    }

    public void displayFloor()
    {
        System.out.println("Floor: "+floornumber);

        for(int counter=0;counter<rooms.length;counter++)
            rooms[counter].display();
    }

    public void findARoomToBook()
    {
        Scanner kboard = new Scanner(System.in);
        int nos; int counter=0; boolean found = false;
        System.out.println("Please enter Room number: ");
        nos = kboard.nextInt();
        for (counter=0; counter < rooms.length; counter++)
        {
            if (nos == rooms[counter].returnRoomNos())
            {
                found = true;
                rooms[counter].bookroom();
                break;
            }
        }
        if (!found) System.out.println("No such Room number");
    }

    public void findaRoomtoCancel()
    {
        Scanner kboard = new Scanner(System.in);
        int nos; int counter=0; boolean found = false;
        System.out.println("Please enter Room number: ");
        nos = kboard.nextInt();
        for (counter=0; counter < rooms.length; counter++)
        {
            if (nos == rooms[counter].returnRoomNos())
            {
                found = true;
                rooms[counter].cancelRoom();
                break;
            }
        }
        if (!found) System.out.println("No such Room number");
    }


}
