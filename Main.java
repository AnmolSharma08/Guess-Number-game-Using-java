import java.util.Random;
import java.util.Scanner;
class game{
    int a,RandomNum,chance=0,num;
    Scanner sc=new Scanner(System.in);
    public game(){
        //Generating Random number between 1 to 100
        Random rand= new Random();
        RandomNum=rand.nextInt(100)+1;
    }
    public void setnum(int x){
        a=x;
    }
    public int checkNUM(){
        if (RandomNum>a){
            System.out.println("You guessed small number,try guessing higher");
            chance++;
            System.out.println();
            System.out.print("Guess number again - ");
            num=sc.nextInt();
            setnum(num);
            checkNUM();

        }
        else if (RandomNum<a)
        {
            System.out.println("You guessed larger number,try guessing lower");
            chance++;
            System.out.println();
            System.out.print("Guess number again - ");
            num=sc.nextInt();
            setnum(num);
            checkNUM();
        }
        else{
            System.out.println("Wow,you Successfully guess the number in "+chance+"  chances only , CONGRATULATION!!!!!");
        }
        return chance;
    }
    public void winORlose(){
        if (chance>5){
            System.out.println("You have successfully guesses the number but you LOSE , because you took more than 5 chance !!!");
        }
        else if(chance==5){
            System.out.println("You have successfully guesses the number and you won , you took perfectly 5 chance !!!");
        }
        else{
            System.out.println("You have successfully guesses the number and you won amazingly, you took less than 5 chance !!!");
        }
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println("Lets Play A Game!!😊😊😊");
        System.out.println("I have a number in mind!!😜😜😜");
        System.out.println("Now , you need to guess that number in 5 chances😎😎😎");
        System.out.println();
        int guessNUM;
        Scanner S=new Scanner(System.in);
        System.out.print("Enter the number you guess-");
        guessNUM=S.nextInt();
        game obj=new game();
        obj.setnum(guessNUM);
        obj.checkNUM();
        obj.winORlose();
    }
}