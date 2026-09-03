package p139o00OOOo0;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p255o00ooO0o.oo0oOO0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00O00o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Activity f31828OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f31829OooO0O0;

    public static final class OooO00o extends Lambda implements Function0<oo0oOO0> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oo0oOO0 invoke() {
            return new oo0oOO0(o00O00o0.this.f31828OooO00o);
        }
    }

    public o00O00o0(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f31828OooO00o = activity;
        this.f31829OooO0O0 = LazyKt.lazy(new OooO00o());
    }
}
