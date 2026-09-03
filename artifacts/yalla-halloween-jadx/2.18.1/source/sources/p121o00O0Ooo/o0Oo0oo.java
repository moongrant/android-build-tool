package p121o00O0Ooo;

import com.airbnb.lottie.OooOO0O;
import com.airbnb.lottie.compose.LottieCancellationBehavior;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", i = {}, l = {59, 64}, m = "invokeSuspend", n = {}, s = {})
public final class o0Oo0oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f30911Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f30912Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f30913Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f30914Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ o00000 f30915OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ int f30916OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f30917OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ float f30918OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ LottieCancellationBehavior f30919OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f30920o000oOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(boolean z, boolean z2, o0OO00O o0oo00o2, OooOO0O oooOO0O, int i, float f, o00000 o00000Var, LottieCancellationBehavior lottieCancellationBehavior, o0O00OO<Boolean> o0o00oo2, Continuation<? super o0Oo0oo> continuation) {
        super(2, continuation);
        this.f30913Oooo0oO = z;
        this.f30914Oooo0oo = z2;
        this.f30911Oooo = o0oo00o2;
        this.f30917OoooO00 = oooOO0O;
        this.f30916OoooO0 = i;
        this.f30918OoooO0O = f;
        this.f30915OoooO = o00000Var;
        this.f30919OoooOO0 = lottieCancellationBehavior;
        this.f30920o000oOoO = o0o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0Oo0oo(this.f30913Oooo0oO, this.f30914Oooo0oo, this.f30911Oooo, this.f30917OoooO00, this.f30916OoooO0, this.f30918OoooO0O, this.f30915OoooO, this.f30919OoooOO0, this.f30920o000oOoO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0Oo0oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f30912Oooo0o;
        if (i != 0) {
            if (i == 1) {
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
        if (this.f30913Oooo0oO && !this.f30920o000oOoO.getValue().booleanValue() && this.f30914Oooo0oo) {
            o0OO00O o0oo00o2 = this.f30911Oooo;
            this.f30912Oooo0o = 1;
            float fOooO00o = o000OOo.OooO00o(o0oo00o2.OooOO0(), o0oo00o2.OooOOO0(), o0oo00o2.OooO0OO());
            Object objOooOO0O = o0oo00o2.OooOO0O(o0oo00o2.OooOO0(), fOooO00o, 1, !(fOooO00o == o0oo00o2.OooO0o0()), this);
            if (objOooOO0O != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objOooOO0O = Unit.INSTANCE;
            }
            if (objOooOO0O == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.f30920o000oOoO.setValue(Boolean.valueOf(this.f30913Oooo0oO));
        if (!this.f30913Oooo0oO) {
            return Unit.INSTANCE;
        }
        o0OO00O o0oo00o3 = this.f30911Oooo;
        OooOO0O oooOO0O = this.f30917OoooO00;
        int i2 = this.f30916OoooO0;
        float f = this.f30918OoooO0O;
        o00000 o00000Var = this.f30915OoooO;
        float fOooO0o0 = o0oo00o3.OooO0o0();
        LottieCancellationBehavior lottieCancellationBehavior = this.f30919OoooOO0;
        this.f30912Oooo0o = 2;
        if (o0oo00o3.OooO0oO(oooOO0O, o0oo00o3.OooO0o(), i2, f, o00000Var, fOooO0o0, false, lottieCancellationBehavior, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
