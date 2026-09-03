package com.app.base.model;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RoomLevelInfoModel {
    public long barMax;

    /* JADX INFO: renamed from: code, reason: collision with root package name */
    public String f11880code;
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
