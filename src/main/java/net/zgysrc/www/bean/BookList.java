package net.zgysrc.www.bean;

public class BookList {
    private Integer id;

    private Integer fatherId;

    private String bookListName;

    private String bookImagePathOne;

    private Integer likeNum;

    private Integer bookClickNum;

    private Integer listNum;

    private String bookContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public String getBookListName() {
        return bookListName;
    }

    public void setBookListName(String bookListName) {
        this.bookListName = bookListName == null ? null : bookListName.trim();
    }

    public String getBookImagePathOne() {
        return bookImagePathOne;
    }

    public void setBookImagePathOne(String bookImagePathOne) {
        this.bookImagePathOne = bookImagePathOne == null ? null : bookImagePathOne.trim();
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public Integer getBookClickNum() {
        return bookClickNum;
    }

    public void setBookClickNum(Integer bookClickNum) {
        this.bookClickNum = bookClickNum;
    }

    public Integer getListNum() {
        return listNum;
    }

    public void setListNum(Integer listNum) {
        this.listNum = listNum;
    }

    public String getBookContent() {
        return bookContent;
    }

    public void setBookContent(String bookContent) {
        this.bookContent = bookContent == null ? null : bookContent.trim();
    }
}