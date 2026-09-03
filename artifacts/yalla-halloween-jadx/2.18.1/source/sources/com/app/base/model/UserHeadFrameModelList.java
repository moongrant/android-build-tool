package com.app.base.model;

import com.app.base.bean.AbsJavaBeanApi;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
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
