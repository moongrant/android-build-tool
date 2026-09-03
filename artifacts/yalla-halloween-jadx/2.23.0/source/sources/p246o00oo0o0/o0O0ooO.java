package p246o00oo0o0;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O0ooO implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        o000OO0O o000oo0o2 = (o000OO0O) obj;
        o000OO0O o000oo0o3 = (o000OO0O) obj2;
        long j = o000oo0o2.f40716OooO;
        long j2 = o000oo0o3.f40716OooO;
        if (j - j2 == 0) {
            return o000oo0o2.compareTo(o000oo0o3);
        }
        return j < j2 ? -1 : 1;
    }
}
