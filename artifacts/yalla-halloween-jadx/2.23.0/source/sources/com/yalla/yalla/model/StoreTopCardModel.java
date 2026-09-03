package com.yalla.yalla.model;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class StoreTopCardModel {
    public String code;
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
