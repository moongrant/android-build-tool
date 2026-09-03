package androidx.media3.session;

import android.os.Bundle;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00 implements androidx.media3.common.OooO0OO.OooO00o, o000OoO.o00000O0.OooO00o {
    public /* synthetic */ o00(int i, AnalyticsListener.OooO00o oooO00o, boolean z) {
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(MediaLibraryService.OooO00o.f9198OooO0oo);
        boolean z = bundle.getBoolean(MediaLibraryService.OooO00o.f9197OooO, false);
        boolean z2 = bundle.getBoolean(MediaLibraryService.OooO00o.f9199OooOO0, false);
        boolean z3 = bundle.getBoolean(MediaLibraryService.OooO00o.f9200OooOO0O, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new MediaLibraryService.OooO00o(bundle2, z, z2, z3);
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).o00Oo0();
    }
}
