import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //implementar a classe do JavaScanner

        //Variáveis utlizadas
        int numero;
        String agencia= args[0];
        String nomeCliente = args[1];
        double saldo;

        //Mostrar Mensagens ao usuários
        
            System.out.println("Digite o Seu Nome:  ");
            System.out.println("Digite o Número da Agência:  ");
            System.out.println("Digite agora o Número da Conta:    ");
            System.out.println("Digte agora o Saldo:  ");

            //Ler o que foi digitado por meio do SCANNER
            Scanner scanner = new Scanner(System.in);

            
            nomeCliente.toString();
            agencia.toString();
            numero= scanner.nextInt();
            saldo = scanner.nextDouble();
            
        
        //Mostrar a mensagem final de conta criada ao usuário do programa
        System.out.println( "Olá" + nomeCliente + ",obrigado por criar uma conta em nosso banco, sua agência é" + agencia + "conta" + numero +  "e seu saldo" + saldo + "já está disponível para saque");
    }
}
