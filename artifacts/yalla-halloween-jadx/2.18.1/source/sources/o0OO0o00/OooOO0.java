package o0OO0o00;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @GuardedBy("mLock")
    public int f37921OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f37922OooO0Oo = new Object();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0OO00O<Void> f37923OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f37924OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("mLock")
    public int f37925OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @GuardedBy("mLock")
    public int f37926OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @GuardedBy("mLock")
    public Exception f37927OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("mLock")
    public boolean f37928OooOO0O;

    public OooOO0(int i, o0OO00O<Void> o0oo00o2) {
        this.f37924OooO0o0 = i;
        this.f37923OooO0o = o0oo00o2;
    }

    @GuardedBy("mLock")
    public final void OooO00o() {
        if (this.f37925OooO0oO + this.f37926OooO0oo + this.f37921OooO == this.f37924OooO0o0) {
            if (this.f37927OooOO0 == null) {
                if (this.f37928OooOO0O) {
                    this.f37923OooO0o.OooO0OO();
                    return;
                } else {
                    this.f37923OooO0o.OooO0O0(null);
                    return;
                }
            }
            o0OO00O<Void> o0oo00o2 = this.f37923OooO0o;
            int i = this.f37926OooO0oo;
            int i2 = this.f37924OooO0o0;
            StringBuilder sb = new StringBuilder(54);
            sb.append(i);
            sb.append(" out of ");
            sb.append(i2);
            sb.append(" underlying tasks failed");
            o0oo00o2.OooO00o(new ExecutionException(sb.toString(), this.f37927OooOO0));
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        synchronized (this.f37922OooO0Oo) {
            this.f37921OooO++;
            this.f37928OooOO0O = true;
            OooO00o();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc) {
        synchronized (this.f37922OooO0Oo) {
            this.f37926OooO0oo++;
            this.f37927OooOO0 = exc;
            OooO00o();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        synchronized (this.f37922OooO0Oo) {
            this.f37925OooO0oO++;
            OooO00o();
        }
    }
}
