package p244o00oo0Oo;

import java.util.ArrayList;
import java.util.Collections;
import p173o00OoooO.o00O0000;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f40521OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f40525OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f40526OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f40527OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final o00O0 f40520OooO0oo = new o00O0();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final o00O0000 f40519OooO = new o00O0000(1);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o[] f40523OooO0OO = new OooO00o[5];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList<OooO00o> f40522OooO0O0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f40524OooO0Oo = -1;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f40528OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f40529OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f40530OooO0OO;
    }

    public o00O0O00(int i) {
        this.f40521OooO00o = i;
    }

    public final void OooO00o(float f, int i) {
        OooO00o oooO00o;
        int i2 = this.f40524OooO0Oo;
        ArrayList<OooO00o> arrayList = this.f40522OooO0O0;
        if (i2 != 1) {
            Collections.sort(arrayList, f40520OooO0oo);
            this.f40524OooO0Oo = 1;
        }
        int i3 = this.f40527OooO0oO;
        OooO00o[] oooO00oArr = this.f40523OooO0OO;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f40527OooO0oO = i4;
            oooO00o = oooO00oArr[i4];
        } else {
            oooO00o = new OooO00o();
        }
        int i5 = this.f40526OooO0o0;
        this.f40526OooO0o0 = i5 + 1;
        oooO00o.f40528OooO00o = i5;
        oooO00o.f40529OooO0O0 = i;
        oooO00o.f40530OooO0OO = f;
        arrayList.add(oooO00o);
        this.f40525OooO0o += i;
        while (true) {
            int i6 = this.f40525OooO0o;
            int i7 = this.f40521OooO00o;
            if (i6 <= i7) {
                return;
            }
            int i8 = i6 - i7;
            OooO00o oooO00o2 = arrayList.get(0);
            int i9 = oooO00o2.f40529OooO0O0;
            if (i9 <= i8) {
                this.f40525OooO0o -= i9;
                arrayList.remove(0);
                int i10 = this.f40527OooO0oO;
                if (i10 < 5) {
                    this.f40527OooO0oO = i10 + 1;
                    oooO00oArr[i10] = oooO00o2;
                }
            } else {
                oooO00o2.f40529OooO0O0 = i9 - i8;
                this.f40525OooO0o -= i8;
            }
        }
    }

    public final float OooO0O0() {
        int i = this.f40524OooO0Oo;
        ArrayList<OooO00o> arrayList = this.f40522OooO0O0;
        if (i != 0) {
            Collections.sort(arrayList, f40519OooO);
            this.f40524OooO0Oo = 0;
        }
        float f = 0.5f * this.f40525OooO0o;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            OooO00o oooO00o = arrayList.get(i3);
            i2 += oooO00o.f40529OooO0O0;
            if (i2 >= f) {
                return oooO00o.f40530OooO0OO;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return arrayList.get(arrayList.size() - 1).f40530OooO0OO;
    }
}
