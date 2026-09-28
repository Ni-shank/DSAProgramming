import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ImmutableEmployee {
    private final int id;
    private final String name;
    private final List<String> skills;

    public ImmutableEmployee(int id, String name, List<String> skills) {
        this.id = id;
        this.name = name;
        this.skills = new ArrayList<>(skills);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return new ArrayList<>(skills);
    }

    public static void main(String[] args) {
        List<String> skills = new ArrayList<>(Arrays.asList("Java", "Spring"));

        ImmutableEmployee emp =
                new ImmutableEmployee(1, "Jaikishan", skills);

        skills.add("SQL");

        System.out.println("Employee: " + emp.getName());
        System.out.println("Skills: " + emp.getSkills());
    }
}
