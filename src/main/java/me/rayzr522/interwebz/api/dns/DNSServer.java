package me.rayzr522.interwebz.api.dns;

import me.rayzr522.interwebz.api.IP;
import me.rayzr522.interwebz.api.hardware.Server;

import java.util.Optional;

public interface DNSServer extends Server {
    Optional<DNSRecord> resolveIP(IP address);
}
