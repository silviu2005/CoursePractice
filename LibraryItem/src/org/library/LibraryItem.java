package org.library;

public abstract class LibraryItem {
   private String author;
    private String title;
    private  double price=0.2;
    private  boolean isAvailable;

    public LibraryItem( String newAuthor, String title) {
        author=newAuthor;
        this.title=title;

    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public void reserved(){
        isAvailable=false;
    }
    public void released(){
        isAvailable=true;
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public void showDetails(){
        System.out.println(this.toString());
    }
}
