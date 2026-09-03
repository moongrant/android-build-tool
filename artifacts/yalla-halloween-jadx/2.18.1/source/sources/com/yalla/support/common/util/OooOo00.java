package com.yalla.support.common.util;

import android.content.Context;
import android.util.TypedValue;
import com.umeng.analytics.pro.d;
import kotlin.jvm.internal.Intrinsics;
import p031OoooO.o0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 {
    public static final int OooO00o(float f) {
        Context context = o0000O.f2657OooO00o;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            context = null;
        }
        return (int) (TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()) + 0.5f);
    }

    public static final int OooO0O0(float f) {
        Context context = o0000O.f2657OooO00o;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            context = null;
        }
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
