package p271o00ooooo;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzby;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oO00O0oO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static volatile zzby f40555OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oOO00000 f40556OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oOo00OO0 f40557OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile long f40558OooO0OO;

    public oO00O0oO(oOO00000 ooo00000) {
        Preconditions.checkNotNull(ooo00000);
        this.f40556OooO00o = ooo00000;
        this.f40557OooO0O0 = new oOo00OO0(this, ooo00000);
    }

    public final void OooO00o() {
        this.f40558OooO0OO = 0L;
        OooO0Oo().removeCallbacks(this.f40557OooO0O0);
    }

    public abstract void OooO0O0();

    public final void OooO0OO(long j) {
        OooO00o();
        if (j >= 0) {
            this.f40558OooO0OO = this.f40556OooO00o.zzax().currentTimeMillis();
            if (OooO0Oo().postDelayed(this.f40557OooO0O0, j)) {
                return;
            }
            this.f40556OooO00o.zzaA().zzd().zzb("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final Handler OooO0Oo() {
        zzby zzbyVar;
        if (f40555OooO0Oo != null) {
            return f40555OooO0Oo;
        }
        synchronized (oO00O0oO.class) {
            if (f40555OooO0Oo == null) {
                f40555OooO0Oo = new zzby(this.f40556OooO00o.zzaw().getMainLooper());
            }
            zzbyVar = f40555OooO0Oo;
        }
        return zzbyVar;
    }
}
