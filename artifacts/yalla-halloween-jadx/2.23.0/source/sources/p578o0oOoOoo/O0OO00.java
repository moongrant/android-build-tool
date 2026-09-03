package p578o0oOoOoo;

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
import p546o0oOO.OooO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class O0OO00 extends Lambda implements Function6<BoxScope, Dp, Float, Float, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f56400OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ float f56401OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f56402OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Integer> f56403OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Animatable<Float, AnimationVector1D> f56404OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f56405OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f56406OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0OO00(float f, MutableState<Integer> mutableState, MutableState<Boolean> mutableState2, Animatable<Float, AnimationVector1D> animatable, MutableState<Boolean> mutableState3, MutableState<Float> mutableState4, MutableFloatState mutableFloatState) {
        super(6);
        this.f56401OooO0Oo = f;
        this.f56403OooO0o0 = mutableState;
        this.f56402OooO0o = mutableState2;
        this.f56404OooO0oO = animatable;
        this.f56405OooO0oo = mutableState3;
        this.f56400OooO = mutableState4;
        this.f56406OooOO0 = mutableFloatState;
    }

    @Override // kotlin.jvm.functions.Function6
    public final Unit invoke(BoxScope boxScope, Dp dp, Float f, Float f2, Composer composer, Integer num) {
        int i;
        BoxScope $receiver = boxScope;
        float fM3779unboximpl = dp.m3779unboximpl();
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
            i |= composer2.changed(fM3779unboximpl) ? 32 : 16;
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
                ComposerKt.traceEventStart(-566386901, i, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider.<anonymous>.<anonymous>.<anonymous> (MusicEditDialog.kt:245)");
            }
            int i2 = (int) this.f56401OooO0Oo;
            int i3 = i & 14;
            d.OooO0OO($receiver, i2, composer2, i3);
            MutableState<Integer> mutableState = this.f56403OooO0o0;
            Integer value = mutableState != null ? mutableState.getValue() : null;
            Animatable<Float, AnimationVector1D> animatable = this.f56404OooO0oO;
            MutableState<Boolean> mutableState2 = this.f56405OooO0oo;
            EffectsKt.LaunchedEffect(value, new oo00(animatable, mutableState2, null), composer2, 64);
            EffectsKt.LaunchedEffect(this.f56402OooO0o.getValue(), Boolean.valueOf(mutableState2.getValue().booleanValue()), new O0000000(this.f56402OooO0o, this.f56404OooO0oO, this.f56401OooO0Oo, this.f56400OooO, this.f56406OooOO0, null), composer2, ConstantsKt.MINIMUM_BLOCK_SIZE);
            OooO0o.OooO00o($receiver, fM3779unboximpl, fFloatValue, this.f56402OooO0o, i2, composer2, i3 | 3072 | (i & 112) | (i & 896));
            CanvasKt.Canvas(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new O0O0(fFloatValue2, fFloatValue, this.f56404OooO0oO, this.f56406OooOO0, this.f56405OooO0oo), composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
