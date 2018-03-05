package net.zgysrc.www.bean;

public class BookPrice {
    private Integer id;

    private String bookPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice == null ? null : bookPrice.trim();
    }
}