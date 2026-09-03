package o0O0000O;

import com.google.android.gms.tasks.OnCanceledListener;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOo f41616OooO0Oo;

    public OooOo00(OooOo oooOo) {
        this.f41616OooO0Oo = oooOo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f41616OooO0Oo.f41615OooO0o0) {
            OnCanceledListener onCanceledListener = this.f41616OooO0Oo.f41614OooO0o;
            if (onCanceledListener != null) {
                onCanceledListener.onCanceled();
            }
        }
    }
}
