import java.util.Random;
import java.util.Scanner;
public class Gameof23 {
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    public static int toothpicks = 23;
    public static void human_Turn(){
        int humanpick;
        if(toothpicks>=2){
            System.out.println("Pick toothpicks 1 to 3 to play this '23' game : ");
            humanpick = sc.nextInt();
            if(humanpick>3){
                System.out.println("You pick more than 3 toothpicks ! Please pick again : ");
                humanpick = sc.nextInt();
            }
            toothpicks -= humanpick;
        }
        else{
            humanpick = 1 ;
            toothpicks -= humanpick;
            System.out.println("You Lose ! You pick the last toothpick.");
        }
    }
    public static void computer_Turn(){
        int computerpick;
        if(toothpicks!=0){
            if(toothpicks>4){
                computerpick = r.nextInt(1,3);
                toothpicks -= computerpick;
                System.out.println("After computer's turn "+toothpicks+" toothpicks letf ! \n");
            }
            else if(toothpicks<=4 && toothpicks!=1){
                if(toothpicks == 4){
                    computerpick = 3;
                    toothpicks -= computerpick;
                    System.out.println("After computer's turn "+toothpicks+" toothpicks letf ! \n");
                }
                else if(toothpicks == 3){
                    computerpick = 2;
                    toothpicks -= computerpick;
                    System.out.println("After computer's turn "+toothpicks+" toothpicks letf ! \n");
                }
                else{
                    computerpick = 1;
                    toothpicks -= computerpick;
                    System.out.println("After computer's turn "+toothpicks+" toothpicks letf ! \n");
                }
            }
            else{
                computerpick = 1;
                toothpicks -= computerpick;
                System.out.println("You win ! Computer's picks the last toothpick.");
            }

        }
    }
    public static void play(){
        while(toothpicks>0){
        human_Turn();
        computer_Turn();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\t---------------------------------------------");
        System.out.println("\t|                Game of '23'               |");
        System.out.println("\t---------------------------------------------");
        System.out.println("\tPress:");
        System.out.println("\t1 = START GAME");
        System.out.println("\t2 = INSTRUCTIONS");
        System.out.println("\t3 = QUIT");
        int num1;
        num1 = s.nextInt();
        if(num1 == 1){
            play();
        }
        else if(num1 == 2){
            System.out.println("The game of 23 is a two-player game that begins with a pile of 23 toothpicks.");
            System.out.println("Players take turns, withdrawing either 1, 2, or 3 toothpicks at a time.");
            System.out.println("The player to withdraw the last  toothpick loses the game.");
        }
        else{
            System.out.println("Oops! \n You quit the game.");
        }
       
    }
}