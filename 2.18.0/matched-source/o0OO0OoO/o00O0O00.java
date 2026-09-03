package o0OO0OoO;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzid;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O00 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f37685Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f37686OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f37687OoooO00;

    public /* synthetic */ o00O0O00(Object obj, Object obj2, int i) {
        this.f37685Oooo = i;
        this.f37686OoooO0 = obj;
        this.f37687OoooO00 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37685Oooo) {
            case 0:
                ((zzid) this.f37686OoooO0).OooOO0o((Boolean) this.f37687OoooO00, true);
                return;
            default:
                synchronized (((o0OO0o00.Oooo0) this.f37686OoooO0).f37964OoooO00) {
                    OnFailureListener onFailureListener = ((o0OO0o00.Oooo0) this.f37686OoooO0).f37963OoooO0;
                    if (onFailureListener != null) {
                        onFailureListener.onFailure((Exception) Preconditions.checkNotNull(((Task) this.f37687OoooO00).getException()));
                    }
                    break;
                }
                return;
        }
    }
}
