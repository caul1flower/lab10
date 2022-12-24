package adapter.task3;

public class Database extends БазаДаних{
    public String getUserData() {
        return отриматиДаніКористувача();
    }
    public String getStatisticData() {
        return отриматиСтатистичніДані();
    }
}