package p118o00O0Oo;

import android.content.Context;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O0O00 f36412OooO00o = new o0O0O00();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static o00000O f36413OooO0O0;

    @JvmStatic
    @NotNull
    public static final o00000O OooO00o(@NotNull Context context) {
        o00000O o00000o = f36413OooO0O0;
        if (o00000o != null) {
            return o00000o;
        }
        synchronized (f36412OooO00o) {
            o00000O o00000o2 = f36413OooO0O0;
            if (o00000o2 != null) {
                return o00000o2;
            }
            Object applicationContext = context.getApplicationContext();
            o00000OO o00000oo2 = applicationContext instanceof o00000OO ? (o00000OO) applicationContext : null;
            o00000O o00000oOooO00o = o00000oo2 != null ? o00000oo2.OooO00o() : new o00000O.OooO00o(context).OooO00o();
            f36413OooO0O0 = o00000oOooO00o;
            return o00000oOooO00o;
        }
    }
}
