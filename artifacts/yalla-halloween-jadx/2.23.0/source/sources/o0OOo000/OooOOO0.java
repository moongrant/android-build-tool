package o0OOo000;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p204o00o0oO.oOO00O;
import p246o00oo0o0.o00oOoo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public static com.google.android.exoplayer2.upstream.cache.OooO0O0 f43863OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final o00oOoo f43864OooO0O0 = new o00oOoo();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Object f43865OooO0OO = new Object();

    @NotNull
    public static com.google.android.exoplayer2.upstream.cache.OooO0O0 OooO00o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (f43865OooO0OO) {
            if (f43863OooO00o == null) {
                f43863OooO00o = new com.google.android.exoplayer2.upstream.cache.OooO0O0(new File(context.getCacheDir(), "video_cache"), f43864OooO0O0, new oOO00O(context));
            }
            Unit unit = Unit.INSTANCE;
        }
        com.google.android.exoplayer2.upstream.cache.OooO0O0 oooO0O0 = f43863OooO00o;
        Intrinsics.checkNotNull(oooO0O0);
        return oooO0O0;
    }
}
