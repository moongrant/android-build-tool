package p028Oooo0oO;

import androidx.camera.core.SurfaceRequest;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.util.concurrent.atomic.AtomicReference;
import p206o00o0oOO.o0;
import p245o00oo0o.o00O;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00OOOOo implements o00O000.OooO0OO, o00O.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1172OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1173OooO0o0;

    public /* synthetic */ o00OOOOo(Object obj, Object obj2) {
        this.f1172OooO0Oo = obj;
        this.f1173OooO0o0 = obj2;
    }

    @Override // o0ooOO0.o00O000.OooO0OO
    public final Object OooO0o0(o00O000.OooO00o oooO00o) {
        SurfaceRequest surfaceRequest = (SurfaceRequest) this.f1172OooO0Oo;
        AtomicReference atomicReference = (AtomicReference) this.f1173OooO0o0;
        surfaceRequest.getClass();
        atomicReference.set(oooO00o);
        return "SurfaceRequest-surface-recreation(" + surfaceRequest.hashCode() + ")";
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).OooO0O0((o0) this.f1173OooO0o0);
    }
}
