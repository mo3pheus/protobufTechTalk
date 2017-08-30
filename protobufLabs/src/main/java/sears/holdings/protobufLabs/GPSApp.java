package sears.holdings.protobufLabs;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import sears.holdings.protocol.buffers.LocationOuterClass.Location;
import sears.holdings.protocol.buffers.StudentOuterClass;
import sears.holdings.protocol.buffers.TrajectoryOuterClass;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by skorgao on 8/29/2017.
 */
public class GPSApp {

    public static final String SEPARATOR = "==========================================================================";

    public static void main(String[] args) {
        Location.Builder lBuilder = Location.newBuilder();
        lBuilder.setLatitude(44.567);
        lBuilder.setLongitude(101.32);

        Location location = lBuilder.build();

        System.out.println("Hello Location\n" + location.toString());
        System.out.println(SEPARATOR);

        TrajectoryOuterClass.Trajectory.Builder trajBuilder = TrajectoryOuterClass.Trajectory.newBuilder();

        List<Location> trajectoryPoints = new ArrayList<Location>();
        for (int i = 0; i < 10; i++) {
            double latMin = 44.5d;
            double latMax = 48.5d;

            double longMin = 101.5d;
            double longMax = 102.5d;

            double newLat = ThreadLocalRandom.current().nextDouble(latMin, latMax);
            double newLong = ThreadLocalRandom.current().nextDouble(longMin, longMax);

            Location.Builder locBuilder = Location.newBuilder();
            locBuilder.setLatitude(newLat);
            locBuilder.setLongitude(newLong);

            trajectoryPoints.add(locBuilder.build());
        }

        System.out.println(SEPARATOR);
        trajBuilder.addAllTrajPoints(trajectoryPoints);
        trajBuilder.setTimeMillis(System.currentTimeMillis());
        System.out.println(trajBuilder.build().toString());
        System.out.println(SEPARATOR);

        System.out.println(" JSON FORMAT ");
        System.out.println(SEPARATOR);
        System.out.println(getJSonFromProject(trajBuilder.build()));
        System.out.println(SEPARATOR);

    }

    public static String getJSonFromProject(TrajectoryOuterClass.Trajectory trajectory) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(trajectory);
    }
}
