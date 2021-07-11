package com.alevel.homeworkOOP.week;

public class Week {
    public enum DayStatusEnum{
        WORKDAY,
        WEEKEND;
    }

    public enum WeekEnum {
        MONDAY(DayStatusEnum.WORKDAY),
        TUESDAY(DayStatusEnum.WORKDAY),
        WEDNESDAY(DayStatusEnum.WORKDAY),
        THURSDAY(DayStatusEnum.WORKDAY),
        FRIDAY(DayStatusEnum.WORKDAY),
        SATURDAY(DayStatusEnum.WEEKEND),
        SUNDAY(DayStatusEnum.WEEKEND);

        DayStatusEnum status;
        WeekEnum(DayStatusEnum status) {
            this.status = status;
        }
    }
}
