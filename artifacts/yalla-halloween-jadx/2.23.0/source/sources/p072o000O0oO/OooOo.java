package p072o000O0oO;

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
import o000O0O0.o00000;
import o000O0O0.o000000O;
import o000O0O0.o0OOO0o;
import o000O0O0.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p073o000O0oo.o000oOoO;
import p073o000O0oo.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.room.paging.LimitOffsetPagingSource$load$2", f = "LimitOffsetPagingSource.kt", i = {}, l = {75, 77}, m = "invokeSuspend", n = {}, s = {})
public final class OooOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super o0O0O00.OooO0O0<Integer, Object>>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f34853OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0O0O00.OooO00o<Integer> f34854OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Oooo0<Object> f34855OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(Oooo0<Object> oooo0, o0O0O00.OooO00o<Integer> oooO00o, Continuation<? super OooOo> continuation) {
        super(2, continuation);
        this.f34855OooO0o0 = oooo0;
        this.f34854OooO0o = oooO00o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOo(this.f34855OooO0o0, this.f34854OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super o0O0O00.OooO0O0<Integer, Object>> continuation) {
        return ((OooOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f34853OooO0Oo;
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
        Oooo0<Object> oooo0 = this.f34855OooO0o0;
        o0OoOo0 observer = oooo0.f34861OooO0o0;
        observer.getClass();
        RoomDatabase db = oooo0.f34859OooO0OO;
        Intrinsics.checkNotNullParameter(db, "db");
        if (observer.f34864OooO0OO.compareAndSet(false, true)) {
            o000O0O0.OooOo oooOo = db.f7889OooO0o0;
            oooOo.getClass();
            Intrinsics.checkNotNullParameter(observer, "observer");
            oooOo.OooO00o(new o000O0O0.OooOo.OooO(oooOo, observer));
        }
        int i2 = oooo0.f34860OooO0Oo.get();
        o0O0O00.OooO00o<Integer> oooO00o = this.f34854OooO0o;
        if (i2 != -1) {
            this.f34853OooO0Oo = 2;
            o0O0O00.OooO0O0.OooO0OO oooO0OOOooO00o = o000oOoO.OooO00o(oooO00o, oooo0.f34858OooO0O0, db, i2, new Oooo000(oooo0));
            o000O0O0.OooOo oooOo2 = db.f7889OooO0o0;
            oooOo2.OooO0oO();
            oooOo2.f34742OooOOO.run();
            if (oooo0.f7348OooO00o.f34660OooO0o0) {
                obj = o000oOoO.f34862OooO00o;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Invalid<kotlin.Int, Value of androidx.room.paging.LimitOffsetPagingSource>");
            } else {
                obj = oooO0OOOooO00o;
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (o0O0O00.OooO0O0) obj;
        }
        this.f34853OooO0Oo = 1;
        o00000 o00000Var = null;
        o0OOO0o o0ooo0o2 = new o0OOO0o(db, new OooOo00(oooo0, oooO00o, null), null);
        o000000O o000000o2 = (o000000O) get$context().get(o000000O.f34767OooO0o);
        ContinuationInterceptor continuationInterceptor = o000000o2 != null ? o000000o2.f34768OooO0Oo : null;
        if (continuationInterceptor != null) {
            obj = BuildersKt.withContext(continuationInterceptor, o0ooo0o2, this);
        } else {
            CoroutineContext context = get$context();
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            try {
                o00000 o00000Var2 = db.f7886OooO0OO;
                if (o00000Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
                } else {
                    o00000Var = o00000Var2;
                }
                o00000Var.execute(new o0ooOOo(context, cancellableContinuationImpl, db, o0ooo0o2));
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
