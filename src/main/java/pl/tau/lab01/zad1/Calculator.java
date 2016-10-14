package pl.tau.lab01.zad1;

public class Calculator {
 
    
    
    public int add(int a, int b){
        return a + b;    
    }
    public int sub(int a, int b){
        return a - b;
    }
    public int multi(int a, int b){
        return a * b;
    }
    public int div(int a, int b){
        int wynik = 0;
        try{
            wynik = a / b;
        }
        catch(ArithmeticException e){            
        }
        return wynik;
    }
    public boolean greater(int a, int b){
        if(a > b)
            return true;
        else return false;
    }
}
