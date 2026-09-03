package p037OoooOo0;

import androidx.camera.core.impl.DeferrableSurface;
import com.google.android.exoplayer2.ui.PlayerControlView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O0O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1556OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1557OooO0o0;

    public /* synthetic */ o000O0O0(Object obj, int i) {
        this.f1556OooO0Oo = i;
        this.f1557OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1556OooO0Oo;
        Object obj = this.f1557OooO0o0;
        switch (i) {
            case 0:
                ((DeferrableSurface) obj).OooO00o();
                break;
            default:
                ((PlayerControlView) obj).OooO0O0();
                break;
        }
    }
}
