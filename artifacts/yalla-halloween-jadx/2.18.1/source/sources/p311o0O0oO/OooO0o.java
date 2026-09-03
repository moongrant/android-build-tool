package p311o0O0oO;

import com.google.android.exoplayer2.text.Cue;
import java.util.Collections;
import java.util.List;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;
import p324o0O0oo0O.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements o0000O00 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final List<List<Cue>> f36505Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final List<Long> f36506Oooo0oO;

    public OooO0o(List<List<Cue>> list, List<Long> list2) {
        this.f36505Oooo0o = list;
        this.f36506Oooo0oO = list2;
    }

    @Override // p324o0O0oo0O.o0000O00
    public final int OooO00o(long j) {
        int i;
        List<Long> list = this.f36506Oooo0oO;
        Long lValueOf = Long.valueOf(j);
        int i2 = o000OOo0.f36740OooO00o;
        int iBinarySearch = Collections.binarySearch(list, lValueOf);
        if (iBinarySearch < 0) {
            i = ~iBinarySearch;
        } else {
            int size = list.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (list.get(iBinarySearch).compareTo(lValueOf) == 0);
            i = iBinarySearch;
        }
        if (i < this.f36506Oooo0oO.size()) {
            return i;
        }
        return -1;
    }

    @Override // p324o0O0oo0O.o0000O00
    public final long OooO0O0(int i) {
        o00000O0.OooO00o(i >= 0);
        o00000O0.OooO00o(i < this.f36506Oooo0oO.size());
        return this.f36506Oooo0oO.get(i).longValue();
    }

    @Override // p324o0O0oo0O.o0000O00
    public final List<Cue> OooO0Oo(long j) {
        int i;
        List<Long> list = this.f36506Oooo0oO;
        Long lValueOf = Long.valueOf(j);
        int i2 = o000OOo0.f36740OooO00o;
        int iBinarySearch = Collections.binarySearch(list, lValueOf);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (list.get(iBinarySearch).compareTo(lValueOf) == 0);
            i = iBinarySearch + 1;
        }
        return i == -1 ? Collections.emptyList() : this.f36505Oooo0o.get(i);
    }

    @Override // p324o0O0oo0O.o0000O00
    public final int OooO0o0() {
        return this.f36506Oooo0oO.size();
    }
}
