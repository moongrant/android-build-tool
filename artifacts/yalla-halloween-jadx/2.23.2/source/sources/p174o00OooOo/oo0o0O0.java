package p174o00OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0O0 implements o00O0OO<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile Object f38355OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00O0OO f38356OooO0O0;

    public oo0o0O0(o00O0OO o00o0oo2) {
        this.f38356OooO0O0 = o00o0oo2;
    }

    @Override // p174o00OooOo.o00O0OO
    public final Object get() {
        if (this.f38355OooO00o == null) {
            synchronized (this) {
                if (this.f38355OooO00o == null) {
                    Object obj = this.f38356OooO0O0.get();
                    o00OO00O.OooO0O0(obj);
                    this.f38355OooO00o = obj;
                }
            }
        }
        return this.f38355OooO00o;
    }
}
