import java.util.Scanner;
import java.util.ArrayList;

public class JogoDaVelha
{
    int [][] tabuleiro = new int[3][3];
    private ArrayList<Jogador> jogadores;
     
    public JogoDaVelha(){
        jogadores = new ArrayList<>();
    }
    
    public void tabuleiro(){
        System.out.println("  1   2   3");
        System.out.println("1 "+ tabuleiro[0][0]+" | "+ tabuleiro[0][1]+" | "+ tabuleiro[0][2]);
        System.out.println(" ---|---|--- ");
        System.out.println("2 "+ tabuleiro[1][0]+" | "+ tabuleiro[1][1]+" | "+ tabuleiro[1][2]);
        System.out.println(" ---|---|--- ");
        System.out.println("3 "+ tabuleiro[2][0]+" | "+ tabuleiro[2][1]+" | "+ tabuleiro[2][2]);
    }


}
