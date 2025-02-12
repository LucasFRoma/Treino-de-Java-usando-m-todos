import java.util.Scanner;

public class treino02 {
    static Scanner e = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        String numDia = "";

        System.out.println("Digite o número do dia de hoje - > ");
        num = e.nextInt();

        num = travamento(num);
        numDia = dia(numDia, num);
        System.out.println("Dia da semana - " + numDia);
    }


    public static int travamento(int num) {
        while (num != 1 && num != 2 && num != 3 && num != 4 && num != 5 &&  num != 6  &&  num != 7 ){
            System.out.println("Número inválido, digite um número válido!!");
            num = e.nextInt();
        }


        return num;
    }


    public static String dia(String numDia, int num) {

        switch (num) {
            case 1:
                numDia = "Domingo";
                break;
            case 2:
                numDia = "Segunda-Feira";
                break;
            case 3:
                numDia = "Terça-Feira";
                break;
            case 4:
                numDia = "Quarta-Feira";
                break;
            case 5:
                numDia = "Quinta-Feita";
                break;
            case 6:
                numDia = "Sexta-Feira";
                break;
            case 7:
                numDia = "Sábado";
                break;
        }


        return numDia;
    }

}
