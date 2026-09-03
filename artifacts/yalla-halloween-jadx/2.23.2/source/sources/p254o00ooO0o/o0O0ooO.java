package p254o00ooO0o;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0O0ooO extends o00 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final WeakReference f40259OooO0o = new WeakReference(null);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public WeakReference f40260OooO0o0;

    public o0O0ooO(byte[] bArr) {
        super(bArr);
        this.f40260OooO0o0 = f40259OooO0o;
    }

    @Override // p254o00ooO0o.o00
    public final byte[] OooOo0() {
        byte[] bArrOooOo0O;
        synchronized (this) {
            bArrOooOo0O = (byte[]) this.f40260OooO0o0.get();
            if (bArrOooOo0O == null) {
                bArrOooOo0O = OooOo0O();
                this.f40260OooO0o0 = new WeakReference(bArrOooOo0O);
            }
        }
        return bArrOooOo0O;
    }

    public abstract byte[] OooOo0O();
}
