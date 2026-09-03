package p111o000oooO;

import androidx.paging.o0O0O00;
import androidx.room.RoomDatabase;
import java.util.concurrent.RejectedExecutionException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p110o000ooo0.o000000O;
import p110o000ooo0.o0000O;
import p110o000ooo0.o000O0;
import p110o000ooo0.o000O00;
import p110o000ooo0.o000OO;
import p112o000oooo.o00O00OO;
import p112o000oooo.o00O00o0;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.room.paging.LimitOffsetPagingSource$load$2", f = "LimitOffsetPagingSource.kt", i = {}, l = {75, 77}, m = "invokeSuspend", n = {}, s = {})
public final class o00O00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super o0O0O00.OooO0O0<Integer, Object>>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f35970OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0O0O00.OooO00o<Integer> f35971OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oOO00O<Object> f35972OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00(oOO00O<Object> ooo00o, o0O0O00.OooO00o<Integer> oooO00o, Continuation<? super o00O00> continuation) {
        super(2, continuation);
        this.f35972OooO0o0 = ooo00o;
        this.f35971OooO0o = oooO00o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O00(this.f35972OooO0o0, this.f35971OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super o0O0O00.OooO0O0<Integer, Object>> continuation) {
        return ((o00O00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f35970OooO0Oo;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return (o0O0O00.OooO0O0) obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return (o0O0O00.OooO0O0) obj;
        }
        ResultKt.throwOnFailure(obj);
        oOO00O<Object> ooo00o = this.f35972OooO0o0;
        o00O00o0 observer = ooo00o.f35978OooO0o0;
        observer.getClass();
        RoomDatabase db = ooo00o.f35976OooO0OO;
        Intrinsics.checkNotNullParameter(db, "db");
        if (observer.f35981OooO0OO.compareAndSet(false, true)) {
            o000000O o000000o2 = db.f10983OooO0o0;
            o000000o2.getClass();
            Intrinsics.checkNotNullParameter(observer, "observer");
            o000000o2.OooO00o(new o000000O.OooO(o000000o2, observer));
        }
        int i2 = ooo00o.f35977OooO0Oo.get();
        o0O0O00.OooO00o<Integer> oooO00o = this.f35971OooO0o;
        if (i2 != -1) {
            this.f35970OooO0Oo = 2;
            o0O0O00.OooO0O0.OooO0OO oooO0OOOooO00o = o00O00OO.OooO00o(oooO00o, ooo00o.f35975OooO0O0, db, i2, new o00O00O(ooo00o));
            o000000O o000000o3 = db.f10983OooO0o0;
            o000000o3.OooO0oO();
            o000000o3.f35847OooOOO.run();
            if (ooo00o.f10442OooO00o.f35427OooO0o0) {
                obj = o00O00OO.f35979OooO00o;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Invalid<kotlin.Int, Value of androidx.room.paging.LimitOffsetPagingSource>");
            } else {
                obj = oooO0OOOooO00o;
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (o0O0O00.OooO0O0) obj;
        }
        this.f35970OooO0Oo = 1;
        o000O0 o000o0 = null;
        o0000O o0000o2 = new o0000O(db, new o00O000o(ooo00o, oooO00o, null), null);
        o000O00 o000o01 = (o000O00) get$context().get(o000O00.f35896OooO0o);
        ContinuationInterceptor continuationInterceptor = o000o01 != null ? o000o01.f35897OooO0Oo : null;
        if (continuationInterceptor != null) {
            obj = BuildersKt.withContext(continuationInterceptor, o0000o2, this);
        } else {
            CoroutineContext context = get$context();
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            try {
                o000O0 o000o1 = db.f10980OooO0OO;
                if (o000o1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
                } else {
                    o000o0 = o000o1;
                }
                o000o0.execute(new o000OO(context, cancellableContinuationImpl, db, o0000o2));
            } catch (RejectedExecutionException e) {
                cancellableContinuationImpl.cancel(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
            }
            obj = cancellableContinuationImpl.getResult();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
        }
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        return (o0O0O00.OooO0O0) obj;
    }
}
