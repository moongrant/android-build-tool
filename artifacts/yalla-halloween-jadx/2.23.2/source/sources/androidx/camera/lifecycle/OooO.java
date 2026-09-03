package androidx.camera.lifecycle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p028Oooo0oO.o0O0ooO;
import p030OoooO.OooOOO0;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements OooOOO0<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000Oo0.OooO00o f3860OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0O0ooO f3861OooO0O0;

    public OooO(o0O0ooO o0o0ooo, o000Oo0.OooO00o oooO00o) {
        this.f3860OooO00o = oooO00o;
        this.f3861OooO0O0 = o0o0ooo;
    }

    @Override // p030OoooO.OooOOO0
    public final void OooO00o(@NonNull Throwable th) {
        this.f3860OooO00o.OooO0OO(th);
    }

    @Override // p030OoooO.OooOOO0
    public final void onSuccess(@Nullable Void r2) {
        this.f3860OooO00o.OooO0O0(this.f3861OooO0O0);
    }
}
