package o0OO0o00;

import com.google.android.gms.tasks.OnCanceledListener;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOo f37941Oooo0o;

    public OooOo00(OooOo oooOo) {
        this.f37941Oooo0o = oooOo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f37941Oooo0o.f37940OooO0o0) {
            OnCanceledListener onCanceledListener = this.f37941Oooo0o.f37939OooO0o;
            if (onCanceledListener != null) {
                onCanceledListener.onCanceled();
            }
        }
    }
}
