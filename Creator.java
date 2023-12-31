import java.util.Random;

public class Creator {
    private String name;
    private String role;
    private int health;
    private int strength;
    private int magic;

    public Creator(String name) {
        this.name = name;
        this.role = generateRandomRole();
        this.health = generateRandomStat();
        this.strength = generateRandomStat();
        this.magic = generateRandomStat();


        if (role.equals("Warrior")) {
            this.strength *= 10;
        } else if (role.equals("Wizard")) {
            this.magic *= 10;
        } else if (role.equals("Priest")) {
            this.strength *= 5;
        }
    }

    private String generateRandomRole() {
        String[] roles = {"Warrior", "Wizard", "Priest"};
        Random random = new Random();
        return roles[random.nextInt(roles.length)];
    }

    private int generateRandomStat() {
        Random random = new Random();
        return random.nextInt(11) + 2;  // Random number between 2 and 12
    }

    @Override
    public String toString() {
        return "-----------------------------------------\n" +
                "Welcome to the character generator!\n" +
                name + " is.... a " + role + "!\n\n" +
                "\tStrength: " + strength + "\n" +
                "\tMagic: " + magic + "\n" +
                "\tHealth: " + health + "\n\n" +
                "Happy adventuring!\n" +
                "-----------------------------------------";
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Creator <character_name>");
            return;
        }

        String characterName = args[0];
        Creator character = new Creator(characterName);


        System.out.println(character);
    }
}
