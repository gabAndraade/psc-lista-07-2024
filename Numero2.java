import java.util.Scanner;
import java.util.ArrayList;
public class Numero2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String>respostas=new ArrayList<>();
        System.out.println("Responda apenas 'Sim' ou 'Não' para as perguntas a seguir.");
        System.out.println("Telefonou para a vítima?");
        respostas.add(scanner.nextLine().toLowerCase());
        System.out.println("Esteve no local do crime?");
        respostas.add(scanner.nextLine().toLowerCase());
        System.out.println("Mora perto da vítima?");
        respostas.add(scanner.nextLine().toLowerCase());
        System.out.println("Devia para a vítima?");
        respostas.add(scanner.nextLine().toLowerCase());
        System.out.println("Já trabalhou com a vítima?");
        respostas.add(scanner.nextLine().toLowerCase());

        int respostasSim = 0;
            for(String escolha:respostas){
                if (escolha.equals("sim")) {
                    respostasSim++;
                }
            }
        if (respostasSim == 2) {
            System.out.println("Suspeita");
        }else if(respostasSim==3 || respostasSim ==4){
            System.out.println("Cúmplice");
        }else if(respostasSim==5){
            System.out.println("Assassino");
        }else{
            System.out.println("Inocente");
        }
        scanner.close();
    }
}
