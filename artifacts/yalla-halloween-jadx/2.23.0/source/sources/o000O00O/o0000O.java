package o000O00O;

import androidx.paging.LoadType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1", f = "PageFetcherSnapshot.kt", i = {}, l = {220}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nPageFetcherSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$startConsumingHints$1\n+ 2 Logger.kt\nandroidx/paging/LoggerKt\n*L\n1#1,638:1\n41#2,10:639\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$startConsumingHints$1\n*L\n225#1:639,10\n*E\n"})
public final class o0000O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f34501OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.o000oOoO<Object, Object> f34502OooO0o0;

    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$jumpHint$1", f = "PageFetcherSnapshot.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<androidx.paging.o00000, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f34503OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ androidx.paging.o000oOoO<Object, Object> f34504OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(androidx.paging.o000oOoO<Object, Object> o000oooo2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f34504OooO0o0 = o000oooo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f34504OooO0o0, continuation);
            oooO00o.f34503OooO0Oo = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(androidx.paging.o00000 o00000Var, Continuation<? super Boolean> continuation) {
            return ((OooO00o) create(o00000Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            androidx.paging.o00000 o00000Var = (androidx.paging.o00000) this.f34503OooO0Oo;
            int i = o00000Var.f7272OooO00o * (-1);
            int i2 = this.f34504OooO0o0.f7290OooO0OO.f34567OooO0o;
            return Boxing.boxBoolean(i > i2 || o00000Var.f7273OooO0O0 * (-1) > i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(androidx.paging.o000oOoO<Object, Object> o000oooo2, Continuation<? super o0000O> continuation) {
        super(2, continuation);
        this.f34502OooO0o0 = o000oooo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0000O(this.f34502OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0000O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f34501OooO0Oo;
        boolean z = false;
        androidx.paging.o000oOoO<Object, Object> o000oooo2 = this.f34502OooO0o0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowMerge = FlowKt.merge(o000oooo2.f7295OooO0oo.OooO00o(LoadType.APPEND), o000oooo2.f7295OooO0oo.OooO00o(LoadType.PREPEND));
            OooO00o oooO00o = new OooO00o(o000oooo2, null);
            this.f34501OooO0Oo = 1;
            obj = FlowKt.firstOrNull(flowMerge, oooO00o, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        androidx.paging.o00000 o00000Var = (androidx.paging.o00000) obj;
        if (o00000Var != null) {
            o0OO00O o0oo00o2 = oo0o0Oo.f34666OooO00o;
            if (o0oo00o2 != null && o0oo00o2.OooO0O0(3)) {
                z = true;
            }
            if (z) {
                o0oo00o2.OooO00o(3, "Jump triggered on PagingSource " + o000oooo2.f7289OooO0O0 + " by " + o00000Var);
            }
            o000oooo2.f7294OooO0oO.invoke();
        }
        return Unit.INSTANCE;
    }
}
