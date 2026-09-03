package p022Oooo00O;

import Oooo000.OooO00o;
import Oooo000.OooO0O0;
import Oooo000.OooO0OO;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.OooO0o;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.o000000O;
import androidx.camera.core.impl.o00O0;
import androidx.camera.core.impl.o00O00O;
import androidx.camera.core.impl.o00O0O0;
import androidx.camera.core.impl.o0o0Oo;
import java.util.ArrayList;
import java.util.Iterator;
import p024Oooo0O0.o0000O;
import p024Oooo0O0.o00O0000;
import p025Oooo0OO.o0000oo;
import p026Oooo0o.OooOo00;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00O0O00 implements SessionConfig.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o00O0O00 f618OooO00o = new o00O0O00();

    @Override // androidx.camera.core.impl.SessionConfig.OooO0o
    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public final void OooO00o(@NonNull Size size, @NonNull o0o0Oo<?> o0o0oo, @NonNull SessionConfig.OooO0O0 oooO0O0) {
        SessionConfig sessionConfigOooOo = o0o0oo.OooOo();
        Config config = o00O0.f3709Oooo00O;
        int i = SessionConfig.OooO00o().f3622OooO0o.f3649OooO0OO;
        ArrayList arrayList = oooO0O0.f3627OooO0OO;
        o000000O.OooO00o oooO00o = oooO0O0.f3626OooO0O0;
        if (sessionConfigOooOo != null) {
            o000000O o000000o2 = sessionConfigOooOo.f3622OooO0o;
            i = o000000o2.f3649OooO0OO;
            for (CameraDevice.StateCallback stateCallback : sessionConfigOooOo.f3619OooO0O0) {
                if (!arrayList.contains(stateCallback)) {
                    arrayList.add(stateCallback);
                }
            }
            Iterator<CameraCaptureSession.StateCallback> it = sessionConfigOooOo.f3620OooO0OO.iterator();
            while (it.hasNext()) {
                oooO0O0.OooO0OO(it.next());
            }
            oooO00o.OooO00o(o000000o2.f3652OooO0o0);
            config = o000000o2.f3648OooO0O0;
        }
        oooO00o.getClass();
        oooO00o.f3656OooO0O0 = o00O00O.Oooo0o0(config);
        if (o0o0oo instanceof o00O0O0) {
            Rational rational = o0000oo.f1055OooO00o;
            if (((o00O0000) o0000O.OooO00o(o00O0000.class)) != null) {
                if (!o0000oo.f1055OooO00o.equals(new Rational(size.getWidth(), size.getHeight()))) {
                    o00O00O o00o00oOooo0OO = o00O00O.Oooo0OO();
                    o00o00oOooo0OO.Oooo0oO(OooO00o.Oooo0O0(CaptureRequest.TONEMAP_MODE), 2);
                    oooO00o.OooO0OO(new OooO00o(o00O0.Oooo0O0(o00o00oOooo0OO)));
                }
            }
        }
        oooO00o.f3657OooO0OO = ((Integer) o0o0oo.OooOoO(OooO00o.f427Oooo000, Integer.valueOf(i))).intValue();
        CameraDevice.StateCallback stateCallback2 = (CameraDevice.StateCallback) o0o0oo.OooOoO(OooO00o.f429Oooo00o, new o00O0OOO());
        if (!arrayList.contains(stateCallback2)) {
            arrayList.add(stateCallback2);
        }
        oooO0O0.OooO0OO((CameraCaptureSession.StateCallback) o0o0oo.OooOoO(OooO00o.f426Oooo0, new oo0o0O0()));
        o00OO0O0 o00oo0o1 = new o00OO0O0((CameraCaptureSession.CaptureCallback) o0o0oo.OooOoO(OooO00o.f430Oooo0O0, new o000O0o()));
        oooO00o.OooO0O0(o00oo0o1);
        ArrayList arrayList2 = oooO0O0.f3629OooO0o;
        if (!arrayList2.contains(o00oo0o1)) {
            arrayList2.add(o00oo0o1);
        }
        o00O00O o00o00oOooo0OO2 = o00O00O.Oooo0OO();
        OooO0o oooO0o = OooO00o.f431Oooo0OO;
        o00o00oOooo0OO2.Oooo0oO(oooO0o, (OooO0OO) o0o0oo.OooOoO(oooO0o, new OooO0OO(new OooO0O0[0])));
        OooO0o oooO0o2 = OooO00o.f432Oooo0o;
        o00o00oOooo0OO2.Oooo0oO(oooO0o2, (String) o0o0oo.OooOoO(oooO0o2, null));
        OooO0o oooO0o3 = OooO00o.f428Oooo00O;
        o00o00oOooo0OO2.Oooo0oO(oooO0o3, Long.valueOf(((Long) o0o0oo.OooOoO(oooO0o3, -1L)).longValue()));
        oooO00o.OooO0OO(o00o00oOooo0OO2);
        oooO00o.OooO0OO(OooOo00.OooO00o.OooO0Oo(o0o0oo).OooO0OO());
    }
}
