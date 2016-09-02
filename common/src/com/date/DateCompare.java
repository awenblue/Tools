package com.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Awen on 2016/9/2.
 */
public class DateCompare {

    /**
     * 判断时间格式为"yyyy-MM-dd"的日期大小
     * 返回 0：相等； 大于0：start>end；小于0：start<end
     * @param start
     * @param end
     * @return
     */
    public static int compareDate(String start, String end) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar startTime = Calendar.getInstance();
        Calendar endTime = Calendar.getInstance();

        try {
            startTime.setTime(df.parse(start));
            endTime.setTime(df.parse(end));
        } catch (ParseException e) {

        }

        return startTime.compareTo(endTime);
    }



}
