package o0Oo00o0;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f38955OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<OooO0O0> f38956OooO0O0;

    public OooO0OO(OooO00o oooO00o) {
        this.f38955OooO00o = oooO00o;
        ArrayList arrayList = new ArrayList();
        this.f38956OooO0O0 = arrayList;
        arrayList.add(new OooO0O0(oooO00o, new int[]{1}));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List<o0Oo00o0.OooO0O0>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList, java.util.List<o0Oo00o0.OooO0O0>] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList, java.util.List<o0Oo00o0.OooO0O0>] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.ArrayList, java.util.List<o0Oo00o0.OooO0O0>] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.ArrayList, java.util.List<o0Oo00o0.OooO0O0>] */
    public final void OooO00o(int[] iArr, int i) {
        OooO0O0 oooO0O0;
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        int i2 = 2;
        char c = 0;
        int i3 = 1;
        if (i >= this.f38956OooO0O0.size()) {
            ?? r4 = this.f38956OooO0O0;
            OooO0O0 oooO0O1 = (OooO0O0) r4.get(r4.size() - 1);
            int size = this.f38956OooO0O0.size();
            while (size <= i) {
                OooO00o oooO00o = this.f38955OooO00o;
                int[] iArr2 = new int[i2];
                iArr2[c] = i3;
                iArr2[i3] = oooO00o.f38947OooO00o[(size - 1) + oooO00o.f38951OooO0o];
                OooO0O0 oooO0O2 = new OooO0O0(oooO00o, iArr2);
                if (!oooO0O1.f38953OooO00o.equals(oooO00o)) {
                    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                }
                if (oooO0O1.OooO0OO() || oooO0O2.OooO0OO()) {
                    oooO0O1 = oooO0O1.f38953OooO00o.f38949OooO0OO;
                } else {
                    int[] iArr3 = oooO0O1.f38954OooO0O0;
                    int length2 = iArr3.length;
                    int[] iArr4 = oooO0O2.f38954OooO0O0;
                    int length3 = iArr4.length;
                    int[] iArr5 = new int[(length2 + length3) - 1];
                    for (int i4 = 0; i4 < length2; i4++) {
                        int i5 = iArr3[i4];
                        int i6 = 0;
                        while (i6 < length3) {
                            int i7 = i4 + i6;
                            iArr5[i7] = oooO0O1.f38953OooO00o.OooO00o(i5, iArr4[i6]) ^ iArr5[i7];
                            i6++;
                            iArr3 = iArr3;
                        }
                    }
                    oooO0O1 = new OooO0O0(oooO0O1.f38953OooO00o, iArr5);
                }
                this.f38956OooO0O0.add(oooO0O1);
                size++;
                i2 = 2;
                c = 0;
                i3 = 1;
            }
        }
        OooO0O0 oooO0O3 = (OooO0O0) this.f38956OooO0O0.get(i);
        int[] iArr6 = new int[length];
        System.arraycopy(iArr, 0, iArr6, 0, length);
        OooO0O0 oooO0O0OooO0Oo = new OooO0O0(this.f38955OooO00o, iArr6).OooO0Oo(i, 1);
        if (!oooO0O0OooO0Oo.f38953OooO00o.equals(oooO0O3.f38953OooO00o)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (oooO0O3.OooO0OO()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        OooO0O0 oooO0O0OooO00o = oooO0O0OooO0Oo.f38953OooO00o.f38949OooO0OO;
        int iOooO0O0 = oooO0O3.OooO0O0(oooO0O3.f38954OooO0O0.length - 1);
        OooO00o oooO00o2 = oooO0O0OooO0Oo.f38953OooO00o;
        Objects.requireNonNull(oooO00o2);
        if (iOooO0O0 == 0) {
            throw new ArithmeticException();
        }
        int i8 = oooO00o2.f38947OooO00o[(oooO00o2.f38950OooO0Oo - oooO00o2.f38948OooO0O0[iOooO0O0]) - 1];
        OooO0O0 oooO0O0OooO00o2 = oooO0O0OooO0Oo;
        while (oooO0O0OooO00o2.f38954OooO0O0.length - 1 >= oooO0O3.f38954OooO0O0.length - 1 && !oooO0O0OooO00o2.OooO0OO()) {
            int[] iArr7 = oooO0O0OooO00o2.f38954OooO0O0;
            int length4 = (iArr7.length - 1) - (oooO0O3.f38954OooO0O0.length - 1);
            int iOooO00o = oooO0O0OooO0Oo.f38953OooO00o.OooO00o(oooO0O0OooO00o2.OooO0O0(iArr7.length - 1), i8);
            OooO0O0 oooO0O0OooO0Oo2 = oooO0O3.OooO0Oo(length4, iOooO00o);
            OooO00o oooO00o3 = oooO0O0OooO0Oo.f38953OooO00o;
            Objects.requireNonNull(oooO00o3);
            if (length4 < 0) {
                throw new IllegalArgumentException();
            }
            if (iOooO00o == 0) {
                oooO0O0 = oooO00o3.f38949OooO0OO;
            } else {
                int[] iArr8 = new int[length4 + 1];
                iArr8[0] = iOooO00o;
                oooO0O0 = new OooO0O0(oooO00o3, iArr8);
            }
            oooO0O0OooO00o = oooO0O0OooO00o.OooO00o(oooO0O0);
            oooO0O0OooO00o2 = oooO0O0OooO00o2.OooO00o(oooO0O0OooO0Oo2);
        }
        int[] iArr9 = new OooO0O0[]{oooO0O0OooO00o, oooO0O0OooO00o2}[1].f38954OooO0O0;
        int length5 = i - iArr9.length;
        for (int i9 = 0; i9 < length5; i9++) {
            iArr[length + i9] = 0;
        }
        System.arraycopy(iArr9, 0, iArr, length + length5, iArr9.length);
    }
}
