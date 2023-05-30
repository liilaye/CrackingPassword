public class FabriqueCracker {
    
    public Cracker getAttack(String attackType) {
        if (attackType == null) {
            return null;
        }
        if (attackType.equalsIgnoreCase("Brute force")) {
            return new CrackerBruteForce();
        } else if (attackType.equalsIgnoreCase("Dictionnaire")) {
            return new CrackerDictionnaire();
        }
        return null;
    }
}
        

