package com.shubhamchhimpa.observerpattern.events;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventManager {

    HashMap<EventType, List<EventListener>> eventListenersMap;
    public EventManager() {
        eventListenersMap = new HashMap<>();
    }

    public void subscribe(EventType eventType,EventListener eventListener){
        eventListenersMap.computeIfAbsent(eventType, k -> new ArrayList<>()).add(eventListener);
    }
    public void notifyListeners(EventType eventType, File file) {
        List<EventListener> listeners = eventListenersMap.get(eventType);
        if(listeners!=null){
            for(EventListener listener : listeners){
                listener.update(eventType,file);
            }
        }

    }
}
