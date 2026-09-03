package p185o00o00o0;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO implements Drawable.Callback {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f38680OooO0Oo;

    public OooOOO(OooOOO0 oooOOO0) {
        this.f38680OooO0Oo = oooOOO0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NotNull Drawable d) {
        Intrinsics.checkNotNullParameter(d, "d");
        OooOOO0 oooOOO0 = this.f38680OooO0Oo;
        oooOOO0.f38683OooO0o0.setValue(Integer.valueOf(((Number) oooOOO0.f38683OooO0o0.getValue()).intValue() + 1));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NotNull Drawable d, @NotNull Runnable what, long j) {
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(what, "what");
        ((Handler) OooOOOO.f38685OooO00o.getValue()).postAtTime(what, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NotNull Drawable d, @NotNull Runnable what) {
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(what, "what");
        ((Handler) OooOOOO.f38685OooO00o.getValue()).removeCallbacks(what);
    }
}
