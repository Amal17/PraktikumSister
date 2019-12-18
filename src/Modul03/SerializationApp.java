package Modul03;

import java.util.ArrayList;
import java.util.List;

public class SerializationApp {
    public static void main(String[] args) {
        List<Participant> participants = new ArrayList<Participant>();
        participants.add(new Participant("Dee", "Ajaa", 22));
        participants.add(new Participant("Ami", "Fahmi", 21));
        participants.add(new Participant("Haya", "Hayati", 20));
        participants.add(new Participant("Aya", "hayati", 19));
        
        System.out.println("Participant : "+participants);
        
        SerializationDemo demo = new SerializationDemo();
        demo.serialize(participants, "ParticipantData.ser");
        System.out.println("Serialization is DONE");
        
        System.out.println("Deserialize Object...");
        List<Participant> newList = demo.deserialize("ParticipantData.ser");
        System.out.println("New List : " + newList);
    }
}
