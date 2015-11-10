package com.yuexiang.criminalintent;

import java.util.UUID;

/**
 * Created by WangY2 on 10/11/2015.
 */
public class Crime {
    private UUID mID;
    private String mTitle;

    public UUID getID() {
        return mID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Crime(){


        mID = UUID.randomUUID();
    }
}
