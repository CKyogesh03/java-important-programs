package composition;

public class Engine {
    String name;
    String type;
    int cc;

    public Engine(String name, String type, int cc) {
        this.name = name;
        this.type = type;
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", cc=" + cc +
                '}';
    }
}
