package p022Oooo00O;

import Oooo000.OooO00o;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.OooO0o;
import androidx.camera.core.impl.o000000O;
import androidx.camera.core.impl.o000O00O;
import androidx.camera.core.impl.o00O0O00;
import androidx.camera.core.impl.o00Oo00;
import androidx.camera.core.impl.oOO00O;
import p024Oooo0O0.o000O0;
import p024Oooo0O0.o000OO;
import p025Oooo0OO.o00000OO;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0O000 extends o000Oo0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0O000 f683OooO0OO = new o0O000(new o00000OO());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final o00000OO f684OooO0O0;

    public o0O000(@NonNull o00000OO o00000oo2) {
        this.f684OooO0O0 = o00000oo2;
    }

    @Override // p022Oooo00O.o000Oo0, androidx.camera.core.impl.o000000O.OooO0O0
    public final void OooO00o(@NonNull o00Oo00<?> o00oo00, @NonNull o000000O.OooO00o oooO00o) {
        super.OooO00o(o00oo00, oooO00o);
        if (!(o00oo00 instanceof o000O00O)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        o000O00O o000o00o2 = (o000O00O) o00oo00;
        oOO00O ooo00oOooo0OO = oOO00O.Oooo0OO();
        OooO0o oooO0o = o000O00O.f3693Oooo000;
        if (((o00O0O00) o000o00o2.getConfig()).OooO0o0(oooO0o)) {
            int iIntValue = ((Integer) ((o00O0O00) o000o00o2.getConfig()).OooO0O0(oooO0o)).intValue();
            this.f684OooO0O0.getClass();
            if (((o000O0) o000OO.OooO00o(o000O0.class)) != null) {
                if (iIntValue == 0) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                    ooo00oOooo0OO.Oooo0oO(OooO00o.Oooo0O0(key), Boolean.TRUE);
                } else if (iIntValue == 1) {
                    CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                    ooo00oOooo0OO.Oooo0oO(OooO00o.Oooo0O0(key2), Boolean.FALSE);
                }
            }
        }
        oooO00o.OooO0OO(new OooO00o(o00O0O00.Oooo0O0(ooo00oOooo0OO)));
    }
}
