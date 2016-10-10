package dao;

import java.sql.Date;

public class Delivery {
	private int delno;
	private int cno;
	private int ctno;
	private int pno;
	private String cname;
	private String delar;
	private String delpn;
	public int getDelno() {
		return delno;
	}
	public void setDelno(int delno) {
		this.delno = delno;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public int getCtno() {
		return ctno;
	}
	public void setCtno(int ctno) {
		this.ctno = ctno;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDelar() {
		return delar;
	}
	public void setDelar(String delar) {
		this.delar = delar;
	}
	public String getDelpn() {
		return delpn;
	}
	public void setDelpn(String delpn) {
		this.delpn = delpn;
	}
	public String getDeltm() {
		return deltm;
	}
	public void setDeltm(String deltm) {
		this.deltm = deltm;
	}
	public Date getDeldat() {
		return deldat;
	}
	public void setDeldat(Date deldat) {
		this.deldat = deldat;
	}
	private String deltm;
	private Date deldat;

}
