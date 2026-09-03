package p022Oooo00O;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p023Oooo00o.o0OOO0OO;
import p030OoooO.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0O implements OooOOO0<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0o0Oo f495OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o000OO f496OooO0O0;

    public o0000O0O(o000OO o000oo2, o0o0Oo o0o0oo) {
        this.f496OooO0O0 = o000oo2;
        this.f495OooO00o = o0o0oo;
    }

    @Override // p030OoooO.OooOOO0
    public final void OooO00o(@NonNull Throwable th) {
    }

    @Override // p030OoooO.OooOOO0
    public final void onSuccess(@Nullable Void r2) {
        CameraDevice cameraDevice;
        this.f496OooO0O0.f563OooOOo0.remove(this.f495OooO00o);
        int i = o000OO.OooO0O0.f579OooO00o[this.f496OooO0O0.f554OooO0oo.ordinal()];
        if (i != 3) {
            if (i != 7) {
                if (i != 8) {
                    return;
                }
            } else if (this.f496OooO0O0.f560OooOOOO == 0) {
                return;
            }
        }
        if (!this.f496OooO0O0.OooOoO0() || (cameraDevice = this.f496OooO0O0.f558OooOOO) == null) {
            return;
        }
        o0OOO0OO.OooO00o(cameraDevice);
        this.f496OooO0O0.f558OooOOO = null;
    }
}
