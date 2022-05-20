package DesignPatterns.BehaviouralDP.IteratorDP;

import java.util.ArrayList;
import java.util.List;

public class Messages {
    private final List<Message> messages=new ArrayList<>();

    public Messages() {
        messages.add(new Message("Message 1"));
        messages.add(new Message("Message 2"));
        messages.add(new Message("Message 3"));
        messages.add(new Message("Message 4"));
        messages.add(new Message("Message 5"));
        messages.add(new Message("Message 6"));
    }

    public MessageIterator createMessagesIterator(){
        return new MessageIterator(messages);
    }
}
