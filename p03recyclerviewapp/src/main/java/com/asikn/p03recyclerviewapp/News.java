package com.asikn.p03recyclerviewapp;

import android.os.Parcel;
import android.os.Parcelable;

public class News implements Parcelable {
    private String date;
    private String author;
    private String title;
    private String theme;
    private int ratingCount;
    private int viewsCount;
    private int commentsCount;

    public News(
            String date,
            String author,
            String title,
            String theme,
            int ratingCount,
            int viewsCount,
            int commentsCount
    ) {
        this.date = date;
        this.author = author;
        this.title = title;
        this.theme = theme;
        this.ratingCount = ratingCount;
        this.viewsCount = viewsCount;
        this.commentsCount = commentsCount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    public int getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(int viewsCount) {
        this.viewsCount = viewsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("News{");
        sb.append("date='").append(date).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", theme='").append(theme).append('\'');
        sb.append(", ratingCount=").append(ratingCount);
        sb.append(", viewsCount=").append(viewsCount);
        sb.append(", commentsCount=").append(commentsCount);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(date);
        dest.writeString(author);
        dest.writeString(title);
        dest.writeString(theme);
        dest.writeInt(ratingCount);
        dest.writeInt(viewsCount);
        dest.writeInt(commentsCount);
    }

    protected News(Parcel in) {
        date = in.readString();
        author = in.readString();
        title = in.readString();
        theme = in.readString();
        ratingCount = in.readInt();
        viewsCount = in.readInt();
        commentsCount = in.readInt();
    }

    public static final Creator<News> CREATOR = new Creator<News>() {
        @Override
        public News createFromParcel(Parcel in) {
            return new News(in);
        }

        @Override
        public News[] newArray(int size) {
            return new News[size];
        }
    };
}
