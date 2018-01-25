package me.rayzr522.interwebz.api.connection;

public interface Packet {

    byte[] toSource();

    // READ METHODS

    byte readByte();

    int readInt();

    long readLong();

    String readString();

    // WRITE METHODS

    Packet writeByte(byte value);

    Packet writeInt(int value);

    Packet writeLong(long value);

    Packet writeByteArray(byte[] value);

    Packet writeString(String value);
}
