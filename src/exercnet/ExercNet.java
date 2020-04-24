/*
O programa deve ler um valor inteiro X indefinidas vezes. 
(O programa irá parar quando o valor de X for igual a 0). 
Para cada X lido, imprima a soma dos 5 pares consecutivos a partir de X, inclusive o X , se for par. 
Se o valor de entrada for 4, por exemplo, a saída deve ser 40, que é o resultado da operação: 4+6+8+10+12, 
enquanto que se o valor de entrada for 11, por exempo, a saída deve ser 80, que é a soma de 12+14+16+18+20.
 */
package exercnet;

import java.util.Scanner;

public class ExercNet {

    public static void main(String[] args) {
        int x, aux ,i = 1, acumuladorX = 0;

        //Scanner é utilizado para pegar o valor digitado pelo usuario
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Digite um numero natural maior que zero: ");
            x = Integer.valueOf(input.nextLine());
            aux = x;
            if (aux % 2 == 0 && aux != 0) {
                System.out.println("X: " + x);
                while (i <= 5) {
                    acumuladorX += aux;
                    aux += 2;
                    i++;
                }
                System.out.println("A soma dos 5 primeiros pares de X é: " + acumuladorX);
                aux = 0;
                acumuladorX = 0;
                i = 1;
            }
            if (aux % 2 != 0 && aux != 0) {
                System.out.println("X: " + x);
                aux += 1;
                while (i <= 5) {
                    acumuladorX += aux;
                    aux += 2;
                    i++;
                }
                System.out.println("A soma dos 5 primeiros pares de X é: " + acumuladorX);
                aux = 0;
                acumuladorX = 0;
                i = 1;
            }
            if (x == 0) {
                System.out.println("Fechando o programa...");
            }

        } while (x != 0);

    }
}
