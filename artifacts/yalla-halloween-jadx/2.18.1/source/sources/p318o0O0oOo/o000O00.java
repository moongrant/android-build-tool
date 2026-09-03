package p318o0O0oOo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00 {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final /* synthetic */ int f36705OooO0oo = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f36706OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f36710OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f36711OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f36712OooO0oO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o[] f36708OooO0OO = new OooO00o[5];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList<OooO00o> f36707OooO0O0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f36709OooO0Oo = -1;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f36713OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f36714OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f36715OooO0OO;
    }

    public o000O00(int i) {
        this.f36706OooO00o = i;
    }

    public final void OooO00o(int i, float f) {
        OooO00o oooO00o;
        if (this.f36709OooO0Oo != 1) {
            Collections.sort(this.f36707OooO0O0, new Comparator() { // from class: o0O0oOo.o000O0o
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int i2 = o000O00.f36705OooO0oo;
                    return ((o000O00.OooO00o) obj).f36713OooO00o - ((o000O00.OooO00o) obj2).f36713OooO00o;
                }
            });
            this.f36709OooO0Oo = 1;
        }
        int i2 = this.f36712OooO0oO;
        if (i2 > 0) {
            OooO00o[] oooO00oArr = this.f36708OooO0OO;
            int i3 = i2 - 1;
            this.f36712OooO0oO = i3;
            oooO00o = oooO00oArr[i3];
        } else {
            oooO00o = new OooO00o();
        }
        int i4 = this.f36711OooO0o0;
        this.f36711OooO0o0 = i4 + 1;
        oooO00o.f36713OooO00o = i4;
        oooO00o.f36714OooO0O0 = i;
        oooO00o.f36715OooO0OO = f;
        this.f36707OooO0O0.add(oooO00o);
        this.f36710OooO0o += i;
        while (true) {
            int i5 = this.f36710OooO0o;
            int i6 = this.f36706OooO00o;
            if (i5 <= i6) {
                return;
            }
            int i7 = i5 - i6;
            OooO00o oooO00o2 = this.f36707OooO0O0.get(0);
            int i8 = oooO00o2.f36714OooO0O0;
            if (i8 <= i7) {
                this.f36710OooO0o -= i8;
                this.f36707OooO0O0.remove(0);
                int i9 = this.f36712OooO0oO;
                if (i9 < 5) {
                    OooO00o[] oooO00oArr2 = this.f36708OooO0OO;
                    this.f36712OooO0oO = i9 + 1;
                    oooO00oArr2[i9] = oooO00o2;
                }
            } else {
                oooO00o2.f36714OooO0O0 = i8 - i7;
                this.f36710OooO0o -= i7;
            }
        }
    }

    public final float OooO0O0() {
        if (this.f36709OooO0Oo != 0) {
            Collections.sort(this.f36707OooO0O0, new Comparator() { // from class: o0O0oOo.o000Oo0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int i = o000O00.f36705OooO0oo;
                    return Float.compare(((o000O00.OooO00o) obj).f36715OooO0OO, ((o000O00.OooO00o) obj2).f36715OooO0OO);
                }
            });
            this.f36709OooO0Oo = 0;
        }
        float f = 0.5f * this.f36710OooO0o;
        int i = 0;
        for (int i2 = 0; i2 < this.f36707OooO0O0.size(); i2++) {
            OooO00o oooO00o = this.f36707OooO0O0.get(i2);
            i += oooO00o.f36714OooO0O0;
            if (i >= f) {
                return oooO00o.f36715OooO0OO;
            }
        }
        if (this.f36707OooO0O0.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<OooO00o> arrayList = this.f36707OooO0O0;
        return arrayList.get(arrayList.size() - 1).f36715OooO0OO;
    }
}
