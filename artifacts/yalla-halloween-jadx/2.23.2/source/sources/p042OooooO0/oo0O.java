package p042OooooO0;

import android.media.AudioManager;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.audio.OooO0o;
import p592o0oOoooo.c3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1799OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1800OooO0o0;

    public /* synthetic */ oo0O(Object obj, int i) {
        this.f1799OooO0Oo = i;
        this.f1800OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1799OooO0Oo;
        Object obj = this.f1800OooO0o0;
        switch (i) {
            case 0:
                OooO0o oooO0o = (OooO0o) obj;
                oooO0o.getClass();
                try {
                    oooO0o.f4088OooO0oO.start();
                    if (oooO0o.f4091OooOO0O.getAndSet(true)) {
                        return;
                    }
                    oooO0o.OooO0OO();
                    return;
                } catch (AudioStream.AudioStreamException e) {
                    throw new RuntimeException(e);
                }
            default:
                c3 c3Var = (c3) obj;
                AudioManager audioManager = c3Var.f57320OooO00o;
                if (audioManager == null) {
                    return;
                }
                audioManager.setMode(3);
                c3Var.f57320OooO00o.startBluetoothSco();
                c3Var.f57320OooO00o.setBluetoothScoOn(true);
                c3Var.f57320OooO00o.setSpeakerphoneOn(false);
                return;
        }
    }
}
