package OooO0O0;

import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.o0OoOo0;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSession;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f96OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f97OooO0o0;

    public /* synthetic */ OooOO0(Object obj, int i) {
        this.f96OooO0Oo = i;
        this.f97OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f96OooO0Oo;
        Object obj = this.f97OooO0o0;
        switch (i) {
            case 0:
                OooOOO0 this$0 = (OooOOO0) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0OoOo0.OooO00o oooO00o = this$0.f107OooO0Oo;
                if (oooO00o != null) {
                    oooO00o.invoke(OooOo00.f109OooO0O0);
                    break;
                }
                break;
            default:
                DefaultDrmSessionManager.OooO0OO oooO0OO = (DefaultDrmSessionManager.OooO0OO) obj;
                if (!oooO0OO.f11746OooO0Oo) {
                    DrmSession drmSession = oooO0OO.f11745OooO0OO;
                    if (drmSession != null) {
                        drmSession.OooO0O0(oooO0OO.f11744OooO0O0);
                    }
                    DefaultDrmSessionManager.this.f11728OooOOO.remove(oooO0OO);
                    oooO0OO.f11746OooO0Oo = true;
                    break;
                }
                break;
        }
    }
}
