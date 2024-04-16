import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Pescador pescador = new Pescador();

        while (true) {
            Peixe peixe = new Peixe();

            System.out.println("# Informe o peso: ");
            peixe.setPeso(ler.nextDouble());
            pescador.addPeixe(peixe);

            System.out.println("Deseja cadastrar outro (S/N)?");
            if (ler.next().equalsIgnoreCase("N")) {
                break;
            }
        }

        System.out.println("####### Total á pagar: ");
        System.out.println("R$ " + pescador.Multa());
    }
}
