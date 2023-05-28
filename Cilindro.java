import java.util.Scanner;

public class Cilindro {
    private double Raio;
    private double Altura;
    
    public Cilindro(double Raio, double Altura){
        this.Raio = Raio;
        this.Altura = Altura;
    }
    public double getAreaLateral(){
        double AreaLateral = 2*Math.PI*Raio*Altura;
        return AreaLateral;
    }
    public double getAreaTotal(){
        double AreaTotal = 2*Math.PI*Raio*(Altura+Raio);
        return AreaTotal;
    }
    public double getVolume(){
        double Volume = Math.PI*Math.pow(Raio,2)*Altura;
        return Volume;
    }

    public double getRaio() {
        return Raio;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura){
        if(Altura < 0){
            System.out.println("Altura invalida.");
            System.exit(0);;
        }
        this.Altura = Altura;
    }

    public void setRaio(double Raio){
        if(Raio < 0){
            System.out.println("Raio invalido.");
            System.exit(0);;
        }
        this.Raio = Raio;
    }

    public static void main(String[] args) {
        Cilindro Clnd = new Cilindro(0, 0);
        Scanner Teclado = new Scanner(System.in);

        System.out.print("Raio: ");
        double Raio = Teclado.nextDouble();
        System.out.print("Altura: ");
        double Altura = Teclado.nextDouble();
        Teclado.close();

        if(Raio < 0){
            System.out.println("Raio invalido.");
            return;
        }

        Clnd.setAltura(Altura);
        Clnd.setRaio(Raio);

        System.out.printf("\nArea lateral: %.2f", Clnd.getAreaLateral());
        System.out.printf("\nArea total: %.2f", Clnd.getAreaTotal());
        System.out.printf("\nVolume: %.2f", Clnd.getVolume());
        
    }
}
