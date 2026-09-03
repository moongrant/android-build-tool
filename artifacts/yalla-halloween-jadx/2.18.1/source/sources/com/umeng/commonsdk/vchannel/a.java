package com.umeng.commonsdk.vchannel;

import androidx.viewpager2.adapter.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static String a = "https://pslog.umeng.com";
    public static String b = "https://pslog.umeng.com/";
    public static String c = "explog";
    public static final String d = "analytics";
    public static final String e = "ekv";
    public static final String f = "id";
    public static final String g = "ts";
    public static final String h = "ds";
    public static final String i = "pn";
    public static String j = "";

    static {
        String strOooO00o = OooO00o.OooO00o("SUB", System.currentTimeMillis());
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(strOooO00o);
        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("%0");
        sbOooO0o1.append(32 - strOooO00o.length());
        sbOooO0o1.append("d");
        sbOooO0o0.append(String.format(sbOooO0o1.toString(), 0));
        j = sbOooO0o0.toString();
    }
}
