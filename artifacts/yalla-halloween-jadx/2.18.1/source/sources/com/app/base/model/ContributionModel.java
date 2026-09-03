package com.app.base.model;

import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ContributionModel {

    /* JADX INFO: renamed from: code, reason: collision with root package name */
    public int f11863code;
    public List<DataBean> data;
    public String message;
    public long own;
    public long sumamount;
    public long upstamp;
    public String upttime;

    public static class DataBean extends RoomUserInfoModel {
        public long number;
    }
}
