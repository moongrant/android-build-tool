package p042OooooO0;

import androidx.camera.video.OooOO0O;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.audio.OooO00o;
import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO00o.OooO0o f1777OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Throwable f1778OooO0o0;

    public /* synthetic */ o00O0(OooO00o.OooO0o oooO0o, Throwable th) {
        this.f1777OooO0Oo = oooO0o;
        this.f1778OooO0o0 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OooOO0O.OooO0OO oooO0OO = (OooOO0O.OooO0OO) this.f1777OooO0Oo;
        oooO0OO.getClass();
        Throwable th = this.f1778OooO0o0;
        o00O0O0.OooO0OO("Recorder", "Error occurred after audio source started.", th);
        if (th instanceof AudioSourceAccessException) {
            oooO0OO.f3976OooO00o.accept(th);
        }
    }
}
