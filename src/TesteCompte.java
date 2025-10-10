public class TesteCompte {
    public static void main(String[] args) {

        Compte c1 = new Compte("Alice");
        Compte c2 = new Compte("Bob");


        c1.deposer(500);


        c2.deposer(1000);


        c2.retirer(10);


        c1.virerVers(75, c2);


        System.out.println("Après opérations entre c1 et c2 :");
        c1.afficher();
        c2.afficher();


        Compte[] tab = new Compte[10];


        for (int i = 0; i < tab.length; i++) {
            tab[i] = new Compte("Compte_" + i);
        }

        
        for (int i = 0; i < tab.length; i++) {
            int montant = 200 + 100 * i;
            tab[i].deposer(montant);
        }

        for (int i = 0; i < tab.length - 1; i++) {
            tab[i].virerVers(20, tab[i + 1]);
        }

        System.out.println("Soldes finaux des comptes du tableau :");
        for (int i = 0; i < tab.length; i++) {
            System.out.print("Indice " + i + " - ");
            tab[i].afficher();
        }
    }
}