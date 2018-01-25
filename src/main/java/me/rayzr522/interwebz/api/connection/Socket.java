package me.rayzr522.interwebz.api.connection;

import me.rayzr522.interwebz.api.IP;
import me.rayzr522.interwebz.api.Port;

public interface Socket {
    /**
     * @return The {@link IP} of the connected device.
     */
    IP getAddress();

    /**
     * @return The {@link Port} of the connected device.
     */
    Port getPort();

    /**
     * @return Whether or not the connection is still open.
     */
    boolean isConnected();

    /**
     * Sends a packet to the target machine.
     *
     * @param packet The {@link Packet} to send.
     */
    void sendPacket(Packet packet);

    /**
     * Called when a packet is received.
     *
     * @param packet The received packet.
     */
    void onReceivePacket(Packet packet);
}
