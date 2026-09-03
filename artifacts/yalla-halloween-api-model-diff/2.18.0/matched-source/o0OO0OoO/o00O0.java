package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzid;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f37653Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f37654OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f37655OoooO00;

    public /* synthetic */ o00O0(Object obj, Object obj2, int i) {
        this.f37653Oooo = i;
        this.f37654OoooO0 = obj;
        this.f37655OoooO00 = obj2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37653Oooo) {
            case 0:
                synchronized (((AtomicReference) this.f37655OoooO00)) {
                    try {
                        ((AtomicReference) this.f37655OoooO00).set(Double.valueOf(((zzid) this.f37654OoooO0).f37591OooO00o.zzf().zza(((zzid) this.f37654OoooO0).f37591OooO00o.zzh().zzl(), zzeb.zzN)));
                        ((AtomicReference) this.f37655OoooO00).notify();
                    } catch (Throwable th) {
                        ((AtomicReference) this.f37655OoooO00).notify();
                        throw th;
                    }
                }
                return;
            default:
                synchronized (((o0OO0o00.Oooo000) this.f37654OoooO0).f37967OoooO00) {
                    OnCompleteListener<TResult> onCompleteListener = ((o0OO0o00.Oooo000) this.f37654OoooO0).f37966OoooO0;
                    if (onCompleteListener != 0) {
                        onCompleteListener.onComplete((Task<TResult>) ((Task) this.f37655OoooO00));
                    }
                    break;
                }
                return;
        }
    }
}
