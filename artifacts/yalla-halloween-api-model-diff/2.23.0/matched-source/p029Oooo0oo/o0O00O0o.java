package p029Oooo0oo;

import android.media.AudioManager;
import androidx.camera.core.OooOo00;
import com.google.android.material.textfield.OooOO0O;
import p588o0oOooo0.oOOoOOO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O00O0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1255OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1256OooO0o0;

    public /* synthetic */ o0O00O0o(Object obj, int i) {
        this.f1255OooO0Oo = i;
        this.f1256OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1255OooO0Oo;
        Object obj = this.f1256OooO0o0;
        switch (i) {
            case 0:
                ((OooOo00) obj).OooO00o();
                break;
            case 1:
                ((OooOO0O) obj).OooOo00(true);
                break;
            default:
                oOOoOOO0 ooooooo0 = (oOOoOOO0) obj;
                AudioManager audioManager = ooooooo0.f56787OooO00o;
                if (audioManager != null) {
                    audioManager.setMode(3);
                    ooooooo0.f56787OooO00o.startBluetoothSco();
                    ooooooo0.f56787OooO00o.setBluetoothScoOn(true);
                    ooooooo0.f56787OooO00o.setSpeakerphoneOn(false);
                    break;
                }
                break;
        }
    }
}
