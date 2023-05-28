import java.util.Scanner;

public class Paciente {
    String Nome;
    int Peso;
    double Altura;

    public Paciente(String Nome, int Peso, int Altura){
        this.Altura = Altura;
        this.Nome = Nome;
        this.Peso = Peso;
    }

    public double calculaIMC(){
        double IMC = Peso/Math.pow(Altura, 2);
        return IMC;
    }

    public void faixaPeso(){
        if(calculaIMC() < 20){
            System.out.println("Abaixo do peso ideal.");
            return;
        }
        if(calculaIMC() >= 20 && calculaIMC() <= 25){
            System.out.println("Peso ideal");
            return;
        }
        if(calculaIMC() > 25 && calculaIMC() <= 30){
            System.out.println("Excesso de peso.");
            return;
        }
        if(calculaIMC() > 30 && calculaIMC() <= 35){
            System.out.println("Obesidade.");
            return;
        }
        if(calculaIMC() > 35){
            System.out.println("Obesidade morbida.");
            return;
        }   
    }

    public void setAltura(Double altura) {
        Altura = altura;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setPeso(int peso) {
        Peso = peso;
    }

    public double getAltura() {
        return Altura;
    }

    public String getNome() {
        return Nome;
    }

    public int getPeso() {
        return Peso;
    }
    public static void main(String[] args) {
        Paciente Pessoa = new Paciente(null, 0, 0);
        Scanner Teclado = new Scanner(System.in);

        System.out.print("Digite seu Nome: ");
        String Nome = Teclado.nextLine();
        System.out.print("Digite sua Altura: ");
        double Altura = Teclado.nextDouble();
        System.out.print("Digite seu peso: ");
        int Peso = Teclado.nextInt();

        Pessoa.setAltura(Altura);
        Pessoa.setNome(Nome.toUpperCase());
        Pessoa.setPeso(Peso);
        Teclado.close();

        System.out.println("\n\n---FICHA GERAL DO PACIENTE--- ");
        System.out.println("Nome: " + Pessoa.getNome());
        System.out.println("Altura: " + Pessoa.getAltura());
        System.out.println("Peso: " + Pessoa.getPeso());
        System.out.printf("IMC %.2f\n", Pessoa.calculaIMC());
        Pessoa.faixaPeso();
    }
}
