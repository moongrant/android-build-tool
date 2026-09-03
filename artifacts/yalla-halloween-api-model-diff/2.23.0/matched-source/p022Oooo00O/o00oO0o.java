package p022Oooo00O;

import android.graphics.SurfaceTexture;
import android.util.Size;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.o000oOoO;
import com.yy.yyeva.view.EvaAnimViewV3;
import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00oO0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f668OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f669OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f670OooO0o0;

    public /* synthetic */ o00oO0o(int i, Object obj, Object obj2) {
        this.f668OooO0Oo = i;
        this.f670OooO0o0 = obj;
        this.f669OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f668OooO0Oo) {
            case 0:
                ((o000oOoO) this.f670OooO0o0).OooO0OO((CameraCaptureFailure) this.f669OooO0o);
                return;
            case 1:
                DeferrableSurface deferrableSurface = (DeferrableSurface) this.f670OooO0o0;
                String str = (String) this.f669OooO0o;
                Size size = DeferrableSurface.f3528OooO;
                deferrableSurface.getClass();
                try {
                    deferrableSurface.f3537OooO0o0.get();
                    deferrableSurface.OooO0o(DeferrableSurface.f3531OooOO0o.decrementAndGet(), DeferrableSurface.f3530OooOO0O.get(), "Surface terminated");
                    return;
                } catch (Exception e) {
                    o00O0O0.OooO0O0("DeferrableSurface", "Unexpected surface termination for " + deferrableSurface + "\nStack Trace:\n" + str);
                    synchronized (deferrableSurface.f3532OooO00o) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", deferrableSurface, Boolean.valueOf(deferrableSurface.f3534OooO0OO), Integer.valueOf(deferrableSurface.f3533OooO0O0)), e);
                    }
                }
            default:
                EvaAnimViewV3.onSurfaceTextureAvailable$lambda$6((EvaAnimViewV3) this.f670OooO0o0, (SurfaceTexture) this.f669OooO0o);
                return;
        }
    }
}
