package com.patrick;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Patrick on 3/20/2016.
 */
public class Lake {
    private String lakeName;
    private ArrayList<Double> runningTimes = new ArrayList<Double>();

    public Lake(String lakeName) {
        this.lakeName = lakeName;

    }
    public void addLakeTime(double lakeTime)
    {
        Double timeConvert = new Double(lakeTime);//
        runningTimes.add(timeConvert);
    }
    public String getName()
    {
        return lakeName;
    }
    public Double getQuickestTime()
    {
        Double quickestTime = Double.POSITIVE_INFINITY;
        for (Object o : runningTimes) {
            Double time = (Double) o;
            if (time < quickestTime)
                quickestTime = time;
        }
        return quickestTime;
    }
}