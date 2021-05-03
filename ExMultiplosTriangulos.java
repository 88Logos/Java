/*Tentativa de fazer múltiplos triangulos em triangulo (triangulos em numeral crescente e decrescente)*/


import java.util.Scanner;

public class ExMultiplosTriangulos {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        int base, i, j, k, l, m; //nota: se a variável base tiver mais que um digito o triângulo não vai ficar simétrico
        int y,z;
        int c = 1;
        int a, b, d;

        do {
            System.out.print("Introduza o tamanho da base dos triângulos  (Min-1 Máx-9): ");
            base = scan.nextInt();
            System.out.print("Introduza o número de linhas: ");
            z = scan.nextInt();
            if(base<=0 || base > 9){System.out.println("O número da base tem que ser positivo e menor que 9!\n");}
            if(z<=0){System.out.println("O número de linhas tem que ser positivo e maior que 0!\n");}
        }while(base<=0 || base >9 || z<=0);
        final int base2 = base;

        System.out.println("\n");

        for(y=1;y<=z;++y){          //for posterior para o numero de linhas (acaba com um print"\n")
                                    //quando variavel y incrementa muda de linha
        for(i=1;i<=base;i++){       // vai permitir todos os processos para uma linha (serve de referência à impressão e aos espaços)
            for(b = z-c;b>0;--b){   
                for(d=base2;d>0;d--){System.out.print(" ");}
            }                       // imprime espaços iniciais necessários para centrar os triângulos
            
            //processo que vai imprimir os triângulos necessários a cada linha
            //("a" com referência a C, vai indicar quantos triângulos são feitos por linha) 
            //(escrita de espaços de "j & m" com referência a (base - i))
            //(escrita de número crescente "k" e número decrescente "l" com referência a i)
            for(a=1;a<=c;++a){      
            for(j=base-i;j>0;--j){System.out.print(" ");}    
            for(k=1; k<=i;++k){System.out.print(k);}
            for(l=i-1;l>0;--l){System.out.print(l);}
            for(m=(base-i)+1;m>0;--m){System.out.print(" ");}//adicionado +1 ao espaço posterior para centrar vertices
            }
            
            System.out.print("\n");
                
        }
        c=c+1;    // o incremento de "c" vai indicar a "a" quantos triângulos deve fazer por linha
               // o incremento de "c" vai indicar a "b" quantos espaço deve fazer para centrar os triângulos de "a"
               // "c" só pode incrementar dentro do for posterior de "y"
    }
    System.out.println("\n");
}
}
