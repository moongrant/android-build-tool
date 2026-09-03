package p330o0O0ooo0;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o000OO00 extends o000O0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final WeakReference f37058OooO0OO = new WeakReference(null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public WeakReference f37059OooO0O0;

    public o000OO00(byte[] bArr) {
        super(bArr);
        this.f37059OooO0O0 = f37058OooO0OO;
    }

    @Override // p330o0O0ooo0.o000O0O0
    public final byte[] OooOOo() {
        byte[] bArrOooOOoo;
        synchronized (this) {
            bArrOooOOoo = (byte[]) this.f37059OooO0O0.get();
            if (bArrOooOOoo == null) {
                bArrOooOOoo = OooOOoo();
                this.f37059OooO0O0 = new WeakReference(bArrOooOOoo);
            }
        }
        return bArrOooOOoo;
    }

    public abstract byte[] OooOOoo();
}
