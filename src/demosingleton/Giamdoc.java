package demosingleton;

public class Giamdoc {
    private int id;
    private String name;

    private static Giamdoc instance;

    public static Giamdoc getInstance(int id, String name) {
        if (instance == null) {
           instance = new Giamdoc(id, name);
        }
        return instance;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Giamdoc{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Giamdoc(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
