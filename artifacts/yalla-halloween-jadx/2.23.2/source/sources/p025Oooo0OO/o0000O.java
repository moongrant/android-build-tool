package p025Oooo0OO;

import Oooo000.OooO00o;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.o000000O;
import androidx.camera.core.impl.o00O0O00;
import androidx.camera.core.impl.oOO00O;
import java.util.ArrayList;
import java.util.Iterator;
import p024Oooo0O0.o000OO;
import p024Oooo0O0.o00O000o;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f1037OooO00o;

    public o0000O() {
        this.f1037OooO00o = o000OO.OooO00o(o00O000o.class) != null;
    }

    @NonNull
    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public static o000000O OooO00o(@NonNull o000000O o000000o2) {
        o000000O.OooO00o oooO00o = new o000000O.OooO00o();
        oooO00o.f3656OooO0OO = o000000o2.f3648OooO0OO;
        Iterator<DeferrableSurface> it = o000000o2.OooO00o().iterator();
        while (it.hasNext()) {
            oooO00o.f3654OooO00o.add(it.next());
        }
        oooO00o.OooO0OO(o000000o2.f3647OooO0O0);
        oOO00O ooo00oOooo0OO = oOO00O.Oooo0OO();
        ooo00oOooo0OO.Oooo0oO(OooO00o.Oooo0O0(CaptureRequest.FLASH_MODE), 0);
        oooO00o.OooO0OO(new OooO00o(o00O0O00.Oooo0O0(ooo00oOooo0OO)));
        return oooO00o.OooO0Oo();
    }

    public final boolean OooO0O0(@NonNull ArrayList arrayList, boolean z) {
        if (!this.f1037OooO00o || !z) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }
}
