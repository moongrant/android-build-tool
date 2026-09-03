package p523o0o0O0oo;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Color;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.composable.room.SoundRippleComp$SoundRipple$1$launcher$1$1", f = "SoundRippleComp.kt", i = {}, l = {59, 60}, m = "invokeSuspend", n = {}, s = {})
public final class oO0O0OoO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f53175OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Color> f53176OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Animatable<Float, AnimationVector1D> f53177OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Job> f53178OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0OoO(Animatable<Float, AnimationVector1D> animatable, MutableState<Color> mutableState, MutableState<Job> mutableState2, Continuation<? super oO0O0OoO> continuation) {
        super(2, continuation);
        this.f53177OooO0o0 = animatable;
        this.f53176OooO0o = mutableState;
        this.f53178OooO0oO = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO0O0OoO(this.f53177OooO0o0, this.f53176OooO0o, this.f53178OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO0O0OoO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f53175OooO0Oo;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.f53178OooO0oO.setValue(null);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        this.f53176OooO0o.setValue(Color.m1671boximpl(o0OOo000.f48135OooO0O0));
        Animatable<Float, AnimationVector1D> animatable = this.f53177OooO0o0;
        Float fBoxFloat = Boxing.boxFloat(1.0f);
        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(4000, 0, EasingKt.getLinearEasing(), 2, null);
        this.f53175OooO0Oo = 1;
        if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        Float fBoxFloat2 = Boxing.boxFloat(0.0f);
        this.f53175OooO0Oo = 2;
        if (this.f53177OooO0o0.snapTo(fBoxFloat2, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f53178OooO0oO.setValue(null);
        return Unit.INSTANCE;
    }
}
