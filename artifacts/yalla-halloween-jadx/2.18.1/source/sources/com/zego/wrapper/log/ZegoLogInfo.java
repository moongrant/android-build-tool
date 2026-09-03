package com.zego.wrapper.log;

import OooO00o.OooO00o;
import com.umeng.analytics.pro.bl;

/* JADX INFO: loaded from: classes3.dex */
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
            return bl.a;
        }
        String str = TAG;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("getLogLevelColor 没有定义指定类型的颜色？ mLogLevel = ");
        sbOooO0o0.append(this.mLogLevel);
        ZLog.w(str, sbOooO0o0.toString(), new Object[0]);
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
        String str = TAG;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("getLogLevelEmoji 没有定义指定类型的 Emoji？ mLogLevel = ");
        sbOooO0o0.append(this.mLogLevel);
        ZLog.w(str, sbOooO0o0.toString(), new Object[0]);
        return "unknown level";
    }

    public String getLogMsg() {
        return this.mLogMsg;
    }

    public String getLogTag() {
        return this.mLogTag;
    }
}
