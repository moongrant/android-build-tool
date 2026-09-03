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
    public final OooO00o f16170OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<OooO00o> f16171OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<OooO00o> f16172OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float[] f16173OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f16174OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float[] f16175OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f16176OooO0oO;

    public OooO0O0(OooO00o oooO00o, ArrayList arrayList, ArrayList arrayList2) {
        this.f16170OooO00o = oooO00o;
        this.f16171OooO0O0 = Collections.unmodifiableList(arrayList);
        this.f16172OooO0OO = Collections.unmodifiableList(arrayList2);
        float f = ((OooO00o) OooOOO.OooO00o(arrayList, 1)).OooO0O0().f16166OooO00o - oooO00o.OooO0O0().f16166OooO00o;
        this.f16174OooO0o = f;
        float f2 = oooO00o.OooO0Oo().f16166OooO00o - ((OooO00o) OooOOO.OooO00o(arrayList2, 1)).OooO0Oo().f16166OooO00o;
        this.f16176OooO0oO = f2;
        this.f16173OooO0Oo = OooO00o(f, arrayList, true);
        this.f16175OooO0o0 = OooO00o(f2, arrayList2, false);
    }

    public static float[] OooO00o(float f, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            OooO00o oooO00o = (OooO00o) arrayList.get(i2);
            OooO00o oooO00o2 = (OooO00o) arrayList.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i2] + ((z ? oooO00o2.OooO0O0().f16166OooO00o - oooO00o.OooO0O0().f16166OooO00o : oooO00o.OooO0Oo().f16166OooO00o - oooO00o2.OooO0Oo().f16166OooO00o) / f);
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
                if (oooO00o.f16155OooO00o != oooO00o2.f16155OooO00o) {
                    throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
                }
                List<OooO00o.OooO0O0> list2 = oooO00o.f16156OooO0O0;
                int size2 = list2.size();
                List<OooO00o.OooO0O0> list3 = oooO00o2.f16156OooO0O0;
                if (size2 != list3.size()) {
                    throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    OooO00o.OooO0O0 oooO0O0 = list2.get(i2);
                    OooO00o.OooO0O0 oooO0O1 = list3.get(i2);
                    float f4 = oooO0O0.f16166OooO00o;
                    float f5 = oooO0O1.f16166OooO00o;
                    LinearInterpolator linearInterpolator = o0O000.OooO0O0.f40880OooO00o;
                    float fOooO00o2 = OooO0o.OooO00o(f5, f4, fOooO00o, f4);
                    float f6 = oooO0O1.f16167OooO0O0;
                    float f7 = oooO0O0.f16167OooO0O0;
                    float fOooO00o3 = OooO0o.OooO00o(f6, f7, fOooO00o, f7);
                    float f8 = oooO0O1.f16168OooO0OO;
                    float f9 = oooO0O0.f16168OooO0OO;
                    float fOooO00o4 = OooO0o.OooO00o(f8, f9, fOooO00o, f9);
                    float f10 = oooO0O1.f16169OooO0Oo;
                    float f11 = oooO0O0.f16169OooO0Oo;
                    arrayList.add(new OooO00o.OooO0O0(fOooO00o2, fOooO00o3, fOooO00o4, OooO0o.OooO00o(f10, f11, fOooO00o, f11)));
                }
                return new OooO00o(oooO00o.f16155OooO00o, arrayList, o0O000.OooO0O0.OooO0O0(oooO00o.f16157OooO0OO, oooO00o2.f16157OooO0OO, fOooO00o), o0O000.OooO0O0.OooO0O0(oooO00o.f16158OooO0Oo, oooO00o2.f16158OooO0Oo, fOooO00o));
            }
            i++;
            f2 = f3;
        }
        return list.get(0);
    }

    public static OooO00o OooO0OO(OooO00o oooO00o, int i, int i2, float f, int i3, int i4) {
        ArrayList arrayList = new ArrayList(oooO00o.f16156OooO0O0);
        arrayList.add(i2, (OooO00o.OooO0O0) arrayList.remove(i));
        OooO00o.C0216OooO00o c0216OooO00o = new OooO00o.C0216OooO00o(oooO00o.f16155OooO00o);
        int i5 = 0;
        while (i5 < arrayList.size()) {
            OooO00o.OooO0O0 oooO0O0 = (OooO00o.OooO0O0) arrayList.get(i5);
            float f2 = oooO0O0.f16169OooO0Oo;
            c0216OooO00o.OooO00o((f2 / 2.0f) + f, oooO0O0.f16168OooO0OO, f2, i5 >= i3 && i5 <= i4);
            f += oooO0O0.f16169OooO0Oo;
            i5++;
        }
        return c0216OooO00o.OooO0O0();
    }
}
