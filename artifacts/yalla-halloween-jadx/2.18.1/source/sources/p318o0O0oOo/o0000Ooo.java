package p318o0O0oOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f36704OooO00o;

    public final synchronized boolean OooO00o() {
        boolean z;
        z = this.f36704OooO00o;
        this.f36704OooO00o = false;
        return z;
    }

    public final synchronized boolean OooO0O0() {
        if (this.f36704OooO00o) {
            return false;
        }
        this.f36704OooO00o = true;
        notifyAll();
        return true;
    }
}
