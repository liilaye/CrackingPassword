import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CrackerDictionnaire implements Cracker {
    // @Override
    public void cracker(String psw) {
        final File doc = new File("library2.txt");  
        try (Scanner obj = new Scanner(doc)) {  
            while (obj.hasNextLine()) {  
                System.out.println(obj.nextLine());  
                String test = obj.nextLine();  
                if (test.equals(psw)) {  
                    System.out.println("Le mot de passe est " + test);  
                    return;  
                }
            }
            System.out.println("Mot de passe non trouvé !");  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        }
    }
}

