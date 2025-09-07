package com.shubhamchhimpa.observerpattern.events;

import java.io.File;

public class EmailEventListener implements EventListener {
    public String email;

    public EmailEventListener(String email) {
        this.email = email;
    }

    @Override
    public void update(EventType eventType, File file) {
        System.out.printf(
                        """  
                        sending email to %s with attachment : %s
                        """, email, file.getName()
        );
    }
}
