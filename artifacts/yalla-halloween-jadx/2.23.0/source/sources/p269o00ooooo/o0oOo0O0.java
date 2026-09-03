package p269o00ooooo;

import com.google.android.gms.measurement.internal.zzab;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oOo0O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO000o00 f41240OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0oo00 f41241OooO0o0;

    public o0oOo0O0(o0O0oo00 o0o0oo00, oO000o00 oo000o00) {
        this.f41241OooO0o0 = o0o0oo00;
        this.f41240OooO0Oo = oo000o00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41240OooO0Oo.zzay();
        if (zzab.zza()) {
            this.f41240OooO0Oo.zzaB().zzp(this);
            return;
        }
        boolean z = this.f41241OooO0o0.f41180OooO0OO != 0;
        this.f41241OooO0o0.f41180OooO0OO = 0L;
        if (z) {
            this.f41241OooO0o0.OooO0O0();
        }
    }
}
