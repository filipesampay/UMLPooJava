package Exercicio02;
import java.util.Scanner;

public class Piramide {
    
    private float Base;
    private float Altura;
    
    public Piramide(float Base, float Altura){
        this.Base = Base;
        this.Altura = Altura;
    }

    public float getVolume(){
        float Vol = Base * Altura * 1/3;
        return Vol;
    }

    public float getBase(){
        return Base;
    }
    
    public float getAltura(){
        return Altura;
    }
    
    public void setAltura(float novaAltura) {
        if(novaAltura < 0){
            System.out.println("Altura invalida.");
            return;
        }
        this.Altura = novaAltura;
    }
    
    public void setBase(float novaBase){
        if(novaBase < 0){
            System.out.println("Base invalida.");
            return;
        }
        this.Base = novaBase;
    }

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        float BaseMain = Teclado.nextFloat();
        float AlturaMain = Teclado.nextFloat();
        Teclado.close();

        Piramide Piranha = new Piramide(0, 0);

        if(BaseMain < 0 || AlturaMain < 0){
            System.out.println("Parametros invalidos.");
            return;
        }
        
        Piranha.setBase(BaseMain);
        Piranha.setAltura(AlturaMain);

        System.out.println(Piranha.getVolume());
    }
}
