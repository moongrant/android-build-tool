package p002OooO0Oo;

import OooO0O0.OooO0o;
import android.util.Pair;
import com.google.android.exoplayer2.drm.OooO0O0;
import com.google.android.exoplayer2.o00O0O;
import com.google.android.exoplayer2.source.OooOOOO;
import kotlin.jvm.internal.Intrinsics;
import p245o00oo0o.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f111OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f112OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f113OooO0o0;

    public /* synthetic */ OooOOO0(int i, Object obj, Object obj2) {
        this.f111OooO0Oo = i;
        this.f113OooO0o0 = obj;
        this.f112OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f111OooO0Oo;
        Object obj = this.f112OooO0o;
        Object obj2 = this.f113OooO0o0;
        switch (i) {
            case 0:
                OooOo this$0 = (OooOo) obj2;
                OooO0o nativeAppInfo = (OooO0o) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(nativeAppInfo, "$nativeAppInfo");
                this$0.OooO0o(nativeAppInfo);
                break;
            case 1:
                Pair pair = (Pair) obj;
                ((o00O0O.OooO00o) obj2).f12812OooO0o0.f12807OooO0oo.Oooo0(((Integer) pair.first).intValue(), (OooOOOO.OooO0O0) pair.second);
                break;
            case 2:
                OooO0O0.OooO00o oooO00o = (OooO0O0.OooO00o) obj2;
                ((OooO0O0) obj).Oooo000(oooO00o.f11769OooO00o, oooO00o.f11770OooO0O0);
                break;
            default:
                ((o00OOOO0.OooO00o) obj).OooO00o(((o00OOOO0) obj2).OooO0OO());
                break;
        }
    }
}
