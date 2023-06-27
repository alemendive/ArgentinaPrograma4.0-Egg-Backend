package com.alemendive;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Fechas {
    public static void main(String[] args) {
        //Fechas
        Calendar c = Calendar.getInstance();
        c.set(2000, Calendar.JANUARY, 1);

        LocalDate date = LocalDate.of(2000, 1, 1);

        //Times

        LocalTime time = LocalTime.of(12, 0);

        //Date and time
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        LocalDateTime dateTime2 = LocalDateTime.of(2000, 1, 1, 12, 0);


        LocalDateTime lastWeek = dateTime.minusDays(7);

        String dateFormated = dateTime.format(DateTimeFormatter.ISO_DATE);
        System.out.println(dateFormated);



    }
}
