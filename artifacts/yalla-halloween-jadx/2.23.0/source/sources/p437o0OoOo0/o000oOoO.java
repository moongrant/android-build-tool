package p437o0OoOo0;

import androidx.camera.core.impl.CameraInternal;
import androidx.camera.view.OooO00o;
import androidx.camera.view.OooO0OO;
import androidx.camera.view.PreviewView;
import java.util.concurrent.atomic.AtomicReference;
import p030OoooO.OooOOO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000oOoO implements OooO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PreviewView.OooO00o f46071OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooO00o f46072OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ CameraInternal f46073OooO0OO;

    public /* synthetic */ o000oOoO(PreviewView.OooO00o oooO00o, OooO00o oooO00o2, CameraInternal cameraInternal) {
        this.f46071OooO00o = oooO00o;
        this.f46072OooO0O0 = oooO00o2;
        this.f46073OooO0OO = cameraInternal;
    }

    public final void OooO00o() {
        OooO00o oooO00o;
        boolean z;
        AtomicReference<OooO00o> atomicReference = PreviewView.this.f4136OooO;
        while (true) {
            oooO00o = this.f46072OooO0O0;
            if (atomicReference.compareAndSet(oooO00o, null)) {
                z = true;
                break;
            } else if (atomicReference.get() != oooO00o) {
                z = false;
                break;
            }
        }
        if (z) {
            oooO00o.OooO0O0(PreviewView.StreamState.IDLE);
        }
        OooOOO oooOOO = oooO00o.f4110OooO0o0;
        if (oooOOO != null) {
            oooOOO.cancel(false);
            oooO00o.f4110OooO0o0 = null;
        }
        this.f46073OooO0OO.OooO0O0().OooO0OO(oooO00o);
    }
}
