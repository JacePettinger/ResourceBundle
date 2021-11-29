package com.pettinger;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class DateApplication {
    PrintWriter pw = new PrintWriter(System.out, true);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Locale currentLocale = Locale.US;
    ResourceBundle messages = ResourceBundle.getBundle("messages", Locale.US);

    LocalDateTime today = LocalDateTime.now();
    DateTimeFormatter df;
    Language language = new Language();

    public void run() {
        String line = "";

        while(!(line.equals("q"))) {
            this.printMenu();
            try {
                line = this.br.readLine();
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
            switch(line) {
                case "2":
                    this.setFrench();
                    break;
                case "3":
                    this.setIcelandic();
                    break;
                default:
                    this.setEnglish();
                    break;
            }
        }
    }


    public void printMenu() {
        pw.println("=== " + messages.getString("appTitle") + " ===");

        // Print a Full Date
        this.df = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(currentLocale);
        pw.println(messages.getString("date1") + ": " + today.format(df));
        // Print a Long Date
        this.df = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(currentLocale);
        pw.println(messages.getString("date2") + ": " + today.format(df));
        // Print a Medium Date
        this.df = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(currentLocale);
        pw.println(messages.getString("date3") + ": " + today.format(df));
        // Print a Short Date
        this.df = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(currentLocale);
        pw.println(messages.getString("date4") + ": " + today.format(df));
        // Print a Medium Date/Time
        this.df = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(currentLocale);
        pw.println(messages.getString("date5") + ": " + today.format(df));
        // Print a Medium Time
        this.df = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).withLocale(currentLocale);
        pw.println(messages.getString("date6") + ": " + today.format(df));


        pw.println("\n--- " + messages.getString("menuTitle") + " ---");
        pw.println("1. " + messages.getString("menu1"));
        pw.println("2. " + messages.getString("menu2"));
        pw.println("3. " + messages.getString("menu3"));
        pw.println("q. " + messages.getString("menuq"));
        System.out.print(messages.getString("menucommand") + ": ");
    }

    public void setEnglish() {
        language.setLocale(Language.Option.English);
        messages = language.getMessages();
    }

    public void setFrench() {
        language.setLocale(Language.Option.French);
        messages = language.getMessages();
    }

    private void setIcelandic() {
        language.setLocale(Language.Option.Icelandic);
        messages = language.getMessages();
    }
}
