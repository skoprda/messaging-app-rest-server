package sk.koprda.messagingappserver.model;

import lombok.Getter;

import java.util.UUID;

public class Contact {

    @Getter
    private final UUID userId;

    public Contact(UUID userId) {
        this.userId = userId;
    }
}
