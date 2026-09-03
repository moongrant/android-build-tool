package androidx.media3.exoplayer.trackselection;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import com.google.common.collect.o0O000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements Spatializer$OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f8247OooO00o;

    public OooO0OO(OooO0O0 oooO0O0) {
        this.f8247OooO00o = oooO0O0;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        OooO0O0 oooO0O0 = this.f8247OooO00o;
        o0O000<Integer> o0o001 = OooO0O0.f8131OooOO0;
        oooO0O0.OooOOO0();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        OooO0O0 oooO0O0 = this.f8247OooO00o;
        o0O000<Integer> o0o001 = OooO0O0.f8131OooOO0;
        oooO0O0.OooOOO0();
    }
}
