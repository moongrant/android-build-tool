package p037OoooOo0;

import androidx.camera.core.impl.DeferrableSurface;
import androidx.media3.ui.LegacyPlayerControlView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1480OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1481OooO0o0;

    public /* synthetic */ o00(Object obj, int i) {
        this.f1480OooO0Oo = i;
        this.f1481OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1480OooO0Oo;
        Object obj = this.f1481OooO0o0;
        switch (i) {
            case 0:
                ((DeferrableSurface) obj).OooO0O0();
                break;
            default:
                ((LegacyPlayerControlView) obj).OooO00o();
                break;
        }
    }
}
