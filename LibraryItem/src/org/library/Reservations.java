package org.library;

import java.util.Date;

public class Reservations {
   private Date date;
   private Person person;
   private LibraryItem libraryItem;

    public Reservations(Date date, Person person, LibraryItem libraryItem) {
        this.date = date;
        this.person = person;
        this.libraryItem = libraryItem;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public LibraryItem getLibraryItem() {
        return libraryItem;
    }

    public void setLibraryItem(LibraryItem libraryItem) {
        this.libraryItem = libraryItem;
    }
}
