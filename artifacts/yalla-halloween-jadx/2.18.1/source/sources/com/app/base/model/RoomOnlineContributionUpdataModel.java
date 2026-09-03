package com.app.base.model;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RoomOnlineContributionUpdataModel extends BaseRoomModel {
    public List<UpdataUsersBean> users;

    public static class UpdataUsersBean {
        public long priority;
        public int rankday;
        public int rankweek;
        public long uid;
    }
}
