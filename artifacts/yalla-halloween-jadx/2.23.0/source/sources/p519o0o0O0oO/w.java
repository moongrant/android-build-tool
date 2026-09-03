package p519o0o0O0oO;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p157o00OoOO0.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class w {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Activity f53178OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f53179OooO0O0;

    public static final class OooO00o extends Lambda implements Function0<o0OO00O> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OO00O invoke() {
            return new o0OO00O(w.this.f53178OooO00o);
        }
    }

    public w(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f53178OooO00o = activity;
        this.f53179OooO0O0 = LazyKt.lazy(new OooO00o());
    }
}
