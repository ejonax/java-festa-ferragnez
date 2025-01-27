import java.util.Scanner;

public class CheckGuestBonus {
    public static void main(String[] args) {
         String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        int invitatiLength=listaInvitati.length;

        Scanner in= new Scanner(System.in);
        System.out.println("Inserisci il tuo nome");
        String nomeInvitato = in.nextLine();

        /********** WHILE LOOP ***************/
        int j=-1;
        int i=0;
        while (i < invitatiLength){
            if (nomeInvitato.equals(listaInvitati[i])){
                j = i;
                System.out.println("Il tuo nome è nella lista degli invitati, benvenuto!");
                break; // una volta trovato il nome dell'utente nella lista non continuiamo con le iterazioni successive del ciclo
            } 
            i++;
        }
        
        if (j==-1) { // se l'indice j sarà ancora -1 dopo che abbiamo girato tutto l'array degli invitati vuol dire che il nome dell'utente non è presente nella listaInvitati
        System.out.println("Il tuo nome non si trova nella lista degli invitati");
        }
       
    }
}
