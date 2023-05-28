import java.util.Scanner;

public class Cone {
    private double Altura;
    private double Raio;
    
    public Cone(double Raio, double Altura){
        this.Raio = Raio;
        this.Altura = Altura;
    }

    public double getGeratriz(){
        double Geratriz = Math.sqrt((Math.pow(Altura, 2)+(Math.pow(Raio, 2))));
        return Geratriz;
    }
    public double getAreaLateral(){
        double AreaLateral = (Math.PI*Raio*getGeratriz());
        return AreaLateral;
    }
    public double getAreaTotal(){
        double AreaTotal = (Math.PI*Raio*(getGeratriz()*Raio));
        return AreaTotal;
    }
    public double getVolume(){
        double Volume = (1.0/3.0*Math.PI*Math.pow(Raio, 2)*Altura);
        return Volume;
    }
    public double getAltura(){
        return Altura;
    }
    public double getRaio(){
        return Raio;
    }
    public void setAltura(double Altura){
        if(Altura < 0){
            System.out.println("Altura invalido.");
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
        Cone ConeLaranja = new Cone(0, 0);
        Scanner Teclado = new Scanner(System.in);
        
        System.out.print("Altura:");
        double Altura = Teclado.nextDouble();
        System.out.print("Raio:");
        double Raio = Teclado.nextDouble();
        Teclado.close();

        if(Raio < 0 || Altura < 0){
            System.out.println("Parametros invalidos.");
            return;
        }

        ConeLaranja.setAltura(Altura);
        ConeLaranja.setRaio(Raio);

        System.out.printf("\nGeretriz: %.2f", ConeLaranja.getGeratriz());
        System.out.printf("\nArea Lateral: %.2f", ConeLaranja.getAreaLateral());
        System.out.printf("\nArea Total: %.2f", ConeLaranja.getAreaTotal());
        System.out.printf("\nVolume: %.2f", ConeLaranja.getVolume());
    }
}
