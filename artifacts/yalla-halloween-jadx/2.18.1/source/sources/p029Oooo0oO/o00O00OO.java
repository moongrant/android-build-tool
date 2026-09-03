package p029Oooo0oO;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImplKt$rememberItemProvider$1", f = "LazyGridItemProviderImpl.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
public final class o00O00OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f2294Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f2295Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<IntRange> f2296Oooo0oo;

    public static final class OooO00o extends Lambda implements Function0<IntRange> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OOOOo f2297Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00OOOOo o00ooooo2) {
            super(0);
            this.f2297Oooo0o = o00ooooo2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final IntRange invoke() {
            int iOooO0Oo = (this.f2297Oooo0o.OooO0Oo() / 90) * 90;
            return RangesKt.until(Math.max(iOooO0Oo - 200, 0), iOooO0Oo + 90 + 200);
        }
    }

    public static final class OooO0O0 implements FlowCollector<IntRange> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<IntRange> f2298Oooo0o;

        public OooO0O0(o0O00OO<IntRange> o0o00oo2) {
            this.f2298Oooo0o = o0o00oo2;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(IntRange intRange, Continuation continuation) {
            this.f2298Oooo0o.setValue(intRange);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00OO(o00OOOOo o00ooooo2, o0O00OO<IntRange> o0o00oo2, Continuation<? super o00O00OO> continuation) {
        super(2, continuation);
        this.f2295Oooo0oO = o00ooooo2;
        this.f2296Oooo0oo = o0o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O00OO(this.f2295Oooo0oO, this.f2296Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O00OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f2294Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowOooO0oO = o0OOO00.OooO0oO(new OooO00o(this.f2295Oooo0oO));
            OooO0O0 oooO0O0 = new OooO0O0(this.f2296Oooo0oo);
            this.f2294Oooo0o = 1;
            if (flowOooO0oO.collect(oooO0O0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
