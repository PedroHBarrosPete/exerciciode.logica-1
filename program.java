import java.awt.*;
import java.util.Scanner;
void main() {

    //Identificação do cliente.
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual o seu nome?");
    String cliente = sc.next();

    //Soma dos produtos
    double refrigerante = 3.50;
    double agua = 2.5;
    double coxinha = 5;
    double qntdRefrigerante = 0;
    double qntdAgua = 0 ;
    double qntdCoxinha = 0;

    char resposta;
    do {
        System.out.printf("Qual produto você comprou? %n1= Regrigerante 2= Água 3= Coxinha%n");
        int produto = sc.nextInt();

        if (produto == 1) {
            System.out.println("Quantos refrigerantes você comprou?");
            qntdRefrigerante = sc.nextDouble();
        } else if (produto == 2) {
            System.out.println("Quantas aguas você comprou?");
            qntdAgua = sc.nextDouble();
        } else {
            System.out.println("Quantas coxinhas você comprou?");
            qntdCoxinha = sc.nextDouble();
        }
        System.out.println("Você comprou mais algo? (s/n)");
        resposta = sc.next().charAt(0);
    } while (resposta != 'n');

    double preTotal = refrigerante * qntdRefrigerante + agua * qntdAgua + coxinha * qntdCoxinha;
    double total;

    //Clube de compras
    char membro;
        System.out.println("Você faz parte do clube de descontos?");
        membro = sc.next().charAt(0);
        if (membro == 's') {
            total = preTotal * 0.9;
            }
        else total = preTotal;

    //Recibo:
    System.out.println("Nome do cliente:" + cliente );
    System.out.printf("Itens comprados:%n%.0f - Refrigerante- R$%.2f;%n%.0f - Água- R$%.2f;%n%.0f - Coxinha- R$%.2f%n", qntdRefrigerante, refrigerante, qntdAgua, agua, qntdCoxinha, coxinha);
    System.out.printf("Total: R$%.2f %nTotal c/ desconto: R$%.2f", preTotal, total);
}
