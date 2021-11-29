package com.pettinger;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Currency;
import java.util.ResourceBundle;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args){

        DateApplication dateApp = new DateApplication();
        dateApp.run();

//        Language language = new Language();
//        ResourceBundle messages = language.getMessages();
//        Consumer<LocalDate> today;
//
//        System.out.println("--- English ---");
//        language.setLocale(Language.Option.English);
//        switchLanguages(language);
//
//        System.out.println("--- German ---");
//        language.setLocale(Language.Option.German);
//        switchLanguages(language);
//
//        System.out.println("--- French ---");
//        language.setLocale(Language.Option.French);
//        switchLanguages(language);
//
//        System.out.println("--- Iceland ---");
//        language.setLocale(Language.Option.Icelandic);
//        switchLanguages(language);
//
//
//    }
//
//    private static void switchLanguages(Language language) {
//        ResourceBundle messages;
//        Consumer<LocalDate> today;
//        messages = language.getMessages();
//        System.out.println(messages.getString("greeting"));
//        System.out.println(messages.getString("inquiry"));
//        System.out.println(messages.getString("farewell"));
//        today = (date) -> {
//            DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(language.getLocale());
//            System.out.println(dtf.format(date));
//        };
//        today.accept(LocalDate.now());
//        NumberFormat nf = NumberFormat.getCurrencyInstance(language.getLocale());
//        nf.setCurrency(Currency.getInstance("USD"));
//        System.out.println(nf.format(23.99));
//        System.out.println();
 }
}
