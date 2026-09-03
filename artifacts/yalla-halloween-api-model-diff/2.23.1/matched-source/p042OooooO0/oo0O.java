package p042OooooO0;

import android.media.AudioManager;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.audio.OooO0o;
import p591o0oOooo.oOOo0000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1802OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1803OooO0o0;

    public /* synthetic */ oo0O(Object obj, int i) {
        this.f1802OooO0Oo = i;
        this.f1803OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1802OooO0Oo;
        Object obj = this.f1803OooO0o0;
        switch (i) {
            case 0:
                OooO0o oooO0o = (OooO0o) obj;
                oooO0o.getClass();
                try {
                    oooO0o.f4091OooO0oO.start();
                    if (oooO0o.f4094OooOO0O.getAndSet(true)) {
                        return;
                    }
                    oooO0o.OooO0OO();
                    return;
                } catch (AudioStream.AudioStreamException e) {
                    throw new RuntimeException(e);
                }
            default:
                oOOo0000 oooo0000 = (oOOo0000) obj;
                AudioManager audioManager = oooo0000.f56883OooO00o;
                if (audioManager == null) {
                    return;
                }
                audioManager.setMode(3);
                oooo0000.f56883OooO00o.startBluetoothSco();
                oooo0000.f56883OooO00o.setBluetoothScoOn(true);
                oooo0000.f56883OooO00o.setSpeakerphoneOn(false);
                return;
        }
    }
}
