import java.util.Scanner;

public class Funcionario {
    String Nome;
    double Salario;
    int Filhos;

    public Funcionario(String Nome, double Salario, int Filhos){
        this.Filhos = Filhos;
        this.Nome = Nome;
        this.Salario = Salario;
    }

    public double aumentoSalario(int Porcentagem){
        double Aumento = (Salario*Porcentagem)/100;
        return Aumento;
    }
    public double descontoImposto() {
        double Desconto = Filhos * 1250.25;
        return Desconto;
    }

    public double INSS(){
        double Total;
        if(Salario <= 2545){
            Total = Salario*(6.0/100);
        }
        else{
            Total = Salario*(10.0/100);
        }
        return Total;
    }

    public int getFilhos() {
        return Filhos;
    }
    public String getNome() {
        return Nome;
    }
    public double getSalario() {
        return Salario;
    }
    public void setFilhos(int filhos) {
        Filhos = filhos;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public void setSalario(double salario) {
        Salario = salario;
    }

    public static void main(String[] args) {
        Funcionario Colaborador = new Funcionario(null, 0, 0);
        Scanner Teclado = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String Nome = Teclado.nextLine();
        System.out.print("Digite a quantidade de filhos: ");
        int Filhos = Teclado.nextInt();
        System.out.print("Digite o valor do salario: ");
        double Salario = Teclado.nextDouble();
        System.out.print("Digite a porcentagem de aumento do salario: ");
        int Porcentagem = Teclado.nextInt();
        Teclado.close();

        Colaborador.setNome(Nome.toUpperCase());
        Colaborador.setFilhos(Filhos);
        Colaborador.setSalario(Salario);

        System.out.println("\nNome: " + Colaborador.getNome());
        System.out.println("Filhos: " +Colaborador.getFilhos());
        System.out.println("Salario: " +Colaborador.getSalario());

        System.out.printf("\nValor de aumento do salario: %.2f",  Colaborador.aumentoSalario(Porcentagem));
        System.out.printf("\nDesconto do imposto de renda: %.2f", Colaborador.descontoImposto());
        System.out.printf("\nValor do INSS: %.2f", Colaborador.INSS());
        
    }

}
