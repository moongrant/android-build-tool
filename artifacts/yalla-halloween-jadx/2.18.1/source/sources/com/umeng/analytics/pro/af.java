package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import p168o00Ooo0.OooOo;
import p416o0Oo0oO0.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
public class af implements z {
    private boolean a = false;

    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        try {
            if (!this.a) {
                o00oO0o.f39584OooO0O0 = ooOOOOOo.OooO00o.OooO0O0.f53506OooO00o.OooO00o(context.getApplicationContext());
                o00oO0o.f39583OooO00o = true;
                this.a = true;
            }
            if (!o00oO0o.f39583OooO00o) {
                throw new RuntimeException("SDK Need Init First!");
            }
            if (o00oO0o.f39584OooO0O0) {
                return OooOo.OooO00o(context);
            }
            UMLog.mutlInfo(2, "当前设备不支持获取OAID");
            return null;
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
            return null;
        }
    }
}
