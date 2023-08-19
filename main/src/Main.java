import Entites.Dados;
import Entites.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player newPlayer = new Player();
        Dados newDados = new Dados();

        System.out.print("O ano é de 2023, Muitas cosias aconteceram, desde de guerra, pandemia, submarino...\nFelizmente consegui sobreviver, \nEssa é a minha historia a historia que solucionei o maior crime, O CRIME DOS CLIPS DE PAPEL.\nBem, vamos começar desde do inicio, deixa-me apresentar, o meu nome é: ");
        newPlayer.name = sc.nextLine();
        System.out.println("  ");
        System.out.print("Me formei recentemente com o Grande Rafael, com o nick de RafaRafoso, quando me formei consegui um contrato numa empresa\nde tecnologia líder chamada TechVanguard.\nVocê é conhecido por suas habilidades de codificação e resolução de problemas. No entanto, assim que você entra no escritório, descobre que algo estranho está acontecendo - \nos clips de papel estão misteriosamente desaparecendo.\nAo iniciar a sua jornada de trabalho logo no primeiro dia você percebe que os seus clips sumiram, porem você ve um fio de cabelo: ");
        System.out.println("********* EP1 *********\nTIPS: Toda ação para descobrir algo novo voce devera tirar nos dados um numero maior que 16 caso ao contrario você nao sera capaz de descobrir algo novo");
        System.out.println("Digite um valor de 0 a 5, o dado sera jogado na quantidade de vezes que você selecionou e fara a media, o valor resultante é o seu pontos de ação: \nLançar: ");
        newDados.sorte = sc.nextInt();
        if(newDados.numeroSorteado()<16){
            System.out.print("Saiu menos que 16, e infelizmente teve uma revolta da skynet bem no seu primeiro dia de trabalho e infelizmente o mouse te matou. Fim de jogo. boa sorte na proxima vez"+newPlayer.name);
        }else{
            System.out.println("Saiu mais que 16, e você conseguiu solucionar o misterio, na verdade você esqueceu de comprar, na proxima vez não esqueça de comprar os clips "+newPlayer.name);
        }

    }
}