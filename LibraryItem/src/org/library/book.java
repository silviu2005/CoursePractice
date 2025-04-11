package org.library;

public class book extends LibraryItem {
    private int pageNR;
    private String covertype;
    public book(String newAuthor, String title) {
        super(newAuthor, title);
    }

    public String getCovertype() {
        return covertype;
    }

    public void setCovertype(String covertype) {
        this.covertype = covertype;
    }

    public int getPageNR() {
        return pageNR;
    }

    public void setPageNR(int pageNR) {
        this.pageNR = pageNR;
    }
}
