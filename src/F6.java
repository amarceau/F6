public class F6 {

    public F6() {
        //trace();
        //esterGetNbValeursPositives();
        //testerTrouverIndice();
        //testerSontDesTableauxEgaux();
        //testerRemplacerValeur();
        testerSortirLesNombresPositifs();
    }

    private void testerGetNbValeursPositives() {
        int t1[] = {1, -1, 0, 7};
        int tVide[] = {};

        System.out.println("testerGetNbValeursPositives");
        System.out.println(getNbValeursPositives(t1) == 3);
        System.out.println(getNbValeursPositives(tVide) == 0);
    }

    private int getNbValeursPositives(int tE[]) {
        int nbValeursPositives;

        nbValeursPositives = 0;

        for (int i = 0; i < tE.length; i++) {
            if (tE[i] >= 0)
                nbValeursPositives++;
        }

        return nbValeursPositives;
    }

    private void testerTrouverIndice() {
        int t1[] = {1, -1, 1, 7};
        int tVide[] = {};

        System.out.println("testerTrouverIndice");
        System.out.println(trouverIndice(t1, -1) == 1);
        System.out.println(trouverIndice(t1, 1) == 0);
        System.out.println(trouverIndice(t1, 7) == 3);
        System.out.println(trouverIndice(t1, -2) == -1);
        System.out.println(trouverIndice(tVide, 7) == -1);
    }

    private int trouverIndice(int tE[], int nombre) {

        for (int i = 0; i < tE.length; i++) {
            if (tE[i] == nombre)
                return i;
        }

        return -1;

    }

    private void testerSontDesTableauxEgaux() {
        int t1[] = {1, -1, 2, 7};
        int t2[] = {1, -1, 2, 7};
        int t3[] = {1, -1, 2, 8};
        int t4[] = {1, -1};
        int tVide[] = {};

        System.out.println("testerSontDesTableauxEgaux");
        System.out.println(sontDesTableauxEgaux(t1, t2) == true);
        System.out.println(sontDesTableauxEgaux(t1, t3) == false);
        System.out.println(sontDesTableauxEgaux(t1, t2) == true);
        System.out.println(sontDesTableauxEgaux(t1, t4) == false);
        System.out.println(sontDesTableauxEgaux(tVide, tVide) == true);
    }

    private boolean sontDesTableauxEgaux(int tE1[], int tE2[]) {

        if (tE1.length == tE2.length) {
            for (int i = 0; i < tE1.length; i++) {
                if (tE1[i] != tE2[i])
                    return false;
            }
        } else
            return false;

        return true;
    }

   private void testerRemplacerValeur() {
        int t1[] = {1, -1, 2, 7, 2};
        int t2[] = {1, -1, 3, 7, 3};
        int t3[] = {1, -1, 3, 7, 3};
        int t4[] = {1, -1};
        int tVide[] = {};

        System.out.println("testerRemplacerValeur");
        System.out.println(sontDesTableauxEgaux(t1, t2) == false);
        remplacerValeur(t1, 2, 3);
        System.out.println(sontDesTableauxEgaux(t1, t2) == true);

        System.out.println(sontDesTableauxEgaux(t2, t3) == true);
        remplacerValeur(t2, -99, 55);
        System.out.println(sontDesTableauxEgaux(t2, t3) == true);

        System.out.println(sontDesTableauxEgaux(tVide, tVide) == true);
    }

    private void remplacerValeur(int tE[], int ancienneVal, int nouvelleVal) {

        for (int i = 0; i < tE.length; i++) {
            if (tE[i] == ancienneVal)
                tE[i] = nouvelleVal;
        }
    }

    private void testerSortirLesNombresPositifs() {
        int t1[] = {1, -1, 0, 7, -2};
        int t1Copie[] = {1, -1, 0, 7, -2};
        int t1Rep[] = {1, 0, 7};
        int t2[] = {1, 2, 7, 2};
        int tVide[] = {};
        int tRep[];

        System.out.println("testerSortirLesNombresPositifs");
        tRep = sortirLesNombresPositifs(t1);
        System.out.println(sontDesTableauxEgaux(tRep, t1Rep) == true);
        System.out.println(sontDesTableauxEgaux(t1, t1Copie) == true);

        tRep = sortirLesNombresPositifs(t2);
        System.out.println(sontDesTableauxEgaux(tRep, t2) == true);

        tRep = sortirLesNombresPositifs(tVide);
        System.out.println(sontDesTableauxEgaux(tRep, tVide) == true);
    }

    private int[] sortirLesNombresPositifs (int t1[]) {
        int t2[];
        int j;
        int compteurPositif;

        j=0;
        compteurPositif = 0;

        for (int i = 0; i < t1.length; i++) {
            if (t1[i] >= 0) {
                compteurPositif++;
            }
        }

        t2 = new int[compteurPositif];

        for (int i = 0; i < t1.length; i++) {
            if (t1[i] >= 0) {
                t2[j] = t1[i];
                j++;
            }
        }

        return t2;
    }


    /*
    private int[] traceTableau(int t1[]) {
        int t2[];
        int j;

        t2 = new int[t1.length - 2];
        j=0;
        for (int i = t1.length - 1; i >= 0; i--) {
            if (t1[i] % 3 == 0) {
                t2[j] = t1[i];
                j++;
            } else
                System.out.print(t1[i] + ", ");
        }
        System.out.println();
        return t2;
    }

    private void trace() {
        int tA[] = {9, -3, 0, 2, 17};
        int tB[];

        tB = traceTableau(tA);

        for (int i = 0; i < tB.length; i++) {
            System.out.print(tB[i] + ", ");
        }
    }*/

    public static void main(String[] args) {
        new F6();
    }
}
