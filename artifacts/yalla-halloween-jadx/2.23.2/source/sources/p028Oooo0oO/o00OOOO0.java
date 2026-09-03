package p028Oooo0oO;

import androidx.camera.core.SurfaceRequest;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.util.concurrent.atomic.AtomicReference;
import p080o000OoO.o00000O0;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00OOOO0 implements o000Oo0.OooO0OO, o00000O0.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1152OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1153OooO0o0;

    public /* synthetic */ o00OOOO0(Object obj, Object obj2) {
        this.f1152OooO0Oo = obj;
        this.f1153OooO0o0 = obj2;
    }

    @Override // o0ooOO0.o000Oo0.OooO0OO
    public final Object OooO0o0(o000Oo0.OooO00o oooO00o) {
        SurfaceRequest surfaceRequest = (SurfaceRequest) this.f1152OooO0Oo;
        AtomicReference atomicReference = (AtomicReference) this.f1153OooO0o0;
        surfaceRequest.getClass();
        atomicReference.set(oooO00o);
        return "SurfaceRequest-surface-recreation(" + surfaceRequest.hashCode() + ")";
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).o0ooOOo();
    }
}
