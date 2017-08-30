package sears.holdings.protobufLabs;

import java.io.*;

/**
 * Created by skorgao on 8/30/2017.
 */
public class SerializationUtil {

    public static byte[] serialize(Object obj) {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        try {
            ObjectOutputStream out = new ObjectOutputStream(byteOut);
            out.writeObject(obj);
            return byteOut.toByteArray();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public static Object deserialize(byte[] messageBytes) throws IOException, ClassNotFoundException {
        ByteArrayInputStream byteIn = new ByteArrayInputStream(messageBytes);
        ObjectInputStream objectIn = new ObjectInputStream(byteIn);
        return objectIn.readObject();
    }

}
