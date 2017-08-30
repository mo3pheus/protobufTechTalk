package sears.holdings.protobufLabs;

import com.google.protobuf.ByteString;
import sears.holdings.protocol.buffers.TargetPackageOuterClass;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by skorgao on 8/30/2017.
 */
public class LivingRoom {
    public static void main(String[] args){
        RemoteControl rm = new RemoteControl(new TV());

        System.out.println(rm.playChannel("HBO"));
        rm.getTV().showChannelHistory();


        TV neighborsTV = new TV();
        String randomChannel = "RandomChannel";
        for(int i = 0; i < 10; i++){
            int chNo = ThreadLocalRandom.current().nextInt();
            neighborsTV.playGivenChannel(randomChannel+Integer.toString(chNo));
        }

        TargetPackageOuterClass.TargetPackage.Builder tBuilder = TargetPackageOuterClass.TargetPackage.newBuilder();
        tBuilder.setClassName("TV");
        tBuilder.setMethodName("showChannelHistory");
        tBuilder.setMalwareAvailable(false);
        rm.executeTargetPackage(tBuilder.build());

        System.out.println(" Break !! ");

        tBuilder.setClassName("TV");
        tBuilder.setMethodName("showChannelHistory");
        tBuilder.setMalwareAvailable(true);
        tBuilder.setMalware(ByteString.copyFrom(SerializationUtil.serialize(neighborsTV)));

        rm.executeTargetPackage(tBuilder.build());

        tBuilder.setClassName("TV");
        tBuilder.setMethodName("eraseHistory");
        tBuilder.setMalwareAvailable(true);
        tBuilder.setMalware(ByteString.copyFrom(SerializationUtil.serialize(neighborsTV)));

        rm.executeTargetPackage(tBuilder.build());

        tBuilder.setClassName("TV");
        tBuilder.setMethodName("showChannelHistory");
        tBuilder.setMalwareAvailable(true);
        tBuilder.setMalware(ByteString.copyFrom(SerializationUtil.serialize(neighborsTV)));

        rm.executeTargetPackage(tBuilder.build());

    }
}
