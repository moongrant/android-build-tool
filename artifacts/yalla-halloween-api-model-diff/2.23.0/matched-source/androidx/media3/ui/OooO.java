package androidx.media3.ui;

import com.facebook.internal.FetchedAppGateKeepersManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f6559OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f6560OooO0o0;

    public /* synthetic */ OooO(Object obj, int i) {
        this.f6559OooO0Oo = i;
        this.f6560OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6559OooO0Oo;
        Object obj = this.f6560OooO0o0;
        switch (i) {
            case 0:
                int i2 = LegacyPlayerControlView.f6509OoooOoO;
                ((LegacyPlayerControlView) obj).OooO0oO();
                break;
            default:
                ((FetchedAppGateKeepersManager.Callback) obj).onCompleted();
                break;
        }
    }
}
