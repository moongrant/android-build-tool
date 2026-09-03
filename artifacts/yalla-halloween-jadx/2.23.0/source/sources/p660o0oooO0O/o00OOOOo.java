package p660o0oooO0O;

/* JADX INFO: loaded from: classes5.dex */
public final class o00OOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o00OOOO0 f60293OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o00OOOO0 f60294OooO0O0;

    public final synchronized void OooO00o(o00OOOO0 o00oooo1) {
        o00OOOO0 o00oooo2 = this.f60294OooO0O0;
        if (o00oooo2 != null) {
            o00oooo2.f60292OooO0OO = o00oooo1;
            this.f60294OooO0O0 = o00oooo1;
        } else {
            if (this.f60293OooO00o != null) {
                throw new IllegalStateException("Head present, but no tail");
            }
            this.f60294OooO0O0 = o00oooo1;
            this.f60293OooO00o = o00oooo1;
        }
        notifyAll();
    }

    public final synchronized o00OOOO0 OooO0O0() {
        o00OOOO0 o00oooo1;
        o00oooo1 = this.f60293OooO00o;
        if (o00oooo1 != null) {
            o00OOOO0 o00oooo2 = o00oooo1.f60292OooO0OO;
            this.f60293OooO00o = o00oooo2;
            if (o00oooo2 == null) {
                this.f60294OooO0O0 = null;
            }
        }
        return o00oooo1;
    }

    public final synchronized o00OOOO0 OooO0OO() throws InterruptedException {
        if (this.f60293OooO00o == null) {
            wait(1000);
        }
        return OooO0O0();
    }
}
