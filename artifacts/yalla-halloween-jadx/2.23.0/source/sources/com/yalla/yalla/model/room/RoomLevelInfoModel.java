package com.yalla.yalla.model.room;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RoomLevelInfoModel {
    public long barMax;
    public String code;
    public List<RoomLevelInfo> data;
    public String message;
    public String userMax;

    public static class RoomLevelInfo {
        public Long experience;
        public Long maxExperience;
        public Long single;
        public Long sumExperience;
        public int type;
    }
}
