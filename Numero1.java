import java.util.ArrayList;
import java.util.Scanner;
public class Numero1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double>temperaturas = new ArrayList<>();
        String[] mes = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        for(int rodada = 0;rodada<mes.length;rodada++){
            System.out.println("Informe a temperatura média do mês de "+mes[rodada]+" : ");
            temperaturas.add(scanner.nextDouble());
        }
        double soma = 0;
        for(double temp:temperaturas){
            soma+=temp;
        }
        double media = soma/12;
        System.out.println("A média anual das temperaturas é: "+media);
        System.out.println("Temperaturas que estão acima da média anual:");
            for(int rodada = 0; rodada<12;rodada++){
                if (temperaturas.get(rodada)>media) {
                    System.out.println("Temperaturas do mês de "+mes[rodada]+": "+temperaturas.get(rodada));
                }
            }
        scanner.close();
    }
}