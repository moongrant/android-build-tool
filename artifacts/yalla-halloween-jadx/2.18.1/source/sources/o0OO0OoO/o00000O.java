package o0OO0OoO;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfv;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ zzfv f37539Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final long f37540Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final boolean f37541Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final String f37542Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(zzfv zzfvVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.f37539Oooo = zzfvVar;
        Preconditions.checkNotNull(str);
        long andIncrement = zzfv.f16182OooOO0O.getAndIncrement();
        this.f37540Oooo0o = andIncrement;
        this.f37542Oooo0oo = str;
        this.f37541Oooo0oO = z;
        if (andIncrement == Long.MAX_VALUE) {
            p167o00Ooo.OooOO0.OooO0O0(zzfvVar.f37615OooO00o, "Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj) {
        o00000O o00000o = (o00000O) obj;
        boolean z = this.f37541Oooo0oO;
        if (z != o00000o.f37541Oooo0oO) {
            return !z ? 1 : -1;
        }
        long j = this.f37540Oooo0o;
        long j2 = o00000o.f37540Oooo0o;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.f37539Oooo.f37615OooO00o.zzay().zzh().zzb("Two tasks share the same index. index", Long.valueOf(this.f37540Oooo0o));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.f37539Oooo.f37615OooO00o.zzay().zzd().zzb(this.f37542Oooo0oo, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(zzfv zzfvVar, Callable callable, boolean z) {
        super(callable);
        this.f37539Oooo = zzfvVar;
        Preconditions.checkNotNull("Task exception on worker thread");
        long andIncrement = zzfv.f16182OooOO0O.getAndIncrement();
        this.f37540Oooo0o = andIncrement;
        this.f37542Oooo0oo = "Task exception on worker thread";
        this.f37541Oooo0oO = z;
        if (andIncrement == Long.MAX_VALUE) {
            p167o00Ooo.OooOO0.OooO0O0(zzfvVar.f37615OooO00o, "Tasks index overflow");
        }
    }
}
