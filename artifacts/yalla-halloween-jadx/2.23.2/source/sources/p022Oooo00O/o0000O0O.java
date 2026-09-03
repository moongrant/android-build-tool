package p022Oooo00O;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p023Oooo00o.o0OOOO0o;
import p030OoooO.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0O implements OooOOO0<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0o0Oo f497OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o000OO f498OooO0O0;

    public o0000O0O(o000OO o000oo2, o0o0Oo o0o0oo) {
        this.f498OooO0O0 = o000oo2;
        this.f497OooO00o = o0o0oo;
    }

    @Override // p030OoooO.OooOOO0
    public final void OooO00o(@NonNull Throwable th) {
    }

    @Override // p030OoooO.OooOOO0
    public final void onSuccess(@Nullable Void r2) {
        CameraDevice cameraDevice;
        this.f498OooO0O0.f562OooOOo0.remove(this.f497OooO00o);
        int i = o000OO.OooO0O0.f578OooO00o[this.f498OooO0O0.f553OooO0oo.ordinal()];
        if (i != 3) {
            if (i != 7) {
                if (i != 8) {
                    return;
                }
            } else if (this.f498OooO0O0.f559OooOOOO == 0) {
                return;
            }
        }
        if (!this.f498OooO0O0.OooOoO0() || (cameraDevice = this.f498OooO0O0.f557OooOOO) == null) {
            return;
        }
        o0OOOO0o.OooO00o(cameraDevice);
        this.f498OooO0O0.f557OooOOO = null;
    }
}
