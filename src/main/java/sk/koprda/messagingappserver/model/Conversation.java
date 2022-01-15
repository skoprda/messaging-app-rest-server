package sk.koprda.messagingappserver.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
public class Conversation {
    @Setter @Getter
    private UUID id;
    @Getter
    private String name;
    @Getter
    private MessagesList messagesList;

    public Conversation(String name, MessagesList messagesList) {
        this.name = name;
        this.messagesList = messagesList;
    }
}
