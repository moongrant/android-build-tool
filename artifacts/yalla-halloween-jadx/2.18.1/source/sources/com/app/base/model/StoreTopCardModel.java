package com.app.base.model;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StoreTopCardModel {

    /* JADX INFO: renamed from: code, reason: collision with root package name */
    public String f11891code;
    public List<TopCard> data;
    public boolean isRoom;
    public long isTop;
    public String message;

    public static class TopCard {
        public long bidderUserid;
        public boolean biddingState;
        public long expiryTime;
        public String headurl;
        public long idx;
        public String nickname;
        public long price;
        public boolean purchaseState;
        public String setTopId;
    }
}
