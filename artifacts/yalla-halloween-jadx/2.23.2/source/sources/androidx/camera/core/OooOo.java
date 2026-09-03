package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo implements p030OoooO.OooOOO0<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000Oo0.OooO00o f3474OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ com.google.common.util.concurrent.OooOO0O f3475OooO0O0;

    public OooOo(o000Oo0.OooO00o oooO00o, o000Oo0.OooO0o oooO0o) {
        this.f3474OooO00o = oooO00o;
        this.f3475OooO0O0 = oooO0o;
    }

    @Override // p030OoooO.OooOOO0
    public final void OooO00o(@NonNull Throwable th) {
        if (th instanceof SurfaceRequest.OooO0O0) {
            o000OO.OooOOO0.OooO0o(null, this.f3475OooO0O0.cancel(false));
        } else {
            o000OO.OooOOO0.OooO0o(null, this.f3474OooO00o.OooO0O0(null));
        }
    }

    @Override // p030OoooO.OooOOO0
    public final void onSuccess(@Nullable Void r2) {
        o000OO.OooOOO0.OooO0o(null, this.f3474OooO00o.OooO0O0(null));
    }
}
