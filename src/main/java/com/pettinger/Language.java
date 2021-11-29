package com.pettinger;

import java.util.Locale;
import java.util.ResourceBundle;

public class Language {
    public enum Option {
        English,
        German,
        French,
        Icelandic
    };

    private ResourceBundle messages;
    private Locale locale;

    public Language() {
        locale = Locale.getDefault();
        messages = ResourceBundle.getBundle("messages", locale);
    }

    public ResourceBundle getMessages() {
        return messages;
    }

    public Locale getLocale(){
        return locale;
    }

    public void setLocale(Option language){
        switch(language){
            case English -> locale = Locale.ENGLISH;
            case German -> locale = Locale.GERMANY;
            case French -> locale = Locale.FRANCE;
            case Icelandic -> locale = new Locale("is");
            default -> locale = Locale.getDefault();
        }
        messages = ResourceBundle.getBundle("messages", locale);
    }
}
