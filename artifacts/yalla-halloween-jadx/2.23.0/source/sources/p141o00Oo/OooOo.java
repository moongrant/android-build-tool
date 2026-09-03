package p141o00Oo;

import androidx.compose.runtime.State;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.uikit.slider.core.CustomSliderKt$CustomSlider$3$drag$1$1", f = "CustomSlider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OooOo extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public /* synthetic */ float f37473OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ State<Function1<Float, Unit>> f37474OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooOo(State<? extends Function1<? super Float, Unit>> state, Continuation<? super OooOo> continuation) {
        super(3, continuation);
        this.f37474OooO0o0 = state;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, Float f, Continuation<? super Unit> continuation) {
        float fFloatValue = f.floatValue();
        OooOo oooOo = new OooOo(this.f37474OooO0o0, continuation);
        oooOo.f37473OooO0Oo = fFloatValue;
        return oooOo.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f37474OooO0o0.getValue().invoke(Boxing.boxFloat(this.f37473OooO0Oo));
        return Unit.INSTANCE;
    }
}
