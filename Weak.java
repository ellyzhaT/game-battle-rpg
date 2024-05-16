//Class weak
public class Weak implements Status {
    @Override
    public void applyStatus(Character character) {
        character.receiveDamage(5); 
    }

    @Override
    public void removeStatus(Character character) {
       
    }
    @Override
    public String toString() {
        return "WeakStatus";
    }
    @Override
    public String getStatusName() {
        return "WEAK";
    }
}