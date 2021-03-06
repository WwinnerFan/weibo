package com.fy.weibo.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by Fan on 2018/7/31.
 * Fighting!!!
 */
public final class SimpleUser implements Serializable {

    private String idstr;
    private String screen_name;
    private String profile_image_url;
    private String cover_image_phone;
    private String token;
    private String uid;


    public String getCover_image_phone() {
        return cover_image_phone;
    }

    public String getIdstr() {
        return idstr;
    }

    public String getScreen_name() {
        return screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
