package o000O00O;

import androidx.media3.exoplayer.AudioFocusManager;
import com.yalla.yalla.ui.view.SwitchView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOo00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f33967OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f33968OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f33969OooO0o0;

    public /* synthetic */ OooOo00(Object obj, int i, int i2) {
        this.f33967OooO0Oo = i2;
        this.f33968OooO0o = obj;
        this.f33969OooO0o0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f33967OooO0Oo;
        int i2 = this.f33969OooO0o0;
        Object obj = this.f33968OooO0o;
        switch (i) {
            case 0:
                AudioFocusManager audioFocusManager = ((AudioFocusManager.OooO00o) obj).f7104OooO0o0;
                audioFocusManager.getClass();
                if (i2 == -3 || i2 == -2) {
                    if (i2 != -2) {
                        androidx.media3.common.OooO00o oooO00o = audioFocusManager.f7098OooO0Oo;
                        if (!(oooO00o != null && oooO00o.f6354OooO0Oo == 1)) {
                            audioFocusManager.OooO0Oo(3);
                        }
                    }
                    audioFocusManager.OooO0O0(0);
                    audioFocusManager.OooO0Oo(2);
                } else if (i2 == -1) {
                    audioFocusManager.OooO0O0(-1);
                    audioFocusManager.OooO00o();
                } else if (i2 == 1) {
                    audioFocusManager.OooO0Oo(1);
                    audioFocusManager.OooO0O0(1);
                } else {
                    com.facebook.appevents.OooOOO.OooO00o("Unknown focus change type: ", i2, "AudioFocusManager");
                }
                break;
            default:
                SwitchView.OooO0OO((SwitchView) obj, i2);
                break;
        }
    }
}
