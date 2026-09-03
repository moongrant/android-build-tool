package p063o0000oO;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f34296OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO00o f34297OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f34298OooO0OO;

    public interface OooO00o {
        void onCancel();
    }

    public final void OooO00o(@Nullable OooO00o oooO00o) {
        synchronized (this) {
            while (this.f34298OooO0OO) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f34297OooO0O0 == oooO00o) {
                return;
            }
            this.f34297OooO0O0 = oooO00o;
            if (this.f34296OooO00o) {
                oooO00o.onCancel();
            }
        }
    }
}
