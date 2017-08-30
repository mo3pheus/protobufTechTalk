package sears.holdings.protobufLabs;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by skorgao on 8/30/2017.
 */
public class TV {

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
        for(String channel:availableChannels){
            System.out.println(channel);
        }
    }

    public void eraseHistory(){
        availableChannels.clear();
    }
}
