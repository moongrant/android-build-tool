package p578o0oOoOoo;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import p141o00Oo.oo0o0Oo;
import p546o0oOO.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O0 extends Lambda implements Function10<BoxScope, Modifier, Dp, MutableInteractionSource, oo0o0Oo, Boolean, Dp, Dp, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f56435OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0O0(MutableState<Boolean> mutableState) {
        super(10);
        this.f56435OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function10
    public final Unit invoke(BoxScope boxScope, Modifier modifier, Dp dp, MutableInteractionSource mutableInteractionSource, oo0o0Oo oo0o0oo, Boolean bool, Dp dp2, Dp dp3, Composer composer, Integer num) {
        int i;
        BoxScope $receiver = boxScope;
        Modifier anonymous$parameter$0$ = modifier;
        float fM3779unboximpl = dp.m3779unboximpl();
        MutableInteractionSource interactionSource = mutableInteractionSource;
        oo0o0Oo colors = oo0o0oo;
        boolean zBooleanValue = bool.booleanValue();
        float fM3779unboximpl2 = dp2.m3779unboximpl();
        float fM3779unboximpl3 = dp3.m3779unboximpl();
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        Intrinsics.checkNotNullParameter(anonymous$parameter$0$, "$anonymous$parameter$0$");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        if ((iIntValue & 14) == 0) {
            i = (composer2.changed($receiver) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 896) == 0) {
            i |= composer2.changed(fM3779unboximpl) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((iIntValue & 7168) == 0) {
            i |= composer2.changed(interactionSource) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((iIntValue & 57344) == 0) {
            i |= composer2.changed(colors) ? 16384 : 8192;
        }
        if ((iIntValue & 458752) == 0) {
            i |= composer2.changed(zBooleanValue) ? 131072 : 65536;
        }
        if ((iIntValue & 3670016) == 0) {
            i |= composer2.changed(fM3779unboximpl2) ? ZegoConstants.ErrorMask.RoomServerErrorMask : 524288;
        }
        if ((23967371 & i) == 4793474 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2104155944, i, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider.<anonymous>.<anonymous> (CompressVideoChangeMusicVoice.kt:194)");
            }
            int i2 = 12582912 | (i & 14);
            int i3 = i >> 3;
            OooOO0.OooO0O0($receiver, fM3779unboximpl, interactionSource, colors, zBooleanValue, fM3779unboximpl2, fM3779unboximpl3, this.f56435OooO0Oo, composer2, (57344 & i3) | i2 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 458752));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
