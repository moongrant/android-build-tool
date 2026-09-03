package p237o00oOooO;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.ui.geometry.Size;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00o00 implements Drawable.Callback {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0oO0Ooo f39969OooO0Oo;

    public o0O00o00(o0oO0Ooo o0oo0ooo2) {
        this.f39969OooO0Oo = o0oo0ooo2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NotNull Drawable d) {
        Intrinsics.checkNotNullParameter(d, "d");
        o0oO0Ooo o0oo0ooo2 = this.f39969OooO0Oo;
        o0oo0ooo2.f39974OooO0o0.setValue(Integer.valueOf(((Number) o0oo0ooo2.f39974OooO0o0.getValue()).intValue() + 1));
        o0oo0ooo2.f39973OooO0o.setValue(Size.m1504boximpl(o0O00oO0.OooO00o(o0oo0ooo2.f39972OooO0Oo)));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NotNull Drawable d, @NotNull Runnable what, long j) {
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(what, "what");
        ((Handler) o0O00oO0.f39970OooO00o.getValue()).postAtTime(what, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NotNull Drawable d, @NotNull Runnable what) {
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(what, "what");
        ((Handler) o0O00oO0.f39970OooO00o.getValue()).removeCallbacks(what);
    }
}
