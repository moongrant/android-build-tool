package p097o000o0oO;

import android.content.Context;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0000oo f35408OooO00o = new o0000oo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static o000O000 f35409OooO0O0;

    @JvmStatic
    @NotNull
    public static final o000O000 OooO00o(@NotNull Context context) {
        o000O000 o000o001 = f35409OooO0O0;
        if (o000o001 != null) {
            return o000o001;
        }
        synchronized (f35408OooO00o) {
            o000O000 o000o002 = f35409OooO0O0;
            if (o000o002 != null) {
                return o000o002;
            }
            Object applicationContext = context.getApplicationContext();
            o000O0o o000o0o2 = applicationContext instanceof o000O0o ? (o000O0o) applicationContext : null;
            o000O000 o000o000OooO00o = o000o0o2 != null ? o000o0o2.OooO00o() : new o000O000.OooO00o(context).OooO00o();
            f35409OooO0O0 = o000o000OooO00o;
            return o000o000OooO00o;
        }
    }
}
