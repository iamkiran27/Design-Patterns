package DesignPatterns.BehaviouralDP.IteratorDP;

import java.util.List;

public class MessageIterator {
    private final List<Message> messageList;
    private int index;

    public MessageIterator(List<Message> messageList) {
        this.messageList = messageList;
        index=0;
    }

    public boolean hasNext(){
        if(index>=messageList.size() || messageList.get(index)==null)
            return false;
        return true;
    }

    public String next(){
        Message message=messageList.get(index);
        index++;
        return message.getMessage();
    }
}
