public class Room {

    //Add Private fields to the Room Class
    private String guest;
    private String number;
    private double dailyRate;

    //Add constructor to the Room class using three parameters set to the corresponding fields
    public Room(String aGuest, String aNumber, double aRate) {
        guest = aGuest;
        number = aNumber;
        dailyRate = aRate;
    }

    //Add getter and setter methods for the three fields
    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    //Create method to tell if the room is available or not
    public boolean isAvailable() {
        if (number.charAt(0) == '0' && number.charAt(1) == '0') {
            return true;
        } else {
            return false;
        }
    }

    /*
    Add method called verifyRoom that returns 'true' if the room has a valid number,
    and otherwise returns false.
    (1) The room number string must be 3 characters in length, otherwise return false.
    (2) The first two characters should represent a room number (string) from 01 to 99, otherwise the room number is invalid.
    (3) The third character should in the room number must be either 'A', 'B' or 'C', otherwise the number is invalid.
    */
    public boolean verifyRoom() {
        if(number.charAt(0) == '0' && number.charAt(1) == '0') {
            return false;
        } else if(number.length() >= 3 && number.charAt(2) == 'A' || number.charAt(2) == 'B' || number.charAt(2) == 'C') {
            return true;
        }
        return false;
    }

    /*
    Create a method called getType that returns a string that describes the type of room based
    on the numbers third character.
    If the rooms third character is 'A' the method returns "Single".
    If the rooms third character is 'B' the method returns "Double".
    If the rooms third character is 'C' the method returns "Family".
    */
    public String getType() {
        if(number.charAt(2) == 'A') {
            return "Single";
        } else if (number.charAt(2) == 'B') {
            return "Double";
        } else {
            return "Family";
        }
    }

    /*
  Create a method called description that has no parameters but return a string describing the room
  using the format: type, room number, availability, guest name.
  Example: Single room 21A (available) Joe Bloggs.
  */
    public String description() {
        return(getType() + " Room " + number + " (" + isAvailable() +  ") " + "" + guest);
    }
}
