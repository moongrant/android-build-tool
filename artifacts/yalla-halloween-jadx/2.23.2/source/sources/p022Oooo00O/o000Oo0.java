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
import androidx.camera.core.impl.o00O00o0;
import androidx.camera.core.impl.o00O0O00;
import androidx.camera.core.impl.o00OOO0;
import androidx.camera.core.impl.o00Oo00;
import androidx.camera.core.impl.oOO00O;
import androidx.camera.core.impl.oo0O;
import java.util.ArrayList;
import java.util.HashSet;
import p026Oooo0o.OooOo00;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class o000Oo0 implements o000000O.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000Oo0 f602OooO00o = new o000Oo0();

    @Override // androidx.camera.core.impl.o000000O.OooO0O0
    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public void OooO00o(@NonNull o00Oo00<?> o00oo00, @NonNull o000000O.OooO00o oooO00o) {
        o000000O o000000oOooo000 = o00oo00.Oooo000();
        Config config = o00O0O00.f3722Oooo00O;
        OooO0o oooO0o = o000000O.f3644OooO;
        HashSet hashSet = new HashSet();
        oOO00O ooo00oOooo0OO = oOO00O.Oooo0OO();
        int i = -1;
        Range<Integer> range = oo0O.f3780OooO00o;
        ArrayList arrayList = new ArrayList();
        o00O00o0 o00o00o0OooO0OO = o00O00o0.OooO0OO();
        ArrayList arrayList2 = new ArrayList(hashSet);
        o00O0O00 o00o0o00Oooo0O0 = o00O0O00.Oooo0O0(ooo00oOooo0OO);
        ArrayList arrayList3 = new ArrayList(arrayList);
        o00OOO0 o00ooo1 = o00OOO0.f3743OooO0O0;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : o00o00o0OooO0OO.OooO0O0()) {
            arrayMap.put(str, o00o00o0OooO0OO.OooO00o(str));
        }
        new o000000O(arrayList2, o00o0o00Oooo0O0, -1, range, arrayList3, false, new o00OOO0(arrayMap), null);
        if (o000000oOooo000 != null) {
            oooO00o.OooO00o(o000000oOooo000.f3651OooO0o0);
            i = o000000oOooo000.f3648OooO0OO;
            config = o000000oOooo000.f3647OooO0O0;
        }
        oooO00o.f3655OooO0O0 = oOO00O.Oooo0o0(config);
        oooO00o.f3656OooO0OO = ((Integer) o00oo00.OooOoO(OooO00o.f426Oooo000, Integer.valueOf(i))).intValue();
        oooO00o.OooO0O0(new o00OO0O0((CameraCaptureSession.CaptureCallback) o00oo00.OooOoO(OooO00o.f429Oooo0O0, new o000O0o())));
        oooO00o.OooO0OO(OooOo00.OooO00o.OooO0Oo(o00oo00).OooO0OO());
    }
}
