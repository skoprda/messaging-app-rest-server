package sk.koprda.messagingappserver.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@AllArgsConstructor
public class User {

    @Setter @Getter
    private UUID id;
    @Getter
    private final String username;
    @Getter
    private final ContactsList contactsList;
    @Getter
    private final ConversationsList conversationsList;

    public User(String username, ContactsList contactsList, ConversationsList conversationsList) {
        this.username = username;
        this.contactsList = contactsList;
        this.conversationsList = conversationsList;
    }
}
