package me.rayzr522.interwebz.types.connection;

public interface Packet {

    // READ METHODS

    byte readByte();

    int readInt();

    long readLong();

    String readString(int length);

    // WRITE METHODS

    void writeByte(byte value);

    void writeInt(int value);

    void writeLong(long value);

    void writeString(String value);
}
