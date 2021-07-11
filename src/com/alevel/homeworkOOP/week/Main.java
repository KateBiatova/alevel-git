package com.alevel.homeworkOOP.week;

import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {

        EnumSet.allOf(Week.WeekEnum.class)
                .forEach
                        (day -> System.out.println(day + " is "+ day.status) );
    }
}
