package com.yalla.yalla.model.user;

import com.yalla.yalla.model.bean.AbsJavaBeanApi;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class UserHeadFrameModelList extends AbsJavaBeanApi {
    private ArrayList<UserHeadFrameModel> dataOfLock;
    private ArrayList<UserHeadFrameModel> dataOfUnlock;

    public ArrayList<UserHeadFrameModel> getDataOfLock() {
        return this.dataOfLock;
    }

    public ArrayList<UserHeadFrameModel> getDataOfUnlock() {
        return this.dataOfUnlock;
    }
}
