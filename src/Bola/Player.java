package Bola;
/*
 R Mochamad Irfan Kusuma Indrayana
 1202220316
 SI4604
 */
public class Player {
    public String playerName;
    public int jerseyNumber;
    public int goalsScored;
    public int foulCard;
    public boolean activeStatus;
    public Referee refere;
    public Team teams;
    
    public void printplayer() {
    	//teams.printteam();
    	System.out.println("Nama Player 	: " + playerName);
    	System.out.println("Nomor Jersey 	: " + jerseyNumber);
    	System.out.println("Gol Dicetak	: " + goalsScored);
    	System.out.println("Pelanggaran	: " + foulCard);
    	System.out.println("Status 		: " + activeStatus);
    	System.out.println("======================");
    	
    }
}
