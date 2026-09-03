package com.android.billingclient.api;

import java.lang.reflect.Type;
import p386o0OOoo0O.o000OOo0;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0Oo0oo {
    public static o000OOo0 OooO00o() {
        p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
        return p516o0o0O000.o0OOO0o.OooO00o();
    }

    public static Object OooO0O0(String str, Class cls) {
        try {
            return OooO00o().OooO0OO(str, cls);
        } catch (Exception e) {
            e.printStackTrace();
            o00O00.OooO0Oo("GsonConvert fromJson\n json = " + str + "\n classOfT = " + cls + "\n Exception = " + e);
            return null;
        }
    }

    public static Object OooO0OO(String str, Type type) {
        try {
            return OooO00o().OooO0Oo(str, type);
        } catch (Exception e) {
            e.printStackTrace();
            o00O00.OooO0Oo("GsonConvert fromJson\n json = " + str + "\n type = " + type + "\n Exception = " + e);
            return null;
        }
    }

    public static String OooO0Oo(Object obj) {
        return OooO00o().OooO0oo(obj);
    }
}
