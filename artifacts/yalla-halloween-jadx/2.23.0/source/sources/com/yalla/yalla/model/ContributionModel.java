package com.yalla.yalla.model;

import com.yalla.yalla.model.room.RoomUserInfoDTO;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ContributionModel {
    public int code;
    public List<DataBean> data;
    public String message;
    public long own;
    public long sumamount;
    public long upstamp;
    public String upttime;

    public static class DataBean extends RoomUserInfoDTO {
        public long number;
    }
}
