package com.yuexiang.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by WangY2 on 10/11/2015.
 */
public class Crime {
    private UUID mID;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public UUID getID() {
        return mID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Crime(){

        mID = UUID.randomUUID();
        mDate = new Date();

    }
}
