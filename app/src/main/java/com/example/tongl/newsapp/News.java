package com.example.tongl.newsapp;

public class News {
    private String mTitle;
    private String mSection;
    private String mDate;
    private String mUrl;

    /**
     * Constructs a new {@link News} object.
     *
     * @param title   is the name of article
     * @param section is the type of news
     * @param date    is the date of article
     * @param url     is the website URL that loads the news article
     */
    public News(String title, String section, String date, String url) {
        mTitle = title;
        mSection = section;
        mDate = date;
        mUrl = url;
    }


    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getDate() {
        return mDate;
    }

    /**
     * Returns the website URL to find more information about the news article.
     */
    public String getUrl() {
        return mUrl;
    }

}
