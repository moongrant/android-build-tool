package androidx.media3.ui;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000OO implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        o0000O0.OooO0O0 oooO0O0 = (o0000O0.OooO0O0) obj;
        o0000O0.OooO0O0 oooO0O1 = (o0000O0.OooO0O0) obj2;
        int iCompare = Integer.compare(oooO0O1.f6747OooO00o, oooO0O0.f6747OooO00o);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = oooO0O1.f6749OooO0OO.compareTo(oooO0O0.f6749OooO0OO);
        return iCompareTo != 0 ? iCompareTo : oooO0O1.f6750OooO0Oo.compareTo(oooO0O0.f6750OooO0Oo);
    }
}
