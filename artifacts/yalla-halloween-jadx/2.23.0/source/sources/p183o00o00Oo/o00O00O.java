package p183o00o00Oo;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.ui.geometry.Size;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00O implements Drawable.Callback {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O00 f38601OooO0Oo;

    public o00O00O(o00O00 o00o01) {
        this.f38601OooO0Oo = o00o01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NotNull Drawable d) {
        Intrinsics.checkNotNullParameter(d, "d");
        o00O00 o00o01 = this.f38601OooO0Oo;
        o00o01.f38598OooO0o0.setValue(Integer.valueOf(((Number) o00o01.f38598OooO0o0.getValue()).intValue() + 1));
        o00o01.f38597OooO0o.setValue(Size.m1493boximpl(oOO00O.OooO00o(o00o01.f38596OooO0Oo)));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NotNull Drawable d, @NotNull Runnable what, long j) {
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(what, "what");
        ((Handler) oOO00O.f38602OooO00o.getValue()).postAtTime(what, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NotNull Drawable d, @NotNull Runnable what) {
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(what, "what");
        ((Handler) oOO00O.f38602OooO00o.getValue()).removeCallbacks(what);
    }
}
