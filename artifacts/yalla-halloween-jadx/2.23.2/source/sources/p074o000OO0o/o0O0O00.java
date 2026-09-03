package p074o000OO0o;

import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f34430OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f34434OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f34435OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f34436OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final o0OO00O f34429OooO0oo = new o0OO00O();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final oo0o0Oo f34428OooO = new oo0o0Oo();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o[] f34432OooO0OO = new OooO00o[5];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList<OooO00o> f34431OooO0O0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f34433OooO0Oo = -1;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f34437OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f34438OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f34439OooO0OO;
    }

    public o0O0O00(int i) {
        this.f34430OooO00o = i;
    }

    public final void OooO00o(float f, int i) {
        OooO00o oooO00o;
        int i2 = this.f34433OooO0Oo;
        ArrayList<OooO00o> arrayList = this.f34431OooO0O0;
        if (i2 != 1) {
            Collections.sort(arrayList, f34429OooO0oo);
            this.f34433OooO0Oo = 1;
        }
        int i3 = this.f34436OooO0oO;
        OooO00o[] oooO00oArr = this.f34432OooO0OO;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f34436OooO0oO = i4;
            oooO00o = oooO00oArr[i4];
        } else {
            oooO00o = new OooO00o();
        }
        int i5 = this.f34435OooO0o0;
        this.f34435OooO0o0 = i5 + 1;
        oooO00o.f34437OooO00o = i5;
        oooO00o.f34438OooO0O0 = i;
        oooO00o.f34439OooO0OO = f;
        arrayList.add(oooO00o);
        this.f34434OooO0o += i;
        while (true) {
            int i6 = this.f34434OooO0o;
            int i7 = this.f34430OooO00o;
            if (i6 <= i7) {
                return;
            }
            int i8 = i6 - i7;
            OooO00o oooO00o2 = arrayList.get(0);
            int i9 = oooO00o2.f34438OooO0O0;
            if (i9 <= i8) {
                this.f34434OooO0o -= i9;
                arrayList.remove(0);
                int i10 = this.f34436OooO0oO;
                if (i10 < 5) {
                    this.f34436OooO0oO = i10 + 1;
                    oooO00oArr[i10] = oooO00o2;
                }
            } else {
                oooO00o2.f34438OooO0O0 = i9 - i8;
                this.f34434OooO0o -= i8;
            }
        }
    }

    public final float OooO0O0() {
        int i = this.f34433OooO0Oo;
        ArrayList<OooO00o> arrayList = this.f34431OooO0O0;
        if (i != 0) {
            Collections.sort(arrayList, f34428OooO);
            this.f34433OooO0Oo = 0;
        }
        float f = 0.5f * this.f34434OooO0o;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            OooO00o oooO00o = arrayList.get(i3);
            i2 += oooO00o.f34438OooO0O0;
            if (i2 >= f) {
                return oooO00o.f34439OooO0OO;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return arrayList.get(arrayList.size() - 1).f34439OooO0OO;
    }
}
