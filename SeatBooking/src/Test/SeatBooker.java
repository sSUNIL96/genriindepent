package Test;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import javax.naming.TimeLimitExceededException;

import models.Seat;

public class SeatBooker extends Thread {
	
	String travelerName;
	List <Seat> list;
	public static Integer bookedseats=0;
	public boolean notbooked=true;
	
	
	public SeatBooker(String travelerName , List<Seat> list ) {
		super(travelerName);
		this.travelerName = travelerName;
		this.list =list;
		//this.bookedseats = bookedseats;
		
	}


	public void run (){
	
		/*if (Thread.currentThread().getName().equals("Ninad")){
			try {
				
				TimeUnit.SECONDS.sleep(5);
				
				new App().myMethod();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		System.out.println(Thread.currentThread().getName() +" is inside run ");
		
		while (notbooked){
			Random r = new Random();
			int a = r.nextInt(list.size())+0;
		//	int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
			Seat seat =list.get(a);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e1) {
				
				e1.printStackTrace();
			}
			System.out.println("list size "+list.size()+" by "+Thread.currentThread().getName());
			synchronized (seat){
				
					
			if ( bookedseats <list.size()){
			
			
				
				         if (seat.getTravelerName().equalsIgnoreCase("A")){
	        			     seat.setTravelerName(Thread.currentThread().getName()); //seat booked
			        	     bookedseats=bookedseats+1;				
				             System.out.println("\nSeat "+seat.getSeatNo() +"  booked by "+seat.getTravelerName()+", No of booked seats "+bookedseats);
				             this.notbooked=false;
				             try {
								TimeUnit.SECONDS.sleep(2);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				         }
				        
				
			}
			else {
				System.out.println("\nsorry "+Thread.currentThread().getName()+ ", all seats booked ");
				//App.addSeats();
		
				this.notbooked=false;  //this will kill thread
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	         }
	     	}
			}
			
		}


		
		}
		
	
