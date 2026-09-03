package p022Oooo00O;

import Oooo000.OooO00o;
import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.OooO0o;
import androidx.camera.core.impl.o000000O;
import androidx.camera.core.impl.o00O0;
import androidx.camera.core.impl.o00O00O;
import androidx.camera.core.impl.o00O00OO;
import androidx.camera.core.impl.o00OO;
import androidx.camera.core.impl.o00OO0O0;
import androidx.camera.core.impl.o0o0Oo;
import java.util.ArrayList;
import java.util.HashSet;
import p026Oooo0o.OooOo00;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class o000Oo0 implements o000000O.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000Oo0 f603OooO00o = new o000Oo0();

    @Override // androidx.camera.core.impl.o000000O.OooO0O0
    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public void OooO00o(@NonNull o0o0Oo<?> o0o0oo, @NonNull o000000O.OooO00o oooO00o) {
        o000000O o000000oOooo000 = o0o0oo.Oooo000();
        Config config = o00O0.f3709Oooo00O;
        OooO0o oooO0o = o000000O.f3645OooO;
        HashSet hashSet = new HashSet();
        o00O00O o00o00oOooo0OO = o00O00O.Oooo0OO();
        int i = -1;
        Range<Integer> range = o00OO0O0.f3743OooO00o;
        ArrayList arrayList = new ArrayList();
        o00O00OO o00o00ooOooO0OO = o00O00OO.OooO0OO();
        ArrayList arrayList2 = new ArrayList(hashSet);
        o00O0 o00o0Oooo0O0 = o00O0.Oooo0O0(o00o00oOooo0OO);
        ArrayList arrayList3 = new ArrayList(arrayList);
        o00OO o00oo2 = o00OO.f3727OooO0O0;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : o00o00ooOooO0OO.OooO0O0()) {
            arrayMap.put(str, o00o00ooOooO0OO.OooO00o(str));
        }
        new o000000O(arrayList2, o00o0Oooo0O0, -1, range, arrayList3, false, new o00OO(arrayMap), null);
        if (o000000oOooo000 != null) {
            oooO00o.OooO00o(o000000oOooo000.f3652OooO0o0);
            i = o000000oOooo000.f3649OooO0OO;
            config = o000000oOooo000.f3648OooO0O0;
        }
        oooO00o.f3656OooO0O0 = o00O00O.Oooo0o0(config);
        oooO00o.f3657OooO0OO = ((Integer) o0o0oo.OooOoO(OooO00o.f427Oooo000, Integer.valueOf(i))).intValue();
        oooO00o.OooO0O0(new o00OO0O0((CameraCaptureSession.CaptureCallback) o0o0oo.OooOoO(OooO00o.f430Oooo0O0, new o000O0o())));
        oooO00o.OooO0OO(OooOo00.OooO00o.OooO0Oo(o0o0oo).OooO0OO());
    }
}
