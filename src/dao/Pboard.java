package dao;

import java.sql.Date;

public class Pboard {
	private int pcno;
	private int pno;
	private String cid;
	private String pcps;
	private Date pcdat;
	private String pcip;
	public int getPcno() {
		return pcno;
	}
	public void setPcno(int pcno) {
		this.pcno = pcno;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getPcps() {
		return pcps;
	}
	public void setPcps(String pcps) {
		this.pcps = pcps;
	}
	public Date getPcdat() {
		return pcdat;
	}
	public void setPcdat(Date pcdat) {
		this.pcdat = pcdat;
	}
	public String getPcip() {
		return pcip;
	}
	public void setPcip(String pcip) {
		this.pcip = pcip;
	}
	public String getPccon() {
		return pccon;
	}
	public void setPccon(String pccon) {
		this.pccon = pccon;
	}
	private String pccon;

}
