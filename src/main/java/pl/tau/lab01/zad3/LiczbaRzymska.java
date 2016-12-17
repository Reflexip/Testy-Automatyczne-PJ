package pl.tau.lab01.zad3;


public class LiczbaRzymska {
    
	private int liczba;
	
	public String toString() {
		int mnoznik=0, tab[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String suma="";
		
		if(liczba>3999) return "More than 3999";
		if(liczba<0) liczba*=-1;
		
		for(int j=0;j<tab.length;j++){
			if(liczba>=tab[j]){
				mnoznik=liczba/tab[j];
				suma+=addLiczba(tab[j], mnoznik);
			}
		}
		return suma;
	}
	
	private String addLiczba(int ilosc, int mnoznik){
		String litera="", suma="";
		
		switch (ilosc) {
		case 1000:
			litera="M";
			break;
		
		case 900:
			litera="CM";
			break;
		
		case 500:
			litera="D";
			break;
			
		case 400:
			litera="CD";
			break;
		
		case 100:
			litera="C";
			break;
			
		case 90:
			litera="XC";
			break;
			
		case 50:
			litera="L";
			break;
			
		case 40:
			litera="XL";
			break;
			
		case 10:
			litera="X";
			break;
			
		case 9:
			litera="IX";
			break;
		
		case 5:
			litera="V";
			break;
			
		case 4:
			litera="IV";
			break;
			
		case 1:
			litera="I";
			break;
			
		default:
			break;
		}
		for(int i=0; i<mnoznik; i++){
			liczba-=ilosc;
			suma+=litera;
		}
		return suma;
	}

	public void setLiczba(int liczba) {
		this.liczba = liczba;
	}
	
}
