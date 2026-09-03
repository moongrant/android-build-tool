package p587o0oOooOO;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableState;
import com.code.android.util.o0000O0;
import io.agora.rtc.Constants;
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
@DebugMetadata(c = "com.yalla.yalla.ui.view.RoomLiveHookFloatingWindow$HookFloatingWindow$3$1$2$2", f = "RoomLiveHookFloatingWindow.kt", i = {}, l = {Constants.ERR_PUBLISH_STREAM_CDN_ERROR}, m = "invokeSuspend", n = {}, s = {})
public final class c1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56759OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f56760OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ float f56761OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f56762OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(float f, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super c1> continuation) {
        super(2, continuation);
        this.f56761OooO0o0 = f;
        this.f56760OooO0o = mutableState;
        this.f56762OooO0oO = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new c1(this.f56761OooO0o0, this.f56760OooO0o, this.f56762OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((c1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f56759OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Animatable<Float, AnimationVector1D> animatable = e1.f56784OooO00o;
            Float fBoxFloat = Boxing.boxFloat(this.f56761OooO0o0);
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 0, null, 6, null);
            this.f56759OooO0Oo = 1;
            if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        float fFloatValue = e1.f56784OooO00o.getValue().floatValue();
        float fOooO00o = o0000O0.OooO00o(124);
        MutableState<Boolean> mutableState = this.f56762OooO0oO;
        MutableState<Boolean> mutableState2 = this.f56760OooO0o;
        if (fFloatValue > fOooO00o) {
            mutableState2.setValue(Boolean.FALSE);
            mutableState.setValue(Boolean.TRUE);
        } else {
            mutableState2.setValue(Boolean.TRUE);
            mutableState.setValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
