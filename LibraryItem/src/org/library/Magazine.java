package org.library;

public class Magazine extends LibraryItem {
    private String domain;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Magazine(String newAuthor, String title) {
        super(newAuthor, title);
    }
}
