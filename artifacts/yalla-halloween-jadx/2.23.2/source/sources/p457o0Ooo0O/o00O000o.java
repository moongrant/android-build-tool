package p457o0Ooo0O;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import p199o00o0Oo0.o0000Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000o extends Lambda implements Function6<BoxScope, Dp, Float, Float, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f47732OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ float f47733OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f47734OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Integer> f47735OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Animatable<Float, AnimationVector1D> f47736OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f47737OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f47738OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(float f, MutableState<Integer> mutableState, MutableState<Boolean> mutableState2, Animatable<Float, AnimationVector1D> animatable, MutableState<Boolean> mutableState3, MutableState<Float> mutableState4, MutableFloatState mutableFloatState) {
        super(6);
        this.f47733OooO0Oo = f;
        this.f47735OooO0o0 = mutableState;
        this.f47734OooO0o = mutableState2;
        this.f47736OooO0oO = animatable;
        this.f47737OooO0oo = mutableState3;
        this.f47732OooO = mutableState4;
        this.f47738OooOO0 = mutableFloatState;
    }

    @Override // kotlin.jvm.functions.Function6
    public final Unit invoke(BoxScope boxScope, Dp dp, Float f, Float f2, Composer composer, Integer num) {
        int i;
        BoxScope $receiver = boxScope;
        float fM3789unboximpl = dp.m3789unboximpl();
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        if ((iIntValue & 14) == 0) {
            i = (composer2.changed($receiver) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 112) == 0) {
            i |= composer2.changed(fM3789unboximpl) ? 32 : 16;
        }
        if ((iIntValue & 896) == 0) {
            i |= composer2.changed(fFloatValue) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((iIntValue & 7168) == 0) {
            i |= composer2.changed(fFloatValue2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((46811 & i) == 9362 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-566386901, i, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider.<anonymous>.<anonymous>.<anonymous> (MusicEditDialog.kt:246)");
            }
            int i2 = (int) this.f47733OooO0Oo;
            int i3 = i & 14;
            o00O00o0.OooO0OO($receiver, i2, composer2, i3);
            MutableState<Integer> mutableState = this.f47735OooO0o0;
            Integer value = mutableState != null ? mutableState.getValue() : null;
            Animatable<Float, AnimationVector1D> animatable = this.f47736OooO0oO;
            MutableState<Boolean> mutableState2 = this.f47737OooO0oo;
            EffectsKt.LaunchedEffect(value, new o0O0ooO(animatable, mutableState2, null), composer2, 64);
            EffectsKt.LaunchedEffect(this.f47734OooO0o.getValue(), Boolean.valueOf(mutableState2.getValue().booleanValue()), new o00oOoo(this.f47734OooO0o, this.f47736OooO0oO, this.f47733OooO0Oo, this.f47732OooO, this.f47738OooOO0, null), composer2, ConstantsKt.MINIMUM_BLOCK_SIZE);
            o0000Ooo.OooO00o($receiver, fM3789unboximpl, fFloatValue, this.f47734OooO0o, i2, composer2, i3 | 3072 | (i & 112) | (i & 896));
            CanvasKt.Canvas(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new o00O000(fFloatValue2, fFloatValue, this.f47736OooO0oO, this.f47738OooOO0, this.f47737OooO0oo), composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
