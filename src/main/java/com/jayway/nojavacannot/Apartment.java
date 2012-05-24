package com.jayway.nojavacannot;

public class Apartment {

    final private int rooms;
    final private boolean hasBalcony;
    final private boolean hasWasher;

    public Apartment(int rooms, boolean hasBalcony, boolean hasWasher) {
        this.rooms = rooms;
        this.hasBalcony = hasBalcony;
        this.hasWasher = hasWasher;
    }

    public Apartment(int rooms, boolean hasBalcony) {
        this(rooms, hasBalcony, false);
    }

//    public Apartment(int rooms, boolean hasWasher) {
//        this(rooms, false, hasWasher);
//    }

    /**
     * More factories are created in Scala.
     * @param rooms
     * @param hasBalcony
     * @param hasWasher
     * @return
     */
    public static Apartment factory(int rooms, boolean hasBalcony, boolean hasWasher) {
        return new Apartment(rooms, hasBalcony, hasWasher);
    }

    
    public int getRooms() {
        return rooms;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public boolean isHasWasher() {
        return hasWasher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apartment)) return false;

        Apartment apartment = (Apartment) o;

        if (hasBalcony != apartment.hasBalcony) return false;
        if (hasWasher != apartment.hasWasher) return false;
        if (rooms != apartment.rooms) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rooms;
        result = 31 * result + (hasBalcony ? 1 : 0);
        result = 31 * result + (hasWasher ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Apartment[" +
                "rooms=" + rooms +
                ", hasBalcony=" + hasBalcony +
                ", hasWasher=" + hasWasher +
                ']';
    }
    

}
