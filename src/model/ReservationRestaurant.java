package model;

public class ReservationRestaurant {
	private int num_table = 2;
	private int num_service = 1;
	private int jour = 10;
	private int mois = 12;
	public ReservationRestaurant(int jour, int mois, int num_service, int num_table){
		this.jour = jour;
		this.mois = mois;
		this.num_table = num_table;
		this.num_service = num_service;
	}
	
	public String toString() {
		String service;
		if (this.num_service == 1)
			service  = "premier";
		else service = "deuxième";
		return "Le "+this.jour+"/"+this.mois+"\n"+"Table "+this.num_table+" pour le "+service+" service.";
	}
}
