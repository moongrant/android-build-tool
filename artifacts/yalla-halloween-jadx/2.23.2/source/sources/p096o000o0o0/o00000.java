package p096o000o0o0;

import androidx.media3.common.text.Cue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;
import p092o000o0O0.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 implements o0OO00O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<List<Cue>> f35277OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<Long> f35278OooO0o0;

    public o00000(ArrayList arrayList, ArrayList arrayList2) {
        this.f35277OooO0Oo = arrayList;
        this.f35278OooO0o0 = arrayList2;
    }

    @Override // p092o000o0O0.o0OO00O
    public final int OooO00o(long j) {
        int i;
        Long lValueOf = Long.valueOf(j);
        int i2 = o00.f34910OooO00o;
        List<Long> list = this.f35278OooO0o0;
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

    @Override // p092o000o0O0.o0OO00O
    public final List<Cue> OooO0O0(long j) {
        int iOooO0OO = o00.OooO0OO(this.f35278OooO0o0, Long.valueOf(j), false);
        return iOooO0OO == -1 ? Collections.emptyList() : this.f35277OooO0Oo.get(iOooO0OO);
    }

    @Override // p092o000o0O0.o0OO00O
    public final long OooO0OO(int i) {
        o00Oo0.OooO00o(i >= 0);
        List<Long> list = this.f35278OooO0o0;
        o00Oo0.OooO00o(i < list.size());
        return list.get(i).longValue();
    }

    @Override // p092o000o0O0.o0OO00O
    public final int OooO0Oo() {
        return this.f35278OooO0o0.size();
    }
}
