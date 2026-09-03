package com.app.base.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class ChackFollowAndJoinModel extends CommonModel {
    public DataBean data;

    public static class DataBean {

        @SerializedName("isFollowing")
        public boolean isFollowing;

        @SerializedName("isJoined")
        public boolean isJoined;
    }
}
