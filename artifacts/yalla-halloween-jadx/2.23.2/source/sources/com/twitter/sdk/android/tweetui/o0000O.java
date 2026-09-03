package com.twitter.sdk.android.tweetui;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O {
    public static void OooO00o(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                OooOOO0 oooOOO0 = (OooOOO0) it.next();
                int i = oooOOO0.f21835OooO00o;
                Iterator it2 = arrayList2.iterator();
                int i2 = 0;
                while (it2.hasNext() && ((Integer) it2.next()).intValue() - i2 <= i) {
                    i2++;
                }
                oooOOO0.f21835OooO00o += i2;
                oooOOO0.f21836OooO0O0 += i2;
            }
        }
    }

    public static void OooO0O0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null || arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            OooOOO0 oooOOO0 = (OooOOO0) it.next();
            int i3 = 0;
            int i4 = i2;
            while (i2 < size) {
                int[] iArr = (int[]) arrayList2.get(i2);
                int i5 = iArr[0];
                int i6 = iArr[1];
                int i7 = i6 - i5;
                if (i6 < oooOOO0.f21835OooO00o) {
                    i += i7;
                    i4++;
                } else if (i6 < oooOOO0.f21836OooO0O0) {
                    i3 += i7;
                }
                i2++;
            }
            int i8 = i3 + i;
            oooOOO0.f21835OooO00o -= i8;
            oooOOO0.f21836OooO0O0 -= i8;
            i2 = i4;
        }
    }
}
