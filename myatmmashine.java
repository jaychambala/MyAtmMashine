/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myatmmashine;
 import java.util.Scanner;


public class MyATMmashine {
    static Scanner keyboard = new Scanner(System.in);
    private static final String USERNAME = "juma";
    private static final int PIN = 1234;
    static double amount = 00.000;
    
    
   public static void menu(){
       System.out.println("Wellcome" + " " + USERNAME + " " + "Press any one for the choice");
       System.out.println("1. Amount cheking");
       System.out.println("2. Deposit fedha");
       System.out.println("3. Toa fedha");
       System.out.println("4. exit/Toka");
   } 
   
   public static void amount(){
       System.out.println("Your amount is " + amount +" "+ USERNAME);
       
   }
   
   public static void deposit(){
       System.out.println("how many chek you wann enter\n");
       int kiasi = keyboard.nextInt();
       for(int i = 1; i <= kiasi; i++){
           System.out.println("enter cheki number "+ i);
             amount += keyboard.nextDouble();
           
       }
       System.out.println("new amount is " + amount + " " + USERNAME);
   }

    
    public static void main(String[] args) {
        
        System.out.println("WELLCOME ATM MASHINE");
        
        System.out.println("USERNAME >\n");
        String userNameInput = keyboard.nextLine();
        
        System.out.println("PIN >\n");
        int userPIN = keyboard.nextInt();
        
         keyboard.nextLine();
        
        while(!userNameInput.equals(USERNAME) && userPIN != PIN || userNameInput.equals(USERNAME) && userPIN != PIN || !userNameInput.equals(USERNAME) && userPIN == PIN){
        System.out.println("information validation errow");
        
        System.out.println("USERNAME >\n");
         userNameInput = keyboard.nextLine();
         
        System.out.println("PIN >\n");
         userPIN = keyboard.nextInt();
         
        keyboard.nextLine();
        }
        System.out.println(" ");
        System.out.println("logIn successfully and secured\n");
        System.out.println("Wellcome" +" " +USERNAME+" ATM FLOW \n");
        menu();
        
        String choice = keyboard.nextLine();
        
        switch(choice){
            case "1": amount();
                break;
                
            case "2": deposit();
                break;
                
            case "3":
                break;
                
            case "4":
                break;
        }
    }
    
}
