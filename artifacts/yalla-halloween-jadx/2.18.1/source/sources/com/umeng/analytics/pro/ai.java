package com.umeng.analytics.pro;

import android.content.Context;
import android.util.Log;
import com.umeng.commonsdk.debug.UMLog;
import java.lang.reflect.Method;
import p692oO000o0o.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
class ai implements z {
    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        try {
            if (!((OooOOO0.f52704OooO0O0 == null || OooOOO0.f52703OooO00o == null) ? false : true)) {
                UMLog.mutlInfo(2, "当前设备不支持获取OAID");
                return null;
            }
            Method method = OooOOO0.f52705OooO0OO;
            Object obj = OooOOO0.f52703OooO00o;
            if (obj == null || method == null) {
                return null;
            }
            try {
                Object objInvoke = method.invoke(obj, context);
                if (objInvoke != null) {
                    return (String) objInvoke;
                }
                return null;
            } catch (Exception e) {
                Log.e("IdentifierManager", "invoke exception!", e);
                return null;
            }
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
            return null;
        }
    }
}
