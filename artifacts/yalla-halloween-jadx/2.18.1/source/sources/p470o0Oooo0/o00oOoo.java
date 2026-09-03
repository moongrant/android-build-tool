package p470o0Oooo0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static int f40633OooO00o;

    public static final int OooO00o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f40633OooO00o == 0) {
            Resources system = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
            int i = (int) ((system.getDisplayMetrics().density * 300.0f) + 0.5f);
            Intrinsics.checkNotNullParameter(context, "context");
            if (o0O0ooO.f40634OooO00o == null) {
                synchronized (o0O0ooO.class) {
                    if (o0O0ooO.f40634OooO00o == null) {
                        o0O0ooO.f40634OooO00o = context.getSharedPreferences("keyboard.common", 0);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            SharedPreferences sharedPreferences = o0O0ooO.f40634OooO00o;
            Intrinsics.checkNotNull(sharedPreferences);
            f40633OooO00o = sharedPreferences.getInt("sp.key.keyboard.height", i);
        }
        return f40633OooO00o;
    }
}
