package com.app.base.app.appConfig.apiDataModela;

import com.app.base.model.RoomActivityModel;

/* JADX INFO: loaded from: classes.dex */
public class ApiRoomActivityUtils {
    private static ApiRoomActivityUtils instance;
    private RoomActivityModel roomActivityInfo;

    public static ApiRoomActivityUtils getInstance() {
        if (instance == null) {
            instance = new ApiRoomActivityUtils();
        }
        return instance;
    }

    public RoomActivityModel getRoomActivityModel() {
        return this.roomActivityInfo;
    }

    public void init() {
    }
}
