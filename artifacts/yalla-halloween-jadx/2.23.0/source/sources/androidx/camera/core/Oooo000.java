package androidx.camera.core;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.CancellationException;
import p028Oooo0oO.o0O00o0;
import p033OoooO0O.o00oO0o;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 implements p030OoooO.OooOOO0<Surface> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ com.google.common.util.concurrent.OooO00o f3499OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00O000.OooO00o f3500OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ String f3501OooO0OO;

    public Oooo000(com.google.common.util.concurrent.OooO00o oooO00o, o00O000.OooO00o oooO00o2, String str) {
        this.f3499OooO00o = oooO00o;
        this.f3500OooO0O0 = oooO00o2;
        this.f3501OooO0OO = str;
    }

    @Override // p030OoooO.OooOOO0
    public final void OooO00o(@NonNull Throwable th) {
        boolean z = th instanceof CancellationException;
        o00O000.OooO00o oooO00o = this.f3500OooO0O0;
        if (z) {
            o000OO.OooOOO0.OooO0o(null, oooO00o.OooO0OO(new SurfaceRequest.OooO0O0(o0O00o0.OooO0O0(new StringBuilder(), this.f3501OooO0OO, " cancelled."), th)));
        } else {
            oooO00o.OooO0O0(null);
        }
    }

    @Override // p030OoooO.OooOOO0
    public final void onSuccess(@Nullable Surface surface) {
        p030OoooO.OooOo00.OooO0o(true, this.f3499OooO00o, this.f3500OooO0O0, o00oO0o.OooO00o());
    }
}
