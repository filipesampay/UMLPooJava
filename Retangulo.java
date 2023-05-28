import java.util.Scanner;

public class Retangulo {
    private double Comprimento;
    private double Largura;
    
    public Retangulo(double Comprimento, double Largura){
        this.Comprimento = Comprimento;
        this.Largura = Largura;
    }

    public double getPerimetro(){
        double Perimetro = Comprimento*2 + Largura*2;
        return Perimetro;
    }

    public double getArea(){
        double Area = Comprimento*Largura;
        return Area;
    }

    public double getComprimento(){
        return Comprimento;
    }

    public double getLargura(){
        return Largura;
    }

    public void setComprimento(double Comprimento){
        if(Largura < 0){
            System.out.println("Comprimento invalido.");
            return;
        }
        this.Comprimento = Comprimento;
    }

    public void setLargura(double Largura){
        if(Largura < 0){
            System.out.println("Largura invalida.");
            return;
        }
        this.Largura = Largura;
    }

    public static void main(String[] args) throws Exception{
        Scanner Teclado = new Scanner(System.in);
        double Comprimento = Teclado.nextDouble();
        double Largura = Teclado.nextDouble();
        Teclado.close();

        Retangulo Campo = new Retangulo(0, 0);
        
        if(Largura < 0 || Comprimento < 0){
            System.out.println("Parametros invalidos.");
            return;
        }

        Campo.setLargura(Largura);
        Campo.setComprimento(Comprimento);  

        System.out.printf("\nArea: %.2f", Campo.getArea()); 
        System.out.printf("\nPerimetro: %.2f", Campo.getPerimetro()); 
    }
}
