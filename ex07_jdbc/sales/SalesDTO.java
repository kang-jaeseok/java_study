package ex07_jdbc.sales;

import java.util.Date;

public class SalesDTO {
	private String saledate;
	private int seq;
	private String iemcode;
	private int qty;
	private int amount;
	private Date regdate;
	
	public SalesDTO(String saledate, int seq, String iemcode, int qty, int amount, Date regdate) {
		super();
		this.saledate = saledate;
		this.seq = seq;
		this.iemcode = iemcode;
		this.qty = qty;
		this.amount = amount;
		this.regdate = regdate;
	}
	public String getSaledate() {
		return saledate;
	}
	public void setSaledate(String saledate) {
		this.saledate = saledate;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getIemcode() {
		return iemcode;
	}
	public void setIemcode(String iemcode) {
		this.iemcode = iemcode;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "SalesDTO [saledate=" + saledate + ", seq=" + seq + ", iemcode=" + iemcode + ", qty=" + qty + ", amount="
				+ amount + ", regdate=" + regdate + "]";
	}
	
	
}
