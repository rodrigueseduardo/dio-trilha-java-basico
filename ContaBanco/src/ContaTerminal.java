import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal 
{
    public static void main(String[] args) throws Exception 
    {
        //TODO: Conhecer e importar a classe Scanner

        //TODO: Exibir as mensagens para nosso usuário

        //TODO: Obter pela classe Scanner os valores digitados no terminal

        //TODO: Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in);
        
        double saldo = 50;

        System.out.println("Olá! Bem vindo a criação de conta do nosso banco!");
        System.out.println("Crie a sua conta hoje e ganhe R$ 50,00 como saldo inicial!");

        System.out.println("Por favor, digite o seu nome:");
        String nome = scanner.next();

        System.out.println("Agora digite o seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite o número de sua agência de preferência:");
        System.out.println("776 CENTRO");
        System.out.println("568 ZONA LESTE");
        System.out.println("443 ZONA SUL");
        int agencia = scanner.nextInt();

        System.out.println("Agora digite o número desejado para sua nova conta:");
        int conta = scanner.nextInt();


        System.out.println("Bem vindo " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + ", conta " + conta + " e seu saldo R$ " + saldo + " já está disponível para saque!");        
    }
}
