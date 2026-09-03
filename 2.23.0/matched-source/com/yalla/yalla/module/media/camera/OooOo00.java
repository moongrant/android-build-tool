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
import p468o0OoooO0.o0OO0o;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.module.media.camera.CameraCommonCompKt$CameraSwitchComp$1$1", f = "CameraCommonComp.kt", i = {}, l = {IZegoLiveEventCallback.StreamEvent.RetryPlayFail}, m = "invokeSuspend", n = {}, s = {})
public final class OooOo00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f24370OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Context f24371OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CameraViewModel f24372OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<PreviewView> f24373OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(CameraViewModel cameraViewModel, Context context, MutableState<PreviewView> mutableState, Continuation<? super OooOo00> continuation) {
        super(2, continuation);
        this.f24372OooO0o0 = cameraViewModel;
        this.f24371OooO0o = context;
        this.f24373OooO0oO = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOo00(this.f24372OooO0o0, this.f24371OooO0o, this.f24373OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOo00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f24370OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0OO000.OooO00o("106076");
            o0OO0o o0oo0o2 = o0OO0o.f46911OooO00o;
            this.f24370OooO0Oo = 1;
            if (o0oo0o2.OooO00o(this.f24372OooO0o0, this.f24371OooO0o, this.f24373OooO0oO, this) == coroutine_suspended) {
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
