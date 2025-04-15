package com.ps;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WorkingWIthDates {
    public static void main(String[] args) {
        String str1 = "2025-01-01";
        LocalDate date1 = LocalDate.parse(str1);

        String str2 = "12/30/1999";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date2 = LocalDate.parse(str2, formatter);

        System.out.println(date2.getDayOfWeek());

    }
}
