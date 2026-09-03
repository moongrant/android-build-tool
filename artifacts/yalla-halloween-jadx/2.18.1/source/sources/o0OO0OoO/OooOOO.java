package o0OO0OoO;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzby;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static volatile zzby f37497OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O0O0 f37498OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO0 f37499OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile long f37500OooO0OO;

    public OooOOO(o000O0O0 o000o0o1) {
        Preconditions.checkNotNull(o000o0o1);
        this.f37498OooO00o = o000o0o1;
        this.f37499OooO0O0 = new OooOOO0(this, o000o0o1);
    }

    public final void OooO00o() {
        this.f37500OooO0OO = 0L;
        OooO0Oo().removeCallbacks(this.f37499OooO0O0);
    }

    public abstract void OooO0O0();

    public final void OooO0OO(long j) {
        OooO00o();
        if (j >= 0) {
            this.f37500OooO0OO = this.f37498OooO00o.zzav().currentTimeMillis();
            if (OooO0Oo().postDelayed(this.f37499OooO0O0, j)) {
                return;
            }
            this.f37498OooO00o.zzay().zzd().zzb("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final Handler OooO0Oo() {
        zzby zzbyVar;
        if (f37497OooO0Oo != null) {
            return f37497OooO0Oo;
        }
        synchronized (OooOOO.class) {
            if (f37497OooO0Oo == null) {
                f37497OooO0Oo = new zzby(this.f37498OooO00o.zzau().getMainLooper());
            }
            zzbyVar = f37497OooO0Oo;
        }
        return zzbyVar;
    }
}
