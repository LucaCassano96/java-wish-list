import java.util.ArrayList;
import java.util.Scanner;

public class ListaRegaliNatale {
    public static void main(String[] args) {

        ArrayList<Regalo> listaRegali = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Inserisci la descrizione del regalo: ");
            String descrizione = input.nextLine();

            System.out.print("Inserisci il destinatario del regalo (mamma, sorella, amico, ...): ");
            String destinatario = input.nextLine();

            Regalo regalo = new Regalo(descrizione, destinatario);
            listaRegali.add(regalo);

            System.out.println("Regalo aggiunto alla lista.");

            System.out.print("Vuoi aggiungere un altro regalo? (Sì/No): ");
            String risposta = input.nextLine().toLowerCase();
            if (!risposta.equals("sì")) {
                break;
            }
        }

        System.out.println("\nEcco la tua lista di regali di Natale:");
        for (Regalo regalo : listaRegali) {
            System.out.println("Descrizione: " + regalo.getDescrizione());
            System.out.println("Destinatario: " + regalo.getDestinatario());
            System.out.println();
        }
    }
}

