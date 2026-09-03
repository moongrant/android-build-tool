package o0O0000O;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f40953OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("mLock")
    public ArrayDeque f40954OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("mLock")
    public boolean f40955OooO0OO;

    public final void OooO00o(@NonNull o00oO0o o00oo0o2) {
        synchronized (this.f40953OooO00o) {
            if (this.f40954OooO0O0 == null) {
                this.f40954OooO0O0 = new ArrayDeque();
            }
            this.f40954OooO0O0.add(o00oo0o2);
        }
    }

    public final void OooO0O0(@NonNull Task task) {
        o00oO0o o00oo0o2;
        synchronized (this.f40953OooO00o) {
            if (this.f40954OooO0O0 != null && !this.f40955OooO0OO) {
                this.f40955OooO0OO = true;
                while (true) {
                    synchronized (this.f40953OooO00o) {
                        o00oo0o2 = (o00oO0o) this.f40954OooO0O0.poll();
                        if (o00oo0o2 == null) {
                            this.f40955OooO0OO = false;
                            return;
                        }
                    }
                    o00oo0o2.OooO00o(task);
                }
            }
        }
    }
}
