package p269o00ooooo;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzby;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0O0oo00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static volatile zzby f41177OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO000o00 f41178OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0oOo0O0 f41179OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile long f41180OooO0OO;

    public o0O0oo00(oO000o00 oo000o00) {
        Preconditions.checkNotNull(oo000o00);
        this.f41178OooO00o = oo000o00;
        this.f41179OooO0O0 = new o0oOo0O0(this, oo000o00);
    }

    public final void OooO00o() {
        this.f41180OooO0OO = 0L;
        OooO0Oo().removeCallbacks(this.f41179OooO0O0);
    }

    public abstract void OooO0O0();

    public final void OooO0OO(long j) {
        OooO00o();
        if (j >= 0) {
            this.f41180OooO0OO = this.f41178OooO00o.zzax().currentTimeMillis();
            if (OooO0Oo().postDelayed(this.f41179OooO0O0, j)) {
                return;
            }
            this.f41178OooO00o.zzaA().zzd().zzb("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final Handler OooO0Oo() {
        zzby zzbyVar;
        if (f41177OooO0Oo != null) {
            return f41177OooO0Oo;
        }
        synchronized (o0O0oo00.class) {
            if (f41177OooO0Oo == null) {
                f41177OooO0Oo = new zzby(this.f41178OooO00o.zzaw().getMainLooper());
            }
            zzbyVar = f41177OooO0Oo;
        }
        return zzbyVar;
    }
}
