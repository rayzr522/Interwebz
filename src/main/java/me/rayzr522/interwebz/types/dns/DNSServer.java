package me.rayzr522.interwebz.types.dns;

import me.rayzr522.interwebz.types.IP;
import me.rayzr522.interwebz.types.Server;

import java.util.Optional;

public interface DNSServer extends Server {
    Optional<DNSRecord> resolveIP(IP address);
}
