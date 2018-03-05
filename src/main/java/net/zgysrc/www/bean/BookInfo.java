package net.zgysrc.www.bean;

public class BookInfo {
    private Integer id;

    private String bookName;

    private String bookWriter;

    private Integer collectionNum;

    private Integer clickNum;

    private String bookCreateTime;

    private String bookInfoImagePath;

    private String indexInfo;

    private String bookType;

    private Integer bookTypeId;

    private String bookPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getBookWriter() {
        return bookWriter;
    }

    public void setBookWriter(String bookWriter) {
        this.bookWriter = bookWriter == null ? null : bookWriter.trim();
    }

    public Integer getCollectionNum() {
        return collectionNum;
    }

    public void setCollectionNum(Integer collectionNum) {
        this.collectionNum = collectionNum;
    }

    public Integer getClickNum() {
        return clickNum;
    }

    public void setClickNum(Integer clickNum) {
        this.clickNum = clickNum;
    }

    public String getBookCreateTime() {
        return bookCreateTime;
    }

    public void setBookCreateTime(String bookCreateTime) {
        this.bookCreateTime = bookCreateTime == null ? null : bookCreateTime.trim();
    }

    public String getBookInfoImagePath() {
        return bookInfoImagePath;
    }

    public void setBookInfoImagePath(String bookInfoImagePath) {
        this.bookInfoImagePath = bookInfoImagePath == null ? null : bookInfoImagePath.trim();
    }

    public String getIndexInfo() {
        return indexInfo;
    }

    public void setIndexInfo(String indexInfo) {
        this.indexInfo = indexInfo == null ? null : indexInfo.trim();
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType == null ? null : bookType.trim();
    }

    public Integer getBookTypeId() {
        return bookTypeId;
    }

    public void setBookTypeId(Integer bookTypeId) {
        this.bookTypeId = bookTypeId;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice == null ? null : bookPrice.trim();
    }
}