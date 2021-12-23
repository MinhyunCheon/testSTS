package kr.co.encore.model.vo;

public class TestVO {
	private String id;
	private String pwd;
	
	public TestVO() {
		super();
	}
	
	public TestVO(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
