package com.yalla.support.common.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.umeng.analytics.pro.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p031OoooO.o0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO {
    public static final int OooO00o(int i) {
        Context contextOooO0O0 = OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            contextOooO0O0 = null;
        }
        return contextOooO0O0.getResources().getColor(i);
    }

    @NotNull
    public static final Drawable OooO0O0(int i) {
        Context context = null;
        if (Build.VERSION.SDK_INT >= 23) {
            Context contextOooO0O0 = OooO0O0.f20502OooO00o.OooO0O0();
            if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                contextOooO0O0 = null;
            }
            Drawable drawable = contextOooO0O0.getResources().getDrawable(i, null);
            Intrinsics.checkNotNullExpressionValue(drawable, "{\n        Utils.uiContex…ble(drawable, null)\n    }");
            return drawable;
        }
        Context contextOooO0O1 = OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O1 == null) {
            Context context2 = o0000O.f2657OooO00o;
            if (context2 != null) {
                context = context2;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(d.R);
            }
            contextOooO0O1 = context;
        }
        Drawable drawable2 = contextOooO0O1.getResources().getDrawable(i);
        Intrinsics.checkNotNullExpressionValue(drawable2, "{\n        Utils.uiContex…tDrawable(drawable)\n    }");
        return drawable2;
    }

    @NotNull
    public static final String OooO0OO(int i) {
        Context contextOooO0O0 = OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            contextOooO0O0 = null;
        }
        String string = contextOooO0O0.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "Utils.uiContext.getString(stringId)");
        return string;
    }
}
