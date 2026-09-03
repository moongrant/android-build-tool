package p236o00oOooo;

import com.google.android.exoplayer2.text.Cue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p230o00oOoO0.o000;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00OOOOo implements o000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<List<Cue>> f40310OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<Long> f40311OooO0o0;

    public o00OOOOo(ArrayList arrayList, ArrayList arrayList2) {
        this.f40310OooO0Oo = arrayList;
        this.f40311OooO0o0 = arrayList2;
    }

    @Override // p230o00oOoO0.o000
    public final int OooO00o(long j) {
        int i;
        Long lValueOf = Long.valueOf(j);
        int i2 = o0O00.f40595OooO00o;
        List<Long> list = this.f40311OooO0o0;
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
        if (i < list.size()) {
            return i;
        }
        return -1;
    }

    @Override // p230o00oOoO0.o000
    public final List<Cue> OooO0O0(long j) {
        int iOooO0OO = o0O00.OooO0OO(this.f40311OooO0o0, Long.valueOf(j), false);
        return iOooO0OO == -1 ? Collections.emptyList() : this.f40310OooO0Oo.get(iOooO0OO);
    }

    @Override // p230o00oOoO0.o000
    public final long OooO0OO(int i) {
        o00O000o.OooO00o(i >= 0);
        List<Long> list = this.f40311OooO0o0;
        o00O000o.OooO00o(i < list.size());
        return list.get(i).longValue();
    }

    @Override // p230o00oOoO0.o000
    public final int OooO0Oo() {
        return this.f40311OooO0o0.size();
    }
}
