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
import androidx.camera.core.impl.o00O0O0O;
import androidx.camera.core.impl.o00Oo00;
import androidx.camera.core.impl.oOO00O;
import java.util.ArrayList;
import java.util.Iterator;
import p024Oooo0O0.o00;
import p024Oooo0O0.o000OO;
import p025Oooo0OO.o0000oo;
import p026Oooo0o.OooOo00;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00O0O00 implements SessionConfig.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o00O0O00 f616OooO00o = new o00O0O00();

    @Override // androidx.camera.core.impl.SessionConfig.OooO0o
    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public final void OooO00o(@NonNull Size size, @NonNull o00Oo00<?> o00oo00, @NonNull SessionConfig.OooO0O0 oooO0O0) {
        SessionConfig sessionConfigOooOo = o00oo00.OooOo();
        Config config = androidx.camera.core.impl.o00O0O00.f3722Oooo00O;
        int i = SessionConfig.OooO00o().f3620OooO0o.f3648OooO0OO;
        ArrayList arrayList = oooO0O0.f3625OooO0OO;
        o000000O.OooO00o oooO00o = oooO0O0.f3624OooO0O0;
        if (sessionConfigOooOo != null) {
            o000000O o000000o2 = sessionConfigOooOo.f3620OooO0o;
            i = o000000o2.f3648OooO0OO;
            for (CameraDevice.StateCallback stateCallback : sessionConfigOooOo.f3617OooO0O0) {
                if (!arrayList.contains(stateCallback)) {
                    arrayList.add(stateCallback);
                }
            }
            Iterator<CameraCaptureSession.StateCallback> it = sessionConfigOooOo.f3618OooO0OO.iterator();
            while (it.hasNext()) {
                oooO0O0.OooO0OO(it.next());
            }
            oooO00o.OooO00o(o000000o2.f3651OooO0o0);
            config = o000000o2.f3647OooO0O0;
        }
        oooO00o.getClass();
        oooO00o.f3655OooO0O0 = oOO00O.Oooo0o0(config);
        if (o00oo00 instanceof o00O0O0O) {
            Rational rational = o0000oo.f1044OooO00o;
            if (((o00) o000OO.OooO00o(o00.class)) != null) {
                if (!o0000oo.f1044OooO00o.equals(new Rational(size.getWidth(), size.getHeight()))) {
                    oOO00O ooo00oOooo0OO = oOO00O.Oooo0OO();
                    ooo00oOooo0OO.Oooo0oO(OooO00o.Oooo0O0(CaptureRequest.TONEMAP_MODE), 2);
                    oooO00o.OooO0OO(new OooO00o(androidx.camera.core.impl.o00O0O00.Oooo0O0(ooo00oOooo0OO)));
                }
            }
        }
        oooO00o.f3656OooO0OO = ((Integer) o00oo00.OooOoO(OooO00o.f426Oooo000, Integer.valueOf(i))).intValue();
        CameraDevice.StateCallback stateCallback2 = (CameraDevice.StateCallback) o00oo00.OooOoO(OooO00o.f428Oooo00o, new o00O0OOO());
        if (!arrayList.contains(stateCallback2)) {
            arrayList.add(stateCallback2);
        }
        oooO0O0.OooO0OO((CameraCaptureSession.StateCallback) o00oo00.OooOoO(OooO00o.f425Oooo0, new oo0o0O0()));
        o00OO0O0 o00oo0o1 = new o00OO0O0((CameraCaptureSession.CaptureCallback) o00oo00.OooOoO(OooO00o.f429Oooo0O0, new o000O0o()));
        oooO00o.OooO0O0(o00oo0o1);
        ArrayList arrayList2 = oooO0O0.f3627OooO0o;
        if (!arrayList2.contains(o00oo0o1)) {
            arrayList2.add(o00oo0o1);
        }
        oOO00O ooo00oOooo0OO2 = oOO00O.Oooo0OO();
        OooO0o oooO0o = OooO00o.f430Oooo0OO;
        ooo00oOooo0OO2.Oooo0oO(oooO0o, (OooO0OO) o00oo00.OooOoO(oooO0o, new OooO0OO(new OooO0O0[0])));
        OooO0o oooO0o2 = OooO00o.f431Oooo0o;
        ooo00oOooo0OO2.Oooo0oO(oooO0o2, (String) o00oo00.OooOoO(oooO0o2, null));
        OooO0o oooO0o3 = OooO00o.f427Oooo00O;
        ooo00oOooo0OO2.Oooo0oO(oooO0o3, Long.valueOf(((Long) o00oo00.OooOoO(oooO0o3, -1L)).longValue()));
        oooO00o.OooO0OO(ooo00oOooo0OO2);
        oooO00o.OooO0OO(OooOo00.OooO00o.OooO0Oo(o00oo00).OooO0OO());
    }
}
