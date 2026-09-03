package OooOOO;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f166Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f167OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f168OoooO00;

    public /* synthetic */ OooOO0(Object obj, Object obj2, int i) {
        this.f166Oooo = i;
        this.f168OoooO00 = obj;
        this.f167OoooO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f166Oooo) {
            case 0:
                OooOO0O this$0 = (OooOO0O) this.f168OoooO00;
                OooO00o.OooO nativeAppInfo = (OooO00o.OooO) this.f167OoooO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(nativeAppInfo, "$nativeAppInfo");
                this$0.OooO0oO(nativeAppInfo);
                break;
            default:
                com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o c0097OooO00o = (com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o) this.f168OoooO00;
                ((com.google.android.exoplayer2.drm.OooO00o) this.f167OoooO0).Oooo00O(c0097OooO00o.f13738OooO00o, c0097OooO00o.f13739OooO0O0);
                break;
        }
    }
}
