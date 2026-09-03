package p269o00ooooo;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzga;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0Oo extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f41396OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f41397OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f41398OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ zzga f41399OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo(zzga zzgaVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.f41399OooO0oO = zzgaVar;
        Preconditions.checkNotNull(str);
        long andIncrement = zzga.f15978OooOO0O.getAndIncrement();
        this.f41396OooO0Oo = andIncrement;
        this.f41397OooO0o = str;
        this.f41398OooO0o0 = z;
        if (andIncrement == LongCompanionObject.MAX_VALUE) {
            o0O0OO0.OooO00o(zzgaVar.f41276OooO00o, "Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj) {
        oO0Oo oo0oo = (oO0Oo) obj;
        boolean z = oo0oo.f41398OooO0o0;
        boolean z2 = this.f41398OooO0o0;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = oo0oo.f41396OooO0Oo;
        long j2 = this.f41396OooO0Oo;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        this.f41399OooO0oO.f41276OooO00o.zzaA().zzh().zzb("Two tasks share the same index. index", Long.valueOf(j2));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.f41399OooO0oO.f41276OooO00o.zzaA().zzd().zzb(this.f41397OooO0o, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo(zzga zzgaVar, Callable callable, boolean z) {
        super(callable);
        this.f41399OooO0oO = zzgaVar;
        Preconditions.checkNotNull("Task exception on worker thread");
        long andIncrement = zzga.f15978OooOO0O.getAndIncrement();
        this.f41396OooO0Oo = andIncrement;
        this.f41397OooO0o = "Task exception on worker thread";
        this.f41398OooO0o0 = z;
        if (andIncrement == LongCompanionObject.MAX_VALUE) {
            o0O0OO0.OooO00o(zzgaVar.f41276OooO00o, "Tasks index overflow");
        }
    }
}
