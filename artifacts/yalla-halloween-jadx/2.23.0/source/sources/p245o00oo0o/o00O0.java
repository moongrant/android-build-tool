package p245o00oo0o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f40556OooO00o;

    public o00O0() {
    }

    public final synchronized void OooO00o() {
        this.f40556OooO00o = false;
    }

    public final synchronized boolean OooO0O0() {
        if (this.f40556OooO00o) {
            return false;
        }
        this.f40556OooO00o = true;
        notifyAll();
        return true;
    }

    public o00O0(int i) {
    }
}
