
import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) throws Exception {
        String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        int invitatiLength=listaInvitati.length;

        Scanner in= new Scanner(System.in);
        System.out.println("Inserisci il tuo nome");
        String nomeInvitato = in.nextLine();
         
        int j= -1;// salviamo l'indice dell'utente che si troverà nella lista degli invitati
        for (int i=0; i < invitatiLength; i++){
            
            if (nomeInvitato.equals(listaInvitati[i])){
               j = i;
               System.out.println("Il tuo nome è nella lista degli invitati, benvenuto!");
               break;
            } 
        }

        if (j==-1) { // se l'indice j sarà ancora -1 dopo che abbiamo girato tutto l'array degli invitati vuol dire che il nome dell'utente non è presente nella listaInvitati
          System.out.println("Il tuo nome non si trova nella lista degli invitati");
        }
       
    }
}
