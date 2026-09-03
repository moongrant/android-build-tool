package p254o00ooO0O;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"StaticFieldLeak"})
public final class o00O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00O000 f34346OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static Context f34347OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Handler f34348OooO0OO = new Handler(Looper.getMainLooper());

    @NotNull
    public static final Context OooO00o() {
        Context context = f34347OooO0O0;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException(d.R);
        return null;
    }

    @Nullable
    public static final Activity OooO0O0() {
        return o00000O.f34254OooO00o.OooO0O0();
    }
}
