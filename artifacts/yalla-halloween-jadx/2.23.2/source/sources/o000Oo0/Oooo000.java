package o000Oo0;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Oooo000 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        OooO oooO = (OooO) obj;
        OooO oooO2 = (OooO) obj2;
        long j = oooO.f34784OooO;
        long j2 = oooO2.f34784OooO;
        if (j - j2 == 0) {
            return oooO.compareTo(oooO2);
        }
        return j < j2 ? -1 : 1;
    }
}
