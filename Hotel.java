import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;
    private String name;

    public Hotel(String aName) {
        name = aName;
        rooms = new ArrayList<Room>();
    }
    public void addRooms()
    {
        int i = 10;
        while (i < 19) {
            String number = "" + i;
            double rate;

            if(i % 3 == 1) {
                number += "A";
                rate = 100;
            }
            else if (i % 3 == 2) {
                number += "B";
                rate = 180;
            }
            else
            {
                number += "C";
                rate = 250;
            }

            Room r = new Room("", number, rate);

            rooms.add(r);
            i++;
        }
    }
    public double calculateBill(Room room, int days) {
        double bill = room.getDailyRate() * days;
        if (days >= 4) {
            bill = bill * 0.9;
        }
        return bill;
    }

    public ArrayList<Room> getMatchingRooms(String roomType) {
        ArrayList<Room> matchingRooms = new ArrayList<Room>();
        for (Room room : rooms) {
            if (room.getType().equals(roomType) && room.getGuest().equals("")) {
                matchingRooms.add(room);
            }
        }
        return matchingRooms;
    }

    public int vacancies() {
        int vacancyCount = 0;
        for (Room room : rooms) {
            if (room.getType().equals("Single") && room.getGuest().equals("")) {
                vacancyCount++;
            } else if (room.getType().equals("Double") && room.getGuest().equals("")) {
                vacancyCount = vacancyCount + 2;
            } else if (room.getType().equals("Family") && room.getGuest().equals("")) {
                vacancyCount = vacancyCount + 4;
            }
        }
        return vacancyCount;
    }

    public void bookRoom(Room room) {
        for (Room r : rooms) {
            if (r.getNumber().equals(room.getNumber())) {
                r.setGuest("Guest");
            }
        }
    }

    public void removeRoom(String roomNumber) {
        for (Room room : rooms) {
            if (room.getNumber().equals(roomNumber)) {
                rooms.remove(room);
            } else {
                System.out.println("Room " + roomNumber + " not found!");
            }
        }
    }
}
