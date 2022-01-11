public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name == null) {
            return false;
        }
        return name.matches("(?=.{3,19}$)[a-zA-Zа-яёА-яЁ]+\\s[a-zA-Zа-яёА-яЁ]+");
    }
}
