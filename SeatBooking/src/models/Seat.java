package models;

public class Seat {

	public int seatNo;
	public String boogeyNo;
	public String trainName;
	public String travelerName;
	
	public Seat(int seatNo, String boogeyNo, String trainName, String travelerName) {
		super();
		this.seatNo = seatNo;
		this.boogeyNo = boogeyNo;
		this.trainName = trainName;
		this.travelerName=travelerName;
	}
	
	

	public String getTravelerName() {
		return travelerName;
	}



	public void setTravelerName(String travelerName) {
		this.travelerName = travelerName;
	}



	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public String getBoogeyNo() {
		return boogeyNo;
	}

	public void setBoogeyNo(String boogeyNo) {
		this.boogeyNo = boogeyNo;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	
	
	
}
