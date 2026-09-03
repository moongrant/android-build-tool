package o00O0OOO;

import android.content.Context;
import android.os.PowerManager;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes2.dex */
@JvmName(name = "WakeLocks")
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final String f36310OooO00o;

    static {
        String strOooO0o = p115o00O00oO.o0Oo0oo.OooO0o("WakeLocks");
        Intrinsics.checkNotNullExpressionValue(strOooO0o, "tagWithPrefix(\"WakeLocks\")");
        f36310OooO00o = strOooO0o;
    }

    @NotNull
    public static final PowerManager.WakeLock OooO00o(@NotNull Context context, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strOooO00o = o00O00OO.OooO00o("WorkManager: ", tag);
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, strOooO00o);
        synchronized (o0OO00O.f36308OooO00o) {
            o0OO00O.f36309OooO0O0.put(wakeLock, strOooO00o);
        }
        Intrinsics.checkNotNullExpressionValue(wakeLock, "wakeLock");
        return wakeLock;
    }
}
