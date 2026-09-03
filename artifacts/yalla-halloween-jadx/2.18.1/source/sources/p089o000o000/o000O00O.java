package p089o000o000;

import androidx.paging.LoadType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$2", f = "PageFetcherSnapshot.kt", i = {0, 0}, l = {614, 235}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1"})
public final class o000O00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f28850Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o000O0Oo.OooO00o f28851Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Mutex f28852Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public o000O000 f28853Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o000O000<Object, Object> f28854OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(o000O000<Object, Object> o000o001, Continuation<? super o000O00O> continuation) {
        super(2, continuation);
        this.f28854OoooO00 = o000o001;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O00O(this.f28854OoooO00, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o000O000<Object, Object> o000o001;
        o000O0Oo.OooO00o<Object, Object> oooO00o;
        Mutex mutex;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f28850Oooo;
        try {
            if (i != 0) {
                if (i == 1) {
                    o000o001 = this.f28853Oooo0oo;
                    mutex = this.f28852Oooo0oO;
                    oooO00o = this.f28851Oooo0o;
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
            o000o001 = this.f28854OoooO00;
            oooO00o = o000o001.f28795OooOO0O;
            Mutex mutex2 = oooO00o.f28868OooO00o;
            this.f28851Oooo0o = oooO00o;
            this.f28852Oooo0oO = mutex2;
            this.f28853Oooo0oo = o000o001;
            this.f28850Oooo = 1;
            if (mutex2.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex = mutex2;
            o000O0Oo<Object, Object> o000o0oo2 = oooO00o.f28869OooO0O0;
            Flow flowOnStart = FlowKt.onStart(FlowKt.consumeAsFlow(o000o0oo2.f28856OooO), new o000O0O0(o000o0oo2, null));
            mutex.unlock(null);
            LoadType loadType = LoadType.PREPEND;
            this.f28851Oooo0o = null;
            this.f28852Oooo0oO = null;
            this.f28853Oooo0oo = null;
            this.f28850Oooo = 2;
            if (o000O000.OooO00o(o000o001, flowOnStart, loadType, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
