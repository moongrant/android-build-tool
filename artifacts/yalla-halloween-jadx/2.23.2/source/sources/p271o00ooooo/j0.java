package p271o00ooooo;

import com.google.android.gms.measurement.internal.zzlh;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j0 extends i0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f40512OooO0OO;

    public j0(zzlh zzlhVar) {
        super(zzlhVar);
        this.f40509OooO0O0.f15621OooOOo0++;
    }

    public final void OooO00o() {
        if (!this.f40512OooO0OO) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public abstract void OooO0O0();

    public final void zzX() {
        if (this.f40512OooO0OO) {
            throw new IllegalStateException("Can't initialize twice");
        }
        OooO0O0();
        this.f40509OooO0O0.f15620OooOOo++;
        this.f40512OooO0OO = true;
    }
}
