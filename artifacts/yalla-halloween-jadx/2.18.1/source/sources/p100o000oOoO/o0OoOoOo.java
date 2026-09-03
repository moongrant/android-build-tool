package p100o000oOoO;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOoOo implements oo0oO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Function2<CoroutineScope, Continuation<? super Unit>, Object> f29663Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f29664Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Job f29665Oooo0oo;

    /* JADX WARN: Multi-variable type inference failed */
    public o0OoOoOo(@NotNull CoroutineContext parentCoroutineContext, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> task) {
        Intrinsics.checkNotNullParameter(parentCoroutineContext, "parentCoroutineContext");
        Intrinsics.checkNotNullParameter(task, "task");
        this.f29663Oooo0o = task;
        this.f29664Oooo0oO = CoroutineScopeKt.CoroutineScope(parentCoroutineContext);
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO00o() {
        Job job = this.f29665Oooo0oo;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f29665Oooo0oo = null;
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO0O0() {
        Job job = this.f29665Oooo0oo;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f29665Oooo0oo = null;
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO0Oo() {
        Job job = this.f29665Oooo0oo;
        if (job != null) {
            JobKt__JobKt.cancel$default(job, "Old job was still running!", null, 2, null);
        }
        this.f29665Oooo0oo = BuildersKt__Builders_commonKt.launch$default(this.f29664Oooo0oO, null, null, this.f29663Oooo0o, 3, null);
    }
}
