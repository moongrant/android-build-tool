package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzfy;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o000OO0O extends o000O0Oo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f37620OooO0O0;

    public o000OO0O(zzfy zzfyVar) {
        super(zzfyVar);
        this.f37615OooO00o.f16222OooOooo++;
    }

    public void OooO00o() {
    }

    public abstract boolean OooO0O0();

    public final void OooO0OO() {
        if (!OooO0Oo()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final boolean OooO0Oo() {
        return this.f37620OooO0O0;
    }

    public final void zzv() {
        if (this.f37620OooO0O0) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (OooO0O0()) {
            return;
        }
        this.f37615OooO00o.OooO00o();
        this.f37620OooO0O0 = true;
    }

    public final void zzw() {
        if (this.f37620OooO0O0) {
            throw new IllegalStateException("Can't initialize twice");
        }
        OooO00o();
        this.f37615OooO00o.OooO00o();
        this.f37620OooO0O0 = true;
    }
}
