package o000O0O0;

import androidx.room.RoomDatabase;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ThreadContextElementKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f34817OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ RoomDatabase f34818OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<Object> f34819OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function2<CoroutineScope, Continuation<Object>, Object> f34820OooO0oO;

    @DebugMetadata(c = "androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1", f = "RoomDatabaseExt.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f34821OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomDatabase f34822OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f34823OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<Object> f34824OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function2<CoroutineScope, Continuation<Object>, Object> f34825OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(RoomDatabase roomDatabase, CancellableContinuation<Object> cancellableContinuation, Function2<? super CoroutineScope, ? super Continuation<Object>, ? extends Object> function2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f34822OooO0o = roomDatabase;
            this.f34824OooO0oO = cancellableContinuation;
            this.f34825OooO0oo = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f34822OooO0o, this.f34824OooO0oO, this.f34825OooO0oo, continuation);
            oooO00o.f34823OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Continuation continuation;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f34821OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext.Element element = ((CoroutineScope) this.f34823OooO0o0).getCoroutineContext().get(ContinuationInterceptor.INSTANCE);
                Intrinsics.checkNotNull(element);
                ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) element;
                o000000O o000000o2 = new o000000O(continuationInterceptor);
                CoroutineContext coroutineContextPlus = continuationInterceptor.plus(o000000o2).plus(ThreadContextElementKt.asContextElement(this.f34822OooO0o.f7892OooOO0, Integer.valueOf(System.identityHashCode(o000000o2))));
                CancellableContinuation<Object> cancellableContinuation = this.f34824OooO0oO;
                this.f34823OooO0o0 = cancellableContinuation;
                this.f34821OooO0Oo = 1;
                obj = BuildersKt.withContext(coroutineContextPlus, this.f34825OooO0oo, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                continuation = cancellableContinuation;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                continuation = (Continuation) this.f34823OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            continuation.resumeWith(Result.m4213constructorimpl(obj));
            return Unit.INSTANCE;
        }
    }

    public o0ooOOo(CoroutineContext coroutineContext, CancellableContinuationImpl cancellableContinuationImpl, RoomDatabase roomDatabase, o0OOO0o o0ooo0o2) {
        this.f34817OooO0Oo = coroutineContext;
        this.f34819OooO0o0 = cancellableContinuationImpl;
        this.f34818OooO0o = roomDatabase;
        this.f34820OooO0oO = o0ooo0o2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CancellableContinuation<Object> cancellableContinuation = this.f34819OooO0o0;
        try {
            BuildersKt.runBlocking(this.f34817OooO0Oo.minusKey(ContinuationInterceptor.INSTANCE), new OooO00o(this.f34818OooO0o, cancellableContinuation, this.f34820OooO0oO, null));
        } catch (Throwable th) {
            cancellableContinuation.cancel(th);
        }
    }
}
