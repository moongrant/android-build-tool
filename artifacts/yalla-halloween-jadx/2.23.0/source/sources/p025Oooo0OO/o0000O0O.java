package p025Oooo0OO;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;
import p024Oooo0O0.o0000O;
import p024Oooo0O0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0000O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f1052OooO00o;

    public o0000O0O() {
        this.f1052OooO00o = ((o00O000) o0000O.OooO00o(o00O000.class)) != null;
    }

    public final boolean OooO00o(@NonNull ArrayList arrayList, boolean z) {
        if (!this.f1052OooO00o || !z) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
            if (iIntValue == 2 || iIntValue == 3) {
                return true;
            }
        }
        return false;
    }
}
