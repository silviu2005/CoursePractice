package org.library;

import java.util.Date;

public class ReservationService {
    int counter=0;
    Reservations[] reservations = new Reservations[100];
    public void reserve(Person person,LibraryItem libraryItem) {
        Reservations reservation= new Reservations(new Date(),person,libraryItem);
        reservations[counter]=reservation;
        counter++;

    }
}
