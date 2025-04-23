package com.ps;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime rightNow = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
        String rightNowPrettyFormatted = rightNow.format(formatter);
        System.out.println("Date " + rightNowPrettyFormatted);

//    04/23/2025
    }
}