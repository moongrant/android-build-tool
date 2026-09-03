package p140o00OOOoO;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f37505OooO0Oo = 500;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public View f37506OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f37507OooO0o0;

    public abstract void OooO00o(@NotNull View view);

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View currentView) {
        Intrinsics.checkNotNullParameter(currentView, "currentView");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!Intrinsics.areEqual(this.f37506OooO0o, currentView) || Math.abs(jCurrentTimeMillis - this.f37507OooO0o0) > this.f37505OooO0Oo) {
            this.f37506OooO0o = currentView;
            this.f37507OooO0o0 = jCurrentTimeMillis;
            OooO00o(currentView);
        }
    }
}
