package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p101o000oo.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$2", f = "PageFetcherSnapshot.kt", i = {0, 0}, l = {645, 233}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nPageFetcherSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$startConsumingHints$2\n+ 2 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,638:1\n391#2:639\n392#2:648\n107#3,8:640\n116#3:649\n115#3:650\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$startConsumingHints$2\n*L\n232#1:639\n232#1:648\n232#1:640,8\n232#1:649\n232#1:650\n*E\n"})
public final class o00Ooo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00oO0o.OooO00o f10423OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o000oOoO f10424OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Mutex f10425OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f10426OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o000oOoO<Object, Object> f10427OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(o000oOoO<Object, Object> o000oooo2, Continuation<? super o00Ooo> continuation) {
        super(2, continuation);
        this.f10427OooO0oo = o000oooo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00Ooo(this.f10427OooO0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00Ooo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o000oOoO<Object, Object> o000oooo2;
        o00oO0o.OooO00o<Object, Object> oooO00o;
        Mutex mutex;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f10426OooO0oO;
        try {
            if (i != 0) {
                if (i == 1) {
                    o000oooo2 = this.f10424OooO0o;
                    mutex = this.f10425OooO0o0;
                    oooO00o = this.f10423OooO0Oo;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            o000oooo2 = this.f10427OooO0oo;
            oooO00o = o000oooo2.f10391OooOO0O;
            Mutex mutex2 = oooO00o.f10440OooO00o;
            this.f10423OooO0Oo = oooO00o;
            this.f10425OooO0o0 = mutex2;
            this.f10424OooO0o = o000oooo2;
            this.f10426OooO0oO = 1;
            if (mutex2.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex = mutex2;
            o00oO0o<Object, Object> o00oo0o2 = oooO00o.f10441OooO0O0;
            Flow flowOnStart = FlowKt.onStart(FlowKt.consumeAsFlow(o00oo0o2.f10428OooO), new o00O0000(o00oo0o2, null));
            mutex.unlock(null);
            LoadType loadType = LoadType.PREPEND;
            this.f10423OooO0Oo = null;
            this.f10425OooO0o0 = null;
            this.f10424OooO0o = null;
            this.f10426OooO0oO = 2;
            if (o000oOoO.OooO00o(o000oooo2, flowOnStart, loadType, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
