package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import models.Seat;

public class App {
	
	
	public static List <Seat> seats = new ArrayList<Seat>();

	static SeatBooker t1 ; 
	static SeatBooker t2;
	static SeatBooker t3;
	static SeatBooker t4; 
	static SeatBooker t5;
	
	public void myMethod () throws InterruptedException{
		
		t2.join();
	    t3.join();
		t4.join();
		t5.join();
		
	}

	public void StartMyApp() throws InterruptedException{
    
		App.addSeats();		          
	        t1 = new SeatBooker("Ninad",seats); 
	        t2 = new SeatBooker("Konark",seats); 
	       	t3 = new SeatBooker("Rutujit",seats); 
		    t4 = new SeatBooker("Parth",seats); 
            t5 = new SeatBooker("Kapil",seats); 
		

		
		t1.start();		
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		//who allocates memory to thread ?????????????????????????
		
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		
		
		System.out.println("\nchecking seats in main after all threads completed : ");
		
		for (Seat s : seats){
			System.out.println("seatNo "+s.getSeatNo()+" Passenger Name : "+s.getTravelerName());
		}
	}
	
	
    
	
	public static void addSeats (){
		
		System.out.println("adding new seats ");
	for (int i=1 ;i <=3 ; i++){
		seats.add(new Seat(i,"boogey-"+i, "KonarkExpress","A"));
	  }	

	}


	public static void main(String[] args) throws InterruptedException {
		
	
		new App().StartMyApp();

		

	}

}
