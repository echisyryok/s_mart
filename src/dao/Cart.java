package dao;

public class Cart {
	private int ctno;
	private String pname;
	private int pno;
	private int price;
	public int getCtno() {
		return ctno;
	}
	public void setCtno(int ctno) {
		this.ctno = ctno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPget() {
		return pget;
	}
	public void setPget(int pget) {
		this.pget = pget;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	private int pget;
	private int cin;

}
