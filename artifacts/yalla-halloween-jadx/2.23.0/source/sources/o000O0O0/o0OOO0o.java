package o000O0O0;

import androidx.room.RoomDatabase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.room.RoomDatabaseKt$withTransaction$transactionBlock$1", f = "RoomDatabaseExt.kt", i = {0}, l = {56}, m = "invokeSuspend", n = {"transactionElement"}, s = {"L$0"})
public final class o0OOO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f34804OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ RoomDatabase f34805OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f34806OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<Continuation<Object>, Object> f34807OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0OOO0o(RoomDatabase roomDatabase, Function1<? super Continuation<Object>, ? extends Object> function1, Continuation<? super o0OOO0o> continuation) {
        super(2, continuation);
        this.f34805OooO0o = roomDatabase;
        this.f34807OooO0oO = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0OOO0o o0ooo0o2 = new o0OOO0o(this.f34805OooO0o, this.f34807OooO0oO, continuation);
        o0ooo0o2.f34806OooO0o0 = obj;
        return o0ooo0o2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<Object> continuation) {
        return ((o0OOO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Throwable th;
        o000000O o000000o2;
        Throwable th2;
        o000000O o000000o3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f34804OooO0Oo;
        RoomDatabase roomDatabase = this.f34805OooO0o;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext.Element element = ((CoroutineScope) this.f34806OooO0o0).getCoroutineContext().get(o000000O.f34767OooO0o);
                Intrinsics.checkNotNull(element);
                o000000o2 = (o000000O) element;
                o000000o2.f34769OooO0o0.incrementAndGet();
                try {
                    roomDatabase.OooO0OO();
                    try {
                        Function1<Continuation<Object>, Object> function1 = this.f34807OooO0oO;
                        this.f34806OooO0o0 = o000000o2;
                        this.f34804OooO0Oo = 1;
                        Object objInvoke = function1.invoke(this);
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        o000000o3 = o000000o2;
                        obj = objInvoke;
                    } catch (Throwable th3) {
                        th2 = th3;
                        roomDatabase.OooOO0();
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (o000000o2.f34769OooO0o0.decrementAndGet() >= 0) {
                        throw th;
                    }
                    throw new IllegalStateException("Transaction was never started or was already released.");
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000000O o000000o4 = (o000000O) this.f34806OooO0o0;
                try {
                    ResultKt.throwOnFailure(obj);
                    o000000o3 = o000000o4;
                } catch (Throwable th5) {
                    th2 = th5;
                    roomDatabase.OooOO0();
                    throw th2;
                }
            }
            roomDatabase.OooOOO0();
            roomDatabase.OooOO0();
            if (o000000o3.f34769OooO0o0.decrementAndGet() >= 0) {
                return obj;
            }
            throw new IllegalStateException("Transaction was never started or was already released.");
        } catch (Throwable th6) {
            th = th6;
            o000000o2 = coroutine_suspended;
        }
    }
}
