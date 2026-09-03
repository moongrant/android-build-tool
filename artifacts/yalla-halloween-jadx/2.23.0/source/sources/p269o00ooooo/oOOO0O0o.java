package p269o00ooooo;

import com.google.android.gms.measurement.internal.zzlh;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oOOO0O0o extends oOOO00o0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f41478OooO0OO;

    public oOOO0O0o(zzlh zzlhVar) {
        super(zzlhVar);
        this.f41477OooO0O0.f16097OooOOo0++;
    }

    public final void OooO00o() {
        if (!this.f41478OooO0OO) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public abstract void OooO0O0();

    public final void zzX() {
        if (this.f41478OooO0OO) {
            throw new IllegalStateException("Can't initialize twice");
        }
        OooO0O0();
        this.f41477OooO0O0.f16096OooOOo++;
        this.f41478OooO0OO = true;
    }
}
