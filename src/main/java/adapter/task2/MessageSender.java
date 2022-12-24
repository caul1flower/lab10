package adapter.task2;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.ArrayList;

@Getter
@Setter
public class MessageSender {
    ArrayList<Client> allUsers;

    public void send(String text, Client user, Country country) {
        if (user.getCountry().equals(country) && user.getLastActiveTime().equals(LocalDate.now())) {
            System.out.println("text sent to " + user);
        }
    }
    public void sendText(String text, Country country) {
        for (Client client : allUsers.stream().toList()) {
            send(text, client, country);
        }
    }
}
