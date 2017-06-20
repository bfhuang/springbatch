package com.mkyong.model;

/**
 * Created by bfhuang on 6/19/17.
 */
public class JdbcReport {
    private String Impressions;
    private String Clicks;
    private String Earning;
    private String Date;

    public String getImpressions() {
        return Impressions;
    }

    public void setImpressions(String impressions) {
        Impressions = impressions;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getClicks() {
        return Clicks;
    }

    public void setClicks(String clicks) {
        Clicks = clicks;
    }

    public String getEarning() {
        return Earning;
    }

    public void setEarning(String earning) {
        Earning = earning;
    }
}
