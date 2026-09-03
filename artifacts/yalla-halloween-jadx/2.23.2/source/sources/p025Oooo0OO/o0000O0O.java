package p025Oooo0OO;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;
import p024Oooo0O0.o000OO;
import p024Oooo0O0.o00oOoo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0000O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f1041OooO00o;

    public o0000O0O() {
        this.f1041OooO00o = ((o00oOoo) o000OO.OooO00o(o00oOoo.class)) != null;
    }

    public final boolean OooO00o(@NonNull ArrayList arrayList, boolean z) {
        if (!this.f1041OooO00o || !z) {
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
