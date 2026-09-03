package p092o000o0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o extends o000000 {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f35204OooO0oo;

    public o0OOO0o(o0Oo0oo o0oo0oo2) {
        this.f35204OooO0oo = o0oo0oo2;
    }

    @Override // o000O00.OooOO0O
    public final void OooO0oo() {
        o0Oo0oo o0oo0oo2 = this.f35204OooO0oo;
        synchronized (o0oo0oo2.f33935OooO0O0) {
            boolean z = false;
            this.f33931OooO0Oo = 0;
            this.f35190OooO0o = null;
            int i = o0oo0oo2.f33941OooO0oo;
            o0oo0oo2.f33941OooO0oo = i + 1;
            o0oo0oo2.f33938OooO0o[i] = this;
            if (!o0oo0oo2.f33936OooO0OO.isEmpty() && o0oo0oo2.f33941OooO0oo > 0) {
                z = true;
            }
            if (z) {
                o0oo0oo2.f33935OooO0O0.notify();
            }
        }
    }
}
