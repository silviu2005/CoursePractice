package org.library;


public class LibraryInventory implements InventoryActions{
    LibraryItem[] LibraryItem=new LibraryItem[100];
    int counter=0;
    @Override
    public void addItems(LibraryItem libraryItem) {
        LibraryItem[counter]=libraryItem;
        counter++;

      if (libraryItem instanceof book){
          Book book=(Book)libraryItem;
      }
    }

    @Override
    public void listItems() {
    /*for(LibraryItem libraryItem : LibraryItem){
        System.out.println(libraryItem.toString());
    }*/
        for(int i=0;i<counter;i++){
            System.out.println(LibraryItem[i].toString());
        }
    }

    @Override
    public LibraryItem findbyTitle(String title) {
        LibraryItem foundItem=null;
        for(int i=0;i<counter;i++){
            LibraryItem libraryItem=LibraryItem[i];
           if( libraryItem.getTitle().equalsIgnoreCase(title)){
               foundItem= libraryItem;break;
           }

        }
        return null;
    }
    public LibraryItem findByTitleandAuthor(String title,String author) {
        LibraryItem foundItem = null;
        for(int i=0;i<counter;i++){
            LibraryItem libraryItem=LibraryItem[i];
            if( libraryItem.getTitle().equals(title) && libraryItem.getAuthor().equals(author)){
                return libraryItem;
            }
        }
        return null;
    }
}
