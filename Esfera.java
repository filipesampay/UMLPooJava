import java.util.Scanner;

public class Esfera{
    double Raio;

    public Esfera(double Raio){
        this.Raio = Raio;
    }

    public double getRaio(){
        return Raio;
    }
    
    public double getArea(){
        double Area = 4*(Math.PI)*(Raio*Raio);
        return Area;
    }

    public double getVolume(){
        double Volume = ((4)*Math.PI*(Math.pow(Raio, 3))/3);
        return Volume;
    }

    public void setRaio(double raio) {
        if(raio < 0){
            System.out.println("Raio invalido!");
            return;
        }
        this.Raio = raio;
    }

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        double RaioMain = Teclado.nextDouble();
        Teclado.close();

        if(RaioMain < 0){
            System.out.println("Raio invalido!");
            return;
        }

        Esfera Bola = new Esfera(0);

        Bola.setRaio(RaioMain);

        System.out.printf("\nA area da esfera e: %.2f",Bola.getArea());
        System.out.printf("\nO volume da esfera e: %.2f",Bola.getVolume());
    }
}
