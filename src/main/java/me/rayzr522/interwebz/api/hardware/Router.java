package me.rayzr522.interwebz.api.hardware;

import me.rayzr522.interwebz.api.IP;
import me.rayzr522.interwebz.api.Port;
import me.rayzr522.interwebz.api.connection.Socket;

import java.util.Optional;

public interface Router {
    /**
     * NOTE: This method is considered bad practice to use, since in real life you can't literally just reach through
     * the router and suddenly have access to another piece of hardware! That's not how life works!
     *
     * @param address The {@link IP} of the device to find.
     * @return The device.
     * @deprecated This isn't realistic!
     */
    @Deprecated
    Optional<Device> findDevice(IP address);

    /**
     * Attempts to connect on the given port to the device with the given address.
     *
     * @param address The {@link IP} address of the device to connect to.
     * @param port    The port to connect on.
     * @return A possible connection.
     */
    Optional<Socket> connectTo(IP address, Port port);

    /**
     * Connects a device to this router.
     *
     * @param device The device to connect.
     * @return Whether or not the device successfully connected.
     */
    boolean connectToRouter(Device device);

    /**
     * Disconnects a device from this router.
     *
     * @param device The device to disconnect.
     * @return Whether or not the device cleanly disconnected.
     */
    boolean disconnectFromRouter(Device device);
}
