
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner getNumber = new Scanner(System.in);
        
        System.out.print("Enter Number 1 : ");
        
        int number1 = getNumber.nextInt();
        
        System.out.print("Enter Number 2 : ");
        
        int number2 = getNumber.nextInt();
        
        System.out.print("Enter Number 3 : ");
        
        int number3 = getNumber.nextInt();
        
        if((number1 > number2) && (number1 > number3)){
            
            if(number2 > number3){
                
                System.out.println(number1 + " > " + number2 + " > " + number3);
                
            }
            
            else{
                System.out.println(number1 + " > " + number3 + " > " + number2);
            }
            
        }
        
        else if ((number2 > number1) && (number2 > number3)){
            
            if(number1 > number3){
                
                System.out.println(number2 + " > " + number1 + " > " + number3);
                
            }
            
            else{
                System.out.println(number2 + " > " + number3 + " > " + number1);
            }
            
        }
        
        else if ((number3 > number1) && (number3 > number2)){
            
            if(number1 > number2){
                
                System.out.println(number3 + " > " + number1 + " > " + number2);
                
            }
            
            else{
                
                System.out.println(number3 + " > " + number2 + " > " + number1);
                
            }
            
        }
        
        
    }
    
}
