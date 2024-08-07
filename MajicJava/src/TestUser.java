import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestUser {
    public static void main(String[] args) throws IllegalArgumentException {
        List<User> users = new ArrayList<>();
        users.add(new User("Alice", 30, "Google", "London"));
        users.add(new User("Bob", 25, "Uber", "New York"));
        users.add(new User("Charlie", 30, "Amazon", "Amsterdam"));
        users.add(new User("David", 25, "Google", "London"));
        users.add(new User("Eve", 35, "Uber", "New York"));

        Map<Integer, List<User>> groupedUsers = User.groupUsers(users);

        for (Map.Entry<Integer, List<User>> entry : groupedUsers.entrySet()) {
            System.out.println("Возраст: " + entry.getKey());
            for (User user : entry.getValue()) {
                System.out.println(" - Имя: " + user.getName() + ", Работа: " + user.getWork() + ", Адрес: " + user.getAdress());
            }
        }

    }
}
