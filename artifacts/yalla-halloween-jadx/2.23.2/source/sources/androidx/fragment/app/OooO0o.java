package androidx.fragment.app;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.v1.ApplicationProcessState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f5907OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f5908OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f5909OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f5910OooO0oO;

    public /* synthetic */ OooO0o(int i, Object obj, Object obj2, Object obj3) {
        this.f5907OooO0Oo = i;
        this.f5909OooO0o0 = obj;
        this.f5908OooO0o = obj2;
        this.f5910OooO0oO = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5907OooO0Oo;
        Object obj = this.f5910OooO0oO;
        Object obj2 = this.f5908OooO0o;
        Object obj3 = this.f5909OooO0o0;
        switch (i) {
            case 0:
                o000O000 impl = (o000O000) obj3;
                Rect lastInEpicenterRect = (Rect) obj;
                Intrinsics.checkNotNullParameter(impl, "$impl");
                Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
                impl.getClass();
                o000O000.OooO0oO((View) obj2, lastInEpicenterRect);
                break;
            case 1:
                Pair pair = (Pair) obj2;
                ((androidx.media3.exoplayer.OooOOO0.OooO00o) obj3).f7320OooO0o0.f7315OooO0oo.OooOoo0(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.OooOOOO.OooO0O0) pair.second, (Exception) obj);
                break;
            default:
                ((GaugeManager) obj3).lambda$stopCollectingGauges$3((String) obj2, (ApplicationProcessState) obj);
                break;
        }
    }
}
