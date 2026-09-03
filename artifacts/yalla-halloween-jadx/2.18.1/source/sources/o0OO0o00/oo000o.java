package o0OO0o00;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o<TResult> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f37967OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("mLock")
    public Queue<o00Ooo<TResult>> f37968OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("mLock")
    public boolean f37969OooO0OO;

    public final void OooO00o(@NonNull o00Ooo<TResult> o00ooo2) {
        synchronized (this.f37967OooO00o) {
            if (this.f37968OooO0O0 == null) {
                this.f37968OooO0O0 = new ArrayDeque();
            }
            this.f37968OooO0O0.add(o00ooo2);
        }
    }

    public final void OooO0O0(@NonNull Task<TResult> task) {
        o00Ooo o00ooo2;
        synchronized (this.f37967OooO00o) {
            if (this.f37968OooO0O0 != null && !this.f37969OooO0OO) {
                this.f37969OooO0OO = true;
                while (true) {
                    synchronized (this.f37967OooO00o) {
                        o00ooo2 = (o00Ooo) this.f37968OooO0O0.poll();
                        if (o00ooo2 == null) {
                            this.f37969OooO0OO = false;
                            return;
                        }
                    }
                    o00ooo2.OooO00o(task);
                }
            }
        }
    }
}
