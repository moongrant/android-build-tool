package p271o00ooooo;

import com.google.android.gms.measurement.internal.zzab;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo00OO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oOO00000 f40786OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oO00O0oO f40787OooO0o0;

    public oOo00OO0(oO00O0oO oo00o0oo, oOO00000 ooo00000) {
        this.f40787OooO0o0 = oo00o0oo;
        this.f40786OooO0Oo = ooo00000;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40786OooO0Oo.zzay();
        if (zzab.zza()) {
            this.f40786OooO0Oo.zzaB().zzp(this);
            return;
        }
        boolean z = this.f40787OooO0o0.f40558OooO0OO != 0;
        this.f40787OooO0o0.f40558OooO0OO = 0L;
        if (z) {
            this.f40787OooO0o0.OooO0O0();
        }
    }
}
