# Life of a Ping

1. `$ ping google.com`
2. Settings -> DNS server -> `8.8.8.8`
3. Opens a connection to `8.8.8.8:80` (fails if port is not open)
4. Send packet to `8.8.8.8`:

       (BYTE) type: 0 (request)
       (BYTE) length: 10
       (STRING) hostname: 'google.com'

5. DNS server receives packet, decoding into fields
6. Retrieves record for `google.com`, resolving to `1.2.3.4` (for example)
7. Replies with packet on same connection:

       (BYTE) type: 1 (response)
       (BYTE) length: 7
       (STRING) address: '1.2.3.4'

8. DNS server closes connection & client closes connection
9. Client now knows to ping `1.2.3.4`
10. Opens a connection to `1.2.3.4:80` (fails if port is not open)
11. Sends packet to `1.2.3.4`:
    
        (BYTE) type: 42 (ping request)
        (BYTE[]) payload: [random data]
    
12. `1.2.3.4` receives packet, decoding into fields
13. Responds with timestamp:

        (BYTE) type: 43 (ping response)
        (LONG) timestamp: [current time]
        
14. Client receives data, client and server close connection
15. Client displays timestamp difference to user