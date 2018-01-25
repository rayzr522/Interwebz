package me.rayzr522.interwebz.api.hardware;

import me.rayzr522.interwebz.api.IP;
import me.rayzr522.interwebz.api.Port;
import me.rayzr522.interwebz.api.connection.Socket;

import java.util.Set;

public interface Device {
    /**
     * @return A set containing the currently open {@link Port}s.
     */
    Set<Port> getOpenPorts();

    /**
     * @return The {@link IP} address of this device.
     */
    IP getAddress();

    /**
     * @return The router that this device is connected to.
     */
    Router getRouter();

    /**
     * Called when a device connects to this one.
     *
     * @param connection The connection to the other device.
     */
    void onIncomingConnection(Socket connection);
}
