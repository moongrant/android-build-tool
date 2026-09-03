package com.app.base.model;

import android.text.TextUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class WlanIpSaveModel implements Serializable {
    private long expiryTime;
    private String networkType;
    private long saveTime;
    private String wlanIp;

    public WlanIpSaveModel(String str, String str2, long j) {
        if (TextUtils.isEmpty(str) || j < 0) {
            return;
        }
        this.wlanIp = str;
        this.networkType = str2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.saveTime = jCurrentTimeMillis;
        this.expiryTime = (j * 1000) + jCurrentTimeMillis;
    }

    public long getExpiryTime() {
        return this.expiryTime;
    }

    public String getNetworkType() {
        return this.networkType;
    }

    public long getSaveTime() {
        return this.saveTime;
    }

    public String getWlanIp() {
        return this.wlanIp;
    }

    public void setExpiryTime(long j) {
        this.expiryTime = j;
    }

    public void setNetworkType(String str) {
        this.networkType = str;
    }

    public void setSaveTime(long j) {
        this.saveTime = j;
    }

    public void setWlanIp(String str) {
        this.wlanIp = str;
    }
}
