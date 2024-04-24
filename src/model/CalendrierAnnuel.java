package model;

public class CalendrierAnnuel {
	boolean[][] jours = new boolean[31][12];
	public CalendrierAnnuel() {
		for (int i = 0; i<31;i++) {
			for (int y = 0; y<12;y++) {
				this.jours[i][y] = true;
			}
		}
	}
	
	public boolean estLibre(int i, int y) {
		return jours[i-1][y-1];
	}
	
	public boolean reserver(int i, int y) {
		if (estLibre(i,y)) {
			jours[i-1][y-1] = false;
			return true;
		}
		else return false;
	}
}
