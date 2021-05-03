/* Programa de gestão orçamental modificado capítulo a capítulo */

import java.util.Scanner;


public class GestorOrçamental {
    public static void main(String[]args){
        
        Scanner scan = new Scanner(System.in);
        
        int menu, dia;
        double orçamento,orçamentot, compra;
        menu = 0;
        
        System.out.println("Bem-vindo ao Gestor Orçamental!\n\n");

        do{
            System.out.print("Introduza o orçamento: ");
            orçamento = scan.nextDouble();
            orçamentot = orçamento;

            if(orçamento <= 0){System.out.println("O orçamento tem que ser maior que 0€!");}
            System.out.print("Qual é o dia do mês? ");
            dia = scan.nextInt();

            if(dia<=0 || dia>31 ){System.out.println("o dia do mês não pode ser um valor <= 0 ou > 31!");}
            
        }while(orçamento<=0 || dia<=0 || dia>31);


        while(menu>=0 && menu <4){
        
        System.out.println("\n        Menu\n");
        System.out.println("1 - Fazer compras");
        System.out.println("2 - Eliminar a última compra");
        System.out.println("3 - Ver compras efetuadas");
        System.out.println("4 - Ver a média semanal");
        System.out.println("5 - Sair\n");

        System.out.print("Escolha o digíto correspondente à opção pretendida: ");
        menu = scan.nextInt();
        
            
        switch (menu){
            case 1: 
                    if (orçamento > 0)
            {
                
                int menu_compra = 1;
                while (orçamento >0 && menu_compra == 1){
                    if (dia == 1){System.out.println("\nO seu orçamento é de: "+orçamento+" €\n");}
                    System.out.print("Indique o que pretende comprar: ");
                    String str = scan.next();
                    do{
                    System.out.print("Indique qual o valor da compra: ");
                    compra = scan.nextDouble();
                    if(compra<0){System.out.println("O valor da compra tem que ser positivo ou igual a 0");}
                    }while(compra<0);
                        if (compra<= orçamento) 
                            {
                               orçamento -= compra;
                               System.out.println("\nComprou "+str+" com o custo de "+compra+"€.\n");
                                if(dia == 1)
                                {
                                    double percentcompra = (compra/orçamentot)*100;
                                    System.out.println("A sua compra no valor de "+compra+"€ representa "+percentcompra+"% do orçamento diário");
                                    double percentorçamento = (orçamento/orçamentot)*100;
                                    System.out.println("Resta "+percentorçamento+"% do orçamento\n");
                                }
                            }
                        else{
                            if(compra > orçamento){System.out.println("\nO valor da sua compra não pode ultrapassar o seu orçamento!");}}
                    if(orçamento > 0){
                                        System.out.println("\nDeseja fazer outra compra?\n");
                                        System.out.println("1 - Sim");
                                        System.out.println("2 - Não");
                                        menu_compra = scan.nextInt();
                                    }           

                        }
                         
            }
                    else{System.out.println("\nNão tem orçamento disponível");} break;

            case 2: System.out.println("\nOpção 2 implementada em breve"); break;
            case 3: System.out.println("\nOpção 3 implementada em breve"); break;
            case 4: System.out.println("\nOpção 4 implementada em breve"); break;
            case 5: System.out.println("\nOpção 5 implementada em breve"); break;
        }
    }
    }



        
    


}
