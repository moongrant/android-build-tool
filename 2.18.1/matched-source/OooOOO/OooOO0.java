package OooOOO;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f166Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f167Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f168Oooo0oo;

    public /* synthetic */ OooOO0(Object obj, Object obj2, int i) {
        this.f166Oooo0o = i;
        this.f167Oooo0oO = obj;
        this.f168Oooo0oo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f166Oooo0o) {
            case 0:
                OooOO0O this$0 = (OooOO0O) this.f167Oooo0oO;
                OooO00o.OooO nativeAppInfo = (OooO00o.OooO) this.f168Oooo0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(nativeAppInfo, "$nativeAppInfo");
                this$0.OooO0oO(nativeAppInfo);
                break;
            default:
                com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o c0097OooO00o = (com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o) this.f167Oooo0oO;
                ((com.google.android.exoplayer2.drm.OooO00o) this.f168Oooo0oo).Oooo00O(c0097OooO00o.f13720OooO00o, c0097OooO00o.f13721OooO0O0);
                break;
        }
    }
}
