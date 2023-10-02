package Bola;
/*
R Mochamad Irfan Kusuma Indrayana
1202220316
SI4604
*/
public class Match {
    public String homeTeam;
    public String awayTeam;
    public String date;
    public String score;
    public byte refereeCards;
    public int matchTotalTime;
    public String stadionName;
    
    public void printmatch() {
    	System.out.println("Tim tuan rumah 	 	: " + homeTeam);
    	System.out.println("Tim Tamu 	 	: " + awayTeam);
    	System.out.println("Tanggal	Pertandingan	: " + date);
    	System.out.println("Skor			: "  +   score);
    	System.out.println("Jumlah Pelanggaran 	:" + refereeCards);
    	System.out.println("Total Waktu Pertandingan: " + matchTotalTime);
    	System.out.println("Nama Stadion 		:" +  stadionName);
    	System.out.println("======================");
    }
    	
        public static void main(String[] args) {
        	Team a1 = new Team();
        	Team a2 = new Team();
    		Player a = new Player();
    		Player b = new Player();
    		Player c = new Player();
    		Player d = new Player();
    		Referee r = new Referee();
    		Match m = new Match();
    		

    		a1.teamName = "Suka Bola";
    		a1.player = "Bagus Subagus, Madunesia";
    		a1.coachName = "Nazmi Firdausi";
    		a1.sponsor = "Activation";
    		
    		a2.teamName = "Suka Gawang";
    		a2.player = "Albob Nomiss, Daffa Nolimit";
    		a2.coachName = "Wildan Irwansyah";
    		a2.sponsor = "Waltzy";
    		
    		a.playerName = "Bagus Subagus";
    		a.jerseyNumber = 68;
    		a.goalsScored = 3;
    		a.foulCard = 1;
    		a.activeStatus = true;
    		
    		b.playerName = "Madunesia";
    		b.jerseyNumber = 70;
    		b.goalsScored = 4;
    		b.foulCard = 7;
    		b.activeStatus = true;
    		
    		c.playerName = "Albob Nomiss";
    		c.jerseyNumber = 12;
    		c.goalsScored = 5;
    		c.foulCard = 0;
    		c.activeStatus = true;
    		
    		d.playerName = "Daffa Nolimit";
    		d.jerseyNumber = 14;
    		d.goalsScored = 1;
    		d.foulCard = 9;
    		d.activeStatus = true;
    		
    		r.refereeName = "Bambang Sumiatko";
    		r.refereeLicence = "g66-k99";
    		
    		m.homeTeam = a1.teamName;
    		m.awayTeam = a2.teamName;

    		m.date = "30 September 2023";
    		m.score = "Suka Bola 7 - 6 Suka Gawang ";
    		m.refereeCards  =   17;
    		m.matchTotalTime = 100;
    		m.stadionName = " Graha Bola";
    		
    		
    		a1.printteam();
    		a.printplayer();
    		b.printplayer();
    		a2.printteam();
    		c.printplayer();
    		d.printplayer();  
    		m.printmatch();    
    		r.printreferee(); 
    }
}