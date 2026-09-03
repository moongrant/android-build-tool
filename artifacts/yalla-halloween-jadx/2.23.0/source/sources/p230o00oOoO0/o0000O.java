package p230o00oOoO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O extends o000O00O {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o0000OO0 f40110OooO0oo;

    public o0000O(o0000OO0 o0000oo1) {
        this.f40110OooO0oo = o0000oo1;
    }

    @Override // p206o00o0oOO.o0O00000
    public final void OooO0oo() {
        o0000OO0 o0000oo1 = this.f40110OooO0oo;
        synchronized (o0000oo1.f39414OooO0O0) {
            boolean z = false;
            this.f39410OooO0Oo = 0;
            this.f40117OooO0o = null;
            int i = o0000oo1.f39420OooO0oo;
            o0000oo1.f39420OooO0oo = i + 1;
            o0000oo1.f39417OooO0o[i] = this;
            if (!o0000oo1.f39415OooO0OO.isEmpty() && o0000oo1.f39420OooO0oo > 0) {
                z = true;
            }
            if (z) {
                o0000oo1.f39414OooO0O0.notify();
            }
        }
    }
}
