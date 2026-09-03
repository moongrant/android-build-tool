package com.common.support.atd;

import android.content.Context;
import com.common.support.atd.base.InitResult;
import p225o00oOOo0.o0000O;

/* JADX INFO: loaded from: classes2.dex */
public class YS {
    public static native boolean A();

    public static native boolean B();

    public static native boolean C();

    public static native String D(String str);

    public static native String E();

    public static native boolean F();

    public static void init(Context context, InitResult initResult) {
        try {
            new o0000O().OooO0O0(context, "sgavmpro");
            o0000O o0000o2 = new o0000O();
            o0000o2.f39714OooO0Oo = true;
            o0000o2.OooO0O0(context, "atd");
        } catch (Throwable th) {
            initResult.setCode(8);
            initResult.setMessage(th.toString());
        }
    }
}
