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
import androidx.camera.core.impl.o00O0;
import androidx.camera.core.impl.o00O00O;
import androidx.camera.core.impl.o00O00OO;
import androidx.camera.core.impl.o00OO;
import androidx.camera.core.impl.o00OO0O0;
import androidx.camera.core.impl.o0o0Oo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00O0O0 implements UseCaseConfigFactory {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0oOO f617OooO0O0;

    public o00O0O0(@NonNull Context context) {
        this.f617OooO0O0 = o0oOO.OooO0O0(context);
    }

    @Override // androidx.camera.core.impl.UseCaseConfigFactory
    @NonNull
    public final Config OooO00o(@NonNull UseCaseConfigFactory.CaptureType captureType, int i) {
        o00O00O o00o00oOooo0OO = o00O00O.Oooo0OO();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        o00O00O o00o00oOooo0OO2 = o00O00O.Oooo0OO();
        Range<Integer> range = o00OO0O0.f3743OooO00o;
        ArrayList arrayList = new ArrayList();
        o00O00OO o00o00ooOooO0OO = o00O00OO.OooO0OO();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int[] iArr = o0O.f672OooO00o;
        int i2 = iArr[captureType.ordinal()];
        int i3 = i2 != 1 ? (i2 == 2 || i2 == 3) ? 3 : 1 : i == 2 ? 5 : 1;
        OooO0o oooO0o = o0o0Oo.f3771OooOo0;
        ArrayList arrayList6 = new ArrayList(linkedHashSet);
        ArrayList arrayList7 = new ArrayList(arrayList2);
        ArrayList arrayList8 = new ArrayList(arrayList3);
        ArrayList arrayList9 = new ArrayList(arrayList5);
        ArrayList arrayList10 = new ArrayList(arrayList4);
        ArrayList arrayList11 = new ArrayList(hashSet);
        o00O0 o00o0Oooo0O0 = o00O0.Oooo0O0(o00o00oOooo0OO2);
        ArrayList arrayList12 = new ArrayList(arrayList);
        o00OO o00oo2 = o00OO.f3727OooO0O0;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : o00o00ooOooO0OO.OooO0O0()) {
            arrayMap.put(str, o00o00ooOooO0OO.OooO00o(str));
            arrayList7 = arrayList7;
        }
        o00o00oOooo0OO.Oooo0oO(oooO0o, new SessionConfig(arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, new o000000O(arrayList11, o00o0Oooo0O0, i3, range, arrayList12, false, new o00OO(arrayMap), null), null));
        o00o00oOooo0OO.Oooo0oO(o0o0Oo.f3773OooOo0o, o00O0O00.f618OooO00o);
        HashSet hashSet2 = new HashSet();
        o00O00O o00o00oOooo0OO3 = o00O00O.Oooo0OO();
        Range<Integer> range2 = o00OO0O0.f3743OooO00o;
        ArrayList arrayList13 = new ArrayList();
        o00O00OO o00o00ooOooO0OO2 = o00O00OO.OooO0OO();
        int i4 = iArr[captureType.ordinal()];
        int i5 = i4 != 1 ? (i4 == 2 || i4 == 3) ? 3 : 1 : i == 2 ? 5 : 2;
        OooO0o oooO0o2 = o0o0Oo.f3772OooOo0O;
        ArrayList arrayList14 = new ArrayList(hashSet2);
        o00O0 o00o0Oooo0O1 = o00O0.Oooo0O0(o00o00oOooo0OO3);
        ArrayList arrayList15 = new ArrayList(arrayList13);
        o00OO o00oo3 = o00OO.f3727OooO0O0;
        ArrayMap arrayMap2 = new ArrayMap();
        for (String str2 : o00o00ooOooO0OO2.OooO0O0()) {
            arrayMap2.put(str2, o00o00ooOooO0OO2.OooO00o(str2));
        }
        o00o00oOooo0OO.Oooo0oO(oooO0o2, new o000000O(arrayList14, o00o0Oooo0O1, i5, range2, arrayList15, false, new o00OO(arrayMap2), null));
        o00o00oOooo0OO.Oooo0oO(o0o0Oo.f3770OooOo, captureType == UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE ? o0O000.f677OooO0OO : o000Oo0.f603OooO00o);
        UseCaseConfigFactory.CaptureType captureType2 = UseCaseConfigFactory.CaptureType.PREVIEW;
        o0oOO o0ooo2 = this.f617OooO0O0;
        if (captureType == captureType2) {
            o00o00oOooo0OO.Oooo0oO(ImageOutputConfig.f3548OooOOo0, o0ooo2.OooO0o0());
        }
        o00o00oOooo0OO.Oooo0oO(ImageOutputConfig.f3542OooOO0o, Integer.valueOf(o0ooo2.OooO0OO(true).getRotation()));
        if (captureType == UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE || captureType == UseCaseConfigFactory.CaptureType.STREAM_SHARING) {
            o00o00oOooo0OO.Oooo0oO(o0o0Oo.f3778OooOoo0, Boolean.TRUE);
        }
        return o00O0.Oooo0O0(o00o00oOooo0OO);
    }
}
