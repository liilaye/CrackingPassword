public class CrackerBruteForce implements Cracker {

    // @Override
    public void cracker(String psw) {
        char caracter[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z','0', '1', '2', '3', '4', '5', '6', '7', '8',
                '9' };
        for (int i = 0; i < caracter.length; i++) {
            String test = String.valueOf(caracter[i]);
            for (int j = 0; j < caracter.length; j++) {
                String test2 = test + "" + String.valueOf(caracter[j]);
                for (int k = 0; k < caracter.length; k++) {
                    String test3 = test2 + "" + String.valueOf(caracter[k]);
                    for (int l = 0; l < caracter.length; l++) {
                        String test4 = test3 + "" + String.valueOf(caracter[l]);
                        System.out.println(test4);
                        if (test4.equals(psw)) {
                            System.out.println("Le mot de passe est " + test4);
                            return;
                        }
                        for (int m = 0; m < caracter.length; m++) {
                            String test5 = test4 + "" + String.valueOf(caracter[m]);
                            System.out.println(test5);
                            if (test5.equals(psw)) {
                                System.out.println("Le mot de passe est " + test5);
                                return;
                            }
                            for (int n = 0; n < caracter.length; n++) {
                                String test6 = test5 + "" + String.valueOf(caracter[n]);
                                System.out.println(test6);
                                if (test6.equals(psw)) {
                                    System.out.println("Le mot de passe est " + test6);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

