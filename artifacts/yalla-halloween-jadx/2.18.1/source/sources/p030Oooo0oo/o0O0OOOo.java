package p030Oooo0oo;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o00O0O.OooOO0O;
import o0O0O00.Oooo000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2", f = "BringIntoViewResponder.kt", i = {}, l = {272}, m = "invokeSuspend", n = {}, s = {})
public final class o0O0OOOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f2524Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f2525Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f2526Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f2527Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f2528OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f2529OoooO00;

    @DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2$1", f = "BringIntoViewResponder.kt", i = {}, l = {267}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f2530Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O0OOO0 f2531Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f2532Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0O0OOO0 o0o0ooo0, OooOO0O oooOO0O, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f2531Oooo0oO = o0o0ooo0;
            this.f2532Oooo0oo = oooOO0O;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f2531Oooo0oO, this.f2532Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f2530Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0O0O0o0 o0o0o0o0 = this.f2531Oooo0oO.f2514Oooo;
                if (o0o0o0o0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("responder");
                    o0o0o0o0 = null;
                }
                OooOO0O oooOO0O = this.f2532Oooo0oo;
                this.f2530Oooo0o = 1;
                if (o0o0o0o0.OooO0O0(oooOO0O, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOOo(o0O0OOO0 o0o0ooo0, OooOO0O oooOO0O, Oooo000 oooo000, OooOO0O oooOO0O2, Continuation<? super o0O0OOOo> continuation) {
        super(2, continuation);
        this.f2527Oooo0oo = o0o0ooo0;
        this.f2524Oooo = oooOO0O;
        this.f2529OoooO00 = oooo000;
        this.f2528OoooO0 = oooOO0O2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0O0OOOo o0o0oooo = new o0O0OOOo(this.f2527Oooo0oo, this.f2524Oooo, this.f2529OoooO00, this.f2528OoooO0, continuation);
        o0o0oooo.f2526Oooo0oO = obj;
        return o0o0oooo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O0OOOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f2525Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.f2526Oooo0oO, null, null, new OooO00o(this.f2527Oooo0oo, this.f2528OoooO0, null), 3, null);
            o0O0OOO0 o0o0ooo0 = this.f2527Oooo0oo;
            o0O00oO0 o0o00oo1 = o0o0ooo0.f2544Oooo0oO;
            if (o0o00oo1 == null) {
                o0o00oo1 = o0o0ooo0.f2543Oooo0o;
            }
            OooOO0O oooOO0O = this.f2524Oooo;
            Oooo000 oooo000 = this.f2529OoooO00;
            this.f2525Oooo0o = 1;
            if (o0o00oo1.OooO00o(oooOO0O, oooo000, this) == coroutine_suspended) {
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
