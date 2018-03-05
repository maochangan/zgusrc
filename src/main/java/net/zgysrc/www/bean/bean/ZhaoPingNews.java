package net.zgysrc.www.bean.bean;

public class ZhaoPingNews {

	private Integer cId;
	private Integer postId1;
	private Integer postId2;
	private String cCompanyLogo;
	private String cCompanyName;
	private String pTyoeTwo1;
	private String pTyoeTwo2;
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public Integer getPostId1() {
		return postId1;
	}
	public void setPostId1(Integer postId1) {
		this.postId1 = postId1;
	}
	public Integer getPostId2() {
		return postId2;
	}
	public void setPostId2(Integer postId2) {
		this.postId2 = postId2;
	}
	public String getcCompanyLogo() {
		return cCompanyLogo;
	}
	public void setcCompanyLogo(String cCompanyLogo) {
		this.cCompanyLogo = cCompanyLogo;
	}
	public String getcCompanyName() {
		return cCompanyName;
	}
	public void setcCompanyName(String cCompanyName) {
		this.cCompanyName = cCompanyName;
	}
	public String getpTyoeTwo1() {
		return pTyoeTwo1;
	}
	public void setpTyoeTwo1(String pTyoeTwo1) {
		this.pTyoeTwo1 = pTyoeTwo1;
	}
	public String getpTyoeTwo2() {
		return pTyoeTwo2;
	}
	public void setpTyoeTwo2(String pTyoeTwo2) {
		this.pTyoeTwo2 = pTyoeTwo2;
	}
	public ZhaoPingNews(Object object, Object object2, Object object3, Object object4, Object object5,
			Object object6, Object object7) {
		super();
		this.cId = (Integer) object;
		this.postId1 = (Integer) object2;
		this.postId2 = (Integer) object3;
		this.cCompanyLogo = (String) object4;
		this.cCompanyName = (String) object5;
		this.pTyoeTwo1 = (String) object6;
		this.pTyoeTwo2 = (String) object7;
	}
	
	
	
	
	
	
}
