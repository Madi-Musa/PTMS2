public class Driver {
    private int id;
    private String name;
    private int experienceYears;

    public Driver(int id, String name, int experienceYears) {
        this.id = id;
        this.name = name;
        this.experienceYears = experienceYears;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getExperienceYears() {
        return experienceYears;
    }
}
