package me.rayzr522.interwebz.types;

import java.util.Set;

public interface Device {
    Set<Port> getOpenPorts();

    IP getAddress();
}
