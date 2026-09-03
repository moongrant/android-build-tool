package com.yalla.yalla.model.room;

import com.yalla.yalla.model.BaseRoomModel;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RoomOnlineContributionUpdataModel extends BaseRoomModel {
    public List<UpdataUsersBean> users;

    public static class UpdataUsersBean {
        public long priority;
        public int rankday;
        public int rankweek;
        public long uid;
    }
}
