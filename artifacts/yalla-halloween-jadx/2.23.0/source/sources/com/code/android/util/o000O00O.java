package com.code.android.util;

import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00O {
    public static final void OooO00o(int i) {
        String strOooO0OO = o0000.OooO0OO(i);
        if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
            return;
        }
        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
        } else {
            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
        }
    }

    public static final void OooO0O0(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (string == null || StringsKt.isBlank(string)) {
            return;
        }
        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(string, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
        } else {
            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
        }
    }
}
