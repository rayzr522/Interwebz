package me.rayzr522.interwebz.types.dns;

import me.rayzr522.interwebz.types.IP;

public interface DNSRecord {
    IP getAddress();

    String getHost();
}
