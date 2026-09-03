package p080o000OoO;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f35000OooO00o;

    public oo0o0Oo() {
    }

    public final synchronized void OooO00o() throws InterruptedException {
        while (!this.f35000OooO00o) {
            wait();
        }
    }

    public final synchronized void OooO0O0() {
        this.f35000OooO00o = false;
    }

    public final synchronized boolean OooO0OO() {
        return this.f35000OooO00o;
    }

    public final synchronized boolean OooO0Oo() {
        if (this.f35000OooO00o) {
            return false;
        }
        this.f35000OooO00o = true;
        notifyAll();
        return true;
    }

    public oo0o0Oo(int i) {
    }
}
