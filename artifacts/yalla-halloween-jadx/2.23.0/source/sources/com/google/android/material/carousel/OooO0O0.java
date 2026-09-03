package com.google.android.material.carousel;

import OooOo.OooO0o;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p018OooOoo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f16643OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<OooO00o> f16644OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<OooO00o> f16645OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float[] f16646OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f16647OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float[] f16648OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f16649OooO0oO;

    public OooO0O0(OooO00o oooO00o, ArrayList arrayList, ArrayList arrayList2) {
        this.f16643OooO00o = oooO00o;
        this.f16644OooO0O0 = Collections.unmodifiableList(arrayList);
        this.f16645OooO0OO = Collections.unmodifiableList(arrayList2);
        float f = ((OooO00o) OooOOO.OooO0O0(arrayList, 1)).OooO0O0().f16639OooO00o - oooO00o.OooO0O0().f16639OooO00o;
        this.f16647OooO0o = f;
        float f2 = oooO00o.OooO0Oo().f16639OooO00o - ((OooO00o) OooOOO.OooO0O0(arrayList2, 1)).OooO0Oo().f16639OooO00o;
        this.f16649OooO0oO = f2;
        this.f16646OooO0Oo = OooO00o(f, arrayList, true);
        this.f16648OooO0o0 = OooO00o(f2, arrayList2, false);
    }

    public static float[] OooO00o(float f, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            OooO00o oooO00o = (OooO00o) arrayList.get(i2);
            OooO00o oooO00o2 = (OooO00o) arrayList.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i2] + ((z ? oooO00o2.OooO0O0().f16639OooO00o - oooO00o.OooO0O0().f16639OooO00o : oooO00o.OooO0Oo().f16639OooO00o - oooO00o2.OooO0Oo().f16639OooO00o) / f);
            i++;
        }
        return fArr;
    }

    public static OooO00o OooO0O0(List<OooO00o> list, float f, float[] fArr) {
        int size = list.size();
        float f2 = fArr[0];
        int i = 1;
        while (i < size) {
            float f3 = fArr[i];
            if (f <= f3) {
                float fOooO00o = o0O000.OooO0O0.OooO00o(0.0f, 1.0f, f2, f3, f);
                OooO00o oooO00o = list.get(i - 1);
                OooO00o oooO00o2 = list.get(i);
                if (oooO00o.f16628OooO00o != oooO00o2.f16628OooO00o) {
                    throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
                }
                List<OooO00o.OooO0O0> list2 = oooO00o.f16629OooO0O0;
                int size2 = list2.size();
                List<OooO00o.OooO0O0> list3 = oooO00o2.f16629OooO0O0;
                if (size2 != list3.size()) {
                    throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    OooO00o.OooO0O0 oooO0O0 = list2.get(i2);
                    OooO00o.OooO0O0 oooO0O1 = list3.get(i2);
                    float f4 = oooO0O0.f16639OooO00o;
                    float f5 = oooO0O1.f16639OooO00o;
                    LinearInterpolator linearInterpolator = o0O000.OooO0O0.f41571OooO00o;
                    float fOooO00o2 = OooO0o.OooO00o(f5, f4, fOooO00o, f4);
                    float f6 = oooO0O1.f16640OooO0O0;
                    float f7 = oooO0O0.f16640OooO0O0;
                    float fOooO00o3 = OooO0o.OooO00o(f6, f7, fOooO00o, f7);
                    float f8 = oooO0O1.f16641OooO0OO;
                    float f9 = oooO0O0.f16641OooO0OO;
                    float fOooO00o4 = OooO0o.OooO00o(f8, f9, fOooO00o, f9);
                    float f10 = oooO0O1.f16642OooO0Oo;
                    float f11 = oooO0O0.f16642OooO0Oo;
                    arrayList.add(new OooO00o.OooO0O0(fOooO00o2, fOooO00o3, fOooO00o4, OooO0o.OooO00o(f10, f11, fOooO00o, f11)));
                }
                return new OooO00o(oooO00o.f16628OooO00o, arrayList, o0O000.OooO0O0.OooO0O0(oooO00o.f16630OooO0OO, oooO00o2.f16630OooO0OO, fOooO00o), o0O000.OooO0O0.OooO0O0(oooO00o.f16631OooO0Oo, oooO00o2.f16631OooO0Oo, fOooO00o));
            }
            i++;
            f2 = f3;
        }
        return list.get(0);
    }

    public static OooO00o OooO0OO(OooO00o oooO00o, int i, int i2, float f, int i3, int i4) {
        ArrayList arrayList = new ArrayList(oooO00o.f16629OooO0O0);
        arrayList.add(i2, (OooO00o.OooO0O0) arrayList.remove(i));
        OooO00o.C0219OooO00o c0219OooO00o = new OooO00o.C0219OooO00o(oooO00o.f16628OooO00o);
        int i5 = 0;
        while (i5 < arrayList.size()) {
            OooO00o.OooO0O0 oooO0O0 = (OooO00o.OooO0O0) arrayList.get(i5);
            float f2 = oooO0O0.f16642OooO0Oo;
            c0219OooO00o.OooO00o((f2 / 2.0f) + f, oooO0O0.f16641OooO0OO, f2, i5 >= i3 && i5 <= i4);
            f += oooO0O0.f16642OooO0Oo;
            i5++;
        }
        return c0219OooO00o.OooO0O0();
    }
}
