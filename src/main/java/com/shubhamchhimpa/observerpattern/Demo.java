package com.shubhamchhimpa.observerpattern;

import com.shubhamchhimpa.observerpattern.editor.Editor;
import com.shubhamchhimpa.observerpattern.events.EmailEventListener;
import com.shubhamchhimpa.observerpattern.events.EventType;
import com.shubhamchhimpa.observerpattern.events.LogEventListener;

public class Demo {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.manager.subscribe(EventType.OPEN, new EmailEventListener("shubham@gmail.com"));
        editor.manager.subscribe(EventType.OPEN,new LogEventListener());
        editor.manager.subscribe(EventType.SAVE,new LogEventListener());
        editor.open("test.txt");
        editor.save("test.txt");
    }
}
