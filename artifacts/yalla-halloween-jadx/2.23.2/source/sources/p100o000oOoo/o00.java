package p100o000oOoo;

import androidx.media3.common.text.Cue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p080o000OoO.o00Oo0;
import p092o000o0O0.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00 implements o0OO00O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<o000O0Oo> f35341OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long[] f35342OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long[] f35343OooO0o0;

    public o00(ArrayList arrayList) {
        this.f35341OooO0Oo = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f35343OooO0o0 = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            o000O0Oo o000o0oo2 = (o000O0Oo) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = this.f35343OooO0o0;
            jArr[i2] = o000o0oo2.f35377OooO0O0;
            jArr[i2 + 1] = o000o0oo2.f35378OooO0OO;
        }
        long[] jArr2 = this.f35343OooO0o0;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f35342OooO0o = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // p092o000o0O0.o0OO00O
    public final int OooO00o(long j) {
        long[] jArr = this.f35342OooO0o;
        int iOooO0O0 = p080o000OoO.o00.OooO0O0(jArr, j, false);
        if (iOooO0O0 < jArr.length) {
            return iOooO0O0;
        }
        return -1;
    }

    @Override // p092o000o0O0.o0OO00O
    public final List<Cue> OooO0O0(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List<o000O0Oo> list = this.f35341OooO0Oo;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = this.f35343OooO0o0;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                o000O0Oo o000o0oo2 = list.get(i);
                Cue cue = o000o0oo2.f35376OooO00o;
                if (cue.f6902OooO0oo == -3.4028235E38f) {
                    arrayList2.add(o000o0oo2);
                } else {
                    arrayList.add(cue);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new o000OOo0());
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            Cue cue2 = ((o000O0Oo) arrayList2.get(i3)).f35376OooO00o;
            cue2.getClass();
            arrayList.add(new Cue(cue2.f6898OooO0Oo, cue2.f6900OooO0o0, cue2.f6899OooO0o, cue2.f6901OooO0oO, (-1) - i3, 1, cue2.f6903OooOO0, cue2.f6904OooOO0O, cue2.f6905OooOO0o, cue2.f6911OooOOo0, cue2.f6910OooOOo, cue2.f6907OooOOO0, cue2.f6906OooOOO, cue2.f6908OooOOOO, cue2.f6909OooOOOo, cue2.f6912OooOOoo, cue2.f6913OooOo00));
        }
        return arrayList;
    }

    @Override // p092o000o0O0.o0OO00O
    public final long OooO0OO(int i) {
        o00Oo0.OooO00o(i >= 0);
        long[] jArr = this.f35342OooO0o;
        o00Oo0.OooO00o(i < jArr.length);
        return jArr[i];
    }

    @Override // p092o000o0O0.o0OO00O
    public final int OooO0Oo() {
        return this.f35342OooO0o.length;
    }
}
