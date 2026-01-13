public class Inspector {
    private int id;
    private String name;
    private String shift;

    public Inspector(int id, String name, String shift) {
        this.id = id;
        this.name = name;
        this.shift = shift;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShift() {
        return shift;
    }
}
