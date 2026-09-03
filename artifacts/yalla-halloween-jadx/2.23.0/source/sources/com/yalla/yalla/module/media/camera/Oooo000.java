package com.yalla.yalla.module.media.camera;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraSelector;
import androidx.camera.view.PreviewView;
import androidx.compose.runtime.MutableState;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p468o0OoooO0.o0OO0o00;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.module.media.camera.CameraXCompKt$CameraXComp$3$1", f = "CameraXComp.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
public final class Oooo000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f24374OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f24375OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ CameraViewModel f24376OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f24377OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Context f24378OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<PreviewView> f24379OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(CameraViewModel cameraViewModel, Context context, MutableState<PreviewView> mutableState, Function0<Unit> function0, Continuation<? super Oooo000> continuation) {
        super(2, continuation);
        this.f24376OooO0o = cameraViewModel;
        this.f24378OooO0oO = context;
        this.f24379OooO0oo = mutableState;
        this.f24374OooO = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        Oooo000 oooo000 = new Oooo000(this.f24376OooO0o, this.f24378OooO0oO, this.f24379OooO0oo, this.f24374OooO, continuation);
        oooo000.f24377OooO0o0 = obj;
        return oooo000;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Oooo000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objM4213constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f24375OooO0Oo;
        MutableState<PreviewView> mutableState = this.f24379OooO0oo;
        Context context = this.f24378OooO0oO;
        CameraViewModel cameraViewModel = this.f24376OooO0o;
        boolean z = true;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Result.Companion companion = Result.INSTANCE;
                PreviewView value = mutableState.getValue();
                this.f24375OooO0Oo = 1;
                if (OooOo.OooO0O0(cameraViewModel, context, value, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM4213constructorimpl = Result.m4213constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM4213constructorimpl = Result.m4213constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m4216exceptionOrNullimpl(objM4213constructorimpl) != null) {
            this.f24374OooO.invoke();
        }
        Intrinsics.checkNotNullParameter(cameraViewModel, "cameraViewModel");
        try {
            androidx.camera.lifecycle.OooOO0 oooOO1 = cameraViewModel.f24237OooOOo;
            if (oooOO1 != null ? oooOO1.OooO0O0(CameraSelector.f3396OooO0OO) : false) {
                androidx.camera.lifecycle.OooOO0 oooOO2 = cameraViewModel.f24237OooOOo;
                if (!(oooOO2 != null ? oooOO2.OooO0O0(CameraSelector.f3395OooO0O0) : false)) {
                    z = false;
                }
            } else {
                z = false;
            }
            cameraViewModel.f24239OooOOoo.setValue(Boolean.valueOf(z));
        } catch (CameraInfoUnavailableException unused) {
            cameraViewModel.f24239OooOOoo.setValue(Boolean.FALSE);
        }
        PreviewView value2 = mutableState.getValue();
        Intrinsics.checkNotNullParameter(cameraViewModel, "cameraViewModel");
        Intrinsics.checkNotNullParameter(context, "context");
        final ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new o0OO0o00(cameraViewModel));
        if (value2 != null) {
            value2.setOnTouchListener(new View.OnTouchListener() { // from class: o0OoooO0.o0OOooO0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    ScaleGestureDetector scaleGestureDetector2 = scaleGestureDetector;
                    Intrinsics.checkNotNullParameter(scaleGestureDetector2, "$scaleGestureDetector");
                    scaleGestureDetector2.onTouchEvent(motionEvent);
                    return true;
                }
            });
        }
        return Unit.INSTANCE;
    }
}
