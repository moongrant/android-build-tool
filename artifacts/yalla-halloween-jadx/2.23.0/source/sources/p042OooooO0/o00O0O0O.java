package p042OooooO0;

import androidx.camera.video.internal.audio.OooO00o;
import com.yalla.android.videoplayer.view.YLTimeBar;
import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O0O0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1783OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1784OooO0o0;

    public /* synthetic */ o00O0O0O(Object obj, int i) {
        this.f1783OooO0Oo = i;
        this.f1784OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1783OooO0Oo;
        Object obj = this.f1784OooO0o0;
        switch (i) {
            case 0:
                OooO00o oooO00o = (OooO00o) obj;
                oooO00o.getClass();
                int i2 = OooO00o.OooO0OO.f4066OooO00o[oooO00o.f4046OooO0oO.ordinal()];
                if (i2 == 2) {
                    oooO00o.OooO0OO(OooO00o.OooOO0.CONFIGURED);
                    oooO00o.OooO0o0();
                    break;
                } else if (i2 == 3) {
                    o00O0O0.OooO0oo("AudioSource", "AudioSource is released. Calling stop() is a no-op.");
                    break;
                }
                break;
            default:
                int i3 = YLTimeBar.f22549Oooo0O0;
                ((YLTimeBar) obj).OooO0o(false);
                break;
        }
    }
}
