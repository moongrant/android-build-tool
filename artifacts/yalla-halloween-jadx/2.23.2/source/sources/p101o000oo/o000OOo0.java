package p101o000oo;

import androidx.paging.LoadType;
import androidx.paging.o00000;
import androidx.paging.o000oOoO;
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

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1", f = "PageFetcherSnapshot.kt", i = {}, l = {220}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nPageFetcherSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$startConsumingHints$1\n+ 2 Logger.kt\nandroidx/paging/LoggerKt\n*L\n1#1,638:1\n41#2,10:639\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$startConsumingHints$1\n*L\n225#1:639,10\n*E\n"})
public final class o000OOo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f35481OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000oOoO<Object, Object> f35482OooO0o0;

    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$jumpHint$1", f = "PageFetcherSnapshot.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<o00000, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f35483OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000oOoO<Object, Object> f35484OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000oOoO<Object, Object> o000oooo2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f35484OooO0o0 = o000oooo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f35484OooO0o0, continuation);
            oooO00o.f35483OooO0Oo = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00000 o00000Var, Continuation<? super Boolean> continuation) {
            return ((OooO00o) create(o00000Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00000 o00000Var = (o00000) this.f35483OooO0Oo;
            int i = o00000Var.f10366OooO00o * (-1);
            int i2 = this.f35484OooO0o0.f10384OooO0OO.f35512OooO0o;
            return Boxing.boxBoolean(i > i2 || o00000Var.f10367OooO0O0 * (-1) > i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(o000oOoO<Object, Object> o000oooo2, Continuation<? super o000OOo0> continuation) {
        super(2, continuation);
        this.f35482OooO0o0 = o000oooo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000OOo0(this.f35482OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000OOo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f35481OooO0Oo;
        boolean z = false;
        o000oOoO<Object, Object> o000oooo2 = this.f35482OooO0o0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowMerge = FlowKt.merge(o000oooo2.f10389OooO0oo.OooO00o(LoadType.APPEND), o000oooo2.f10389OooO0oo.OooO00o(LoadType.PREPEND));
            OooO00o oooO00o = new OooO00o(o000oooo2, null);
            this.f35481OooO0Oo = 1;
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
        o00000 o00000Var = (o00000) obj;
        if (o00000Var != null) {
            o0000O0 o0000o1 = o0000O0O.f35428OooO00o;
            if (o0000o1 != null && o0000o1.OooO0O0(3)) {
                z = true;
            }
            if (z) {
                o0000o1.OooO00o(3, "Jump triggered on PagingSource " + o000oooo2.f10383OooO0O0 + " by " + o00000Var);
            }
            o000oooo2.f10388OooO0oO.invoke();
        }
        return Unit.INSTANCE;
    }
}
