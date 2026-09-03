package o00OO0O;

import androidx.compose.runtime.MutableState;
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

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", i = {}, l = {59, 64}, m = "invokeSuspend", n = {}, s = {})
public final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f37153OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f37154OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f37155OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f37156OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f37157OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ com.airbnb.lottie.OooOO0 f37158OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ float f37159OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f37160OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ LottieCancellationBehavior f37161OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f37162OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(boolean z, boolean z2, OooO0O0 oooO0O0, com.airbnb.lottie.OooOO0 oooOO1, int i, float f, OooOO0O oooOO0O, LottieCancellationBehavior lottieCancellationBehavior, MutableState<Boolean> mutableState, Continuation<? super OooO00o> continuation) {
        super(2, continuation);
        this.f37156OooO0o0 = z;
        this.f37155OooO0o = z2;
        this.f37157OooO0oO = oooO0O0;
        this.f37158OooO0oo = oooOO1;
        this.f37153OooO = i;
        this.f37159OooOO0 = f;
        this.f37160OooOO0O = oooOO0O;
        this.f37161OooOO0o = lottieCancellationBehavior;
        this.f37162OooOOO0 = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooO00o(this.f37156OooO0o0, this.f37155OooO0o, this.f37157OooO0oO, this.f37158OooO0oo, this.f37153OooO, this.f37159OooOO0, this.f37160OooOO0O, this.f37161OooOO0o, this.f37162OooOOO0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        float fOooO0O0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f37154OooO0Oo;
        OooO0O0 oooO0O0 = this.f37157OooO0oO;
        MutableState<Boolean> mutableState = this.f37162OooOOO0;
        boolean z = this.f37156OooO0o0;
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
        if (z && !mutableState.getValue().booleanValue() && this.f37155OooO0o) {
            this.f37154OooO0Oo = 1;
            com.airbnb.lottie.OooOO0 composition = oooO0O0.getComposition();
            OooOO0O oooOO0OOooO0oO = oooO0O0.OooO0oO();
            float fOooO0O1 = oooO0O0.OooO0O0();
            float f = 0.0f;
            if (fOooO0O1 < 0.0f && composition == null) {
                fOooO0O0 = 1.0f;
                f = fOooO0O0;
            } else if (composition != null) {
                if (fOooO0O1 < 0.0f) {
                    if (oooOO0OOooO0oO == null) {
                        fOooO0O0 = 1.0f;
                    } else {
                        fOooO0O0 = oooOO0OOooO0oO.OooO00o();
                    }
                } else if (oooOO0OOooO0oO != null) {
                    fOooO0O0 = oooOO0OOooO0oO.OooO0O0();
                }
                f = fOooO0O0;
            }
            Object objOooO0o = oooO0O0.OooO0o(oooO0O0.getComposition(), f, 1, !(f == oooO0O0.OooO0Oo()), this);
            if (objOooO0o != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objOooO0o = Unit.INSTANCE;
            }
            if (objOooO0o == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        mutableState.setValue(Boolean.valueOf(z));
        if (!z) {
            return Unit.INSTANCE;
        }
        com.airbnb.lottie.OooOO0 oooOO1 = this.f37158OooO0oo;
        int i2 = this.f37153OooO;
        float f2 = this.f37159OooOO0;
        OooOO0O oooOO0O = this.f37160OooOO0O;
        float fOooO0Oo = oooO0O0.OooO0Oo();
        LottieCancellationBehavior lottieCancellationBehavior = this.f37161OooOO0o;
        this.f37154OooO0Oo = 2;
        if (oooO0O0.OooO00o(oooOO1, oooO0O0.OooO0o0(), i2, f2, oooOO0O, fOooO0Oo, false, lottieCancellationBehavior, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
