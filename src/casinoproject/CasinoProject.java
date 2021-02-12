package casinoproject;

import java.util.*;
import java.util.stream.IntStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
public class CasinoProject {
    
    
    //in roulette, rouletteMoneyBet is the odds bet. But rouletteBet is the acutal deposit variable
    
    static boolean booleanRoulette = true;
 public static double balance = 1000; 
public static double rouletteBetGlobal;//number of sanwiches user betted
public static double globalMultiplier;
public static int globalNumberofNumbers;
public static double rouletteMoneyBetGlobal;//Number user chose as their winning number

public static String objective;
public static String School;
public static String MaidenName;
    public static void main(String[] args) {
        boolean end = false;
        System.out.println("\u001B[31mImportant Note: The Odds are horrible and I don't know how they are actually supposed to work\u001B[30m\n");
        
        while (end == false){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to My Casino!");
        System.out.println("\u001B[30mIn My Casino, the only currency that matters is \u001B[36mSandwiches");
        System.out.println("\u001B[30mWe have three different games avaliable to you: \u001B[31mRoulette, \u001B[30mSlots and \u001B[34mHigher or Lower.");
        System.out.println("You current balance is: " + balance + " Sandwiches\n");
        
            security();
            
//            System.out.println("Would you like to trade money in for more sandwiches, Y OR N");
//            String MoreSandwiches = input.next();
//            while (!MoreSandwiches.equalsIgnoreCase("y") && !MoreSandwiches.equalsIgnoreCase("n")){
//                System.out.println("Invalid Input, do you want more sandwiches, Y or N");
//                String MoreSandwiches1 = input.next();
//                MoreSandwiches1 = MoreSandwiches;
//            }
//            if (MoreSandwiches.equalsIgnoreCase("n")){
//                System.out.println("good...");
//            }else{
//                playMusic("C:\\Users\\raidl\\OneDrive\\Documents\\NetBeansProjects\\CasinoProject\\music");
//            }
//            
            
            
        System.out.println("\u001B[34mWhich game would you like to play, \u001B[31mRoulette(A), \u001B[30mSlots(B) \u001B[34mor \u001B[35mHigher or Lower(C).\n If you would like to withraw your sandwiches, enter 'D'");
        String gameChoice = input.next();
        while (!gameChoice.equalsIgnoreCase("A") && !gameChoice.equalsIgnoreCase("B") && !gameChoice.equalsIgnoreCase("C") && !gameChoice.equalsIgnoreCase("D")){
            System.out.println("Invalid input, please try again");
            System.out.println("\u001B[34mWhich game would you like to play, \u001B[31mRoulette(A), \u001B[30mSlots(B) \u001B[34mor \u001B[35mHigher or Lower(C).\n If you would like to withraw your sandwiches, enter 'D'");
            String gameChoice1 = input.next();
            gameChoice = gameChoice1;
        }
            System.out.println("\u001B[31mMay the odds be never in your favour");
        switch (gameChoice.toUpperCase()) {
                case "A":
                    roulette();
                    break;

                case "B":

                    slots();
                    break;

                case "C":

                    HorL();
                    break;
                case "D":
                    
                    withdraw();
                    break;
                                        
        
    }
        }
    }
    public static void security(){
        Scanner input = new Scanner(System.in);
        System.out.println("The following questions are for security measures, and so that we here at MyCasino TM know where to find you should you cheat in any way shape or form.\n");

            System.out.println("What is your objective here today?");
            objective = input.next();
            System.out.println("What is your mother's maiden name?");
            MaidenName = input.next();
            System.out.println("What primary school did you attend?");
            School = input.next();
    }
    
    public static void withdraw(){
        Scanner input = new Scanner (System.in);
        
        System.out.println("So, you would like to withdraw your sandwiches...");
        System.out.println("Well, how do I know you are the same person trying to withdraw, as the one of won (or lost0 all the sanwiches");
        System.out.println("Its quite simple actually...");
        try{
        TimeUnit.SECONDS.sleep(7);
        }catch(InterruptedException e){
            
        }
        System.out.println("You must answer questions, if you are to take that which you won!\n");
        System.out.println("Please answer the following questions to the best of your ability: \n");
        
            
            System.out.println("What is your mother's maiden name?");
            String MaidenName2 = input.next();
            System.out.println("What primary school did you attend?");
            String School2 = input.next();
        if (!MaidenName.equalsIgnoreCase(MaidenName2) || !School.equalsIgnoreCase(School2)){
            System.out.println("NO - You are the wrong person!");
            System.out.println("Enter Loop Hell");
            try{
            TimeUnit.SECONDS.sleep(1);
            }catch(InterruptedException e){
                
            }
            int x = 5;
                
            while (x < 100){
                x++;
                try{
                    TimeUnit.MILLISECONDS.sleep(40);
                }catch(InterruptedException e){
                    
                }
                System.out.println("You Cheat");
            }
//            try{
//            TimeUnit.SECONDS.sleep(2);
//            }catch(InterruptedException e){
//                
//            }
//            
            //playMusic("C:\\Users\\raidl\\OneDrive\\Documents\\NetBeansProjects\\CasinoProject\\music");
            
        }
            
    }
    public static void playMusic(String filepath){
        InputStream music;
        try{
            music = new FileInputStream(new File(filepath));
            AudioStream audios= new AudioStream(music);
            AudioPlayer.player.start(music);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: Audio File Not Supported. Dunno why tho");
        }
    }
    
        public static void slots(){
            Scanner input = new Scanner(System.in);
            Random rand = new Random();
            boolean booleanSlots = true;
            while (booleanSlots == true){
            
            
            System.out.println("You have chosen to play slots");
            System.out.println("In slots, 3 random numbers will be generated, if they are all the same then you win, if not, you lose");
            System.out.println("Different numbers have different values as there are more 1's than there are 9's.");
            System.out.println("instead of choosing an exact number of sanwiches to bet, you have to choose from a select few choices.");
            System.out.println("Your reward for winning scales with each each rarity, so you recieve a greater reward for getting 3 9's then you do 3 1's");
            
            int[] slotsArray = new int[] {1,1,1,1,1,1,2,2,3};
            //there are 20 1's, 15 3's, 10 4's, 6 6's, 5 7's, 3 8's, and 2 9's
            int Num1 = rand.nextInt((8-1)+1)+1;
            int Num2 = rand.nextInt((8-1)+1)+1;
            int Num3 = rand.nextInt((8-1)+1)+1;
            System.out.println("\nIf you get 3 1's you win back 5 times what you betted");
            System.out.println("If you get 3 2's you win 10 times what you betted");
            System.out.println("If you get 3 3's you win back 20 times what you betted.");
            System.out.println("How much do you want to bet. 10 sandwich(A), 50(B), 100(C) or 500(D) ");
            String slotsMoneyBet = input.next();
            while (!slotsMoneyBet.equalsIgnoreCase("a") && !slotsMoneyBet.equalsIgnoreCase("b") && !slotsMoneyBet.equalsIgnoreCase("c") && !slotsMoneyBet.equalsIgnoreCase("d") && !slotsMoneyBet.equalsIgnoreCase("e")){
                System.out.println("Invalid Input.");
                System.out.println("How much do you want to bet. 10 sandwich(A), 50(B), 100(C) or 500(D) ");
                String slotsMoneyBet2 = input.next();
                slotsMoneyBet = slotsMoneyBet2;
            }
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            
            System.out.println("Your Numbers are\n" + slotsArray[Num1] + " " +  slotsArray[Num2] + " " + slotsArray[Num3]);
            
            if(slotsArray[Num1] == slotsArray[Num2] && slotsArray[Num2] == slotsArray[Num3]){
                System.out.println("You win");                                 //this is for if you win. Tried adding them separately using way less code, didtn work.
            if (slotsMoneyBet.equalsIgnoreCase("a")){                          //assigned varibales were not found
                balance = balance - 10;
                if( Num1 == 1 ){
                balance = balance + (10 * 5);
            }else if(Num1 == 2){
                balance = balance + (10 * 10);
            }else if(Num1 == 3){
                balance = balance + (10 * 20);
//            }else if(Num1 == 8){
//                balance = balance + (10 * 50);
//            }else if(Num1 == 9){
//                balance = balance + (10 * 100);
            }         
                   
            }else if(slotsMoneyBet.equalsIgnoreCase("b")){
                balance = balance - 50;
                if( Num1 == 1){
                balance = balance + (50 * 5);
            }else if(Num1 == 2){
                balance = balance + (50 * 10);
            }else if(Num1 == 3){
                balance = balance + (50 * 20);
//            }else if(Num1 == 8){
//                balance = balance + (50 * 50);
//            }else if(Num1 == 9){
//                balance = balance + (50 * 100);
            }    
            }else if(slotsMoneyBet.equalsIgnoreCase("c")){
                balance = balance - 100;
                if( Num1 == 1){
                balance = balance + (100 * 5);
            }else if(Num1 == 2){
                balance = balance + (100 * 10);
            }else if(Num1 == 3){
                balance = balance + (100 * 20);
//            }else if(Num1 == 8){
//                balance = balance + (100 * 50);
//            }else if(Num1 == 9){
//                balance = balance + (100 * 100);
            }  
            }else if(slotsMoneyBet.equalsIgnoreCase("d")){
                balance = balance - 500;
            if( Num1 == 1){
                balance = balance + (500 * 5);
            }else if(Num1 == 2){
                balance = balance + (500 * 10);
            }else if(Num1 == 3){
                balance = balance + (500 * 20);
//            }else if(Num1 == 8){
//                balance = balance + (500 * 50);
//            }else if(Num1 == 9){
//                balance = balance + (500 * 100);
            }
            }
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                System.out.println("Your new balance is " + balance);
            }else if (slotsMoneyBet.equalsIgnoreCase("a") && Num1 != Num2){
                balance = balance - 10;
                System.out.println("You lose, your new balance is " + balance);
            }else if (slotsMoneyBet.equalsIgnoreCase("b") && Num1 != Num2){
                balance = balance - 50;
                System.out.println("You lose, your new balance is " + balance);
            }else if (slotsMoneyBet.equalsIgnoreCase("c") && Num1 != Num2){
                balance = balance - 100;
                System.out.println("You lose, your new balance is " + balance);
            }else if (slotsMoneyBet.equalsIgnoreCase("d") && Num1 != Num2){
                balance = balance - 500;
                System.out.println("You lose, your new balance is " + balance);
            }
            
            System.out.println("Do you want to play slots again, Y or N");
            String booleanSlotsChoice = input.next();
            while (!booleanSlotsChoice.equalsIgnoreCase("y") && !booleanSlotsChoice.equalsIgnoreCase("N")){
                System.out.println("Invalid Input. Do you want to play slots again, Y or N");
                String booleanSlotsChoice2 = input.next();
                booleanSlotsChoice = booleanSlotsChoice2;
            }
            if (booleanSlotsChoice.equalsIgnoreCase("n")){
                booleanSlots = false;
            }
        }
        }
    
        
    public static void roulette(){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        while (booleanRoulette == true){
        
        System.out.println("You have chosen to play roulette.");
        System.out.println("In this game you pick a number and a random number generator chooses one too. if you choose the same nunmber, you win if not, you lose");
        System.out.println("You may choose the odds with a higher reward for more difficult odds.");
        System.out.println("Choose your odds:\n1 in 3 for 150% return(A)\n1 in 6 for 250% return(B)\n1 in 10 for 800% return(C)");
        System.out.println("Please enter the letter of you choice or type 'E' to exit the game");
        String rouletteChoice = input.next();
        while(!rouletteChoice.equalsIgnoreCase("A") && !rouletteChoice.equalsIgnoreCase("B") && !rouletteChoice.equalsIgnoreCase("C") && !rouletteChoice.equalsIgnoreCase("E")){
            System.out.println("Invalid input, please try again");
            String rouletteChoice1 = input.next();
            rouletteChoice = rouletteChoice1;
        }
            switch(rouletteChoice.toUpperCase()){
                
                case "A":
                    int[] Roulette1_in_3 = new int[] {1,2,3};
                     globalMultiplier = 1.5;
                    int numberOfNumbers = 3;
                    globalNumberofNumbers = numberOfNumbers;
                    System.out.println("How much do you want to bet?");
                    rouletteBetting();
                    
                    boolean booleanRMB = true;
                    while (booleanRMB == true){
                    try{
                    System.out.println("Pick 1, 2 or 3");
                    int rouletteMoneyBet = input.nextInt();
//                    while (rouletteMoneyBet !=(int)rouletteMoneyBet){
//                        System.out.println("Invalid Input. Pick 1, 2 or 3"); // this doesnt work
//                        int rouletteMoneyBet2 = input.nextInt();
//                        rouletteMoneyBet = rouletteMoneyBet2;
//                    }
                    
                    boolean contains = IntStream.of(Roulette1_in_3).anyMatch(x -> x == rouletteMoneyBet);//not even sure what this does anymore
                    if (rouletteMoneyBet == 1 || rouletteMoneyBet == 2 || rouletteMoneyBet == 3){
                    booleanRMB = false;
                    balance = balance - rouletteBetGlobal;
                    rouletteMoneyBetGlobal = rouletteMoneyBet;
                    rouletteBetting2();
                    }
                    }catch(Exception error){
                        System.out.println(error);
                        System.out.println("Invalid Input");
                    }
                    }
                    
                    
                case "B":
                    if(rouletteChoice.equalsIgnoreCase("B")){
                    rouletteCaseB();
                    break;
                    }
                case "C":
                    if(rouletteChoice.equalsIgnoreCase("C")){
                    rouletteCaseC();
                    break;
                    }
                case "E":
                    booleanRoulette = false;
                    break;
        }
    
        }
    }
    
    public static void rouletteBetting(){
        Scanner input = new Scanner(System.in);
        boolean booleanRB = true;
        while (booleanRB == true){
        try{
                    double rouletteBet = input.nextInt();
                    while (rouletteBet > balance || rouletteBet <= 0){
                        System.out.println("Invalid bet,not enough sandwiches or wrong input. You current sandwich balance is: "  + balance);
                        System.out.println("How much would you like to bet?");
                        double rouletteBet2 = input.nextInt();
                        rouletteBet = rouletteBet2;
                    }
                    rouletteBetGlobal = rouletteBet;
                    }catch(Exception error){
                        input.nextLine();
                        System.out.println(error);
                        System.out.println("Invalid bet, not enough sanwiches. Your current balance = " + balance);
                    }
        //THe 2 lines below should not run if the catch runs
        booleanRB = false;
            System.out.println("Corrrect input");
        }
    }
    
    public static void rouletteBetting2(){
        Scanner input = new Scanner(System.in);
        Random rand  =new Random();
        int r1 = rand.nextInt((globalNumberofNumbers -1)+1)+1;
                    if (rouletteMoneyBetGlobal == r1){
                        balance = balance + (rouletteBetGlobal * globalMultiplier);
                        System.out.println("You win " + (rouletteBetGlobal  * globalMultiplier) + " sandwiches. Your new balance is " + balance  + " sanwiches");
                    }else{
                        System.out.println("Sorry, you lost. Your balance is currently " + balance + " sanwiches");
                        System.out.println("Would you like to continue playing roulette, 'Y' or 'N'");
                        String continue1 = input.next();
                        
                        while (!continue1.equalsIgnoreCase("y") && !continue1.equalsIgnoreCase("n")){
                        System.out.println("Invalid input. Do you want to play roulette again, 'Y' or 'N'");
                        String continue2 = input.next();
                        continue1 = continue2;
                    }
                        if (continue1.equalsIgnoreCase("n")){
                            booleanRoulette = false;
                        }else{
                        }
                    }
    }

    public static void rouletteCaseB(){
        Scanner input = new Scanner(System.in);
        int[] Roulette1_in_6 = new int[] {1,2,3,4,5,6};
        globalMultiplier = 2.5;
                    int numberOfNumbers = 6;
                    globalNumberofNumbers = numberOfNumbers;
                    System.out.println("How much do you want to bet?");
                    rouletteBetting();
                    
                    System.out.println("Pick 1, 2, 3, 4, 5 or 6");
                    //try{
                    int rouletteMoneyBet = input.nextInt();
                    boolean contains = IntStream.of(Roulette1_in_6).anyMatch(x -> x == rouletteMoneyBet);

                    balance = balance - rouletteBetGlobal;
                    rouletteMoneyBetGlobal = rouletteMoneyBet;
                    rouletteBetting2();
    }
    
    public static void rouletteCaseC(){
        int[] Roulette1_in_10 = new int[] {1,2,3,4,5,6,7,8,9,10};
        Scanner input = new Scanner(System.in);
        globalMultiplier = 8;
                    int numberOfNumbers = 10;
                    globalNumberofNumbers = numberOfNumbers;
                    System.out.println("How much do you want to bet?");
                    rouletteBetting();
                    
                    System.out.println("Pick 1, 2, 3, 4, 5, 6, 7, 8, 9 or 10");
                    //try{+

                   int rouletteMoneyBet = input.nextInt();
                   if (rouletteMoneyBet != (int)(rouletteMoneyBet)){
                       throw new IllegalArgumentException("no");
                   }
                    boolean contains = IntStream.of(Roulette1_in_10).anyMatch(x -> x == rouletteMoneyBet);
                   
                    balance = balance - rouletteBetGlobal;
                    rouletteMoneyBetGlobal = rouletteMoneyBet;
                    rouletteBetting2();
    }
    
    
    public static void HorL(){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("You have chosen to play Higher or Lower!");
        System.out.println("In higher or Lower, we play with a pack of 52 cards, suites dont make a difference. There are two difficulties, but you'll learn more about that later\n");
        System.out.println("How to play:\n\nYou are given a random card, e.g. Jack and you must guess whether the next one will be higher or lower.");
        System.out.println("Once a card is chosen, it cannot be picked again. However, since it is one deck, there are 4 of each card.");
        System.out.println("In Easy mode, having the same cards chosen counts as a win for the user, and choosing Ace also means you win as it can be whatever you want it to be ");
        System.out.println("In Hard mode, if the same card is chosen it results in a loss, unless you guess it will be the same card. Ace is lower than 2\n");
        System.out.println("How to bet?\n\nBetting will occur before each guess, as you guess you can choose your bet for the one ahead. On easy  mode, your return is 150% (after diposit), and on hard its 200%(afterdiposit)");
        System.out.println("On hard mode, if you have 10 consecutaive wins, you are awarded 5000 sandwiches.");
        System.out.println("Which difficulty would you like to play on, easy(e) or hard(h)");
        String difficulty = input.next();
        int hardConsecutiveWins = 0;
        int J = 11;
        int Q = 12;
        int K = 13;
        int A = 0;
        while (!difficulty.equalsIgnoreCase("e") && !difficulty.equalsIgnoreCase("h")){
            System.out.println("Invalid Input, what difficulty do you want, easy(e) or hard(h)");
            String difficulty1 = input.next();
            difficulty = difficulty1;
        }
        if (difficulty.equals("e")){
        
        boolean EasyHorLcontinue1 = true;
        while (EasyHorLcontinue1 == true){
        int[] EasyCards = new int[] {A,A,A,A, 2,2,2,2, 3,3,3,3, 4,4,4,4, 5,5,5,5, 6,6,6,6, 7,7,7,7, 8,8,8,8, 9,9,9,9, 10,10,10,10, J,J,J,J, Q,Q,Q,Q, K,K,K,K};
        ArrayList<Integer> EasyCardsList = new ArrayList<Integer>(Arrays.asList(A,A,A,A, 2,2,2,2, 3,3,3,3, 4,4,4,4, 5,5,5,5, 6,6,6,6, 7,7,7,7, 8,8,8,8, 9,9,9,9, 10,10,10,10, J,J,J,J, Q,Q,Q,Q, K,K,K,K));
           
        int EasyrandomCard = rand.nextInt((EasyCardsList.size() - 1)+1)+1;
        EasyCardsList.remove(EasyrandomCard);//removes used card from arrayList. NOT from array

            System.out.println("Your current balance is " + balance);
            System.out.println("How many sanwiches would you like to bet?");
            
            double EasyHorLMoneyBet = input.nextDouble();
            boolean booleanEHorLMB = true;
            while (booleanEHorLMB == true){//to loop try for multiple wrong data type inputs
            try{//for wrong data type input
            while (EasyHorLMoneyBet > balance || EasyHorLMoneyBet <= 0){//for multiple invalid integer inputs
                System.out.println("Invalid input, not enough sandwiches");//And try catch to money bet for both hard and easy mode
                double EasyHorLMoneyBet2 = input.nextInt();
                EasyHorLMoneyBet = EasyHorLMoneyBet2;
            }
           }catch(Exception error){
                        System.out.println(error);
                        System.out.println("Invalid bet, not enough sanwiches. Your current balance = " + balance);
                    }
                booleanEHorLMB = false;
            }
            int EasyrandomNextCard = rand.nextInt((EasyCardsList.size() - 1)+1)+1;
            balance = balance - EasyHorLMoneyBet;
           // System.out.println("The first chosen card is " + randomCard);
            System.out.println("The current card is a " + EasyCardsList.get(EasyrandomCard));
            
            
                //System.out.println("Delet after: the next card is " + EasyCards[EasyrandomNextCard]);
                //System.out.println("The size of the array list is: " + EasyCardsList.size());
                //System.out.println("The size of the Array is " + EasyCards.length);
                
                System.out.println("Do you think your card will be higher(h), lower(l) or the same(s)");
                String HorLBet  = input.next();
                while (!HorLBet.equalsIgnoreCase("h") && !HorLBet.equalsIgnoreCase("l") && !HorLBet.equalsIgnoreCase("s")){
                    System.out.println("Invalid Input, please try again - higher(h), lower(l) or the same(s)");
                    String HorLBet2 = input.next();
                    HorLBet = HorLBet2;
            }  
                                
                while (EasyCards[EasyrandomNextCard] == A || EasyrandomNextCard == EasyrandomCard){
                    System.out.println("The next card picked was an ace. You automatically win");
                    balance = balance + (EasyHorLMoneyBet * 1.5);
                    EasyrandomNextCard = rand.nextInt((EasyCardsList.size() - 1)+1)+1;
                }
                if (EasyCards[EasyrandomCard] > EasyCards[EasyrandomNextCard] && HorLBet.equalsIgnoreCase("l")){
                System.out.println("You win " + (EasyHorLMoneyBet * 1.5));
                System.out.println("The next card is a " + EasyCards[EasyrandomNextCard]);
                balance = balance + (EasyHorLMoneyBet*1.5);
                System.out.println("Your new balance is " + balance);
            }    
                //if first shown card is samller than the next one AND you say that then
            else if(EasyCards[EasyrandomCard] < EasyCards[EasyrandomNextCard] && HorLBet.equalsIgnoreCase("h")){
                System.out.println("You win " + (EasyHorLMoneyBet * 1.5));
                System.out.println("The next card is a " + EasyCards[EasyrandomNextCard]);
                balance = balance + (EasyHorLMoneyBet*1.5);
                System.out.println("Your new balance is " + balance);
            }
            else{
                    System.out.println("You lose, too bad.");
            }
            System.out.println("Do you want to play again, Y or N");
            String Easycontinue1 = input.next();
            while(!Easycontinue1.equalsIgnoreCase("n") && !Easycontinue1.equalsIgnoreCase("Y")){
                System.out.println("Invalid input. Do you want to play again, Y or N");
                String Easycontinue2 = input.next();
                Easycontinue1 = Easycontinue2;
            }
            if (Easycontinue1.equalsIgnoreCase("n")){
                EasyHorLcontinue1 = false;
            }    
        }
                
                //Split Between Easy and Hard difficulties
                
                
        }else{            
            //This array doesnt lose elemnent so i can compare with user input to see if they win or lose.
            int[] Cards = new int[] {A,A,A,A, 2,2,2,2, 3,3,3,3, 4,4,4,4, 5,5,5,5, 6,6,6,6, 7,7,7,7, 8,8,8,8, 9,9,9,9, 10,10,10,10, J,J,J,J, Q,Q,Q,Q, K,K,K,K};
            ArrayList<Integer> CardsList = new ArrayList<Integer>(Arrays.asList(A,A,A,A, 2,2,2,2, 3,3,3,3, 4,4,4,4, 5,5,5,5, 6,6,6,6, 7,7,7,7, 8,8,8,8, 9,9,9,9, 10,10,10,10, J,J,J,J, Q,Q,Q,Q, K,K,K,K));
            //This arraylist loses elements so that the same card doesnt get picked twice
            
            //Arrays.asList(Cards);
            boolean HorLcontinue = true;
            while(HorLcontinue == true){
                
            if (hardConsecutiveWins == 10){
                System.out.println("Congratulations, you won 10 in a row on hard difficulty and have been rewarded 5000 sanwiches");
                balance = balance + 5000;
                hardConsecutiveWins = 0;
            }    
        int randomCard = rand.nextInt((CardsList.size() - 1)+1)+1;
        CardsList.remove(randomCard);//removes used card from arrayList. NOT from array

            System.out.println("Your current balance is " + balance);
            System.out.println("How many sanwiches would you like to bet?");
            double HorLMoneyBet = input.nextInt();
            while (HorLMoneyBet > balance || HorLMoneyBet <= 0){
                System.out.println("Invalid input, not enough sandwiches");
                double HorLMoneyBet2 = input.nextInt();
                HorLMoneyBet = HorLMoneyBet2;
            }
            
            int randomNextCard = rand.nextInt((CardsList.size() - 1)+1)+1;
            balance = balance - HorLMoneyBet;
           // System.out.println("The first chosen card is " + randomCard);
            System.out.println("The current card has a value of " + CardsList.get(randomCard));
            
            
//                System.out.println("Delet after: the next card is " + Cards[randomNextCard]);
//                System.out.println("The size of the array list is: " + CardsList.size());
//                System.out.println("The size of the Array is " + Cards.length);
                
            System.out.println("Do you think your card will be higher(h), lower(l) or the same(s)");
            String HorLBet  = input.next();
            while (!HorLBet.equalsIgnoreCase("h") && !HorLBet.equalsIgnoreCase("l") && !HorLBet.equalsIgnoreCase("s")){
                System.out.println("Invalid Input, please try again - higher(h), lower(l) or the same(s)");
                String HorLBet2 = input.next();
                HorLBet = HorLBet2;
            }
            
            
            //if first shown card is bigger than the next card AND user said next card would be Smaller (they are correct) then
            if (Cards[randomCard] > Cards[randomNextCard] && HorLBet.equalsIgnoreCase("l")){
                System.out.println("You win " + (HorLMoneyBet * 2));
                balance = balance + (HorLMoneyBet*2);
                System.out.println("The next has a value of" + Cards[randomNextCard]);
                System.out.println("Your new balance is " + balance);
                hardConsecutiveWins++;
            }    
                //if first shown card is samller than the next one AND you say that then
            else if(Cards[randomCard] < Cards[randomNextCard] && HorLBet.equalsIgnoreCase("h")){
                System.out.println("You win " + (HorLMoneyBet * 2));
                balance = balance + (HorLMoneyBet*2);
                System.out.println("The next card has a value of " + Cards[randomNextCard]);
                System.out.println("Your new balance is " + balance);
                hardConsecutiveWins++;
            }
                //if the two cards are equal and you say that
            else if (randomCard == randomNextCard && HorLBet.equalsIgnoreCase("s")){
                System.out.println("You win " + (HorLMoneyBet * 2));
                balance = balance + (HorLMoneyBet*2);
                System.out.println("The next card has a value of " + Cards[randomNextCard]);
                System.out.println("Your new balance is " + balance);
                hardConsecutiveWins++;
                //otherwise you lose
            }else{
                System.out.println("You lose. Your currenct balance is "+ balance);
                hardConsecutiveWins = 0;
            }
            System.out.println("Do you want to play again, Y or N");
            String continue1 = input.next();
            while(!continue1.equalsIgnoreCase("n") && !continue1.equalsIgnoreCase("Y")){
                System.out.println("Invalid input. Do you want to play again, Y or N");
                String continue2 = input.next();
                continue1 = continue2;
            }
            if (continue1.equalsIgnoreCase("n")){
                HorLcontinue = false;
            }
            }
        
        
    }
    }
}