package activities;

public class Activity3 {
	double seconds = 1000000000;
	
	double mercuryseconds = 0.2408467;
	double venusseconds = 0.61519726;
	double marsseconds = 1.8808158;
	double jupitorseconds = 11.862615;
	double saturnseconds = 29.447498;
	double uranusseconds = 84.016846;
	double neptuneseconds = 164.79132;
	

	public static void main(String[] args) {
		Activity3 age = new Activity3();
		age.calculatemercuryage();
		age.calculatevenusage();
		age.calculatemarsage();
		age.calculatejupitorage();
		age.calculatesaturnage();
		age.calculateuranusage();
		age.calculateneptuneage();
	}

	public  void calculatemercuryage(){
		double agecalculatorinmercury = mercuryseconds*365.25*60*60*24;
		double actualmerucuryage = seconds/agecalculatorinmercury;
		System.out.println(actualmerucuryage);
	}
	public  void calculatevenusage(){
		double agecalculatorinvenus = venusseconds*365.25*60*60*24;
		double actualvenusage = seconds/agecalculatorinvenus;
		System.out.println(actualvenusage);
	}
	public  void calculatemarsage(){
		double agecalculatorinmars = marsseconds*365.25*60*60*24;
		double actualmarsage = seconds/agecalculatorinmars;
		System.out.println(actualmarsage);
	}
	public  void calculatejupitorage(){
		double agecalculatorinjupitor = jupitorseconds*365.25*60*60*24;
		double actualjupitorage = seconds/agecalculatorinjupitor;
		System.out.println(actualjupitorage);
	}
	public  void calculatesaturnage(){
		double agecalculatorinsaturn = saturnseconds*365.25*60*60*24;
		double actualsaturnage = seconds/agecalculatorinsaturn;
		System.out.println(actualsaturnage);
	}

	public  void calculateuranusage(){
		double agecalculatorinuranus = uranusseconds*365.25*60*60*24;
		double actualuranusage = seconds/agecalculatorinuranus;
		System.out.println(actualuranusage);
	}
	public  void calculateneptuneage(){
		double agecalculatorinneptune = neptuneseconds*365.25*60*60*24;
		double actualneptuneage = seconds/agecalculatorinneptune;
		System.out.println(actualneptuneage);
	}
	
}
	
