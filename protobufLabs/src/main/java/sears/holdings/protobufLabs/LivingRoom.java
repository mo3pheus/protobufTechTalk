package sears.holdings.protobufLabs;

import com.google.protobuf.ByteString;
import sears.holdings.protocol.buffers.TargetPackageOuterClass;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by skorgao on 8/30/2017.
 */
public class LivingRoom {
    public static void main(String[] args) {
        RemoteControl rm = new RemoteControl(new TV());

        System.out.println(rm.playChannel("HBO"));
        rm.getTV().showChannelHistory();


        TV neighborsTV = new TV();
        String randomChannel = "RandomChannel";
        for (int i = 0; i < 10; i++) {
            int chNo = ThreadLocalRandom.current().nextInt();
            neighborsTV.playGivenChannel(randomChannel + Integer.toString(chNo));
        }

        TargetPackageOuterClass.TargetPackage.Builder tBuilder = TargetPackageOuterClass.TargetPackage.newBuilder();
        tBuilder.setClassName("TV");
        tBuilder.setMethodName("showChannelHistory");
        tBuilder.setMalwareAvailable(false);
        rm.executeTargetPackage(tBuilder.build());

        System.out.println(" Break !! ");

        TargetPackageOuterClass.TargetPackage.Builder tBuilder1 = TargetPackageOuterClass.TargetPackage.newBuilder();
        tBuilder1.setClassName("TV");
        tBuilder1.setMethodName("showChannelHistory");
        tBuilder1.setMalwareAvailable(true);
        tBuilder1.setMalware(ByteString.copyFrom(SerializationUtil.serialize(neighborsTV)));

        rm.executeTargetPackage(tBuilder1.build());

        TargetPackageOuterClass.TargetPackage.Builder tBuilder2 = TargetPackageOuterClass.TargetPackage.newBuilder();
        tBuilder2.setClassName("TV");
        tBuilder2.setMethodName("eraseHistory");
        tBuilder2.setMalwareAvailable(false);
        //tBuilder.setMalware(ByteString.copyFrom(SerializationUtil.serialize(neighborsTV)));

        rm.executeTargetPackage(tBuilder2.build());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        TargetPackageOuterClass.TargetPackage.Builder tBuilder3 = TargetPackageOuterClass.TargetPackage.newBuilder();
        tBuilder3.setMethodName("showChannelHistory");
        tBuilder3.setMalwareAvailable(false);
        rm.executeTargetPackage(tBuilder.build());

    }
}
