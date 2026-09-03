package p650o0ooo;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p205o00o0o0o.o000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class z {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Activity f59243OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f59244OooO0O0;

    public static final class OooO00o extends Lambda implements Function0<o000O> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000O invoke() {
            return new o000O(z.this.f59243OooO00o);
        }
    }

    public z(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f59243OooO00o = activity;
        this.f59244OooO0O0 = LazyKt.lazy(new OooO00o());
    }
}
