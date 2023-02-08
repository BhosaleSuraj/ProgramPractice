package java9.fatures.collection;

import java.util.ArrayList;

public class Staf {
	private int sid;
    private String sname;
    private int div;
	public ArrayList<Student> ph;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getDiv() {
		return div;
	}
	public void setDiv(int div) {
		this.div = div;
	}
	public Staf(int sid, String sname, int div) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.div = div;
	}
	public Staf() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Staf [sid=" + sid + ", sname=" + sname + ", div=" + div + "]";
	}
    
}
