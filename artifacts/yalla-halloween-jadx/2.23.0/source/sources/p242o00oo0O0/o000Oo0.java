package p242o00oo0O0;

import com.google.android.exoplayer2.text.Cue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p230o00oOoO0.o000;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000Oo0 implements o000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<o000OO> f40449OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long[] f40450OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long[] f40451OooO0o0;

    public o000Oo0(ArrayList arrayList) {
        this.f40449OooO0Oo = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f40451OooO0o0 = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            o000OO o000oo2 = (o000OO) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = this.f40451OooO0o0;
            jArr[i2] = o000oo2.f40447OooO0O0;
            jArr[i2 + 1] = o000oo2.f40448OooO0OO;
        }
        long[] jArr2 = this.f40451OooO0o0;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f40450OooO0o = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // p230o00oOoO0.o000
    public final int OooO00o(long j) {
        long[] jArr = this.f40450OooO0o;
        int iOooO0O0 = o0O00.OooO0O0(jArr, j, false);
        if (iOooO0O0 < jArr.length) {
            return iOooO0O0;
        }
        return -1;
    }

    @Override // p230o00oOoO0.o000
    public final List<Cue> OooO0O0(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List<o000OO> list = this.f40449OooO0Oo;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = this.f40451OooO0o0;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                o000OO o000oo2 = list.get(i);
                Cue cue = o000oo2.f40446OooO00o;
                if (cue.f13406OooO0oo == -3.4028235E38f) {
                    arrayList2.add(o000oo2);
                } else {
                    arrayList.add(cue);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new o000O0o());
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            Cue cue2 = ((o000OO) arrayList2.get(i3)).f40446OooO00o;
            cue2.getClass();
            arrayList.add(new Cue(cue2.f13402OooO0Oo, cue2.f13404OooO0o0, cue2.f13403OooO0o, cue2.f13405OooO0oO, (-1) - i3, 1, cue2.f13407OooOO0, cue2.f13408OooOO0O, cue2.f13409OooOO0o, cue2.f13415OooOOo0, cue2.f13414OooOOo, cue2.f13411OooOOO0, cue2.f13410OooOOO, cue2.f13412OooOOOO, cue2.f13413OooOOOo, cue2.f13416OooOOoo, cue2.f13417OooOo00));
        }
        return arrayList;
    }

    @Override // p230o00oOoO0.o000
    public final long OooO0OO(int i) {
        o00O000o.OooO00o(i >= 0);
        long[] jArr = this.f40450OooO0o;
        o00O000o.OooO00o(i < jArr.length);
        return jArr[i];
    }

    @Override // p230o00oOoO0.o000
    public final int OooO0Oo() {
        return this.f40450OooO0o.length;
    }
}
