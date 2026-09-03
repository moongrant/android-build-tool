package p116o00O0OOo;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooOOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f36571OooO0Oo = 500;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public View f36572OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f36573OooO0o0;

    public abstract void OooO00o(@NotNull View view);

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View currentView) {
        Intrinsics.checkNotNullParameter(currentView, "currentView");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!Intrinsics.areEqual(this.f36572OooO0o, currentView) || Math.abs(jCurrentTimeMillis - this.f36573OooO0o0) > this.f36571OooO0Oo) {
            this.f36572OooO0o = currentView;
            this.f36573OooO0o0 = jCurrentTimeMillis;
            OooO00o(currentView);
        }
    }
}
