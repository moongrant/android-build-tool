package p532o0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 implements o00000O0<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile Object f54556OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00000O0 f54557OooO0O0;

    public o00000(o00000O0 o00000o1) {
        this.f54557OooO0O0 = o00000o1;
    }

    @Override // p532o0o0Oo.o00000O0
    public final Object get() {
        if (this.f54556OooO00o == null) {
            synchronized (this) {
                if (this.f54556OooO00o == null) {
                    Object obj = this.f54557OooO0O0.get();
                    o0000O00.OooO0O0(obj);
                    this.f54556OooO00o = obj;
                }
            }
        }
        return this.f54556OooO00o;
    }
}
