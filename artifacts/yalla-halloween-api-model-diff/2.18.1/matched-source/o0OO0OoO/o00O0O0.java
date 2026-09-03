package o0OO0OoO;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzid;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f37652Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f37653Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f37654Oooo0oo;

    public /* synthetic */ o00O0O0(Object obj, Object obj2, int i) {
        this.f37652Oooo0o = i;
        this.f37654Oooo0oo = obj;
        this.f37653Oooo0oO = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37652Oooo0o) {
            case 0:
                ((zzid) this.f37654Oooo0oo).OooOO0o((Boolean) this.f37653Oooo0oO, true);
                return;
            default:
                synchronized (((o0OO0o00.Oooo0) this.f37654Oooo0oo).f37944OooO0o0) {
                    OnFailureListener onFailureListener = ((o0OO0o00.Oooo0) this.f37654Oooo0oo).f37943OooO0o;
                    if (onFailureListener != null) {
                        onFailureListener.onFailure((Exception) Preconditions.checkNotNull(((Task) this.f37653Oooo0oO).getException()));
                    }
                    break;
                }
                return;
        }
    }
}
