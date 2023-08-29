package calculator;

import java.util.Scanner;


public class Calculator {

    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        
        
        System.out.print("please enter the first number: ");
        int num1=scanner.nextInt();
        
        System.out.print("please enter the second number: ");
        int num2=scanner.nextInt();
        scanner.nextLine();
        
        String operation="Toplama\n"
                + "Cıkarma\n"
                + "Carpma\n"
                + "Bolme\n";
        
        System.out.println(operation);
        
        System.out.print("Choose the operation: ");
        String operation1=scanner.nextLine();
        
        int total;
        
        switch(operation1){
            case "Toplama":
                total=num1+num2;
                System.out.println("Sonuc: "+total);
                break;
            case "Cıkarma":
                if(num1>num2){
                    total=num1-num2;
                    System.out.println("Sonuc: "+total);
                }
                else{
                    total=num2-num1;
                    System.out.println("Sonuc: "+total);
                }
               
                break;
            case "Carpma":
                total=num1*num2;
                System.out.println("Sonuc: "+total);
                break;
            case "Bolme":
                total=num1/num2;
                System.out.println("Sonuc: "+total);
                break;
    
        }
        
    }
    
}
