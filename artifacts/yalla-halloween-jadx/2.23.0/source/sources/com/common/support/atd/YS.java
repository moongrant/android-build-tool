package com.common.support.atd;

import android.content.Context;
import com.common.support.atd.base.InitResult;
import oo00oO.OooO;

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
            new OooO().OooO0O0(context, "sgavmpro");
            OooO oooO = new OooO();
            oooO.f60875OooO0Oo = true;
            oooO.OooO0O0(context, "atd");
        } catch (Throwable th) {
            initResult.setCode(8);
            initResult.setMessage(th.toString());
        }
    }
}
