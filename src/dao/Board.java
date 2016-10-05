package dao;

import java.util.Date;

public class Board {
	private int bdno;
	private String cid;
	private String bdps;
	private Date bddat;
	private String bdip;
	private String bdtit;
	private int bdhit;
	private String bdcon;
	public int getBdno() {
		return bdno;
	}
	public void setBdno(int bdno) {
		this.bdno = bdno;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getBdps() {
		return bdps;
	}
	public void setBdps(String bdps) {
		this.bdps = bdps;
	}
	public Date getBddat() {
		return bddat;
	}
	public void setBddat(Date bddat) {
		this.bddat = bddat;
	}
	public String getBdip() {
		return bdip;
	}
	public void setBdip(String bdip) {
		this.bdip = bdip;
	}
	public String getBdtit() {
		return bdtit;
	}
	public void setBdtit(String bdtit) {
		this.bdtit = bdtit;
	}
	public int getBdhit() {
		return bdhit;
	}
	public void setBdhit(int bdhit) {
		this.bdhit = bdhit;
	}
	public String getBdcon() {
		return bdcon;
	}
	public void setBdcon(String bdcon) {
		this.bdcon = bdcon;
	}

}
