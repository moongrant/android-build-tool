package o0O0OOOo;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p639o0ooOO0.o000O0o;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"RestrictedApi"})
public final class OooOo00<V> extends o000O0o<V> implements ScheduledFuture<V> {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ScheduledFuture<?> f41412OooOO0O;

    public class OooO00o implements OooO0O0<V> {
        public OooO00o() {
        }
    }

    public interface OooO0O0<T> {
    }

    public interface OooO0OO<T> {
        ScheduledFuture OooO00o(OooO00o oooO00o);
    }

    public OooOo00(OooO0OO<V> oooO0OO) {
        this.f41412OooOO0O = oooO0OO.OooO00o(new OooO00o());
    }

    @Override // p639o0ooOO0.o000O0o
    public final void OooO0O0() {
        ScheduledFuture<?> scheduledFuture = this.f41412OooOO0O;
        Object obj = this.f57716OooO0Oo;
        scheduledFuture.cancel((obj instanceof o000O0o.OooO0O0) && ((o000O0o.OooO0O0) obj).f57726OooO00o);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f41412OooOO0O.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f41412OooOO0O.getDelay(timeUnit);
    }
}
