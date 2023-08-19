package Entites;
import java.util.Random;
public class Dados {
    Random random = new Random();
    public int sorte=2;

    public double numeroSorteado(){
        double sorteado=0;
        double numerSort=0;
        for(int i=0; i <sorte;i++){
            sorteado = random.nextDouble()*30;
            numerSort +=sorteado;
        }
        return numerSort / sorte;
    }

}
