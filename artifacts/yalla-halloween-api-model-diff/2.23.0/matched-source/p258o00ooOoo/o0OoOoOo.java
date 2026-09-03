package p258o00ooOoo;

import android.os.Process;
import com.google.android.gms.measurement.internal.zziz;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOoOo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f41047OooO0Oo = 1;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f41048OooO0o0;

    public o0OoOoOo(zziz zzizVar) {
        this.f41048OooO0o0 = zzizVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f41047OooO0Oo;
        Object obj = this.f41048OooO0o0;
        switch (i) {
            case 0:
                Process.setThreadPriority(0);
                ((Runnable) obj).run();
                break;
            default:
                ((zziz) obj).f16056OooOO0 = null;
                break;
        }
    }

    public o0OoOoOo(Runnable runnable) {
        this.f41048OooO0o0 = runnable;
    }
}
