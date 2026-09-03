package o0O0000O;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO<T> implements OnSuccessListener, OnFailureListener, OnCanceledListener {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @GuardedBy("mLock")
    public int f40899OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f40900OooO0Oo = new Object();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0O0O00 f40901OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f40902OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("mLock")
    public int f40903OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @GuardedBy("mLock")
    public int f40904OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @GuardedBy("mLock")
    public Exception f40905OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("mLock")
    public boolean f40906OooOO0O;

    public OooO(int i, o0O0O00 o0o0o00) {
        this.f40902OooO0o0 = i;
        this.f40901OooO0o = o0o0o00;
    }

    @GuardedBy("mLock")
    public final void OooO00o() {
        int i = this.f40903OooO0oO + this.f40904OooO0oo + this.f40899OooO;
        int i2 = this.f40902OooO0o0;
        if (i == i2) {
            Exception exc = this.f40905OooOO0;
            o0O0O00 o0o0o00 = this.f40901OooO0o;
            if (exc == null) {
                if (this.f40906OooOO0O) {
                    o0o0o00.OooO0OO();
                    return;
                } else {
                    o0o0o00.OooO0O0(null);
                    return;
                }
            }
            o0o0o00.OooO00o(new ExecutionException(this.f40904OooO0oo + " out of " + i2 + " underlying tasks failed", this.f40905OooOO0));
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        synchronized (this.f40900OooO0Oo) {
            this.f40899OooO++;
            this.f40906OooOO0O = true;
            OooO00o();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc) {
        synchronized (this.f40900OooO0Oo) {
            this.f40904OooO0oo++;
            this.f40905OooOO0 = exc;
            OooO00o();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t) {
        synchronized (this.f40900OooO0Oo) {
            this.f40903OooO0oO++;
            OooO00o();
        }
    }
}
