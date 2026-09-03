package com.zego.wrapper.manager.utils;

/* JADX INFO: loaded from: classes5.dex */
public class StringHelper {
    public static String getLiveStatusString(int i) {
        if (i == 0) {
            return "待连接";
        }
        if (i != 1) {
            return i != 2 ? "" : "已连接";
        }
        return "连接中";
    }
}
