package o0O0OOO0;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p637o0ooOO0.o00oOoo;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"RestrictedApi"})
public final class o000oOoO<V> extends o00oOoo<V> implements ScheduledFuture<V> {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ScheduledFuture<?> f42064OooOO0O;

    public class OooO00o implements OooO0O0<V> {
        public OooO00o() {
        }
    }

    public interface OooO0O0<T> {
    }

    public interface OooO0OO<T> {
        ScheduledFuture OooO00o(OooO00o oooO00o);
    }

    public o000oOoO(OooO0OO<V> oooO0OO) {
        this.f42064OooOO0O = oooO0OO.OooO00o(new OooO00o());
    }

    @Override // p637o0ooOO0.o00oOoo
    public final void OooO0O0() {
        ScheduledFuture<?> scheduledFuture = this.f42064OooOO0O;
        Object obj = this.f57409OooO0Oo;
        scheduledFuture.cancel((obj instanceof o00oOoo.OooO0O0) && ((o00oOoo.OooO0O0) obj).f57419OooO00o);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f42064OooOO0O.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f42064OooOO0O.getDelay(timeUnit);
    }
}
