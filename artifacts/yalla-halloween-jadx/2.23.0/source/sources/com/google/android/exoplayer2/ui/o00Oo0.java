package com.google.android.exoplayer2.ui;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00Oo0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        o00O0O.OooO0O0 oooO0O0 = (o00O0O.OooO0O0) obj;
        o00O0O.OooO0O0 oooO0O1 = (o00O0O.OooO0O0) obj2;
        int iCompare = Integer.compare(oooO0O1.f14126OooO0O0, oooO0O0.f14126OooO0O0);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = oooO0O0.f14127OooO0OO.compareTo(oooO0O1.f14127OooO0OO);
        return iCompareTo != 0 ? iCompareTo : oooO0O0.f14128OooO0Oo.compareTo(oooO0O1.f14128OooO0Oo);
    }
}
