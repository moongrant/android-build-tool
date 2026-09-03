package p317o0O0oOOO;

import com.google.android.exoplayer2.text.Cue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;
import p324o0O0oo0O.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O00 implements o0000O00 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final List<o00O00O> f36657Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final long[] f36658Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final long[] f36659Oooo0oo;

    public o00O0O00(List<o00O00O> list) {
        this.f36657Oooo0o = Collections.unmodifiableList(new ArrayList(list));
        this.f36658Oooo0oO = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            o00O00O o00o00o2 = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f36658Oooo0oO;
            jArr[i2] = o00o00o2.f36630OooO0O0;
            jArr[i2 + 1] = o00o00o2.f36631OooO0OO;
        }
        long[] jArr2 = this.f36658Oooo0oO;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f36659Oooo0oo = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // p324o0O0oo0O.o0000O00
    public final int OooO00o(long j) {
        int iOooO0O0 = o000OOo0.OooO0O0(this.f36659Oooo0oo, j, false);
        if (iOooO0O0 < this.f36659Oooo0oo.length) {
            return iOooO0O0;
        }
        return -1;
    }

    @Override // p324o0O0oo0O.o0000O00
    public final long OooO0O0(int i) {
        o00000O0.OooO00o(i >= 0);
        o00000O0.OooO00o(i < this.f36659Oooo0oo.length);
        return this.f36659Oooo0oo[i];
    }

    @Override // p324o0O0oo0O.o0000O00
    public final List<Cue> OooO0Oo(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < this.f36657Oooo0o.size(); i2++) {
            long[] jArr = this.f36658Oooo0oO;
            int i3 = i2 * 2;
            if (jArr[i3] <= j && j < jArr[i3 + 1]) {
                o00O00O o00o00o2 = this.f36657Oooo0o.get(i2);
                Cue cue = o00o00o2.f36629OooO00o;
                if (cue.f14622OooO0Oo == -3.4028235E38f) {
                    arrayList2.add(o00o00o2);
                } else {
                    arrayList.add(cue);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: o0O0oOOO.o00O0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((o00O00O) obj).f36630OooO0O0, ((o00O00O) obj2).f36630OooO0O0);
            }
        });
        while (i < arrayList2.size()) {
            Cue cue2 = ((o00O00O) arrayList2.get(i)).f36629OooO00o;
            arrayList.add(new Cue(cue2.f14619OooO00o, cue2.f14620OooO0O0, cue2.f14621OooO0OO, (-1) - i, 1, cue2.f14623OooO0o, cue2.f14625OooO0oO, cue2.f14626OooO0oo, cue2.f14631OooOOO0, cue2.f14630OooOOO, cue2.f14618OooO, cue2.f14627OooOO0, cue2.f14628OooOO0O, cue2.f14629OooOO0o, cue2.f14632OooOOOO));
            i++;
            arrayList2 = arrayList2;
        }
        return arrayList;
    }

    @Override // p324o0O0oo0O.o0000O00
    public final int OooO0o0() {
        return this.f36659Oooo0oo.length;
    }
}
