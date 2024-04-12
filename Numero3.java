import java.util.Scanner;
import java.util.ArrayList;
public class Numero3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double>notas = new ArrayList<>();
        System.out.println("Digite as notas:");
        System.out.println("Digite '-1' para encerrar o programa.");
            double nota = scanner.nextDouble();
        while (nota != -1) {
                notas.add(nota);
                nota = scanner.nextDouble();           
        }
        System.out.println("Quantidade de valores lidos: "+notas.size());
        System.out.print("Valores informados: "+notas);
        System.out.println("\nValores informados na ordem inversa: ");
            for(int i = notas.size()-1;i>=0;i--){
                System.out.println(notas.get(i));
            }
        double soma = 0;
            for(double n:notas){
                soma+=n;
            }
        System.out.println("A soma dos valores é: "+soma);

        double media = soma/notas.size();
        System.out.println("A média dos valores é: "+ media);
        System.out.println("Os valores que estão acima da média são: ");
        for(int i = 0;i<notas.size();i++){
            if (notas.get(i)>media) {
                System.out.println(notas.get(i));
            }
        }
        System.out.println("Valores que estão abaixo de 7: ");
            for(double n:notas){
                if(n<7){
                    System.out.println(n);
                }
            }
            System.out.println("Fim do programa! Obrigado!");
            scanner.close();
    }
}
