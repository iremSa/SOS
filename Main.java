package org.kodluyoruz;


import java.util.Random;
import java.util.Scanner;

public class Main {
    static char[][]gamepanel;
    static char turn='-';
    static Scanner scan=new Scanner(System.in);
    static Random rand=new Random();
    public static void main(String[] args) {
    gamepanel=new char[3][3];
    printpanel();
  
    int player=0;
    int computer=0;
    boolean gameover = false;
    boolean playagain = true;
    
  while(playagain) {
      while (!gameover) {
          player();
          gameover = Gameover();
          player++;}
          printpanel();
        System.out.print(" Player :"+player+"computer:"+computer);
          if (gameover) {
           break;}
          computer();
          gameover = Gameover();
          computer++;
        printpanel();
       System.out.print("Player :"+player+"computer:"+computer);
          if (gameover) {
              break;}
    }}
    public static void printpanel(){
    	 for(int i=0;i<3;i++){
    	 for(int j=0;j<3;j++){
    		gamepanel[i][j]='-';
     System.out.print(gamepanel[i][j]+"|");
		 }	System.out.println();
       }
    	
    }
    public static char Turn() {
        if (turn == 'S') {
           turn = 'O';
        } else {
            turn = 'S';
        }
        return turn;
    }

    	
    public static void player(){
    	
    	    System.out.println("Please enter a row and column(0,1,2):");
    	  int  row = scan.nextInt(3) - 1;
    	  int  column = scan.nextInt(3) - 1;
    	  while(gamepanel[row][column]!= '-')
    	    if (gamepanel[row][column] == '-') {
    	        gamepanel[row][column] = Turn();
    	    } else {
    	        System.out.println("Please go again");
    	        row = scan.nextInt() - 1;
    	        column = scan.nextInt() - 1;
    	       gamepanel[row][column] = Turn();}
    	
    }

    public static void computer(){
    	    int row = rand.nextInt(3);
    	    int column = rand.nextInt(3);
    	    while (gamepanel[row][column]!= '-') {
    	       
    	        if (gamepanel[row][column] == '-') {
    	        	gamepanel[row][column] = Turn();
    	        } else {
    	            row = rand.nextInt(3);
    	            column = rand.nextInt(3);
    	            gamepanel[row][column] = Turn();
    	        }

    	    }

    	}

    
    public static boolean Gameover (){
            if(gamepanel[0][0]=='S' && gamepanel[0][1]=='O' && gamepanel[0][2]=='S'){
	
            return true;}

        if(gamepanel[1][0]=='S' &&gamepanel[1][1]=='O' && gamepanel[1][2]=='S'){
        	
            return true;}	
        if(gamepanel[2][0]=='S' && gamepanel[2][1]=='O' && gamepanel[2][2]=='S'){
        	
      
            return true;}

        if(gamepanel[0][0]=='S' && gamepanel[1][1]=='O' && gamepanel[2][2]=='S'){
        
            return true;}

        if(gamepanel[0][0]=='S' && gamepanel[1][0]=='O' && gamepanel[2][0]=='S'){
     
            return true;}

        if(gamepanel[0][1]=='S' && gamepanel[1][1]=='O' && gamepanel[2][1]=='S'){
        
            return true;}

        if(gamepanel[0][2]=='S' && gamepanel[1][2]=='O' && gamepanel[2][2]=='S'){
        	
            return true;}

        if(gamepanel[0][2]=='S' && gamepanel[1][1]=='O' && gamepanel[2][0]=='S'){
        
            return true;}
        else {
        	return false;} }


 
  
 }

	








