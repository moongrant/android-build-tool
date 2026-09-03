package p023Oooo00o;

import android.hardware.camera2.CameraDevice;
import androidx.profileinstaller.OooO0O0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oO00OO0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f965OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f966OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f967OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f968OooO0oO;

    public /* synthetic */ oO00OO0O(oO00O0o.OooO0O0 oooO0O0, CameraDevice cameraDevice, int i) {
        this.f966OooO0o = oooO0O0;
        this.f968OooO0oO = cameraDevice;
        this.f967OooO0o0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f965OooO0Oo;
        int i2 = this.f967OooO0o0;
        Object obj = this.f968OooO0oO;
        Object obj2 = this.f966OooO0o;
        switch (i) {
            case 0:
                ((oO00O0o.OooO0O0) obj2).f957OooO00o.onError((CameraDevice) obj, i2);
                break;
            default:
                ((OooO0O0) obj2).f7424OooO0O0.OooO0O0(i2, obj);
                break;
        }
    }

    public /* synthetic */ oO00OO0O(OooO0O0 oooO0O0, int i, Serializable serializable) {
        this.f966OooO0o = oooO0O0;
        this.f967OooO0o0 = i;
        this.f968OooO0oO = serializable;
    }
}
