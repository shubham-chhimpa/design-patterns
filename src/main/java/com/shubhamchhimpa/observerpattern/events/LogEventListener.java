package com.shubhamchhimpa.observerpattern.events;

import java.io.File;
import java.time.LocalDateTime;

public class LogEventListener implements EventListener {

    @Override
    public void update(EventType eventType, File file) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.printf(
                        """
                        LOG : DEBUG : %s : Event --> %s  triggered for file : %s  
                        """, dateTime, eventType.toString(), file.getName()
        );
    }
}
