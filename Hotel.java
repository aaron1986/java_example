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
    public double calculateBill(Room r, int days) {
        double bill = r.getDailyRate() * days;
        if(days >= 4) {
            bill = bill * 0.9;
        }
        return bill;
    }
     public ArrayList<Room> getMatchingRooms(String roomType) {
        ArrayList<Room> matchingRooms = new ArrayList<>();

        for(Room r : rooms) {
            if(r.getType().equals(roomType) && r.getGuest().equals("")) {
                matchingRooms.add(r);
            }
        }
        return matchingRooms;
    }

    public int vacancies() {
        int num_vacancies = 0;
        for(Room r : rooms) {
            if(r.getType().equals("Single") && r.getGuest().equals("")) {
                num_vacancies++;
            } else if (r.getType().equals("Double") && r.getGuest().equals("")) {
                num_vacancies+=2;
            } else if (r.getType().equals("Family") && r.getGuest().equals("")) {
                num_vacancies +=4;
            }
        }
        return num_vacancies;
    }
    
public void bookRoom(Room r) {
        for(Room room : rooms) {
            if(room.getNumber().equals(r.getNumber())) {
                room.setGuest("Guest");
            }
        }
    }
    
    public void removeRoom(String roomNumber) {
        for(int i = 0; i < rooms.size(); i++) {
            Room r = rooms.get(i);
            if(r.getNumber().equals(roomNumber)) {
                rooms.remove(i);
            }
        }
    }
}
