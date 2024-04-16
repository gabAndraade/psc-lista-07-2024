import java.util.Scanner;
import java.util.ArrayList;
public class Numero4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double>vendasBrutas=new ArrayList<>();
        int vendedor = 1;
        while (true) {
            System.out.println("Informe o valor total de vendas brutas do vendedor "+vendedor+" Para sair digite '-1'.");
            double bruto = scanner.nextDouble();
            if (bruto==-1) {
                break;
            }
            vendasBrutas.add(bruto);
            vendedor++;
            
        }
        int[] contadorSalario = new int[9];
        for(double vendaBruta:vendasBrutas){
            double salario = 200+(0.09*vendaBruta);
            int faixaSalario = (int)((salario-200)/100);
            if ((salario - 200) % 100 != 0) {
                faixaSalario++;
            }
            if(faixaSalario>=0 && faixaSalario<=8){
                contadorSalario[faixaSalario]++;
            }else{
                contadorSalario[8]++;
            }

        }
        for (int i = 0; i < contadorSalario.length; i++) {
            int faixaInicial = 200 + (i * 100);
            int faixaFinal = faixaInicial + 99;
            if (i == contadorSalario.length - 1) {
                faixaFinal = 1000;
            }
            System.out.println("$" + faixaInicial + " - $" + faixaFinal + ": " + contadorSalario[i] + " vendedores");
        }
        scanner.close();
    }
}