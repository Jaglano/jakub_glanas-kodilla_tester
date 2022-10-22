package com.kodilla.mockito.homework;

import java.util.*;
import java.util.stream.Collectors;


public class Alerts {
    private Map<Location, List<User>> locations = new HashMap<>();
    private Notify notify;

    public Alerts(Notify notify){
        this.notify = notify;
    }

    public Map<Location, List<User>> getLocations(){
        return locations;
    }

    //add Subscriber
    public void addSubscriber(User user, Location location){
        List<User> userList = locations.get(location);
        userList.add(user);
    }

    //remove Subscriber
    public void removeSubscriber(User user, Location location){
        List<User> userList = locations.get(location);
        userList.remove(user);
    }

    //add location
    public void addLocation(Location location){
        locations.put(location, new ArrayList<>());
    }

    //remove location
    public void removeLocation(Location location){
        locations.remove(location, new ArrayList<>());
    }

    //remove Subscriber from all locations
    public void removeSubscriberFromAllLocations(User user){
        locations.values()
                .forEach(locationsList->locationsList.remove(user));
    }

    //send notify to all Users
    public void sendNotifyToAll(String message){
       Set<User>users = locations.entrySet()
               .stream()
               .flatMap(usersList->usersList.getValue().stream())
               .collect(Collectors.toSet());
       users.forEach(a->notify.alert(a, message));
    }

    //send notify to users from location
    public void sendNotifyToLocation(Location location, String message){
        List<User>users = locations.get(location);
        users.forEach(a->notify.alert(a, message));
    }
}