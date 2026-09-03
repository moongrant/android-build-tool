package com.google.android.gms.internal.measurement;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOO0 implements o00oo0o.o00O.OooO00o {
    public /* synthetic */ OooOO0(AnalyticsListener.OooO00o oooO00o, p206o00o0oOO.o0 o0Var) {
    }

    public static Object OooO00o(zzbl zzblVar, int i, List list, int i2) {
        zzh.zzh(zzblVar.name(), i, list);
        return list.get(i2);
    }

    @Override // o00oo0o.o00O.OooO00o
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).Ooooo00();
    }
}
