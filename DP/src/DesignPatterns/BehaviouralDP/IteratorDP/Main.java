package DesignPatterns.BehaviouralDP.IteratorDP;

public class Main {
    public static void main(String[] args) {
        Messages messages=new Messages();
        MessageIterator messagesIterator=messages.createMessagesIterator();
        while(messagesIterator.hasNext()){
            System.out.println(messagesIterator.next());
        }
    }
}
