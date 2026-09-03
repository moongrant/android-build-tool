package p254o00ooO0O;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0O0 {
    public static final int OooO00o(int i) {
        o00O000 o00o001 = o00O000.f34346OooO00o;
        Context contextOooO0O0 = o00O000.OooO0O0();
        if (contextOooO0O0 == null) {
            contextOooO0O0 = o00O000.OooO00o();
        }
        return contextOooO0O0.getResources().getColor(i);
    }

    @NotNull
    public static final Drawable OooO0O0(int i) {
        o00O000 o00o001 = o00O000.f34346OooO00o;
        Context contextOooO0O0 = o00O000.OooO0O0();
        if (contextOooO0O0 == null) {
            contextOooO0O0 = o00O000.OooO00o();
        }
        Drawable drawable = contextOooO0O0.getResources().getDrawable(i, null);
        Intrinsics.checkNotNullExpressionValue(drawable, "Utils.topActivity ?: Uti…tDrawable(drawable, null)");
        return drawable;
    }

    @NotNull
    public static final String OooO0OO(int i) {
        o00O000 o00o001 = o00O000.f34346OooO00o;
        Context contextOooO0O0 = o00O000.OooO0O0();
        if (contextOooO0O0 == null) {
            contextOooO0O0 = o00O000.OooO00o();
        }
        String string = contextOooO0O0.getResources().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "Utils.topActivity ?: Uti…urces.getString(stringId)");
        return string;
    }
}
