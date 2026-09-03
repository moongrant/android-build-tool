package p578o0oOoOoo;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.module.media.dialog.MusicEditDialogKt$CompressCommonSlider$1$1$4$2", f = "MusicEditDialog.kt", i = {}, l = {258, 260}, m = "invokeSuspend", n = {}, s = {})
public final class O0000000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f56389OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56390OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Animatable<Float, AnimationVector1D> f56391OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f56392OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ float f56393OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f56394OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0000000(MutableState<Boolean> mutableState, Animatable<Float, AnimationVector1D> animatable, float f, MutableState<Float> mutableState2, MutableFloatState mutableFloatState, Continuation<? super O0000000> continuation) {
        super(2, continuation);
        this.f56392OooO0o0 = mutableState;
        this.f56391OooO0o = animatable;
        this.f56393OooO0oO = f;
        this.f56394OooO0oo = mutableState2;
        this.f56389OooO = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new O0000000(this.f56392OooO0o0, this.f56391OooO0o, this.f56393OooO0oO, this.f56394OooO0oo, this.f56389OooO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((O0000000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f56390OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f56392OooO0o0.getValue().booleanValue()) {
                Float fBoxFloat = Boxing.boxFloat(0.0f);
                this.f56390OooO0Oo = 1;
                if (this.f56391OooO0o.snapTo(fBoxFloat, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                Animatable<Float, AnimationVector1D> animatable = this.f56391OooO0o;
                Float fBoxFloat2 = Boxing.boxFloat(this.f56389OooO.getFloatValue());
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default((int) ((this.f56393OooO0oO - ((int) this.f56394OooO0oo.getValue().floatValue())) * 1000), 0, EasingKt.getLinearEasing(), 2, null);
                this.f56390OooO0Oo = 2;
                if (Animatable.animateTo$default(animatable, fBoxFloat2, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
