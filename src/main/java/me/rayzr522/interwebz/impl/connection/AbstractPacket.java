package me.rayzr522.interwebz.impl.connection;

import me.rayzr522.interwebz.api.connection.Packet;

import java.nio.ByteBuffer;

public class AbstractPacket implements Packet {
    private static final int DEFAULT_SIZE = 1024;

    private ByteBuffer byteBuffer;

    private AbstractPacket(int capacity) {
        this.byteBuffer = ByteBuffer.allocate(capacity);
    }

    private AbstractPacket(byte[] data) {
        this.byteBuffer = ByteBuffer.wrap(data);
    }

    public static Packet create() {
        return create(DEFAULT_SIZE);
    }

    public static Packet create(int capacity) {
        return new AbstractPacket(capacity);
    }

    public static Packet from(byte[] data) {
        return new AbstractPacket(data);
    }

    @Override
    public byte[] toSource() {
        return byteBuffer.array();
    }

    @Override
    public byte readByte() {
        return byteBuffer.get();
    }

    @Override
    public int readInt() {
        return byteBuffer.getInt();
    }

    @Override
    public long readLong() {
        return byteBuffer.getLong();
    }

    @Override
    public String readString() {
        int length = readInt();
        byte[] output = new byte[length];
        byteBuffer.get(output, 0, length);

        return new String(output);
    }

    @Override
    public Packet writeByte(byte value) {
        byteBuffer.put(value);
        return this;
    }

    @Override
    public Packet writeInt(int value) {
        byteBuffer.putInt(value);
        return this;
    }

    @Override
    public Packet writeLong(long value) {
        byteBuffer.putLong(value);
        return this;
    }

    @Override
    public Packet writeByteArray(byte[] value) {
        byteBuffer.put(value);
        return this;
    }

    @Override
    public Packet writeString(String value) {
        return writeInt(value.length()).writeByteArray(value.getBytes());
    }
}
