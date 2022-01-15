package sk.koprda.messagingappserver.model;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Message<T> {

    protected UUID authorId;
    protected UUID conversationId;
    protected boolean wasEdited;
    protected LocalDateTime timeCreated;

    protected T messageContent;

}
