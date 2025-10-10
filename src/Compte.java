public class Compte {
    private int solde = 0;
    private String titulaire;

    // Constructeur par défaut
    public Compte() {
        this.titulaire = "Inconnu";
    }

    // Constructeur prenant le nom du titulaire (Exercice 2)
    public Compte(String titulaire) {
        this.titulaire = titulaire;
    }

    // dépôt
    public void deposer(int montant) {
        if (montant > 0) {
            solde = solde + montant;
        } else {
            System.out.println("Montant de dépôt invalide : " + montant);
        }
    }


    public void retirer(int montant) {
        if (montant > 0 && montant <= solde) {
            solde = solde - montant;
        } else if (montant > solde) {
            System.out.println("Fonds insuffisants pour retirer " + montant + " (solde=" + solde + ")");
        } else {
            System.out.println("Montant de retrait invalide : " + montant);
        }
    }


    public void virerVers(int montant, Compte destination) {

        this.retirer(montant);
        destination.deposer(montant);
    }


    public void afficher() {
        System.out.println("Titulaire: " + titulaire + " | Solde: " + solde + " euros");
    }


    public int getSolde() {
        return solde;
    }
}