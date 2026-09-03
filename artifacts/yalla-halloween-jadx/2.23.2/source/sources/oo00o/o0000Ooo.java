package oo00o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000Ooo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ com.google.common.util.concurrent.OooOO0O f60257OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0000O00 f60258OooO0o0;

    public o0000Ooo(o0000O00 o0000o00, p117o00O0OOo.o00000O o00000o) {
        this.f60258OooO0o0 = o0000o00;
        this.f60257OooO0Oo = o00000o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f60258OooO0o0.f60246OooOOoo.f36334OooO0Oo instanceof o00O0OOo.o00000.OooO0O0) {
            return;
        }
        try {
            this.f60257OooO0Oo.get();
            p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(o0000O00.f60230OooOo0, "Starting work for " + this.f60258OooO0o0.f60235OooO0oO.f36218OooO0OO);
            o0000O00 o0000o00 = this.f60258OooO0o0;
            o0000o00.f60246OooOOoo.OooOO0O(o0000o00.f60236OooO0oo.OooO0Oo());
        } catch (Throwable th) {
            this.f60258OooO0o0.f60246OooOOoo.OooOO0(th);
        }
    }
}
