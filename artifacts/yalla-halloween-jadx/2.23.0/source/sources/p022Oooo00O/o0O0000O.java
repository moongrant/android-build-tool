package p022Oooo00O;

import Oooo000.OooO00o;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.impl.o000000O;
import androidx.camera.core.impl.o00O0;
import androidx.camera.core.impl.o00O00O;
import java.util.Collections;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@OptIn(markerClass = {ExperimentalCamera2Interop.class})
@RequiresApi(21)
public final class o0O0000O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final MeteringRectangle[] f680OooO = new MeteringRectangle[0];

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0Oo0oo f681OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile boolean f682OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f683OooO0OO = 1;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0O0o f684OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public MeteringRectangle[] f685OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public MeteringRectangle[] f686OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public MeteringRectangle[] f687OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o00O000.OooO00o<Void> f688OooO0oo;

    public o0O0000O(@NonNull o0Oo0oo o0oo0oo2) {
        MeteringRectangle[] meteringRectangleArr = f680OooO;
        this.f686OooO0o0 = meteringRectangleArr;
        this.f685OooO0o = meteringRectangleArr;
        this.f687OooO0oO = meteringRectangleArr;
        this.f688OooO0oo = null;
        this.f681OooO00o = o0oo0oo2;
    }

    public final void OooO00o(boolean z, boolean z2) {
        if (this.f682OooO0O0) {
            o000000O.OooO00o oooO00o = new o000000O.OooO00o();
            oooO00o.f3659OooO0o = true;
            oooO00o.f3657OooO0OO = this.f683OooO0OO;
            o00O00O o00o00oOooo0OO = o00O00O.Oooo0OO();
            if (z) {
                o00o00oOooo0OO.Oooo0oO(OooO00o.Oooo0O0(CaptureRequest.CONTROL_AF_TRIGGER), 2);
            }
            if (z2) {
                o00o00oOooo0OO.Oooo0oO(OooO00o.Oooo0O0(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 2);
            }
            oooO00o.OooO0OO(new OooO00o(o00O0.Oooo0O0(o00o00oOooo0OO)));
            this.f681OooO00o.OooOo00(Collections.singletonList(oooO00o.OooO0Oo()));
        }
    }
}
