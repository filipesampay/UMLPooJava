import java.util.Scanner;

public class Paralelepipedo {
    private double Altura;
    private double Largura;
    private double Comprimento;
    
    public Paralelepipedo(double Altura, double Largura, double Comprimento){
        this.Altura = Altura;
        this.Largura = Largura;
        this.Comprimento = Comprimento;
    }

    public double getVolume(){
        double Volume = Altura * Comprimento * Largura;
        return Volume;
    }

    public double getArea(){
        double Area = 2 * (Altura * Largura * Comprimento + (Largura * Comprimento));
        return Area;
    }

    public double getAltura() {
        return Altura;
    }

    public double getComprimento() {
        return Comprimento;
    }
    
    public double getLargura() {
        return Largura;
    }

    public void setAltura(double Altura){
        if(Altura < 0){
            System.out.println("Altura invalido");
            System.exit(0);;
        }
        this.Altura = Altura;
    }

    public void setComprimento(double Comprimento){
        if(Comprimento < 0){
            System.out.println("Comprimento invalido");
            System.exit(0);;
        }
        this.Comprimento = Comprimento;
    }

    public void setLargura(double Largura){
        if(Largura < 0){
            System.out.println("Largura invalido");
            System.exit(0);;
        }
        this.Largura = Largura;
    }

    public static void main(String[] args) {
        Paralelepipedo Paralele = new Paralelepipedo(0, 0, 0);
        Scanner Teclado = new Scanner(System.in);
        System.out.print("Altura:");
        double Altura = Teclado.nextDouble();
        System.out.print("Comprimento:");
        double Comprimento = Teclado.nextDouble();
        System.out.print("Largura:");
        double Largura = Teclado.nextDouble();
        Teclado.close();

        if(Altura < 0 || Comprimento < 0 || Largura < 0){
            System.out.println("Parametros invalidos");
            return;
        }

        Paralele.setAltura(Altura);
        Paralele.setComprimento(Comprimento);
        Paralele.setLargura(Largura);

        System.out.printf("\nVolume: %.2f", Paralele.getVolume());
        System.out.printf("\nArea: %.2f", Paralele.getArea());
    }
}
