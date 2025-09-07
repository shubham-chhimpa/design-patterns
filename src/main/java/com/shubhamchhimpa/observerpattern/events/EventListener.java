package com.shubhamchhimpa.observerpattern.events;

import java.io.File;

public interface EventListener {

    void update(EventType eventType, File file);
}

