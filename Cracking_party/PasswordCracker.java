import java.util.Scanner;

public class PasswordCracker {
    public static void main(String[] args) {
        FabriqueCracker fabriqueCracker = new FabriqueCracker();

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un mot de passe");
        String psw = sc.nextLine();

        System.out.println("INTERFACE DE CRACKAGE ET DE HACHAGE MOT DE PASSE");
        System.out.println("1: Cracker password par Brute Force  :");
        System.out.println("2: Cracker password par Dictionnaire:");

        int choix = sc.nextInt();
        
        switch (choix) {
            case 1:
                Cracker crackerbruteForce = fabriqueCracker.getAttack("Brute force");
                long debut = System.currentTimeMillis();
                crackerbruteForce.cracker(psw);
                long fin = System.currentTimeMillis();
                System.out.println("La recherche a durée "+((fin-debut)/1000)+" secondes");
                break;
            case 2:
                Cracker crackerdictionnaire = fabriqueCracker.getAttack("Dictionnaire");
                long debut2 = System.currentTimeMillis();
                crackerdictionnaire.cracker(psw);
                long fin2 = System.currentTimeMillis();
                System.out.println("La recherche a durée "+((fin2-debut2)/1000)+" secondes");
                break;
            default:
                System.out.println("Il faut choisir entre 1 && 2");
                break;
        }
        sc.close();
    }
}