package me.rayzr522.interwebz;

import me.rayzr522.interwebz.api.connection.Packet;
import me.rayzr522.interwebz.impl.connection.AbstractPacket;

public class Interwebz {
    public static void main(String[] args) {
        System.out.println(">> Interwebz BEGIN!");

        byte[] data = AbstractPacket.create()
                .writeByte((byte) 42)
                .writeString("Hello, there!")
                .toSource();

        StringBuilder output = new StringBuilder();

        for (byte b : data) {
            output.append(b).append(' ');
        }

        System.out.println(output);

        Packet reversed = AbstractPacket.from(data);
        byte type = reversed.readByte();
        String payload = reversed.readString();

        System.out.println("Type: " + type);
        System.out.println("Payload: " + payload);
    }
}
