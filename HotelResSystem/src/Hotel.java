import java.util.Scanner;

public class Hotel {

    private int hotelNumber;
    private String hotelName;
    private Floor floors[] = new Floor[4];

    public Hotel(int nos, String name){

        hotelNumber = nos;
        hotelName = name;

        Floor f1 = new Floor(1);
        Floor f2 = new Floor(2);
        Floor f3 = new Floor(3);
        Floor f4 = new Floor(4);

        floors[0] = f1;
        floors[1] = f2;
        floors[2] = f3;
        floors[3] = f4;
    }

    public void display(){

        System.out.println("Hotel Name: "+hotelName);
        for (int counter =0;counter<floors.length;counter++){
            floors[counter].displayFloor();
        }
    }

    public void display(int floornos){

        System.out.println("Hotel Name: "+hotelName);
        floors[floornos].displayFloor();
    }

    public void bookARoom(){

        Scanner kboard = new Scanner(System.in);
        int floorchoice;
        System.out.println("Which floor would you like to stay on?");
        floorchoice = kboard.nextInt();
        floors[floorchoice-1].findARoomToBook();
    }

    public void CancelARoom(){

        Scanner kboard = new Scanner(System.in);
        int floorchoice;
        System.out.println("Which floor are you staying on?");
        floorchoice= kboard.nextInt();
        floors[floorchoice-1].findaRoomtoCancel();
    }
}
