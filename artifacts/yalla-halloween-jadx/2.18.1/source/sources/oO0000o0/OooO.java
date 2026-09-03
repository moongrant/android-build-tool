package oO0000o0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO0o f52416OooO00o;

    public abstract OooO0o OooO00o();

    public final synchronized OooO0o OooO0O0() {
        if (this.f52416OooO00o == null) {
            this.f52416OooO00o = OooO00o();
        }
        return this.f52416OooO00o;
    }
}
