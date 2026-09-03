package p271o00ooooo;

import androidx.annotation.NonNull;
import androidx.media3.session.o00O00;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzga;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O00 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f40597OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f40598OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f40599OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ zzga f40600OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00(zzga zzgaVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.f40600OooO0oO = zzgaVar;
        Preconditions.checkNotNull(str);
        long andIncrement = zzga.f15502OooOO0O.getAndIncrement();
        this.f40597OooO0Oo = andIncrement;
        this.f40598OooO0o = str;
        this.f40599OooO0o0 = z;
        if (andIncrement == LongCompanionObject.MAX_VALUE) {
            o00O00.OooO00o(zzgaVar.f40788OooO00o, "Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj) {
        oO0O00 oo0o00 = (oO0O00) obj;
        boolean z = oo0o00.f40599OooO0o0;
        boolean z2 = this.f40599OooO0o0;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = oo0o00.f40597OooO0Oo;
        long j2 = this.f40597OooO0Oo;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        this.f40600OooO0oO.f40788OooO00o.zzaA().zzh().zzb("Two tasks share the same index. index", Long.valueOf(j2));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.f40600OooO0oO.f40788OooO00o.zzaA().zzd().zzb(this.f40598OooO0o, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00(zzga zzgaVar, Callable callable, boolean z) {
        super(callable);
        this.f40600OooO0oO = zzgaVar;
        Preconditions.checkNotNull("Task exception on worker thread");
        long andIncrement = zzga.f15502OooOO0O.getAndIncrement();
        this.f40597OooO0Oo = andIncrement;
        this.f40598OooO0o = "Task exception on worker thread";
        this.f40599OooO0o0 = z;
        if (andIncrement == LongCompanionObject.MAX_VALUE) {
            o00O00.OooO00o(zzgaVar.f40788OooO00o, "Tasks index overflow");
        }
    }
}
