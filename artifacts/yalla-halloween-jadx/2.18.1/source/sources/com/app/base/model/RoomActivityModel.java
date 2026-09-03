package com.app.base.model;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RoomActivityModel {

    /* JADX INFO: renamed from: code, reason: collision with root package name */
    public String f11878code;
    public List<RoomActivitys> dataRight;
    public List<RoomActivitys> dataTop;
    public String message;

    public static class RoomActivitys {
        public String activityurl;
        public String description;
        public String id;
        public String imageurl;
        public int isshare;
        public String releasetime;
        public boolean shopType;
        public String title;
    }
}
