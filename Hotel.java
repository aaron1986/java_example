// Copy and paste your Hotel class here.
// Don't forget any imports you might need

import java.util.ArrayList;

import java.util.ArrayList;
//create class called Hotel
public class Hotel {

    //create two private fields
    private ArrayList<Room> rooms;
    private String name;

    //create constructor with one parameter called aName
    public Hotel (String aName) {
        name = aName;
        this.rooms = new ArrayList<Room>();
    }

    //method add rooms
    public void addRooms() {
        int i = 10;
        while (i < 19) {
            String number = " " + i;
            double rate;

            if(i % 3 == 1) {
                number += "A";
                rate = 100;
            } else if (i % 3 == 2) {
                number += "B";
                rate = 180;
            } else {
                number += "C";
                rate = 250;
            }
            Room r = new Room("", number, rate);
            rooms.add(r);
            i++;
        }
    }

    //create method calculateBill two parameters Room and days
    public static double calculateBill(int Room, int days) {
        //double days = 1;
        double bill = 0;
        bill = Room *  days;
        if(days <= 4) {
            bill = bill * 10 / 100;
        }
        return bill;
    }

    public ArrayList<Room> getMatchingRooms(String type) {
        ArrayList<Room> rooms1 = new ArrayList<Room>();
        for(Room room : rooms) {
            if (room.getType().equals(type)) {
                rooms1.add(room);
            }
        }
        return rooms1;
    }

   public int vacancies() {

        int num_vancancies = 0;
        return num_vancancies;

    }
}