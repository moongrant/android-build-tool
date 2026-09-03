package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzkz;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oo0OOoo extends o0O0OOOo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f37899OooO0OO;

    public oo0OOoo(zzkz zzkzVar) {
        super(zzkzVar);
        this.f37794OooO0O0.f16300OooOOo0++;
    }

    public final void OooO00o() {
        if (!this.f37899OooO0OO) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public abstract void OooO0O0();

    public final void zzX() {
        if (this.f37899OooO0OO) {
            throw new IllegalStateException("Can't initialize twice");
        }
        OooO0O0();
        this.f37794OooO0O0.f16299OooOOo++;
        this.f37899OooO0OO = true;
    }
}
