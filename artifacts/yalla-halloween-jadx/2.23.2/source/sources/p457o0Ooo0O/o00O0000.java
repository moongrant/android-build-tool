package p457o0Ooo0O;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import p198o00o0Oo.o00Oo00;
import p199o00o0Oo0.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0000 extends Lambda implements Function10<BoxScope, Modifier, Dp, MutableInteractionSource, o00Oo00, Boolean, Dp, Dp, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f47729OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f47730OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f47731OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0000(int i, MutableState mutableState, Function1 function1) {
        super(10);
        this.f47729OooO0Oo = mutableState;
        this.f47731OooO0o0 = function1;
        this.f47730OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function10
    public final Unit invoke(BoxScope boxScope, Modifier modifier, Dp dp, MutableInteractionSource mutableInteractionSource, o00Oo00 o00oo00, Boolean bool, Dp dp2, Dp dp3, Composer composer, Integer num) {
        int i;
        BoxScope $receiver = boxScope;
        Modifier anonymous$parameter$0$ = modifier;
        float fM3789unboximpl = dp.m3789unboximpl();
        MutableInteractionSource interactionSource = mutableInteractionSource;
        o00Oo00 colors = o00oo00;
        boolean zBooleanValue = bool.booleanValue();
        float fM3789unboximpl2 = dp2.m3789unboximpl();
        float fM3789unboximpl3 = dp3.m3789unboximpl();
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
            i |= composer2.changed(fM3789unboximpl) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
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
            i |= composer2.changed(fM3789unboximpl2) ? ZegoConstants.ErrorMask.RoomServerErrorMask : 524288;
        }
        if ((iIntValue & 29360128) == 0) {
            i |= composer2.changed(fM3789unboximpl3) ? 8388608 : Configuration.BLOCK_SIZE;
        }
        if ((191739531 & i) == 38347906 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(687028663, i, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider.<anonymous>.<anonymous>.<anonymous> (MusicEditDialog.kt:234)");
            }
            int i2 = (i & 14) | 12582912;
            int i3 = i >> 3;
            o0000O00.OooO00o($receiver, fM3789unboximpl, interactionSource, colors, zBooleanValue, fM3789unboximpl2, fM3789unboximpl3, this.f47729OooO0Oo, this.f47731OooO0o0, composer2, (234881024 & this.f47730OooO0o) | (i3 & 3670016) | (57344 & i3) | (i3 & 896) | i2 | (i3 & 112) | (i3 & 7168) | (458752 & i3), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
