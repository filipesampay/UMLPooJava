public class Pessoa{
    String Nome = "Filipe";
    int Idade = 20;
    static float Peso = (float) 96.3;
    static float Altura = (float) 1.74;
    

    static float IMC = Peso / ((Altura)*(Altura));

    public static void main(String[] args) {
        System.out.printf("%.2f", IMC);
    }
}