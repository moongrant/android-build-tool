package com.efs.sdk.base.core.a;

import android.text.TextUtils;
import com.efs.sdk.base.BuildConfig;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.PackageUtil;
import com.qiniu.android.http.ResponseInfo;
import com.umeng.analytics.pro.ak;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import p058o0000OoO.OooO;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public String f;
    public byte g;
    public String h;
    public String i;
    public String j;
    public String k;
    public long l = 0;

    public static c a() {
        c cVar = new c();
        cVar.a = ControllerCenter.getGlobalEnvStruct().getAppid();
        cVar.b = ControllerCenter.getGlobalEnvStruct().getSecret();
        cVar.k = ControllerCenter.getGlobalEnvStruct().getUid();
        cVar.j = BuildConfig.VERSION_NAME;
        cVar.c = PackageUtil.getAppVersionName(ControllerCenter.getGlobalEnvStruct().mAppContext);
        cVar.i = String.valueOf(com.efs.sdk.base.core.config.a.c.a().d.a);
        return cVar;
    }

    public final String b() {
        a.a();
        String strValueOf = String.valueOf(a.b() / 1000);
        String strA = com.efs.sdk.base.core.util.c.b.a(com.efs.sdk.base.core.util.c.a.a(OooO.OooO00o(new StringBuilder(), this.k, strValueOf), this.b));
        TreeMap treeMap = new TreeMap();
        treeMap.put("app", this.a);
        treeMap.put("sd", strA);
        if (!TextUtils.isEmpty(this.d)) {
            treeMap.put("cp", this.d);
        }
        if (this.g != 0) {
            treeMap.put("de", String.valueOf(this.e));
            treeMap.put("type", this.h);
            String str = this.f;
            if (TextUtils.isEmpty(str)) {
                a.a();
                long jB = a.b();
                str = String.format(Locale.SIMPLIFIED_CHINESE, "%d%04d", Long.valueOf(jB), Integer.valueOf(new Random(jB).nextInt(ResponseInfo.UnknownError)));
            }
            treeMap.put("seq", str);
        }
        treeMap.put("cver", this.i);
        treeMap.put(ak.x, "android");
        treeMap.put("sver", this.i);
        treeMap.put("tm", strValueOf);
        treeMap.put("ver", this.c);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : treeMap.entrySet()) {
            String str2 = ((String) entry.getKey()) + "=" + ((String) entry.getValue());
            sb2.append(str2);
            sb.append(str2);
            sb.append("&");
        }
        String strA2 = com.efs.sdk.base.core.util.c.b.a(sb2.toString() + this.b);
        sb.append("sign=");
        sb.append(strA2);
        return com.efs.sdk.base.core.util.c.b.b(sb.toString());
    }
}
