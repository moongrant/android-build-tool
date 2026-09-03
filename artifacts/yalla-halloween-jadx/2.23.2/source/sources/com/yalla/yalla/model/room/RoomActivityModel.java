package com.yalla.yalla.model.room;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RoomActivityModel {
    public String code;
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
