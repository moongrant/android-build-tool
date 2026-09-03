package p110o000ooo0;

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
public final class o0000O extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f35876OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ RoomDatabase f35877OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f35878OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<Continuation<Object>, Object> f35879OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0000O(RoomDatabase roomDatabase, Function1<? super Continuation<Object>, ? extends Object> function1, Continuation<? super o0000O> continuation) {
        super(2, continuation);
        this.f35877OooO0o = roomDatabase;
        this.f35879OooO0oO = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0000O o0000o2 = new o0000O(this.f35877OooO0o, this.f35879OooO0oO, continuation);
        o0000o2.f35878OooO0o0 = obj;
        return o0000o2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<Object> continuation) {
        return ((o0000O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Throwable th;
        o000O00 o000o01;
        Throwable th2;
        o000O00 o000o02;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f35876OooO0Oo;
        RoomDatabase roomDatabase = this.f35877OooO0o;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext.Element element = ((CoroutineScope) this.f35878OooO0o0).getCoroutineContext().get(o000O00.f35896OooO0o);
                Intrinsics.checkNotNull(element);
                o000o01 = (o000O00) element;
                o000o01.f35898OooO0o0.incrementAndGet();
                try {
                    roomDatabase.OooO0OO();
                    try {
                        Function1<Continuation<Object>, Object> function1 = this.f35879OooO0oO;
                        this.f35878OooO0o0 = o000o01;
                        this.f35876OooO0Oo = 1;
                        Object objInvoke = function1.invoke(this);
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        o000o02 = o000o01;
                        obj = objInvoke;
                    } catch (Throwable th3) {
                        th2 = th3;
                        roomDatabase.OooOO0();
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (o000o01.f35898OooO0o0.decrementAndGet() >= 0) {
                        throw th;
                    }
                    throw new IllegalStateException("Transaction was never started or was already released.");
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000O00 o000o03 = (o000O00) this.f35878OooO0o0;
                try {
                    ResultKt.throwOnFailure(obj);
                    o000o02 = o000o03;
                } catch (Throwable th5) {
                    th2 = th5;
                    roomDatabase.OooOO0();
                    throw th2;
                }
            }
            roomDatabase.OooOOO();
            roomDatabase.OooOO0();
            if (o000o02.f35898OooO0o0.decrementAndGet() >= 0) {
                return obj;
            }
            throw new IllegalStateException("Transaction was never started or was already released.");
        } catch (Throwable th6) {
            th = th6;
            o000o01 = coroutine_suspended;
        }
    }
}
