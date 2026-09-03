package p229o00oOo0O;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00oO0o implements Drawable.Callback {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo000o f39741OooO0Oo;

    public o00oO0o(oo000o oo000oVar) {
        this.f39741OooO0Oo = oo000oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NotNull Drawable d) {
        Intrinsics.checkNotNullParameter(d, "d");
        oo000o oo000oVar = this.f39741OooO0Oo;
        oo000oVar.f39747OooO0o0.setValue(Integer.valueOf(((Number) oo000oVar.f39747OooO0o0.getValue()).intValue() + 1));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NotNull Drawable d, @NotNull Runnable what, long j) {
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(what, "what");
        ((Handler) o0ooOOo.f39743OooO00o.getValue()).postAtTime(what, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NotNull Drawable d, @NotNull Runnable what) {
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(what, "what");
        ((Handler) o0ooOOo.f39743OooO00o.getValue()).removeCallbacks(what);
    }
}
