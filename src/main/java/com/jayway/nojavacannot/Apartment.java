package com.jayway.nojavacannot;

/**
 * Created by Anders Eriksson.
 */
public class Apartment {

    private int rooms;
    private boolean hasBalcony;
    private boolean hasWasher;

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

}
