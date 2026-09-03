package p199o00o0Oo;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00O00O implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final long f33212Oooo0o = 500;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public long f33213Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public View f33214Oooo0oo;

    public o00O00O() {
    }

    public abstract void OooO00o(@NotNull View view);

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View currentView) {
        Intrinsics.checkNotNullParameter(currentView, "currentView");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!Intrinsics.areEqual(this.f33214Oooo0oo, currentView) || Math.abs(jCurrentTimeMillis - this.f33213Oooo0oO) > this.f33212Oooo0o) {
            this.f33214Oooo0oo = currentView;
            this.f33213Oooo0oO = jCurrentTimeMillis;
            OooO00o(currentView);
        }
    }

    public o00O00O(long j) {
    }
}
