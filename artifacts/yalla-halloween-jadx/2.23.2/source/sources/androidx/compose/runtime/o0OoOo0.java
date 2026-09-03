package androidx.compose.runtime;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.util.ArrayList;
import java.util.Map;
import p080o000OoO.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0OoOo0 implements o00000O0.OooO00o {
    public /* synthetic */ o0OoOo0(AnalyticsListener.OooO00o oooO00o, o000O00O.OooOo oooOo) {
    }

    public static ArrayList OooO00o(Map map, Object obj) {
        ArrayList arrayList = new ArrayList();
        map.put(obj, arrayList);
        return arrayList;
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).Oooo0o0();
    }
}
