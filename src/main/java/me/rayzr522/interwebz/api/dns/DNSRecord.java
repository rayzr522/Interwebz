package me.rayzr522.interwebz.api.dns;

import me.rayzr522.interwebz.api.IP;

public interface DNSRecord {
    IP getAddress();

    String getHost();
}
