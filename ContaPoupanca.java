import java.util.Random;
import java.util.Scanner;

public class ContaPoupanca {
    private String Nome;
    private int Conta;
    private int Agencia;
    private double Saldo;

    public ContaPoupanca(String Nome, int Conta, int Agencia, double Saldo){
        this.Nome = Nome;
        this.Conta = Conta;
        this.Agencia = Agencia;
        this.Saldo = Saldo;
    }
    
    public void setNome(String nome) {
        Nome = nome;
    }

    public int randAgencia() {
        Random AgenciaRand = new Random();
        Agencia = AgenciaRand.nextInt(100)+10;
        return Agencia;
    }
    
    public long randConta() {
        Random Numero = new Random();
        Conta = Numero.nextInt(9000) + 5000;
        return Conta;
    }
    
    public void setSaque(double Valor){
        if(Valor > Saldo){
            System.out.println("Saldo insuficiente");
            System.exit(0);
        }
        Saldo -= Valor;
    }

    public void setDeposito(double Valor){
        Saldo += Valor;
    }

    public String getNome(){
        return Nome;
    }
    public long getConta(){
        return Conta;
    }
    public int getAgencia(){
        return Agencia;
    }
    public double getSaldo(){
        return Saldo;
    }

    public static void main(String[] args) {
        ContaPoupanca Conta = new ContaPoupanca(null, 0, 0, 0);
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Bem vindo ao cadastro de contas do banco");
        
        System.out.print("Digite seu nome:");
        String Nome = Teclado.nextLine();
        
        Conta.setNome(Nome.toUpperCase());
        Conta.randConta();
        Conta.randAgencia();

        System.out.print("Digite o valor a ser depositado: ");
        double Deposito = Teclado.nextDouble();
        Conta.setDeposito(Deposito);

        System.out.println("\nSituacao atual da conta: ");
        System.out.println("Nome: " + Conta.getNome());
        System.out.println("Agencia: " + Conta.getAgencia());
        System.out.println("Conta: " + Conta.getConta());
        System.out.println("Saldo: " + Conta.getSaldo());

        System.out.print("\nDigite o valor do saque: ");
        double Saque = Teclado.nextDouble();
        Conta.setSaque(Saque);
        
        Teclado.close();

        System.out.println("\nSituacao atual da conta: ");
        System.out.println("Nome: " + Conta.getNome());
        System.out.println("Agencia: " + Conta.getAgencia());
        System.out.println("Conta: " + Conta.getConta());
        System.out.println("Saldo: " + Conta.getSaldo());
    }
}
