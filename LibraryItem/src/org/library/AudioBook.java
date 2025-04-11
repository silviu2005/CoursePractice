package org.library;

public class AudioBook extends LibraryItem {
    private int durationInSeconds;

    public int getDuration() {
        return durationInSeconds;
    }

    public void setDuration(int duration) {
        this.durationInSeconds = duration;
    }

    public AudioBook(String newAuthor, String title) {
        super(newAuthor, title);
    }
}