package sears.holdings.protobufLabs;

import com.google.protobuf.ByteString;
import sears.holdings.protocol.buffers.TargetPackageOuterClass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by skorgao on 8/30/2017.
 */
public class RemoteControl {

    private TV hometv = null;

    public RemoteControl(TV tv) {
        this.hometv = tv;
    }

    public void executeTargetPackage(TargetPackageOuterClass.TargetPackage targetPackage) {

        System.out.println("================================");
        System.out.println(targetPackage);
        System.out.println("================================");

        try {
            if (targetPackage.getMalwareAvailable()) {
                Class<?> c = TV.class;
                Method[] methods = c.getDeclaredMethods();
                for(Method m:methods){
                    if(m.getName().equals(targetPackage.getMethodName())){
                        ByteString malWareBytes = targetPackage.getMalware();
                        m.invoke( c.cast(SerializationUtil.deserialize(malWareBytes.toByteArray())));
                    }
                }

            }
        } catch(Exception e){
            e.printStackTrace();
        }


        try {

            Method[] allMethods = hometv.getClass().getDeclaredMethods();
            for (Method m : allMethods) {
                if (m.getName().equals(targetPackage.getMethodName())) {
                    m.invoke(hometv);
                }
            }

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public String playChannel(String channel) {
        return hometv.playGivenChannel(channel);
    }

    public void setTV(TV newTV) {
        hometv = newTV;
    }

    public TV getTV() {
        return hometv;
    }
}
