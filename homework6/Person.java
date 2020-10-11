package homework6;

public class Person implements Comparable<Person> {         // Задание 1.1
    private String nick;
    private String password;

    public Person(String nick, String password) {
        this.nick = nick;
        this.password = password;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return nick + ": " + password;
    }

    @Override
    public int compareTo(Person p) {
        return this.nick.compareTo(p.nick);
    }
}