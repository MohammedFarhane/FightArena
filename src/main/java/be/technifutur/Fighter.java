package be.technifutur;

public class Fighter {
    // ATTRIBUTES
    private final int id;
    private final String name;
    private int age;
    private int elo;
    private int health = 100;
    private int damage = 10;

    // CONSTRUCTOR
    public Fighter(int id, String name, int age, int elo) {
        this.id = id;

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;

        if (elo < 0) {
            throw new IllegalArgumentException("ELO cannot be negative");
        }

        this.elo = elo;
    }

    // GETTERS
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getElo() {
        return elo;
    }

    public int getHealth() {
        return health;
    }

    // METHODS
    public void addElo(int points) {
        this.elo += points;

        if (elo < 0) {
            this.elo = 0;
        }
    }

    public String displayFighter() {
        return """
                    FIGHTER INFORMATION
                 -------------------------
                  ID                %d
                 -------------------------
                  Name              %s
                 -------------------------
                  Age               %d
                 -------------------------
                  ELO               %d
                 -------------------------
                  Health            %d
                """.formatted(id, name, age, elo, health);
    }

    public void takeDamage(int amount) {
        this.health -= amount;

        if (health < 0) {
            this.health = 0;
        }
    }

    public void attack(Fighter opponent) {
        opponent.takeDamage(this.damage);
    }

}
