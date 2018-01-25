package me.rayzr522.interwebz.types.connection;

import me.rayzr522.interwebz.types.Device;

public interface Socket {
    Device getFrom();
    Device getTo();
    boolean isConnected();

    void sendPacket(Packet packet);
}
