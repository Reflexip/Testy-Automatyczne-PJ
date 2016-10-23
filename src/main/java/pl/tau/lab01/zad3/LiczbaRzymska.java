package pl.tau.lab01.zad3;


public class LiczbaRzymska {
    private int number;
    private static final int arabic[] = {1000, 500, 100, 50, 10, 5, 1};
    private static final char roman[] = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
    private static final int ROMAN_N = arabic.length;
    
    public LiczbaRzymska(int number) {
        this.number = number;
    }
    
    
    public String toString(){
        int i = 0; 
        if(number < 0)
            number *= -1;
        
        String result = "";
        if ((number > 3999) || (number <= 0))
            return result;

        while ((number > 0) && (i < ROMAN_N)){
        if(number >= arabic[i]){
        number -= arabic[i];
        result += roman[i];
        }
        else if ((i%2 == 0) &&
        (i<ROMAN_N-2) && 
        (number >= arabic[i] - arabic[i+2]) &&
        (arabic[i+2] != arabic[i] - arabic[i+2]))
        {
        number -= arabic[i] - arabic[i+2];
        result += roman[i+2];
        result += roman[i];
        i++;
        }
        else if ((i%2 == 1) &&
        (i<ROMAN_N-1) && 
        (number >= arabic[i] - arabic[i+1]) &&
        (arabic[i+1] != arabic[i] - arabic[i+1]))
        {
        number -= arabic[i] - arabic[i+1];
        result += roman[i+1];
        result += roman[i];
        i++;
        }
        else
        {
        i++;
        }
        }

        return result;
    }
}
