package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$2", f = "PageFetcherSnapshot.kt", i = {0, 0}, l = {645, 179}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nPageFetcherSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$pageEventFlow$2\n+ 2 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,638:1\n391#2:639\n392#2:648\n107#3,8:640\n116#3:649\n115#3:650\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$pageEventFlow$2\n*L\n179#1:639\n179#1:648\n179#1:640,8\n179#1:649\n179#1:650\n*E\n"})
public final class o00Oo0 extends SuspendLambda implements Function2<FlowCollector<? super Oooo000<Object>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Mutex f7324OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f7325OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public FlowCollector f7326OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public /* synthetic */ Object f7327OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o000oOoO<Object, Object> f7328OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(o000oOoO<Object, Object> o000oooo2, Continuation<? super o00Oo0> continuation) {
        super(2, continuation);
        this.f7328OooO0oo = o000oooo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00Oo0 o00oo1 = new o00Oo0(this.f7328OooO0oo, continuation);
        o00oo1.f7327OooO0oO = obj;
        return o00oo1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Oooo000<Object>> flowCollector, Continuation<? super Unit> continuation) {
        return ((o00Oo0) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        FlowCollector flowCollector;
        o00oO0o.OooO00o<Object, Object> oooO00o;
        Mutex mutex;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7325OooO0o;
        try {
            if (i != 0) {
                if (i == 1) {
                    flowCollector = this.f7326OooO0o0;
                    mutex = this.f7324OooO0Oo;
                    oooO00o = (o00oO0o.OooO00o) this.f7327OooO0oO;
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
            flowCollector = (FlowCollector) this.f7327OooO0oO;
            oooO00o = this.f7328OooO0oo.f7297OooOO0O;
            Mutex mutex2 = oooO00o.f7346OooO00o;
            this.f7327OooO0oO = oooO00o;
            this.f7324OooO0Oo = mutex2;
            this.f7326OooO0o0 = flowCollector;
            this.f7325OooO0o = 1;
            if (mutex2.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex = mutex2;
            OooOOO oooOOOOooO0Oo = oooO00o.f7347OooO0O0.f7345OooOO0o.OooO0Oo();
            mutex.unlock(null);
            Oooo000.OooO0OO oooO0OO = new Oooo000.OooO0OO(oooOOOOooO0Oo, null);
            this.f7327OooO0oO = null;
            this.f7324OooO0Oo = null;
            this.f7326OooO0o0 = null;
            this.f7325OooO0o = 2;
            if (flowCollector.emit(oooO0OO, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
