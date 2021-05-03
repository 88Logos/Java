


import java.util.Scanner;

public class ProgRandom
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);

        double rand = Math.random()*(10 - 0)+0;
        int input;
        int contar = 0;
        rand = (int)rand;

        System.out.print("Insira um num inteiro:");
        input = scan.nextInt();

        while (input != rand)
        {
            if (rand - input >= 3 || rand - input <= -3)
            {System.out.println("Frio");}
            else{if (rand - input < 3 || rand - input > -3)
            {System.out.println("Quente!");}}
            ++contar;
            System.out.print("Insira um num inteiro:");
            input = scan.nextInt();
        }
    System.out.println("O num é: "+rand);
    System.out.println("Precisou de "+contar+" tentativas.");
    }
}