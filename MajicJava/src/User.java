import java.util.*;
public class User {
    private String name;
    private int age;
    private String work;
    private String adress;
    public static final Set<String> VALID_JOBS;
    public static final Set<String> VALID_ADDRESSES;

    public User(String name, int age, String work, String adress) throws IllegalArgumentException {
       validate(name,age,work,adress);
        this.name = name;
        this.age = age;
        this.work = work;
        this.adress = adress;

    }

    static {
        Set<String> jobs = new HashSet<>();
        jobs.add("Google");
        jobs.add("Uber");
        jobs.add("Amazon");
        VALID_JOBS = Collections.unmodifiableSet(jobs);

        VALID_ADDRESSES = Set.of("London", "New York", "Amsterdam");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)  {

        this.age = age;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public static Map<Integer, List<User>> groupUsers(List<User> users) {
        Map<Integer, List<User>> groupedUsers = new HashMap<>();
        for (User user : users) {
            int age = user.getAge();
            if (!groupedUsers.containsKey(age)) {
                groupedUsers.put(age, new ArrayList<>());
            }
            groupedUsers.get(age).add(user);
        }
        return groupedUsers;
    }
    private void validate(String name, int age, String work, String adress) throws IllegalArgumentException {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Имя не должно быть пустым");
        }
        if (age < 18) {
            throw new IllegalArgumentException("Возраст не должен быть меньше 18");
        }
        if (!VALID_JOBS.contains(work)) {
            throw new IllegalArgumentException("Место работы должно быть одно из " + VALID_JOBS);
        }
        if (!VALID_ADDRESSES.contains(adress)) {
            throw new IllegalArgumentException("Место жительства должно быть одно из " + VALID_ADDRESSES);
        }
    }
}
