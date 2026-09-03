package p022Oooo00O;

import android.content.Context;
import android.util.ArrayMap;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.OooO0o;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.o000000O;
import androidx.camera.core.impl.o00O00o0;
import androidx.camera.core.impl.o00O0O00;
import androidx.camera.core.impl.o00OOO0;
import androidx.camera.core.impl.o00Oo00;
import androidx.camera.core.impl.oOO00O;
import androidx.camera.core.impl.oo0O;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00O0O0 implements UseCaseConfigFactory {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0oOO f615OooO0O0;

    public o00O0O0(@NonNull Context context) {
        this.f615OooO0O0 = o0oOO.OooO0O0(context);
    }

    @Override // androidx.camera.core.impl.UseCaseConfigFactory
    @NonNull
    public final Config OooO00o(@NonNull UseCaseConfigFactory.CaptureType captureType, int i) {
        oOO00O ooo00oOooo0OO = oOO00O.Oooo0OO();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        oOO00O ooo00oOooo0OO2 = oOO00O.Oooo0OO();
        Range<Integer> range = oo0O.f3780OooO00o;
        ArrayList arrayList = new ArrayList();
        o00O00o0 o00o00o0OooO0OO = o00O00o0.OooO0OO();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int[] iArr = o0OO000o.f806OooO00o;
        int i2 = iArr[captureType.ordinal()];
        int i3 = i2 != 1 ? (i2 == 2 || i2 == 3) ? 3 : 1 : i == 2 ? 5 : 1;
        OooO0o oooO0o = o00Oo00.f3752OooOo0;
        ArrayList arrayList6 = new ArrayList(linkedHashSet);
        ArrayList arrayList7 = new ArrayList(arrayList2);
        ArrayList arrayList8 = new ArrayList(arrayList3);
        ArrayList arrayList9 = new ArrayList(arrayList5);
        ArrayList arrayList10 = new ArrayList(arrayList4);
        ArrayList arrayList11 = new ArrayList(hashSet);
        o00O0O00 o00o0o00Oooo0O0 = o00O0O00.Oooo0O0(ooo00oOooo0OO2);
        ArrayList arrayList12 = new ArrayList(arrayList);
        o00OOO0 o00ooo1 = o00OOO0.f3743OooO0O0;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : o00o00o0OooO0OO.OooO0O0()) {
            arrayMap.put(str, o00o00o0OooO0OO.OooO00o(str));
            arrayList7 = arrayList7;
        }
        ooo00oOooo0OO.Oooo0oO(oooO0o, new SessionConfig(arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, new o000000O(arrayList11, o00o0o00Oooo0O0, i3, range, arrayList12, false, new o00OOO0(arrayMap), null), null));
        ooo00oOooo0OO.Oooo0oO(o00Oo00.f3754OooOo0o, o00O0O00.f616OooO00o);
        HashSet hashSet2 = new HashSet();
        oOO00O ooo00oOooo0OO3 = oOO00O.Oooo0OO();
        Range<Integer> range2 = oo0O.f3780OooO00o;
        ArrayList arrayList13 = new ArrayList();
        o00O00o0 o00o00o0OooO0OO2 = o00O00o0.OooO0OO();
        int i4 = iArr[captureType.ordinal()];
        int i5 = i4 != 1 ? (i4 == 2 || i4 == 3) ? 3 : 1 : i == 2 ? 5 : 2;
        OooO0o oooO0o2 = o00Oo00.f3753OooOo0O;
        ArrayList arrayList14 = new ArrayList(hashSet2);
        o00O0O00 o00o0o00Oooo0O1 = o00O0O00.Oooo0O0(ooo00oOooo0OO3);
        ArrayList arrayList15 = new ArrayList(arrayList13);
        o00OOO0 o00ooo2 = o00OOO0.f3743OooO0O0;
        ArrayMap arrayMap2 = new ArrayMap();
        for (String str2 : o00o00o0OooO0OO2.OooO0O0()) {
            arrayMap2.put(str2, o00o00o0OooO0OO2.OooO00o(str2));
        }
        ooo00oOooo0OO.Oooo0oO(oooO0o2, new o000000O(arrayList14, o00o0o00Oooo0O1, i5, range2, arrayList15, false, new o00OOO0(arrayMap2), null));
        ooo00oOooo0OO.Oooo0oO(o00Oo00.f3751OooOo, captureType == UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE ? o0O000.f683OooO0OO : o000Oo0.f602OooO00o);
        UseCaseConfigFactory.CaptureType captureType2 = UseCaseConfigFactory.CaptureType.PREVIEW;
        o0oOO o0ooo2 = this.f615OooO0O0;
        if (captureType == captureType2) {
            ooo00oOooo0OO.Oooo0oO(ImageOutputConfig.f3546OooOOo0, o0ooo2.OooO0o0());
        }
        ooo00oOooo0OO.Oooo0oO(ImageOutputConfig.f3540OooOO0o, Integer.valueOf(o0ooo2.OooO0OO(true).getRotation()));
        if (captureType == UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE || captureType == UseCaseConfigFactory.CaptureType.STREAM_SHARING) {
            ooo00oOooo0OO.Oooo0oO(o00Oo00.f3759OooOoo0, Boolean.TRUE);
        }
        return o00O0O00.Oooo0O0(ooo00oOooo0OO);
    }
}
