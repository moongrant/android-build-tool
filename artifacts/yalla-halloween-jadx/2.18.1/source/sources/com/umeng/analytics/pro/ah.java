package com.umeng.analytics.pro;

import Oooo000.o00O00;
import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import java.util.Objects;
import p690oO000o.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public class ah implements z {
    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        String strOooO0o = null;
        try {
            Objects.requireNonNull(OooO0o.OooO00o(context));
            if (OooO0o.f52693OooO0O0) {
                strOooO0o = o00O00.OooO0o(context);
            } else {
                UMLog.mutlInfo(2, "当前设备不支持获取OAID");
            }
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
        }
        return strOooO0o;
    }
}
