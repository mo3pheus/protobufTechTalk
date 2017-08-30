package sears.holdings.protobufLabs;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by skorgao on 8/30/2017.
 */
public class TV implements Serializable{

    private List<String> availableChannels = new ArrayList<>();

    public String playHBO(){
        return "Now playing HBO";
    }

    public String playGivenChannel(String channel){
        System.out.println("I am remembering the channels you watched!");
        availableChannels.add(channel);
        return "Playing " + channel;
    }

    public void showChannelHistory(){
        System.out.println("Executing showChannelHistory");
        for(String channel:availableChannels){
            System.out.println(channel);
        }
    }

    public void eraseHistory(){
        System.out.println("Executing eraseHistory");
        availableChannels.clear();
    }
}
