package com.common.support.imagepicker.preview.component.image.utils;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/common/support/imagepicker/preview/component/image/utils/PreviewVibrateUtil$Companion$runInCoroutine$1", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.common.support.imagepicker.preview.component.image.utils.PreviewVibrateUtil$Companion$vibrate$$inlined$runInCoroutine$1", f = "PreviewVibrateUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nPreviewVibrateUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewVibrateUtil.kt\ncom/common/support/imagepicker/preview/component/image/utils/PreviewVibrateUtil$Companion$runInCoroutine$1\n+ 2 PreviewVibrateUtil.kt\ncom/common/support/imagepicker/preview/component/image/utils/PreviewVibrateUtil$Companion\n*L\n1#1,119:1\n62#2,8:120\n*E\n"})
public final class PreviewVibrateUtil$Companion$vibrate$$inlined$runInCoroutine$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AudioAttributes $audioAttributes$inlined;
    final /* synthetic */ int $repeat$inlined;
    final /* synthetic */ long[] $timings$inlined;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewVibrateUtil$Companion$vibrate$$inlined$runInCoroutine$1(Continuation continuation, long[] jArr, int i, AudioAttributes audioAttributes) {
        super(2, continuation);
        this.$timings$inlined = jArr;
        this.$repeat$inlined = i;
        this.$audioAttributes$inlined = audioAttributes;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PreviewVibrateUtil$Companion$vibrate$$inlined$runInCoroutine$1(continuation, this.$timings$inlined, this.$repeat$inlined, this.$audioAttributes$inlined);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PreviewVibrateUtil.vibrator = PreviewVibrateUtil.INSTANCE.getVibrator();
        if (Build.VERSION.SDK_INT >= 26) {
            VibrationEffect vibrationEffectCreateWaveform = VibrationEffect.createWaveform(this.$timings$inlined, this.$repeat$inlined);
            Vibrator vibrator = PreviewVibrateUtil.vibrator;
            if (vibrator != null) {
                vibrator.vibrate(vibrationEffectCreateWaveform, this.$audioAttributes$inlined);
            }
        } else {
            Vibrator vibrator2 = PreviewVibrateUtil.vibrator;
            if (vibrator2 != null) {
                vibrator2.vibrate(this.$timings$inlined, this.$repeat$inlined, this.$audioAttributes$inlined);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((PreviewVibrateUtil$Companion$vibrate$$inlined$runInCoroutine$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
