package net.zgysrc.www.bean;

public class AualificationCertification {
	private Integer id;

	private String certificationNum;

	private String certificationName;

	private String idCardNum;

	private String certificationType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCertificationNum() {
		return certificationNum;
	}

	public void setCertificationNum(String certificationNum) {
		this.certificationNum = certificationNum == null ? null : certificationNum.trim();
	}

	public String getCertificationName() {
		return certificationName;
	}

	public void setCertificationName(String certificationName) {
		this.certificationName = certificationName == null ? null : certificationName.trim();
	}

	public String getIdCardNum() {
		return idCardNum;
	}

	public void setIdCardNum(String idCardNum) {
		this.idCardNum = idCardNum == null ? null : idCardNum.trim();
	}

	public String getCertificationType() {
		return certificationType;
	}

	public void setCertificationType(String certificationType) {
		this.certificationType = certificationType == null ? null : certificationType.trim();
	}
}