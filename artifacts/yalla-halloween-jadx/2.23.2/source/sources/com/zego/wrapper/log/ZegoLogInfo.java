package com.zego.wrapper.log;

/* JADX INFO: loaded from: classes4.dex */
public class ZegoLogInfo {
    private static final String TAG = "ZegoLogInfo";
    private int mLogLevel;
    private String mLogMsg;
    private String mLogTag;

    public ZegoLogInfo(int i, String str, String str2) {
        this.mLogLevel = i;
        this.mLogTag = str;
        this.mLogMsg = str2;
    }

    public int getLogLevel() {
        return this.mLogLevel;
    }

    public int getLogLevelColor() {
        int i = this.mLogLevel;
        if (i == 2) {
            return -16777216;
        }
        if (i == 3) {
            return -1;
        }
        if (i == 4) {
            return -16776961;
        }
        if (i == 5) {
            return -256;
        }
        if (i == 6) {
            return -65536;
        }
        ZLog.w(TAG, "getLogLevelColor 没有定义指定类型的颜色？ mLogLevel = " + this.mLogLevel, new Object[0]);
        return -16711936;
    }

    public String getLogLevelEmoji() {
        int i = this.mLogLevel;
        if (i == 2) {
            return "◾️";
        }
        if (i == 3) {
            return "◽️";
        }
        if (i == 4) {
            return "🔷️";
        }
        if (i == 5) {
            return "🔶️";
        }
        if (i == 6) {
            return "🔴️";
        }
        ZLog.w(TAG, "getLogLevelEmoji 没有定义指定类型的 Emoji？ mLogLevel = " + this.mLogLevel, new Object[0]);
        return "unknown level";
    }

    public String getLogMsg() {
        return this.mLogMsg;
    }

    public String getLogTag() {
        return this.mLogTag;
    }
}
