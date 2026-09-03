package com.app.base.model;

/* JADX INFO: loaded from: classes.dex */
public class SilenceModel extends BaseRoomModel {
    public static final int SILENCE = 1;
    public static final int UNSILENCE = 0;
    public FromBean from;
    public boolean silence;
    public ToBean to;

    public static class FromBean {
        public String name;
        public int uid;
    }

    public static class ToBean {
        public String name;
        public long uid;
    }
}
