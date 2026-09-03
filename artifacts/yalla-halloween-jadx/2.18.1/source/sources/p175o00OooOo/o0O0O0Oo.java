package p175o00OooOo;

import com.app.base.view.FacePanelView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o0O0O0O.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "com.app.base.view.FacePanelView$IndicatorContainer$1$1$1$1$1", f = "FacePanelView.kt", i = {}, l = {242}, m = "invokeSuspend", n = {}, s = {})
public final class o0O0O0Oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f32709Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ FacePanelView f32710Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f32711Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0Oo(FacePanelView facePanelView, int i, Continuation<? super o0O0O0Oo> continuation) {
        super(2, continuation);
        this.f32710Oooo0oO = facePanelView;
        this.f32711Oooo0oo = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O0O0Oo(this.f32710Oooo0oO, this.f32711Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O0O0Oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f32709Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooOO0 oooOO1 = this.f32710Oooo0oO.f11960OoooO0;
            if (oooOO1 != null) {
                int i2 = this.f32711Oooo0oo;
                this.f32709Oooo0o = 1;
                OooOO0.OooO0OO oooO0OO = OooOO0.f35352OooO0oo;
                if (oooOO1.OooOO0o(i2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
