package com.yalla.yalla.module.media.camera;

import android.content.Context;
import androidx.camera.view.PreviewView;
import androidx.compose.runtime.MutableState;
import com.zego.zegoliveroom.callback.IZegoLiveEventCallback;
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
import p460o0Ooo0o.oo0oOO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.module.media.camera.CameraCommonCompKt$CameraSwitchComp$1$1", f = "CameraCommonComp.kt", i = {}, l = {IZegoLiveEventCallback.StreamEvent.RetryPlayFail}, m = "invokeSuspend", n = {}, s = {})
public final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f23881OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Context f23882OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CameraViewModel f23883OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<PreviewView> f23884OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(CameraViewModel cameraViewModel, Context context, MutableState<PreviewView> mutableState, Continuation<? super OooOOOO> continuation) {
        super(2, continuation);
        this.f23883OooO0o0 = cameraViewModel;
        this.f23882OooO0o = context;
        this.f23884OooO0oO = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOOOO(this.f23883OooO0o0, this.f23882OooO0o, this.f23884OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f23881OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0oo0000.OooO00o.OooO0O0("106076");
            oo0oOO0 oo0ooo0 = oo0oOO0.f47814OooO00o;
            this.f23881OooO0Oo = 1;
            if (oo0ooo0.OooO00o(this.f23883OooO0o0, this.f23882OooO0o, this.f23884OooO0oO, this) == coroutine_suspended) {
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
