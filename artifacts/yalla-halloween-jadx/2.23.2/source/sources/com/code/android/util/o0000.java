package com.code.android.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000 {
    public static final int OooO00o(int i) {
        Context context = o000O00O.f13421OooO00o;
        Context contextOooO0O0 = OooO0O0.OooO0O0();
        if (contextOooO0O0 == null) {
            contextOooO0O0 = o000O00O.OooO00o();
        }
        return contextOooO0O0.getResources().getColor(i);
    }

    @NotNull
    public static final Drawable OooO0O0(int i) {
        Context context = o000O00O.f13421OooO00o;
        Context contextOooO0O0 = OooO0O0.OooO0O0();
        if (contextOooO0O0 == null) {
            contextOooO0O0 = o000O00O.OooO00o();
        }
        Drawable drawable = contextOooO0O0.getResources().getDrawable(i, null);
        Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
        return drawable;
    }

    @NotNull
    public static final String OooO0OO(int i) {
        Context context = o000O00O.f13421OooO00o;
        Context contextOooO0O0 = OooO0O0.OooO0O0();
        if (contextOooO0O0 == null) {
            contextOooO0O0 = o000O00O.OooO00o();
        }
        String string = contextOooO0O0.getResources().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
