package p028Oooo0oO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p030OoooO.OooOOO0;
import p037OoooOo0.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public final class oo00oO implements OooOOO0<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Runnable f1214OooO00o;

    public oo00oO(o000OO0O o000oo0o2) {
        this.f1214OooO00o = o000oo0o2;
    }

    @Override // p030OoooO.OooOOO0
    public final void OooO00o(@NonNull Throwable th) {
    }

    @Override // p030OoooO.OooOOO0
    public final void onSuccess(@Nullable Void r1) {
        this.f1214OooO00o.run();
    }
}
