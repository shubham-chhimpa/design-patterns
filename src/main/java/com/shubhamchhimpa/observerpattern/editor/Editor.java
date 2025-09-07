package com.shubhamchhimpa.observerpattern.editor;

import java.io.File;
import java.util.HashMap;

import com.shubhamchhimpa.observerpattern.events.EventManager;
import com.shubhamchhimpa.observerpattern.events.EventType;

public class Editor {

    public EventManager manager;

    public Editor() {
        manager = new EventManager();
    }

    public void open(String filePath) {
        // open a file with path filePath
        File file = new File(filePath);
        // do some file processing
        manager.notifyListeners(EventType.OPEN, file);
    }

    public void save(String filePath) {
        // save a file with path filePath
        File file = new File(filePath);
        // do some file processing
        manager.notifyListeners(EventType.SAVE, file);
    }
}
