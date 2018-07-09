package models;

import java.util.List;

public class Boogey {

	public String boogeyNo;
	public List <Seat> seatlist;
	
	public Boogey(String boogeyNo, List<Seat> seatlist) {
		super();
		this.boogeyNo = boogeyNo;
		this.seatlist = seatlist;
	}

	public String getBoogeyNo() {
		return boogeyNo;
	}

	public void setBoogeyNo(String boogeyNo) {
		this.boogeyNo = boogeyNo;
	}

	public List<Seat> getSeatlist() {
		return seatlist;
	}

	public void setSeatlist(List<Seat> seatlist) {
		this.seatlist = seatlist;
	}
	
	
	
}
