package p028Oooo0oO;

import android.animation.AnimatorSet;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.audio.OooO0o;
import com.google.android.material.search.o00Ooo;
import com.google.android.material.search.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O0OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1148OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1149OooO0o0;

    public /* synthetic */ o00O0OO(Object obj, int i) {
        this.f1148OooO0Oo = i;
        this.f1149OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1148OooO0Oo;
        Object obj = this.f1149OooO0o0;
        switch (i) {
            case 1:
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
                o0OOO0o o0ooo0o2 = (o0OOO0o) obj;
                AnimatorSet animatorSetOooO0OO = o0ooo0o2.OooO0OO(true);
                animatorSetOooO0OO.addListener(new o00Ooo(o0ooo0o2));
                animatorSetOooO0OO.start();
                return;
        }
    }
}
