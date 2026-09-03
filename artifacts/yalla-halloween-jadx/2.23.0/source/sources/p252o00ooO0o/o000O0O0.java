package p252o00ooO0o;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o000O0O0 extends o000O0Oo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final WeakReference f40921OooO0o = new WeakReference(null);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public WeakReference f40922OooO0o0;

    public o000O0O0(byte[] bArr) {
        super(bArr);
        this.f40922OooO0o0 = f40921OooO0o;
    }

    public abstract byte[] OooOo0();

    @Override // p252o00ooO0o.o000O0Oo
    public final byte[] OooOo00() {
        byte[] bArrOooOo0;
        synchronized (this) {
            bArrOooOo0 = (byte[]) this.f40922OooO0o0.get();
            if (bArrOooOo0 == null) {
                bArrOooOo0 = OooOo0();
                this.f40922OooO0o0 = new WeakReference(bArrOooOo0);
            }
        }
        return bArrOooOo0;
    }
}
